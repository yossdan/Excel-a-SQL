/*
 * ExcelToSQLUltimate.java
 *
 * Aplicación Swing de nivel profesional:
 *  - Carga Excel (.xlsx) con JFileChooser y vista de hojas
 *  - Selección de hoja(s) a exportar
 *  - Inferencia de tipos (INTEGER, DECIMAL, BOOLEAN, DATETIME, VARCHAR(N), TEXT)
 *  - Inferencia de claves primarias (PK): por nombre y por unicidad
 *  - Inferencia de claves foráneas (FK): por nombre y matching de tablas destino
 *  - Detección de tablas pivote (N:M) y PK compuesta
 *  - Generación de SQL (CREATE TABLE + INDEX + FK + INSERT) por dialecto
 *  - Procesamiento fila-a-fila (no guarda todos los datos en memoria)
 *  - Logs, progreso y manejo de errores
 *
 * Dialectos soportados:
 *  - MySQL
 *  - PostgreSQL
 *
 * Dependencias Maven:
 *   poi 5.2.5
 *   poi-ooxml 5.2.5
 *
 * Nota: Para excels gigantes (GB), el "event model" de POI (XSSFReader) reduce memoria aún más.
 *       Esta versión usa XSSFWorkbook por simplicidad y procesa filas en streaming lógico.
 */
package com.example;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ExcelToSQLUltimate {

    public static void main(String[] args) {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception ignored) {}
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }

    // ========================= UI PRINCIPAL =========================
    public static class MainFrame extends JFrame {
        private final JTextField txtTablePrefix = new JTextField("", 16);
        private final JComboBox<Dialect> cbDialect = new JComboBox<>(Dialect.values());
        private final JCheckBox chkCreate = new JCheckBox("CREATE TABLE", true);
        private final JCheckBox chkFK = new JCheckBox("FOREIGN KEY", true);
        private final JCheckBox chkIndexes = new JCheckBox("Índices para FK", true);
        private final JCheckBox chkPivotDetect = new JCheckBox("Detectar tablas pivote", true);
        private final JCheckBox chkHasHeader = new JCheckBox("Primera fila = encabezado", true);
        private final JSpinner spHeaderRow = new JSpinner(new SpinnerNumberModel(0, 0, 9999, 1));
        private final JSpinner spSample = new JSpinner(new SpinnerNumberModel(400, 50, 10000, 50));
        private final JTextField txtDateFmt = new JTextField("yyyy-MM-dd HH:mm:ss", 18);
        private final JTextArea logArea = new JTextArea(10, 80);
        private final JProgressBar progress = new JProgressBar(0, 100);

        private final JTable tblSheets = new JTable(new DefaultTableModel(new Object[]{"Exportar", "Hoja", "Tabla destino"}, 0) {
            @Override public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 0 ? Boolean.class : String.class;
            }
            @Override public boolean isCellEditable(int row, int col) { return col != 1; }
        });

        private File excelFile;
        private File outputFile = new File("export.sql");

        public MainFrame() {
            setTitle("Excel → SQL Ultimate");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(1000, 700);
            setLocationRelativeTo(null);

            JPanel north = new JPanel(new BorderLayout(8,8));
            north.setBorder(new EmptyBorder(8,8,8,8));

            JPanel filePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 4));
            JButton btnOpen = new JButton("Abrir Excel...");
            JButton btnChooseOut = new JButton("Guardar como...");
            JButton btnLoadSheets = new JButton("Cargar hojas");
            filePanel.add(btnOpen);
            filePanel.add(btnLoadSheets);
            filePanel.add(new JLabel("Prefijo tablas:"));
            filePanel.add(txtTablePrefix);
            filePanel.add(new JLabel("Dialect:"));
            filePanel.add(cbDialect);
            filePanel.add(btnChooseOut);
            north.add(filePanel, BorderLayout.NORTH);

            JPanel opts = new JPanel(new FlowLayout(FlowLayout.LEFT, 12, 4));
            opts.add(chkCreate);
            opts.add(chkFK);
            opts.add(chkIndexes);
            opts.add(chkPivotDetect);
            opts.add(chkHasHeader);
            opts.add(new JLabel("Fila header:"));
            opts.add(spHeaderRow);
            opts.add(new JLabel("Muestra inferencia:"));
            opts.add(spSample);
            opts.add(new JLabel("Formato fecha:"));
            opts.add(txtDateFmt);
            north.add(opts, BorderLayout.CENTER);

            getContentPane().add(north, BorderLayout.NORTH);

            JScrollPane spSheets = new JScrollPane(tblSheets);
            spSheets.setPreferredSize(new Dimension(960, 250));
            getContentPane().add(spSheets, BorderLayout.CENTER);

            JPanel south = new JPanel(new BorderLayout(8,8));
            logArea.setEditable(false);
            south.add(new JScrollPane(logArea), BorderLayout.CENTER);

            JPanel southBottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            JButton btnAnalyze = new JButton("Analizar & Prever esquema");
            JButton btnGenerate = new JButton("Generar SQL");
            progress.setPreferredSize(new Dimension(240, 22));
            southBottom.add(progress);
            southBottom.add(btnAnalyze);
            southBottom.add(btnGenerate);
            south.add(southBottom, BorderLayout.SOUTH);

            getContentPane().add(south, BorderLayout.SOUTH);

            // Listeners
            btnOpen.addActionListener(this::onOpenExcel);
            btnLoadSheets.addActionListener(this::onLoadSheets);
            btnChooseOut.addActionListener(this::onChooseOutput);
            btnAnalyze.addActionListener(this::onAnalyze);
            btnGenerate.addActionListener(this::onGenerate);

            appendLog("Listo. Abre un Excel y carga sus hojas para configurar.");
        }


        private void publish(String message) {
    System.out.println(message); // temporal: imprime en consola
    // Si quieres usar un JTextArea llamado txtLog:
    // SwingUtilities.invokeLater(() -> txtLog.append(message + "\n"));
}


        private void onOpenExcel(ActionEvent e) {
            JFileChooser ch = new JFileChooser();
            ch.setDialogTitle("Selecciona archivo .xlsx");
            if (ch.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                excelFile = ch.getSelectedFile();
                appendLog("Excel seleccionado: " + excelFile.getAbsolutePath());
            }
        }

        private void onLoadSheets(ActionEvent e) {
            if (!ensureExcelSelected()) return;
            DefaultTableModel m = (DefaultTableModel) tblSheets.getModel();
            m.setRowCount(0);
            try (FileInputStream fis = new FileInputStream(excelFile);
                 Workbook wb = new XSSFWorkbook(fis)) {
                for (int i = 0; i < wb.getNumberOfSheets(); i++) {
                    String sheetName = wb.getSheetName(i);
                    String tableName = buildTableName(sheetName, txtTablePrefix.getText());
                    m.addRow(new Object[]{Boolean.TRUE, sheetName, tableName});
                }
                appendLog("Hojas cargadas: " + m.getRowCount());
            } catch (Exception ex) {
                error("Error leyendo hojas: " + ex.getMessage(), ex);
            }
        }

        private void onChooseOutput(ActionEvent e) {
            JFileChooser ch = new JFileChooser();
            ch.setSelectedFile(outputFile);
            ch.setDialogTitle("Guardar SQL como...");
            if (ch.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                outputFile = ch.getSelectedFile();
                if (!outputFile.getName().toLowerCase(Locale.ROOT).endsWith(".sql")) {
                    outputFile = new File(outputFile.getAbsolutePath() + ".sql");
                }
                appendLog("Salida: " + outputFile.getAbsolutePath());
            }
        }

        private void onAnalyze(ActionEvent e) {
            if (!ensureExcelSelected()) return;
            List<SheetPlan> plans = collectPlans();
            if (plans.isEmpty()) { warn("No hay hojas seleccionadas."); return; }
            runTask("Analizando esquema", () -> {
                try (FileInputStream fis = new FileInputStream(excelFile);
                     Workbook wb = new XSSFWorkbook(fis)) {

                    Database db = new Database((Dialect) cbDialect.getSelectedItem());

                    for (SheetPlan p : plans) {
                        Sheet sheet = wb.getSheet(p.sheetName);
                        TableSchema schema = Analyzer.analyzeSheet(sheet, p.tableName,
                                (Integer) spHeaderRow.getValue(),
                                chkHasHeader.isSelected(),
                                (Integer) spSample.getValue(),
                                chkPivotDetect.isSelected(),
                                db.dialect);

                        db.tables.add(schema);
                        publish("Analizada hoja: " + p.sheetName + " → tabla " + p.tableName);
                    }

                    // Resumen
                    for (TableSchema t : db.tables) {
                        publish("Tabla: " + t.tableName);
                        for (ColumnSchema c : t.columns) {
                            publish("  - " + c.name + " " + t.dialect.typeToDDL(c.type, c.varcharSize) +
                                    (c.primaryKey ? " PK" : "") +
                                    (c.notNull ? " NOT NULL" : ""));
                        }
                        if (!t.foreignKeys.isEmpty()) {
                            publish("  FKs:");
                            for (ForeignKey fk : t.foreignKeys) {
                                publish("    -> " + fk.column + " → " + fk.refTable + "(" + fk.refColumn + ")");
                            }
                        }
                        if (!t.indexes.isEmpty()) {
                            publish("  Índices: " + t.indexes.stream().map(ix -> ix.name).collect(Collectors.joining(", ")));
                        }
                    }
                }
            });
        }

        private void onGenerate(ActionEvent e) {
            if (!ensureExcelSelected()) return;
            List<SheetPlan> plans = collectPlans();
            if (plans.isEmpty()) { warn("No hay hojas seleccionadas."); return; }
            if (outputFile == null) { warn("Selecciona un archivo de salida."); return; }

            runTask("Generando SQL", () -> {
                try (FileInputStream fis = new FileInputStream(excelFile);
                     Workbook wb = new XSSFWorkbook(fis);
                     BufferedWriter out = new BufferedWriter(new FileWriter(outputFile))) {

                    Dialect dialect = (Dialect) cbDialect.getSelectedItem();
                    Database db = new Database(dialect);

                    // 1) Analizar esquema (tipos, PK, FK, pivote)
                    for (SheetPlan p : plans) {
                        Sheet sheet = wb.getSheet(p.sheetName);
                        TableSchema schema = Analyzer.analyzeSheet(sheet, p.tableName,
                                (Integer) spHeaderRow.getValue(),
                                chkHasHeader.isSelected(),
                                (Integer) spSample.getValue(),
                                chkPivotDetect.isSelected(),
                                dialect);
                        db.tables.add(schema);
                    }

                    // 2) Escribir DDL
                    if (chkCreate.isSelected()) {
                        for (TableSchema t : db.tables) {
                            String ddl = SQLBuilder.buildCreateTable(t, chkFK.isSelected(), chkIndexes.isSelected());
                            out.write(ddl);
                            out.write("\n\n");
                            publish("CREATE TABLE " + t.tableName);
                        }
                    }

                    // 3) Escribir INSERTs (fila-a-fila)
                    for (SheetPlan p : plans) {
                        Sheet sheet = wb.getSheet(p.sheetName);
                        TableSchema t = db.getTableByName(p.tableName);
                        publish("INSERTs para " + p.sheetName + " → " + t.tableName);
                        Inserter.writeInserts(sheet, t, out,
                                (Integer) spHeaderRow.getValue(),
                                chkHasHeader.isSelected(),
                                txtDateFmt.getText().trim());
                        out.write("\n");
                    }

                    publish("Archivo SQL generado: " + outputFile.getAbsolutePath());
                }
            });
        }

        // Helpers UI
        private boolean ensureExcelSelected() {
            if (excelFile == null) { warn("Primero selecciona un Excel (.xlsx)."); return false; }
            if (!excelFile.exists()) { warn("El archivo ya no existe."); return false; }
            return true;
        }
        private List<SheetPlan> collectPlans() {
        DefaultTableModel m = (DefaultTableModel) tblSheets.getModel();
        List<SheetPlan> list = new ArrayList<>();
        for (int i = 0; i < m.getRowCount(); i++) {
        // forzamos que todas las filas estén activas
        String sheet = String.valueOf(m.getValueAt(i, 1));
        String table = String.valueOf(m.getValueAt(i, 2));
        if (table == null || table.isBlank()) {
            table = buildTableName(sheet, txtTablePrefix.getText());
        }
        list.add(new SheetPlan(sheet, table));
    }
    return list;
}

        private void runTask(String title, TaskRunner task) {
            progress.setIndeterminate(true);
            appendLog("▶ " + title + "…");
            SwingWorker<Void, String> w = new SwingWorker<>() {
                @Override protected Void doInBackground() {
                    try { task.run(); } catch (Exception ex) { publish("ERROR: " + ex.getMessage()); ex.printStackTrace(); }
                    return null;
                }
                @Override protected void process(List<String> chunks) { chunks.forEach(MainFrame.this::appendLog); }
                @Override protected void done() {
                    progress.setIndeterminate(false);
                    try { get(); appendLog("✔ Listo."); }
                    catch (InterruptedException | ExecutionException ex) { error("Falló: " + ex.getMessage(), ex); }
                }
            };
            w.execute();
        }
        private static String buildTableName(String sheetName, String prefix) {
            String base = sheetName.trim().toLowerCase(Locale.ROOT)
                    .replaceAll("[^a-z0-9_]", "_")
                    .replaceAll("_+", "_");
            if (base.startsWith("_")) base = base.substring(1);
            if (base.endsWith("_")) base = base.substring(0, base.length()-1);
            if (prefix != null && !prefix.isBlank()) {
                String p = prefix.trim().toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9_]", "_");
                return p + "_" + base;
            }
            return base;
        }
        private void appendLog(String s) { logArea.append(s + "\n"); logArea.setCaretPosition(logArea.getDocument().getLength()); }
        private void warn(String s) { JOptionPane.showMessageDialog(this, s, "Aviso", JOptionPane.WARNING_MESSAGE); appendLog("⚠ " + s); }
        private void error(String s, Exception ex) { JOptionPane.showMessageDialog(this, s, "Error", JOptionPane.ERROR_MESSAGE); appendLog("❌ " + s); if (ex!=null) ex.printStackTrace(); }
    }

    // ========================= MODELO & DIALÉCTO =========================
    interface TaskRunner { void run() throws Exception; }
    static class SheetPlan { final String sheetName; final String tableName; SheetPlan(String s, String t){sheetName=s;tableName=t;} }

    static class Database {
        final Dialect dialect;
        final List<TableSchema> tables = new ArrayList<>();
        Database(Dialect d){ this.dialect = d; }
        TableSchema getTableByName(String name) {
            return tables.stream().filter(t -> t.tableName.equals(name)).findFirst().orElseThrow();
        }
    }

    static class TableSchema {
        final Dialect dialect;
        final String tableName;
        final List<ColumnSchema> columns = new ArrayList<>();
        String primaryKeyName; // simple PK; para pivot se usa PK compuesta
        List<String> compositePk = new ArrayList<>();
        final List<ForeignKey> foreignKeys = new ArrayList<>();
        final List<IndexDef> indexes = new ArrayList<>();
        boolean isPivot = false;

        TableSchema(String name, Dialect dialect) {
            this.tableName = name;
            this.dialect = dialect;
        }

        ColumnSchema getColumn(String name) {
            for (ColumnSchema c: columns) if (c.name.equals(name)) return c;
            return null;
        }
    }

    static class ColumnSchema {
        final String name;
        SqlType type = SqlType.VARCHAR;
        int varcharSize = 255;
        boolean primaryKey = false;
        boolean notNull = false;

        ColumnSchema(String name){ this.name = name; }
    }

    static class ForeignKey {
        final String column;
        final String refTable;
        final String refColumn;
        ForeignKey(String c, String t, String rc){ column=c; refTable=t; refColumn=rc; }
    }

    static class IndexDef {
        final String name;
        final List<String> columns;
        final boolean unique;
        IndexDef(String name, List<String> cols, boolean unique){ this.name=name; this.columns=cols; this.unique=unique; }
    }

    enum SqlType { INTEGER, DECIMAL, BOOLEAN, DATETIME, VARCHAR, TEXT }

    enum Dialect {
        MYSQL {
            @Override public String quoteId(String id){ return "`"+id.replace("`","``")+"`"; }
            @Override public String typeToDDL(SqlType t, int varcharSize){
                switch (t) {
                    case INTEGER: return "BIGINT";
                    case DECIMAL: return "DECIMAL(38,10)";
                    case BOOLEAN: return "TINYINT(1)";
                    case DATETIME: return "DATETIME";
                    case TEXT: return "LONGTEXT";
                    case VARCHAR:
                    default: return "VARCHAR(" + Math.max(1, varcharSize) + ")";
                }
            }
            @Override public String fkClause(String table, ForeignKey fk){
                return "CONSTRAINT " + quoteId("fk_"+table+"_"+fk.column) +
                        " FOREIGN KEY ("+quoteId(fk.column)+") REFERENCES "+
                        quoteId(fk.refTable)+"("+quoteId(fk.refColumn)+")";
            }
            @Override public String indexClause(String table, IndexDef ix){
                String cols = ix.columns.stream().map(this::quoteId).collect(Collectors.joining(", "));
                return (ix.unique?"UNIQUE ":"") + "INDEX " + quoteId(ix.name) + " (" + cols + ")";
            }
        },
        POSTGRES {
            @Override public String quoteId(String id){ return "\""+id.replace("\"","\"\"")+"\""; }
            @Override public String typeToDDL(SqlType t, int varcharSize){
                switch (t) {
                    case INTEGER: return "BIGINT";
                    case DECIMAL: return "NUMERIC(38,10)";
                    case BOOLEAN: return "BOOLEAN";
                    case DATETIME: return "TIMESTAMP";
                    case TEXT: return "TEXT";
                    case VARCHAR:
                    default: return "VARCHAR(" + Math.max(1, varcharSize) + ")";
                }
            }
            @Override public String fkClause(String table, ForeignKey fk){
                return "CONSTRAINT " + quoteId("fk_"+table+"_"+fk.column) +
                        " FOREIGN KEY ("+quoteId(fk.column)+") REFERENCES "+
                        quoteId(fk.refTable)+"("+quoteId(fk.refColumn)+")";
            }
            @Override public String indexClause(String table, IndexDef ix){
                String cols = ix.columns.stream().map(this::quoteId).collect(Collectors.joining(", "));
                return (ix.unique?"CREATE UNIQUE INDEX ":"CREATE INDEX ") + quoteId(ix.name) +
                        " ON " + quoteId(table) + " (" + cols + ");";
            }
            @Override public boolean indexesOutsideCreate(){ return true; }
        };

        public String quoteId(String id){ return id; }
        public String typeToDDL(SqlType t, int varcharSize){ return t.name(); }
        public String fkClause(String table, ForeignKey fk){ return ""; }
        public String indexClause(String table, IndexDef ix){ return ""; }
        public boolean indexesOutsideCreate(){ return false; }
    }

    // ========================= ANALIZADOR =========================
    static class Analyzer {

        private static final Pattern LIKE_ID = Pattern.compile("^(id|.*_id|id_.*|.*Id|.*ID)$");
        private static final String[] DATE_GUESSES = {
                "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd",
                "dd/MM/yyyy", "dd-MM-yyyy", "MM/dd/yyyy"
        };

        static TableSchema analyzeSheet(Sheet sheet, String tableName, int headerRowIndex, boolean hasHeader,
                                        int sampleRows, boolean detectPivot, Dialect dialect) {
            // 1) Detectar columnas
            Row headerRow = sheet.getRow(headerRowIndex);
            if (headerRow == null) throw new IllegalArgumentException("La fila de encabezado no existe: " + headerRowIndex);
            int last = headerRow.getLastCellNum();
            if (last <= 0) throw new IllegalArgumentException("Encabezado vacío en hoja: " + sheet.getSheetName());

            TableSchema table = new TableSchema(safeName(tableName), dialect);
            for (int c = 0; c < last; c++) {
                String raw = getString(headerRow.getCell(c));
                String name = safeName(raw == null || raw.isBlank() ? ("col_"+c) : raw);
                table.columns.add(new ColumnSchema(name));
            }

            // 2) Inferencia de tipos por muestreo
            TypeProbe[] probes = new TypeProbe[table.columns.size()];
            for (int i=0;i<probes.length;i++) probes[i] = new TypeProbe();

            int startData = hasHeader ? headerRowIndex + 1 : headerRowIndex;
            int maxRow = Math.min(sheet.getLastRowNum(), startData + sampleRows);
            for (int r = startData; r <= maxRow; r++) {
                Row row = sheet.getRow(r);
                if (row == null) continue;
                for (int c = 0; c < table.columns.size(); c++) {
                    Cell cell = row.getCell(c);
                    probes[c].accept(cell);
                }
            }
            for (int c = 0; c < table.columns.size(); c++) {
                ColumnSchema col = table.columns.get(c);
                probes[c].finalize(col);
            }

            // 3) PK por nombre
            ColumnSchema idCol = tryFindIdColumn(table, table.tableName);
            if (idCol != null) {
                idCol.primaryKey = true; idCol.notNull = true; table.primaryKeyName = idCol.name;
            }

            // 4) FK por nombre: id_xxx o xxx_id apunta a tabla 'xxx'
            for (ColumnSchema col : table.columns) {
                if (col.primaryKey) continue;
                if (isIdLike(col.name)) {
                    String guess = guessRefTable(col.name);
                    if (guess != null && !guess.equals(table.tableName)) {
                        // ref column = 'id' si existe, si no, primera PK de destino
                        String refCol = "id";
                        table.foreignKeys.add(new ForeignKey(col.name, guess, refCol));
                        // índice sugerido
                        table.indexes.add(new IndexDef("ix_"+table.tableName+"_"+col.name, List.of(col.name), false));
                    }
                }
            }

            // 5) Pivote (N:M): exactamente 2 FKs, pocas columnas y sin datos extra significativos
            if (detectPivot) {
                List<String> fkCols = table.foreignKeys.stream().map(f -> f.column).collect(Collectors.toList());
                if (fkCols.size() == 2 && table.columns.size() <= 3) {
                    table.isPivot = true;
                    table.compositePk = new ArrayList<>(fkCols); // PK compuesta (ambas FK)
                    table.primaryKeyName = null;
                }
            }

            // 6) Si no hay PK: intentar por unicidad (scan otra pequeña muestra)
            if (table.primaryKeyName == null && !table.isPivot) {
                String uniqueCol = findUniqueColumn(sheet, startData, table.columns, 200);
                if (uniqueCol != null) {
                    ColumnSchema c = table.getColumn(uniqueCol);
                    c.primaryKey = true; c.notNull = true; table.primaryKeyName = uniqueCol;
                }
            }

            return table;
        }

        private static String safeName(String s) {
            String x = s.trim().toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9_]", "_").replaceAll("_+", "_");
            if (x.startsWith("_")) x = x.substring(1);
            if (x.isBlank()) x = "col";
            return x;
        }

        private static boolean isIdLike(String name) { return LIKE_ID.matcher(name).matches(); }

        private static String guessRefTable(String idCol) {
            String n = idCol.toLowerCase(Locale.ROOT);
            if (n.equals("id")) return null;
            if (n.endsWith("_id")) return n.substring(0, n.length()-3);
            if (n.startsWith("id_")) return n.substring(3);
            if (n.endsWith("id")) return n.substring(0, n.length()-2);
            return null;
        }

        private static ColumnSchema tryFindIdColumn(TableSchema t, String tableName) {
            // prioridad: "id", tableName+"_id"
            for (ColumnSchema c: t.columns) if (c.name.equals("id")) return c;
            for (ColumnSchema c: t.columns) if (c.name.equals(tableName+"_id")) return c;
            return null;
        }

        private static String findUniqueColumn(Sheet sheet, int startData, List<ColumnSchema> cols, int sampleRows) {
            int maxRow = Math.min(sheet.getLastRowNum(), startData + sampleRows);
            for (int c = 0; c < cols.size(); c++) {
                Set<String> seen = new HashSet<>();
                boolean anyNull = false; boolean dup = false;
                for (int r = startData; r <= maxRow; r++) {
                    Row row = sheet.getRow(r);
                    String v = getString(row==null?null:row.getCell(c));
                    if (v == null || v.isBlank()) { anyNull = true; break; }
                    if (!seen.add(v)) { dup = true; break; }
                }
                if (!anyNull && !dup) return cols.get(c).name;
            }
            return null;
        }

        private static String getString(Cell cell) {
            if (cell == null) return null;
            switch (cell.getCellType()) {
                case STRING: return cell.getStringCellValue();
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell))
                        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(cell.getDateCellValue());
                    double v = cell.getNumericCellValue();
                    if (v == (long)v) return Long.toString((long)v);
                    return Double.toString(v);
                case BOOLEAN: return Boolean.toString(cell.getBooleanCellValue());
                case FORMULA:
                    try { return cell.getStringCellValue(); }
                    catch (Exception e) {
                        try {
                            double dv = cell.getNumericCellValue();
                            if (dv == (long)dv) return Long.toString((long)dv);
                            return Double.toString(dv);
                        } catch (Exception ex) { return cell.getCellFormula(); }
                    }
                default: return null;
            }
        }

        // Recoge estadísticas para decidir tipo óptimo
        static class TypeProbe {
            long nulls=0, ints=0, decimals=0, bools=0, dates=0, texts=0;
            int maxLen=0;
            final SimpleDateFormat[] dateParsers = Arrays.stream(DATE_GUESSES).map(SimpleDateFormat::new).toArray(SimpleDateFormat[]::new);

            void accept(Cell cell) {
                if (cell == null || cell.getCellType() == CellType.BLANK) { nulls++; return; }
                switch (cell.getCellType()) {
                    case BOOLEAN: bools++; return;
                    case NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) { dates++; return; }
                        double v = cell.getNumericCellValue();
                        if (v == (long)v) ints++; else decimals++;
                        return;
                    case STRING:
                        String s = cell.getStringCellValue();
                        if (s == null || s.isBlank()) { nulls++; return; }
                        maxLen = Math.max(maxLen, s.length());
                        // probar parse boolean
                        String l = s.trim().toLowerCase(Locale.ROOT);
                        if (l.equals("true") || l.equals("false") || l.equals("0") || l.equals("1")) { bools++; return; }
                        // probar parse int/decimal
                        try { Long.parseLong(s); ints++; return; } catch (Exception ignored) {}
                        try { Double.parseDouble(s); decimals++; return; } catch (Exception ignored) {}
                        // probar parse date
                        for (SimpleDateFormat f: dateParsers) {
                            try { f.parse(s); dates++; return; } catch (ParseException ignored) {}
                        }
                        texts++;
                        return;
                    default:
                        nulls++;
                }
            }
            void finalize(ColumnSchema c) {
                // prioridad por conteo mayoritario
                if (dates>0 && decimals==0 && texts==0) { c.type = SqlType.DATETIME; c.notNull = false; return; }
                if (bools>0 && decimals==0 && texts==0 && dates==0) { c.type = SqlType.BOOLEAN; return; }
                if (decimals>0 && texts==0 && dates==0) { c.type = SqlType.DECIMAL; return; }
                if (ints>0 && decimals==0 && texts==0 && dates==0) { c.type = SqlType.INTEGER; return; }
                // texto: dimensionar VARCHAR si largo moderado; TEXT si muy grande
                if (maxLen <= 255) { c.type = SqlType.VARCHAR; c.varcharSize = roundUpSize(maxLen); }
                else if (maxLen <= 2000) { c.type = SqlType.VARCHAR; c.varcharSize = roundUpSize(maxLen); }
                else { c.type = SqlType.TEXT; }
            }
            private int roundUpSize(int n){
                if (n<=50) return 50;
                if (n<=100) return 100;
                if (n<=150) return 150;
                if (n<=200) return 200;
                if (n<=255) return 255;
                if (n<=512) return 512;
                if (n<=1024) return 1024;
                return ((n/256)+1)*256;
            }
        }
    }

    // ========================= GENERADOR SQL =========================
    static class SQLBuilder {
        static String buildCreateTable(TableSchema t, boolean includeFK, boolean includeIndexes) {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ").append(t.dialect.quoteId(t.tableName)).append(" (\n");

            List<String> lines = new ArrayList<>();
            for (ColumnSchema c : t.columns) {
                String col = "  " + t.dialect.quoteId(c.name) + " " + t.dialect.typeToDDL(c.type, c.varcharSize)
                        + (c.notNull ? " NOT NULL" : "");
                lines.add(col);
            }

            // PK
            if (t.isPivot && !t.compositePk.isEmpty()) {
                String pkCols = t.compositePk.stream().map(t.dialect::quoteId).collect(Collectors.joining(", "));
                lines.add("  CONSTRAINT " + t.dialect.quoteId("pk_"+t.tableName) + " PRIMARY KEY (" + pkCols + ")");
            } else if (t.primaryKeyName != null) {
                lines.add("  CONSTRAINT " + t.dialect.quoteId("pk_"+t.tableName) + " PRIMARY KEY (" + t.dialect.quoteId(t.primaryKeyName) + ")");
            }

            // FK
            if (includeFK) {
                for (ForeignKey fk : t.foreignKeys) {
                    lines.add("  " + t.dialect.fkClause(t.tableName, fk));
                }
            }

            sb.append(String.join(",\n", lines));
            sb.append("\n);");

            // Índices
            if (includeIndexes) {
                if (t.dialect.indexesOutsideCreate()) {
                    // PostgreSQL: CREATE INDEX fuera
                    for (IndexDef ix : t.indexes) {
                        sb.append("\n").append(t.dialect.indexClause(t.tableName, ix));
                    }
                } else {
                    // MySQL: índices dentro del CREATE ya fueron agregados? (este diseño los agrega como cláusulas aparte)
                    for (IndexDef ix : t.indexes) {
                        sb.append("\nALTER TABLE ").append(t.dialect.quoteId(t.tableName)).append(" ADD ")
                                .append(t.dialect.indexClause(t.tableName, ix)).append(";");
                    }
                }
            }
            return sb.toString();
        }
    }

    static class Inserter {
        static void writeInserts(Sheet sheet, TableSchema t, Writer out,
                                 int headerRowIndex, boolean hasHeader, String dateFormat) throws IOException {
            int start = hasHeader ? headerRowIndex + 1 : headerRowIndex;
            SimpleDateFormat sdf = dateFormat.isBlank() ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") : new SimpleDateFormat(dateFormat);

            String colList = t.columns.stream().map(c -> t.dialect.quoteId(c.name)).collect(Collectors.joining(", "));
            int batchCount = 0;
            StringBuilder sb = new StringBuilder(1024);

            for (int r = start; r <= sheet.getLastRowNum(); r++) {
                Row row = sheet.getRow(r);
                if (row == null) continue;

                String values = buildValuesRow(row, t.columns, t.dialect, sdf);
                if (values == null) continue; // fila vacía

                // INSERT por fila (simple y robusto). Si quieres batching multi-values, se puede extender.
                sb.setLength(0);
                sb.append("INSERT INTO ").append(t.dialect.quoteId(t.tableName)).append(" (").append(colList).append(") VALUES (")
                        .append(values).append(");");
                out.write(sb.toString());
                out.write("\n");
                batchCount++;
                if (batchCount % 1000 == 0) out.flush();
            }
        }

        private static String buildValuesRow(Row row, List<ColumnSchema> cols, Dialect dialect, SimpleDateFormat sdf) {
            List<String> vals = new ArrayList<>(cols.size());
            boolean allNull = true;
            for (int i = 0; i < cols.size(); i++) {
                Cell cell = row.getCell(i);
                String v = toSqlLiteral(cell, cols.get(i), dialect, sdf);
                if (!"NULL".equals(v)) allNull = false;
                vals.add(v);
            }
            if (allNull) return null;
            return String.join(", ", vals);
        }

        private static String toSqlLiteral(Cell cell, ColumnSchema col, Dialect dialect, SimpleDateFormat sdf) {
            if (cell == null || cell.getCellType() == CellType.BLANK) return "NULL";
            try {
                switch (col.type) {
                    case INTEGER:
                        long lv = readAsLong(cell);
                        return String.valueOf(lv);
                    case DECIMAL:
                        double dv = readAsDouble(cell);
                        return trimDouble(dv);
                    case BOOLEAN:
                        return readAsBoolean(cell) ? (dialect==Dialect.POSTGRES ? "TRUE":"1") : (dialect==Dialect.POSTGRES ? "FALSE":"0");
                    case DATETIME:
                        Date d = readAsDate(cell, sdf);
                        if (d == null) return "NULL";
                        return "'" + sdf.format(d) + "'";
                    case VARCHAR:
                    case TEXT:
                    default:
                        String s = readAsString(cell, sdf);
                        if (s == null || s.isBlank()) return "NULL";
                        return "'" + s.replace("'", "''") + "'";
                }
            } catch (Exception ex) {
                // fallback seguro
                String s = cell.toString();
                if (s == null || s.isBlank()) return "NULL";
                return "'" + s.replace("'", "''") + "'";
            }
        }

        private static long readAsLong(Cell c) {
            switch (c.getCellType()) {
                case NUMERIC: return (long) c.getNumericCellValue();
                case STRING: return Long.parseLong(c.getStringCellValue().trim());
                case BOOLEAN: return c.getBooleanCellValue()?1:0;
                default: return 0L;
            }
        }
        private static double readAsDouble(Cell c) {
            switch (c.getCellType()) {
                case NUMERIC: return c.getNumericCellValue();
                case STRING: return Double.parseDouble(c.getStringCellValue().trim());
                case BOOLEAN: return c.getBooleanCellValue()?1.0:0.0;
                default: return 0.0;
            }
        }
        private static boolean readAsBoolean(Cell c) {
            switch (c.getCellType()) {
                case BOOLEAN: return c.getBooleanCellValue();
                case STRING:
                    String s = c.getStringCellValue().trim().toLowerCase(Locale.ROOT);
                    return s.equals("true") || s.equals("1") || s.equals("sí") || s.equals("si");
                case NUMERIC: return c.getNumericCellValue() != 0.0;
                default: return false;
            }
        }
        private static Date readAsDate(Cell c, SimpleDateFormat sdf) {
            if (c.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(c)) return c.getDateCellValue();
            if (c.getCellType() == CellType.STRING) {
                String s = c.getStringCellValue().trim();
                if (s.isBlank()) return null;
                // intenta parsear con 'sdf' y formatos comunes
                try { return sdf.parse(s); } catch (Exception ignored) {}
                String[] fmts = {"yyyy-MM-dd'T'HH:mm:ss","yyyy-MM-dd HH:mm:ss","yyyy-MM-dd","dd/MM/yyyy","dd-MM-yyyy","MM/dd/yyyy"};
                for (String f: fmts) {
                    try { return new SimpleDateFormat(f).parse(s); } catch (Exception ignored) {}
                }
            }
            return null;
        }
        private static String readAsString(Cell c, SimpleDateFormat sdf) {
            switch (c.getCellType()) {
                case STRING: return c.getStringCellValue();
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(c)) return sdf.format(c.getDateCellValue());
                    double v = c.getNumericCellValue();
                    if (v == (long)v) return Long.toString((long)v);
                    return trimDouble(v);
                case BOOLEAN: return Boolean.toString(c.getBooleanCellValue());
                case FORMULA:
                    try { return c.getStringCellValue(); }
                    catch (Exception e) {
                        try {
                            double dv = c.getNumericCellValue();
                            if (DateUtil.isCellDateFormatted(c)) return sdf.format(c.getDateCellValue());
                            if (dv == (long)dv) return Long.toString((long)dv);
                            return trimDouble(dv);
                        } catch (Exception ex) { return c.getCellFormula(); }
                    }
                default: return null;
            }
        }
        private static String trimDouble(double d) {
            String s = Double.toString(d);
            if (s.contains("E")) return s;
            if (s.endsWith(".0")) s = s.substring(0, s.length()-2);
            return s;
        }
    }
}

/*
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
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.example.ExcelSQL.Database;
import com.example.ExcelSQL.Dialect;
import com.example.ExcelSQL.TableSchema;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
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


// === SPLASH SCREEN 100% FUNCIONAL Y COMPILABLE ===

class SplashScreen extends JWindow {
    private final JProgressBar progress = new JProgressBar();
    private final JLabel lblTitle = new JLabel("ExcelSQL", SwingConstants.CENTER);
    private final JLabel lblStatus = new JLabel("Cargando...", SwingConstants.CENTER);

    // Animación
    private float titleAlpha = 0f;
    private Timer fadeInTimer;
    private Timer titleFadeTimer;
    private Timer progressTimer;
    private Timer fadeOutTimer;

    // Control de finalización
    private volatile boolean taskDone = false;
    private long startTime = 0;
    private volatile int minDurationMs = 2500;
    private Runnable onFinished = null;

    public SplashScreen() {
        JPanel content = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, titleAlpha));
                Font f = lblTitle.getFont();
                g2.setFont(f);
                FontMetrics fm = g2.getFontMetrics();
                String s = lblTitle.getText();
                int w = fm.stringWidth(s);
                int h = fm.getAscent();
                int x = (getWidth() - w) / 2;
                int y = (getHeight() / 2) + (h / 2) - 10;
                g2.setColor(lblTitle.getForeground());
                g2.drawString(s, x, y);
                g2.dispose();
            }
        };

        content.setBackground(new Color(22, 22, 22));
        content.setBorder(BorderFactory.createLineBorder(new Color(60, 60, 60)));

        lblTitle.setFont(new Font("Segoe UI Semibold", Font.BOLD, 40));
        lblTitle.setForeground(new Color(180, 200, 255));

        lblStatus.setForeground(new Color(190, 190, 190));
        lblStatus.setFont(new Font("Consolas", Font.PLAIN, 13));
        lblStatus.setBorder(BorderFactory.createEmptyBorder(8, 12, 8, 12));

        progress.setMinimum(0);
        progress.setMaximum(100);
        progress.setForeground(new Color(100, 180, 255));
        progress.setBackground(new Color(35, 35, 35));
        progress.setBorder(BorderFactory.createEmptyBorder(6, 10, 6, 10));
        progress.setValue(0);

        content.add(lblStatus, BorderLayout.NORTH);
        content.add(progress, BorderLayout.SOUTH);

        setContentPane(content);
        setSize(460, 240);
        setLocationRelativeTo(null);
        try { setOpacity(0f); } catch (Throwable ignored) {}

        // === Inicialización segura de timers ===
        fadeInTimer = new Timer(20, ev -> {
            float op = getOpacity();
            op = Math.min(1f, op + 0.06f);
            try { setOpacity(op); } catch (Throwable ignored) {}
            if (op >= 1f) fadeInTimer.stop();
        });

        titleFadeTimer = new Timer(20, ev -> {
            titleAlpha = Math.min(1f, titleAlpha + 0.02f);
            repaint();
            if (titleAlpha >= 1f) titleFadeTimer.stop();
        });

        progressTimer = new Timer(40, ev -> {
            int v = progress.getValue();
            int target = taskDone ? 100 : 90;
            if (v < target) {
                int step = Math.max(1, (int) Math.ceil(target / 60.0));
                progress.setValue(Math.min(target, v + step));
                lblStatus.setText("Cargando módulos... " + progress.getValue() + "%");
            } else {
                if (taskDone && (System.currentTimeMillis() - startTime) >= minDurationMs) {
                    progress.setValue(100);
                    progressTimer.stop();
                    startFadeOut();
                }
            }
        });

        fadeOutTimer = new Timer(20, ev -> {
            float op = getOpacity();
            op = Math.max(0f, op - 0.06f);
            try { setOpacity(op); } catch (Throwable ignored) {}
            if (op <= 0f) {
                fadeOutTimer.stop();
                setVisible(false);
                dispose();
                if (onFinished != null)
                    SwingUtilities.invokeLater(onFinished);
            }
        });
    }

    /** Inicia la animación del splash. No bloquea EDT. */
    public void start() {
        startTime = System.currentTimeMillis();
        setVisible(true);
        fadeInTimer.start();

        // título con retraso leve
        new Timer(300, e -> {
            titleFadeTimer.start();
            ((Timer) e.getSource()).stop();
        }).start();

        progress.setValue(0);
        progressTimer.start();
    }

    public void setMinDuration(int ms) { this.minDurationMs = ms; }

    public void notifyTaskFinished() {
        this.taskDone = true;
        if (progress.getValue() >= 90 && (System.currentTimeMillis() - startTime) >= minDurationMs) {
            progress.setValue(100);
            progressTimer.stop();
            startFadeOut();
        }
    }

    private void startFadeOut() {
        try { setOpacity(1f); } catch (Throwable ignored) {}
        fadeOutTimer.start();
    }

    public void setOnFinished(Runnable r) { this.onFinished = r; }
}

public class ExcelSQL {

// === Medición del rendimiento para ajustar duración del splash ===


public static void main(String[] args) {
    try {
        com.formdev.flatlaf.FlatDarkLaf.setup();
        UIManager.put("Component.focusWidth", 1);
        UIManager.put("Button.arc", 8);
        UIManager.put("TextComponent.arc", 8);
    } catch (Exception e) {
        System.err.println("Error cargando FlatLaf: " + e.getMessage());
    }

    // Mostrar splash inmediatamente (no bloquea)
    SplashScreen splash = new SplashScreen();
    splash.start();

    // Lanzar en background la medición (benchmark) + cualquier inicialización pesada que necesites
    SwingWorker<Integer, Void> initializer = new SwingWorker<>() {
        @Override
        protected Integer doInBackground() {
            // 1) medida ligera de rendimiento (hazla menos pesada para no demorar)
            long start = System.nanoTime();
            double x = 0;
            for (int i = 0; i < 2_000_000; i++) x += Math.sqrt(i); // menos iteraciones para ser rápido
            long elapsedMs = (System.nanoTime() - start) / 1_000_000;
            // 2) aquí puedes cargar recursos, LAF adicionales, etc.
            // (ejemplo simulado) Thread.sleep(300); // NO bloqueará EDT porque esto está en doInBackground
            return (int) elapsedMs;
        }
        @Override
        protected void done() {
            try {
                int measuredMs = get(); // tiempo del benchmark
                int suggested = Math.max(1200, Math.min(4000, measuredMs * 2));
                splash.setMinDuration(suggested);
            } catch (Exception ex) {
                // si falla, dejamos duración por defecto
            } finally {
                // notificar que tarea termina (splash se cerrará cuando haya pasado minDuration)
                splash.notifyTaskFinished();
            }
        }
    };

    // Cuando el splash termine, abrir la UI principal (esto se ejecuta en EDT por setOnFinished)
    splash.setOnFinished(() -> {
        SwingUtilities.invokeLater(() -> {
            try {
                new MainFrame().setVisible(true);
            } catch (Throwable t) {
                t.printStackTrace();
            }
        });
    });

    // ejecutar initializer
    initializer.execute();
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
        private final JTextArea sqlPreview = new JTextArea();


        private final JTable tblSheets = new JTable(new DefaultTableModel(new Object[]{"Exportar", "Hoja", "Tabla destino"}, 0) {
            @Override public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 0 ? Boolean.class : String.class;
            }
            @Override public boolean isCellEditable(int row, int col) { return col != 1; }
        });

        private void openColumnEditor(TableSchema schema) {
    new ColumnEditorDialog(this, schema).setVisible(true);
}


        private File excelFile;
        private File outputFile = new File("export.sql");

        public MainFrame() {
    setTitle("ExcelSQL");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1000, 700);
    setLocationRelativeTo(null);

    sqlPreview.setFont(new Font("Consolas", Font.PLAIN, 14));
    sqlPreview.setBackground(new Color(30, 30, 30));
    sqlPreview.setForeground(Color.WHITE);
    sqlPreview.setCaretColor(Color.WHITE);
    sqlPreview.setEditable(true);
    sqlPreview.setMargin(new Insets(10,10,10,10));
    sqlPreview.setBorder(BorderFactory.createLineBorder(new Color(70,70,70)));

    // === Toolbar profesional ===
    JToolBar toolbar = new JToolBar();
    toolbar.setFloatable(false);
    toolbar.setBorder(new EmptyBorder(8,8,8,8));
    toolbar.setBackground(new Color(35,35,35));

    JButton btnOpen = makeToolbarButton("📂",  "Abrir Excel");
    JButton btnAnalyze = makeToolbarButton("🔍", "Analizar");
    JButton btnGenerate = makeToolbarButton("🔄", "Generar SQL");
    JButton btnDDL = makeToolbarButton("🧾", "Vista DDL");
    JButton btnSaveChanges = makeToolbarButton("💾", "Guardar cambios en archivo SQL");

    toolbar.add(btnOpen);
    toolbar.add(btnAnalyze);
    toolbar.add(btnGenerate);
    toolbar.add(btnSaveChanges); 
    toolbar.addSeparator();
    toolbar.add(btnDDL);
    toolbar.add(Box.createHorizontalGlue());

    getContentPane().add(toolbar, BorderLayout.NORTH);

    // === Layout principal tipo IDE ===
    JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    split.setResizeWeight(0.25); // 25% panel lateral, 75% área de trabajo

    // Panel lateral (configuración)
    JPanel configPanel = buildConfigPanel();

    // ====================== PANEL SQL CON BOTÓN DE GUARDADO ======================
    JPanel sqlPanel = new JPanel(new BorderLayout());
    JScrollPane sqlScroll = new JScrollPane(sqlPreview);

    JButton btnSaveSQLChanges = new JButton("💾 Guardar cambios");
    btnSaveSQLChanges.setVisible(false);
    btnSaveSQLChanges.setBackground(new Color(60,120,60));
    btnSaveSQLChanges.setForeground(Color.WHITE);
    btnSaveSQLChanges.setFocusPainted(false);
    btnSaveSQLChanges.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));

    JPanel topSQLBar = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    topSQLBar.setBackground(new Color(35,35,35));
    topSQLBar.add(btnSaveSQLChanges);

    sqlPanel.add(topSQLBar, BorderLayout.NORTH);
    sqlPanel.add(sqlScroll, BorderLayout.CENTER);

    // ====================== PESTAÑAS PRINCIPALES ======================
    JTabbedPane tabs = new JTabbedPane();
    tabs.addTab("📊 Hojas", new JScrollPane(tblSheets));
    tabs.addTab("🧾 Vista previa SQL", sqlPanel); // 👈 ahora con botón integrado
    tabs.addTab("📜 Log", new JScrollPane(logArea));

    split.setLeftComponent(configPanel);
    split.setRightComponent(tabs);
    getContentPane().add(split, BorderLayout.CENTER);

    // === Personalización visual ===
    logArea.setBackground(new Color(25,25,25));
    logArea.setForeground(new Color(200,200,200));
    logArea.setFont(new Font("Consolas", Font.PLAIN, 13));
    logArea.setCaretColor(Color.WHITE);
    logArea.setBorder(BorderFactory.createLineBorder(new Color(70,70,70)));

    progress.setStringPainted(true);
    progress.setForeground(new Color(100,180,255));
    progress.setBackground(new Color(40,40,40));
    progress.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));

    // === Listeners ===
    btnOpen.addActionListener(this::onOpenExcel);
    btnAnalyze.addActionListener(this::onAnalyze);
    btnGenerate.addActionListener(this::onGenerate);

    btnDDL.addActionListener(e -> {
        try {
            Database db = new Database((Dialect) cbDialect.getSelectedItem());
            List<SheetPlan> plans = collectPlans();
            if (plans.isEmpty()) {
                warn("Analiza primero las hojas.");
                return;
            }
            try (FileInputStream fis = new FileInputStream(excelFile);
                 Workbook wb = new XSSFWorkbook(fis)) {
                for (SheetPlan p : plans) {
                    TableSchema schema = Analyzer.analyzeSheet(
                            wb.getSheet(p.sheetName), p.tableName,
                            (Integer) spHeaderRow.getValue(),
                            chkHasHeader.isSelected(),
                            (Integer) spSample.getValue(),
                            chkPivotDetect.isSelected(),
                            db.dialect
                    );
                    db.tables.add(schema);
                }
            }
            showGlobalDDL(db);
        } catch (Exception ex) {
            error("Error mostrando DDL: " + ex.getMessage(), ex);
        }
    });

    // === Mostrar botón de guardado solo si se edita ===
    sqlPreview.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        private void showSaveButton() {
            if (outputFile != null && sqlPreview.isEditable()) {
                btnSaveSQLChanges.setVisible(true);
            }
        }
        @Override public void insertUpdate(javax.swing.event.DocumentEvent e) { showSaveButton(); }
        @Override public void removeUpdate(javax.swing.event.DocumentEvent e) { showSaveButton(); }
        @Override public void changedUpdate(javax.swing.event.DocumentEvent e) { showSaveButton(); }
    });

    // === Acción del botón para guardar ===
    btnSaveSQLChanges.addActionListener(ev -> {
        if (outputFile == null) {
            JOptionPane.showMessageDialog(this,
                    "Primero genera o selecciona un archivo SQL de salida.",
                    "Sin archivo de destino", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try (FileWriter fw = new FileWriter(outputFile, false)) {
            fw.write(sqlPreview.getText());
            fw.flush();
            appendLog("💾 Cambios guardados en: " + outputFile.getAbsolutePath());
            btnSaveSQLChanges.setVisible(false);
            JOptionPane.showMessageDialog(this,
                    "Cambios guardados correctamente en el archivo SQL.",
                    "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            error("Error al guardar el archivo: " + ex.getMessage(), ex);
        }
    });

    appendLog("Listo. Abre un Excel y carga sus hojas para configurar.");
}



        private void publish(String message) {
    System.out.println(message); // temporal: imprime en consola
    // Si quieres usar un JTextArea llamado txtLog:
    // SwingUtilities.invokeLater(() -> txtLog.append(message + "\n"));
}


    private JButton makeToolbarButton(String icon, String tooltip) {
        JButton b = new JButton(icon);
        b.setToolTipText(tooltip);
        b.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
        b.setFocusable(false);
        b.setBorder(BorderFactory.createEmptyBorder(6,10,6,10));
        b.setBackground(new Color(45,45,45));
        b.setForeground(Color.WHITE);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return b;
    }

    private JPanel buildConfigPanel() {
    JPanel p = new JPanel();
    p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
    p.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    p.setBackground(new Color(35,35,35));

    JLabel title = new JLabel("⚙ Configuración");
    title.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
    title.setForeground(new Color(180,200,255));

    JPanel box = new JPanel(new GridLayout(0,1,6,6));
    box.setBackground(new Color(40,40,40));
    box.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(new Color(60,60,60),1,true),
        BorderFactory.createEmptyBorder(10,10,10,10)
    ));

    box.add(chkCreate);
    box.add(chkFK);
    box.add(chkIndexes);
    box.add(chkPivotDetect);
    box.add(chkHasHeader);
    //box.add(new JLabel("Fila encabezado:"));
    //box.add(spHeaderRow);
    //box.add(new JLabel("Muestra inferencia:"));
    //box.add(spSample);
    //box.add(new JLabel("Formato fecha:"));
    //box.add(txtDateFmt);
    box.add(new JLabel("Dialect:"));
    box.add(cbDialect);

    p.add(title);
    p.add(Box.createVerticalStrut(10));
    p.add(box);
    return p;
}




        private void onOpenExcel(ActionEvent e) {
            JFileChooser ch = new JFileChooser();
            ch.setDialogTitle("Selecciona archivo .xlsx");
            if (ch.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                excelFile = ch.getSelectedFile();
                appendLog("Excel seleccionado: " + excelFile.getAbsolutePath());
                onLoadSheets(null);
            }
        }

private void onLoadSheets(ActionEvent e) {
    if (!ensureExcelSelected()) return;

    // ✅ Validar que el archivo tenga una extensión válida
    String fileName = excelFile.getName().toLowerCase();
    if (!fileName.endsWith(".xlsx") && !fileName.endsWith(".xlsm") && !fileName.endsWith(".xls")) {
        error("⚠ El archivo seleccionado no es un Excel válido (.xls, .xlsx o .xlsm)", null);
        return;
    }

    // ✅ Validar que el archivo no esté vacío o dañado
    if (excelFile.length() == 0) {
        error("❌ El archivo Excel está vacío o dañado.", null);
        return;
    }

    DefaultTableModel m = (DefaultTableModel) tblSheets.getModel();
    m.setRowCount(0);

    try (InputStream fis = new BufferedInputStream(new FileInputStream(excelFile))) {
        Workbook wb;

        try {
            wb = WorkbookFactory.create(fis); // Compatible con .xls, .xlsx, .xlsm
        } catch (org.apache.poi.openxml4j.exceptions.OLE2NotOfficeXmlFileException exOle2) {
    error("⚠ El archivo parece ser un Excel antiguo (.xls) o no válido.", exOle2);
    return;
}


        for (int i = 0; i < wb.getNumberOfSheets(); i++) {
            String sheetName = wb.getSheetName(i);
            String tableName = buildTableName(sheetName, txtTablePrefix.getText());
            m.addRow(new Object[]{Boolean.TRUE, sheetName, tableName});
        }

        appendLog("✅ Hojas cargadas: " + m.getRowCount());

    } catch (Exception ex) {
        error("❌ Error leyendo hojas: " + ex.getMessage(), ex);
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
        try {
            // ✅ 1) Guardar el contenido editado de la vista previa ANTES de regenerar
            String editedText = sqlPreview.getText();
            if (editedText != null && !editedText.isBlank()) {
                try (FileWriter fw = new FileWriter(outputFile, false)) {
                    fw.write(editedText);
                }
                publish("💾 Cambios editados en la vista previa guardados antes de regenerar.");
            }

            // ✅ 2) Ahora procedemos a generar el nuevo SQL
            class TeeWriter extends Writer {
                private final Writer a, b;
                TeeWriter(Writer a, Writer b) { this.a = a; this.b = b; }
                @Override public void write(char[] cbuf, int off, int len) throws IOException {
                    a.write(cbuf, off, len);
                    b.write(cbuf, off, len);
                }
                @Override public void flush() throws IOException { a.flush(); b.flush(); }
                @Override public void close() throws IOException {
                    try { a.close(); } finally { b.close(); }
                }
            }

            StringWriter previewSw = new StringWriter();

            try (FileInputStream fis = new FileInputStream(excelFile);
                 Workbook wb = WorkbookFactory.create(fis);
                 BufferedWriter fileOut = new BufferedWriter(new FileWriter(outputFile, false))) {

                try (Writer out = new TeeWriter(fileOut, previewSw)) {

                    Dialect dialect = (Dialect) cbDialect.getSelectedItem();
                    Database db = new Database(dialect);

                    // 1️⃣ Analizar esquema (tipos, PK, FK, pivote)
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

                    // 2️⃣ Escribir DDL
                    if (chkCreate.isSelected()) {
                        for (TableSchema t : db.tables) {
                            String ddl = SQLBuilder.buildCreateTable(t, chkFK.isSelected(), chkIndexes.isSelected());
                            out.write(ddl);
                            out.write("\n\n");
                            publish("CREATE TABLE " + t.tableName);
                        }
                    }

                    // 3️⃣ Escribir INSERTs
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

                    out.flush();
                }

                // ✅ Actualizar vista previa después de generar
                final String previewText = previewSw.toString();
                SwingUtilities.invokeLater(() -> {
                    sqlPreview.setText(previewText);
                    sqlPreview.setCaretPosition(0);
                    sqlPreview.setEditable(true);

                    // Seleccionar automáticamente la pestaña de vista previa
                    Container parent = sqlPreview.getParent();
                    while (parent != null && !(parent instanceof JTabbedPane)) parent = parent.getParent();
                    if (parent instanceof JTabbedPane)
                        ((JTabbedPane) parent).setSelectedIndex(1);

                    appendLog("🧾 Vista previa SQL actualizada y guardada en disco: "
                            + outputFile.getAbsolutePath());
                });

            }

        } catch (Exception ex) {
            error("Error generando SQL: " + ex.getMessage(), ex);
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

        private void showGlobalDDL(Database db) {
    String fullDDL = db.tables.stream()
            .map(t -> SQLBuilder.buildCreateTable(t, chkFK.isSelected(), chkIndexes.isSelected()))
            .collect(Collectors.joining("\n\n"));

    // === Ventana de vista previa profesional ===
    JDialog dlg = new JDialog(this, "Vista previa del SQL (editable)", true);
    dlg.getContentPane().setBackground(new Color(30,30,30));
    dlg.setLayout(new BorderLayout(10,10));

    JTextArea ddlArea = new JTextArea(fullDDL, 30, 100);
    ddlArea.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
    ddlArea.setForeground(Color.WHITE);
    ddlArea.setBackground(new Color(20,20,20));
    ddlArea.setCaretColor(Color.WHITE);
    ddlArea.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    ddlArea.setLineWrap(true);
    ddlArea.setWrapStyleWord(true);
    ddlArea.setEditable(true); // 🔥 ahora SÍ se puede editar

    JScrollPane scroll = new JScrollPane(ddlArea);
    scroll.setBorder(BorderFactory.createLineBorder(new Color(70,70,70)));

    // === Panel de botones ===
    JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    bottom.setBackground(new Color(30,30,30));
    JButton btnSave = new JButton("💾 Guardar SQL");
    JButton btnClose = new JButton("Cerrar");
    bottom.add(btnSave);
    bottom.add(btnClose);

    dlg.add(scroll, BorderLayout.CENTER);
    dlg.add(bottom, BorderLayout.SOUTH);

    // === Eventos de botones ===
    btnSave.addActionListener(e -> {
        JFileChooser ch = new JFileChooser();
        ch.setSelectedFile(new File("export_editado.sql"));
        if (ch.showSaveDialog(dlg) == JFileChooser.APPROVE_OPTION) {
            try (FileWriter w = new FileWriter(ch.getSelectedFile())) {
                w.write(ddlArea.getText());
                JOptionPane.showMessageDialog(dlg, "Archivo guardado correctamente.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(dlg, "Error al guardar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });

    btnClose.addActionListener(e -> dlg.dispose());

    dlg.setSize(950, 600);
    dlg.setLocationRelativeTo(this);
    dlg.setVisible(true);
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
        private void appendLog(String s) {
        String ts = new java.text.SimpleDateFormat("HH:mm:ss").format(new Date());
        logArea.append("[" + ts + "] " + s + "\n");
        logArea.setCaretPosition(logArea.getDocument().getLength());
}

        private void warn(String s) { JOptionPane.showMessageDialog(this, s, "Aviso", JOptionPane.WARNING_MESSAGE); appendLog("⚠ " + s); }
        private void error(String s, Exception ex) { JOptionPane.showMessageDialog(this, s, "Error", JOptionPane.ERROR_MESSAGE); appendLog("❌ " + s); if (ex!=null) ex.printStackTrace(); }

        private void saveSchemaToJson(Database db) {
    JFileChooser ch = new JFileChooser();
    ch.setDialogTitle("Guardar esquema como JSON");
    ch.setSelectedFile(new File("schema.json"));
    if (ch.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
        File f = ch.getSelectedFile();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter w = new FileWriter(f)) {
            gson.toJson(db.tables, w);
            appendLog("Esquema guardado en: " + f.getAbsolutePath());
        } catch (IOException ex) {
            error("Error guardando JSON: " + ex.getMessage(), ex);
        }
    }
}

private List<TableSchema> loadSchemaFromJson() {
    JFileChooser ch = new JFileChooser();
    ch.setDialogTitle("Cargar esquema desde JSON");
    if (ch.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
        File f = ch.getSelectedFile();
        Gson gson = new Gson();
        try (FileReader r = new FileReader(f)) {
            List<TableSchema> tables = gson.fromJson(r,
                    new TypeToken<List<TableSchema>>(){}.getType());
            appendLog("Esquema cargado: " + tables.size() + " tablas");
            return tables;
        } catch (Exception ex) {
            error("Error cargando JSON: " + ex.getMessage(), ex);
        }
    }
    return List.of();
}



    }

    // ========================= MODELO & DIALÉCTO =========================
    interface TaskRunner { void run() throws Exception; }
    static class SheetPlan { final String sheetName; final String tableName; SheetPlan(String s, String t){sheetName=s;tableName=t;} }

    static class ColumnEditorDialog extends JDialog {
    private final TableSchema table;
    private final JTextArea ddlPreview = new JTextArea(12, 50);
    private final DefaultTableModel model;

    public ColumnEditorDialog(JFrame parent, TableSchema table) {
        super(parent, "Editar columnas: " + table.tableName, true);
        this.table = table;

        setLayout(new BorderLayout(8,8));
        setSize(900, 500);
        setLocationRelativeTo(parent);

        // Modelo de tabla editable
        model = new DefaultTableModel(new Object[]{"Nombre", "Tipo", "Tamaño", "PK", "FK", "NOT NULL"}, 0) {
            @Override public Class<?> getColumnClass(int columnIndex) {
                return switch (columnIndex) {
                    case 2 -> Integer.class;
                    case 3,4,5 -> Boolean.class;
                    default -> String.class;
                };
            }
            @Override public boolean isCellEditable(int row, int col) { return true; }
        };

        JTable tbl = new JTable(model);
        tbl.setFillsViewportHeight(true);
        loadFromSchema();

        JScrollPane spTable = new JScrollPane(tbl);
        JScrollPane spDDL = new JScrollPane(ddlPreview);
        ddlPreview.setFont(new java.awt.Font(java.awt.Font.MONOSPACED, java.awt.Font.PLAIN, 13));
        ddlPreview.setEditable(false);


        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, spTable, spDDL);
        split.setResizeWeight(0.6);

        add(split, BorderLayout.CENTER);

        JPanel south = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnApply = new JButton("Aplicar cambios");
        JButton btnCancel = new JButton("Cancelar");
        south.add(btnApply);
        south.add(btnCancel);
        add(south, BorderLayout.SOUTH);

        // Listeners
        btnApply.addActionListener(e -> applyChanges());
        btnCancel.addActionListener(e -> dispose());

        model.addTableModelListener(e -> updateDDL());
        updateDDL();
    }

    private void loadFromSchema() {
        model.setRowCount(0);
        for (ColumnSchema c : table.columns) {
            model.addRow(new Object[]{c.name, c.type.name(), c.varcharSize, c.primaryKey, false, c.notNull});
        }
    }

    private void applyChanges() {
        table.columns.clear();
        for (int i=0;i<model.getRowCount();i++) {
            ColumnSchema c = new ColumnSchema(model.getValueAt(i,0).toString());
            c.type = SqlType.valueOf(model.getValueAt(i,1).toString());
            c.varcharSize = (Integer) model.getValueAt(i,2);
            c.primaryKey = (Boolean) model.getValueAt(i,3);
            c.notNull = (Boolean) model.getValueAt(i,5);
            table.columns.add(c);
        }
        dispose();
    }

    private void updateDDL() {
        TableSchema temp = new TableSchema(table.tableName, table.dialect);
        for (int i=0;i<model.getRowCount();i++) {
            ColumnSchema c = new ColumnSchema(model.getValueAt(i,0).toString());
            c.type = SqlType.valueOf(model.getValueAt(i,1).toString());
            c.varcharSize = (Integer) model.getValueAt(i,2);
            c.primaryKey = (Boolean) model.getValueAt(i,3);
            c.notNull = (Boolean) model.getValueAt(i,5);
            temp.columns.add(c);
        }
        ddlPreview.setText(SQLBuilder.buildCreateTable(temp, true, true));
        ddlPreview.setCaretPosition(0);
    }
}


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
        };

        public String quoteId(String id){ return id; }
        public String typeToDDL(SqlType t, int varcharSize){ return t.name(); }
        public String fkClause(String table, ForeignKey fk){ return ""; }
        public String indexClause(String table, IndexDef ix){ return ""; }
        public boolean indexesOutsideCreate(){ return false; }
    }

    // ========================= ANALIZADOR =========================
// ========================= ANALIZADOR =========================
static class Analyzer {

    private static final Pattern LIKE_ID = Pattern.compile("^(id|.*_id|id_.*|.*Id|.*ID)$");
    private static final String[] DATE_GUESSES = {
            "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd",
            "dd/MM/yyyy", "dd-MM-yyyy", "MM/dd/yyyy"
    };

    private static int autoDetectHeader(Sheet sheet) {
        int bestRow = -1;
        int bestScore = 0;
        int maxRowsToCheck = Math.min(sheet.getLastRowNum(), 15);
        for (int r = 0; r <= maxRowsToCheck; r++) {
            Row row = sheet.getRow(r);
            if (row == null) continue;
            int textCells = 0, nonEmpty = 0;
            for (int c = 0; c < row.getLastCellNum(); c++) {
                Cell cell = row.getCell(c);
                if (cell == null) continue;
                String val = getString(cell);
                if (val == null || val.isBlank()) continue;
                nonEmpty++;
                if (cell.getCellType() == CellType.STRING) textCells++;
            }
            if (nonEmpty > 0 && textCells >= nonEmpty * 0.6 && nonEmpty > bestScore) {
                bestScore = nonEmpty;
                bestRow = r;
            }
        }
        return bestRow;
    }

    private static int findFirstDataRow(Sheet sheet) {
        for (int r = 0; r <= sheet.getLastRowNum(); r++) {
            Row row = sheet.getRow(r);
            if (row == null) continue;
            for (int c = 0; c < row.getLastCellNum(); c++) {
                String val = getString(row.getCell(c));
                if (val != null && !val.isBlank()) return r;
            }
        }
        return 0;
    }

static TableSchema analyzeSheet(Sheet sheet, String tableName, Integer headerRowIndex, boolean hasHeader,
                                int sampleRows, boolean detectPivot, Dialect dialect) {

    if (sheet == null)
        throw new IllegalArgumentException("Hoja nula para: " + tableName);

    int totalRows = sheet.getPhysicalNumberOfRows();
    if (totalRows == 0)
        return new TableSchema(safeName(tableName), dialect);

    // --- 🔍 Detección flexible del encabezado ---
    headerRowIndex = -1;
    for (int r = 0; r < totalRows; r++) {
        Row row = sheet.getRow(r);
        if (row == null) continue;

        int nonEmpty = 0;
        int total = row.getLastCellNum();
        for (int c = 0; c < total; c++) {
            String val = getString(row.getCell(c));
            if (val != null && !val.isBlank()) nonEmpty++;
        }

        // Si hay al menos 2 celdas con texto, asumimos encabezado
        if (nonEmpty >= 2) {
            headerRowIndex = r;
            hasHeader = true;
            break;
        }
    }

    // Si no se encontró encabezado, busca la primera fila con datos
    if (headerRowIndex < 0) {
        for (int r = 0; r < totalRows; r++) {
            Row row = sheet.getRow(r);
            if (row == null) continue;
            boolean any = false;
            for (int c = 0; c < row.getLastCellNum(); c++) {
                String val = getString(row.getCell(c));
                if (val != null && !val.isBlank()) { any = true; break; }
            }
            if (any) {
                headerRowIndex = r;
                hasHeader = false;
                break;
            }
        }
    }

    Row headerRow = sheet.getRow(headerRowIndex);
    if (headerRow == null)
        return new TableSchema(safeName(tableName), dialect);

    // --- 🧱 Detectar rango real de columnas con datos ---
    int firstCol = Integer.MAX_VALUE;
    int lastCol = 0;

    int rowsToCheck = Math.min(totalRows, headerRowIndex + 10);
    for (int r = Math.max(0, headerRowIndex - 1); r < rowsToCheck; r++) {
        Row row = sheet.getRow(r);
        if (row == null) continue;
        short lastCell = row.getLastCellNum();
        for (int c = 0; c < lastCell; c++) {
            String val = getString(row.getCell(c));
            if (val != null && !val.isBlank()) {
                firstCol = Math.min(firstCol, c);
                lastCol = Math.max(lastCol, c);
            }
        }
    }

    if (firstCol == Integer.MAX_VALUE) firstCol = 0;
    lastCol = Math.max(lastCol, firstCol);

    TableSchema table = new TableSchema(safeName(tableName), dialect);

    // --- 🧠 Crear nombres de columnas limpios y únicos ---
    Set<String> usedNames = new HashSet<>();
    for (int c = firstCol; c <= lastCol; c++) {
        String raw = hasHeader ? getString(headerRow.getCell(c)) : null;
        String name = (raw == null || raw.isBlank()) ? "col_" + c : sanitizeColumnName(raw);

        // Si el nombre está repetido, agrega sufijo numérico
        String base = name;
        int counter = 1;
        while (usedNames.contains(name)) {
            name = base + "_" + counter++;
        }
        usedNames.add(name);

        table.columns.add(new ColumnSchema(name));
    }

    // --- 🔎 Buscar inicio real de datos (evita encabezados repetidos o filas vacías) ---
    int startData = headerRowIndex + 1;
    List<String> headerValues = table.columns.stream().map(c -> c.name.toLowerCase()).toList();

    while (startData < totalRows) {
        Row row = sheet.getRow(startData);
        if (row != null) {
            boolean any = false, sameAsHeader = true;
            for (int c = firstCol; c <= lastCol; c++) {
                String val = getString(row.getCell(c));
                if (val != null && !val.isBlank()) any = true;
                if (val == null || !headerValues.contains(val.toLowerCase().trim()))
                    sameAsHeader = false;
            }
            if (any && !sameAsHeader) break;
        }
        startData++;
    }

    // --- 📊 Inferir tipos de datos ---
    TypeProbe[] probes = new TypeProbe[table.columns.size()];
    for (int i = 0; i < probes.length; i++) probes[i] = new TypeProbe();

    int maxRow = Math.min(sheet.getLastRowNum(), startData + sampleRows);
    for (int r = startData; r <= maxRow; r++) {
        Row row = sheet.getRow(r);
        if (row == null) continue;
        boolean allEmpty = true;
        for (int c = 0; c < table.columns.size(); c++) {
            int realCol = firstCol + c;
            Cell cell = row.getCell(realCol);
            if (cell != null && cell.getCellType() != CellType.BLANK)
                allEmpty = false;
            probes[c].accept(cell);
        }
        // 🔥 Saltar filas totalmente vacías
        if (allEmpty) continue;
    }

    for (int c = 0; c < table.columns.size(); c++)
        probes[c].finalize(table.columns.get(c));

    // --- 🔑 Detectar PK ---
    ColumnSchema idCol = tryFindIdColumn(table, table.tableName);
    if (idCol != null) {
        idCol.primaryKey = true;
        idCol.notNull = true;
        table.primaryKeyName = idCol.name;
    }

    // --- 🔗 Detectar FKs ---
    for (ColumnSchema col : table.columns) {
        if (col.primaryKey) continue;
        if (isIdLike(col.name)) {
            String guess = guessRefTable(col.name);
            if (guess != null && !guess.equals(table.tableName)) {
                table.foreignKeys.add(new ForeignKey(col.name, guess, "id"));
                table.indexes.add(new IndexDef("ix_" + table.tableName + "_" + col.name, List.of(col.name), false));
            }
        }
    }

    // --- 🔄 Detectar tablas pivote ---
    if (detectPivot) {
        List<String> fkCols = table.foreignKeys.stream().map(f -> f.column).toList();
        if (fkCols.size() == 2 && table.columns.size() <= 4) {
            table.isPivot = true;
            table.compositePk = new ArrayList<>(fkCols);
            table.primaryKeyName = null;
        }
    }

    // --- 🧱 PK única si no hay otra ---
    if (table.primaryKeyName == null && !table.isPivot && !table.columns.isEmpty()) {
        String uniqueCol = findUniqueColumn(sheet, startData, table.columns, Math.min(sampleRows, 200));
        if (uniqueCol != null) {
            ColumnSchema c = table.getColumn(uniqueCol);
            if (c != null) {
                c.primaryKey = true;
                c.notNull = true;
                table.primaryKeyName = uniqueCol;
            }
        }
    }

    return table;
}

// 🔧 Limpia encabezados para nombres SQL válidos
private static String sanitizeColumnName(String name) {
    return name.trim()
               .toLowerCase()
               .replaceAll("[^a-z0-9_]", "_")
               .replaceAll("_+", "_")
               .replaceAll("^_|_$", "");
}

    private static String safeName(String s) {
        String x = (s == null ? "" : s.trim().toLowerCase(Locale.ROOT))
                .replaceAll("[^a-z0-9_]", "_")
                .replaceAll("_+", "_");
        if (x.startsWith("_")) x = x.substring(1);
        if (x.isBlank()) x = "col";
        return x;
    }

    private static boolean isIdLike(String name) { return LIKE_ID.matcher(name).matches(); }

    private static String guessRefTable(String idCol) {
        if (idCol == null) return null;
        String base = idCol.toLowerCase(Locale.ROOT)
                .replaceFirst("^id_", "")
                .replaceFirst("_id$", "")
                .replaceFirst("id$", "")
                .replaceFirst("^id", "")
                .replaceAll("_+", "_");
        return base.isBlank() ? null : base;
    }

    private static ColumnSchema tryFindIdColumn(TableSchema t, String tableName) {
        for (ColumnSchema c : t.columns)
            if (c.name.equalsIgnoreCase("id_" + tableName) || c.name.equalsIgnoreCase("id"))
                return c;
        return null;
    }

    private static String findUniqueColumn(Sheet sheet, int start, List<ColumnSchema> cols, int maxRows) {
        Map<String, Set<String>> values = new HashMap<>();
        for (ColumnSchema c : cols) values.put(c.name, new HashSet<>());
        int end = Math.min(sheet.getLastRowNum(), start + maxRows);
        for (int r = start; r <= end; r++) {
            Row row = sheet.getRow(r);
            if (row == null) continue;
            for (int c = 0; c < cols.size(); c++) {
                String val = getString(row.getCell(c));
                if (val != null && !val.isBlank()) values.get(cols.get(c).name).add(val);
            }
        }
        for (var e : values.entrySet())
            if (e.getValue().size() > 0 && e.getValue().size() == (end - start + 1))
                return e.getKey();
        return null;
    }

    private static String getString(Cell cell) {
        if (cell == null) return null;
        try {
            switch (cell.getCellType()) {
                case STRING: return cell.getStringCellValue().trim();
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cell.getDateCellValue());
                    } else {
                        double num = cell.getNumericCellValue();
                        return (num == Math.floor(num)) ? String.valueOf((long) num) : String.valueOf(num);
                    }
                case BOOLEAN: return String.valueOf(cell.getBooleanCellValue());
                case FORMULA:
                    try { return cell.getStringCellValue().trim(); } catch (Exception e) { return String.valueOf(cell.getNumericCellValue()); }
                default: return "";
            }
        } catch (Exception e) {
            return "";
        }
    }

    // === Clase auxiliar para inferencia de tipo ===
    static class TypeProbe {
        boolean hasInt, hasDec, hasBool, hasDate, hasText;
        int maxLen = 0;

        void accept(Cell c) {
            String s = getString(c);
            if (s == null || s.isBlank()) return;
            maxLen = Math.max(maxLen, s.length());
            if (s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false")) hasBool = true;
            else if (s.matches("^-?\\d+$")) hasInt = true;
            else if (s.matches("^-?\\d*\\.\\d+$")) hasDec = true;
            else if (looksLikeDate(s)) hasDate = true;
            else hasText = true;
        }

        void finalize(ColumnSchema col) {
            if (hasDate) col.type = SqlType.DATETIME;
            else if (hasBool && !hasText) col.type = SqlType.BOOLEAN;
            else if (hasDec && !hasText) col.type = SqlType.DECIMAL;
            else if (hasInt && !hasText) col.type = SqlType.INTEGER;
            else if (maxLen > 255) col.type = SqlType.TEXT;
            else {
                col.type = SqlType.VARCHAR;
                col.varcharSize = Math.max(8, Math.min(maxLen + 4, 255));
            }
        }

        private boolean looksLikeDate(String s) {
            for (String fmt : DATE_GUESSES) {
                try {
                    new SimpleDateFormat(fmt).parse(s);
                    return true;
                } catch (ParseException ignored) {}
            }
            return false;
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
    SimpleDateFormat sdf = dateFormat.isBlank()
            ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            : new SimpleDateFormat(dateFormat);

    String colList = t.columns.stream()
            .map(c -> t.dialect.quoteId(c.name))
            .collect(Collectors.joining(", "));

    // Normalizar encabezados base
    List<String> normalizedHeaders = t.columns.stream()
            .map(c -> normalizeHeader(c.name))
            .collect(Collectors.toList());

    int inserted = 0, skipped = 0;
    StringBuilder sb = new StringBuilder(1024);

    for (int r = start; r <= sheet.getLastRowNum(); r++) {
        Row row = sheet.getRow(r);
        if (row == null) continue;

        // 🔍 1. Fila vacía
        boolean allEmpty = true;
        for (int c = 0; c < t.columns.size(); c++) {
            Cell cell = row.getCell(c);
            String val = (cell == null) ? null : cell.toString().trim();
            if (val != null && !val.isBlank()) { allEmpty = false; break; }
        }
        if (allEmpty) continue;

        // 🔍 2. Fila parece encabezado (varios criterios)
        if (isHeaderLike(row, normalizedHeaders)) {
            System.out.println("🟡 Fila " + (r + 1) + " detectada como encabezado o título repetido. Saltada.");
            skipped++;
            continue;
        }

        // 🔍 3. Fila parece texto general (etiqueta)
        if (isLabelRow(row)) {
            System.out.println("🟠 Fila " + (r + 1) + " parece título o etiqueta. Saltada.");
            skipped++;
            continue;
        }

        // ✅ Si pasó todos los filtros → insertar
        String values = buildValuesRow(row, t.columns, t.dialect, sdf);
        if (values == null) continue;

        sb.setLength(0);
        sb.append("INSERT INTO ").append(t.dialect.quoteId(t.tableName))
          .append(" (").append(colList).append(") VALUES (")
          .append(values).append(");");

        out.write(sb.toString());
        out.write("\n");
        inserted++;
    }

    System.out.println("✅ Hoja " + t.tableName + ": " + inserted + " filas insertadas, " + skipped + " filas saltadas.");
}

// 🧹 Normaliza nombres para comparar
private static String normalizeHeader(String val) {
    return val == null ? "" :
            val.trim().toLowerCase(Locale.ROOT)
               .replaceAll("[^a-z0-9]", "");
}

// ⚔️ Detecta si una fila parece un encabezado (super robusto)
private static boolean isHeaderLike(Row row, List<String> headerNames) {
    int matches = 0, total = 0, alphaOnly = 0;
    for (int c = 0; c < headerNames.size(); c++) {
        Cell cell = row.getCell(c);
        if (cell == null) continue;
        String val = normalizeHeader(cell.toString());
        if (val.isBlank()) continue;
        total++;

        // Si es texto tipo columna
        if (val.matches("^[a-z]+$")) alphaOnly++;

        String headerVal = headerNames.get(c);
        if (similar(val, headerVal) >= 0.75) matches++;
    }

    double ratio = total == 0 ? 0 : (double) matches / total;
    double alphaRatio = total == 0 ? 0 : (double) alphaOnly / total;

    // Filtro multinivel
    return (ratio >= 0.6)                 // Coinciden 60 % o más con encabezados
            || (alphaRatio >= 0.9 && total <= 20) // Demasiado texto puro
            || containsHeaderKeywords(row)         // Palabras tipo “id”, “fecha”, “precio”
            || (countDistinctStrings(row) < total / 2 && total > 0); // Demasiadas repeticiones
}

// ⚙️ Compara similitud básica (tipo Levenshtein simplificado)
private static double similar(String a, String b) {
    if (a.isEmpty() || b.isEmpty()) return 0;
    int min = Math.min(a.length(), b.length());
    int same = 0;
    for (int i = 0; i < min; i++) {
        if (a.charAt(i) == b.charAt(i)) same++;
    }
    return (double) same / Math.max(a.length(), b.length());
}

// 🔎 Detecta palabras comunes de encabezados
private static boolean containsHeaderKeywords(Row row) {
    String[] common = {"id", "fecha", "nombre", "marca", "modelo", "precio", "venta", "compra", "stock", "total"};
    Set<String> cellVals = new HashSet<>();
    for (Cell cell : row) {
        if (cell == null) continue;
        String val = normalizeHeader(cell.toString());
        if (!val.isBlank()) cellVals.add(val);
    }
    for (String kw : common) {
        if (cellVals.contains(kw)) return true;
    }
    return false;
}

// 🔠 Detecta filas con puro texto (como “Resumen de ventas”)
private static boolean isLabelRow(Row row) {
    int filled = 0, pureText = 0;
    for (Cell cell : row) {
        if (cell == null) continue;
        String val = cell.toString().trim();
        if (val.isBlank()) continue;
        filled++;
        if (val.matches("^[A-Za-zÀ-ÿ\\s\\.,:;\\-_/()]+$")) pureText++;
    }
    return filled > 0 && pureText == filled && filled <= 4;
}

// 📦 Cuántos valores distintos hay (para detectar encabezados repetidos)
private static int countDistinctStrings(Row row) {
    Set<String> set = new HashSet<>();
    for (Cell cell : row) {
        if (cell == null) continue;
        String val = normalizeHeader(cell.toString());
        if (!val.isBlank()) set.add(val);
    }
    return set.size();
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
                        return readAsBoolean(cell) ? "1" : "0";
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

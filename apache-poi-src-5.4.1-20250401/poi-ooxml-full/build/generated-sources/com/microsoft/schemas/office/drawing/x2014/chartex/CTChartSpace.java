/*
 * XML Type:  CT_ChartSpace
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTChartSpace
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ChartSpace(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTChartSpace extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTChartSpace> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctchartspacec57etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "chartData" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTChartData getChartData();

    /**
     * Sets the "chartData" element
     */
    void setChartData(com.microsoft.schemas.office.drawing.x2014.chartex.CTChartData chartData);

    /**
     * Appends and returns a new empty "chartData" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTChartData addNewChartData();

    /**
     * Gets the "chart" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTChart getChart();

    /**
     * Sets the "chart" element
     */
    void setChart(com.microsoft.schemas.office.drawing.x2014.chartex.CTChart chart);

    /**
     * Appends and returns a new empty "chart" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTChart addNewChart();

    /**
     * Gets the "spPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr();

    /**
     * True if has "spPr" element
     */
    boolean isSetSpPr();

    /**
     * Sets the "spPr" element
     */
    void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr);

    /**
     * Appends and returns a new empty "spPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr();

    /**
     * Unsets the "spPr" element
     */
    void unsetSpPr();

    /**
     * Gets the "txPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxPr();

    /**
     * True if has "txPr" element
     */
    boolean isSetTxPr();

    /**
     * Sets the "txPr" element
     */
    void setTxPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txPr);

    /**
     * Appends and returns a new empty "txPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxPr();

    /**
     * Unsets the "txPr" element
     */
    void unsetTxPr();

    /**
     * Gets the "clrMapOvr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping getClrMapOvr();

    /**
     * True if has "clrMapOvr" element
     */
    boolean isSetClrMapOvr();

    /**
     * Sets the "clrMapOvr" element
     */
    void setClrMapOvr(org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping clrMapOvr);

    /**
     * Appends and returns a new empty "clrMapOvr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping addNewClrMapOvr();

    /**
     * Unsets the "clrMapOvr" element
     */
    void unsetClrMapOvr();

    /**
     * Gets the "fmtOvrs" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverrides getFmtOvrs();

    /**
     * True if has "fmtOvrs" element
     */
    boolean isSetFmtOvrs();

    /**
     * Sets the "fmtOvrs" element
     */
    void setFmtOvrs(com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverrides fmtOvrs);

    /**
     * Appends and returns a new empty "fmtOvrs" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverrides addNewFmtOvrs();

    /**
     * Unsets the "fmtOvrs" element
     */
    void unsetFmtOvrs();

    /**
     * Gets the "printSettings" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPrintSettings getPrintSettings();

    /**
     * True if has "printSettings" element
     */
    boolean isSetPrintSettings();

    /**
     * Sets the "printSettings" element
     */
    void setPrintSettings(com.microsoft.schemas.office.drawing.x2014.chartex.CTPrintSettings printSettings);

    /**
     * Appends and returns a new empty "printSettings" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPrintSettings addNewPrintSettings();

    /**
     * Unsets the "printSettings" element
     */
    void unsetPrintSettings();

    /**
     * Gets the "extLst" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList getExtLst();

    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();

    /**
     * Sets the "extLst" element
     */
    void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst);

    /**
     * Appends and returns a new empty "extLst" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
}

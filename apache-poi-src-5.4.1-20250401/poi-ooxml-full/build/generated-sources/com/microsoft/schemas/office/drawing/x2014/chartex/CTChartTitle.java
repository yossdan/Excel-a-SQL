/*
 * XML Type:  CT_ChartTitle
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTChartTitle
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ChartTitle(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTChartTitle extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTChartTitle> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcharttitle1c6ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "tx" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTText getTx();

    /**
     * True if has "tx" element
     */
    boolean isSetTx();

    /**
     * Sets the "tx" element
     */
    void setTx(com.microsoft.schemas.office.drawing.x2014.chartex.CTText tx);

    /**
     * Appends and returns a new empty "tx" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTText addNewTx();

    /**
     * Unsets the "tx" element
     */
    void unsetTx();

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

    /**
     * Gets the "pos" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STSidePos.Enum getPos();

    /**
     * Gets (as xml) the "pos" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STSidePos xgetPos();

    /**
     * True if has "pos" attribute
     */
    boolean isSetPos();

    /**
     * Sets the "pos" attribute
     */
    void setPos(com.microsoft.schemas.office.drawing.x2014.chartex.STSidePos.Enum pos);

    /**
     * Sets (as xml) the "pos" attribute
     */
    void xsetPos(com.microsoft.schemas.office.drawing.x2014.chartex.STSidePos pos);

    /**
     * Unsets the "pos" attribute
     */
    void unsetPos();

    /**
     * Gets the "align" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STPosAlign.Enum getAlign();

    /**
     * Gets (as xml) the "align" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STPosAlign xgetAlign();

    /**
     * True if has "align" attribute
     */
    boolean isSetAlign();

    /**
     * Sets the "align" attribute
     */
    void setAlign(com.microsoft.schemas.office.drawing.x2014.chartex.STPosAlign.Enum align);

    /**
     * Sets (as xml) the "align" attribute
     */
    void xsetAlign(com.microsoft.schemas.office.drawing.x2014.chartex.STPosAlign align);

    /**
     * Unsets the "align" attribute
     */
    void unsetAlign();

    /**
     * Gets the "overlay" attribute
     */
    boolean getOverlay();

    /**
     * Gets (as xml) the "overlay" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetOverlay();

    /**
     * True if has "overlay" attribute
     */
    boolean isSetOverlay();

    /**
     * Sets the "overlay" attribute
     */
    void setOverlay(boolean overlay);

    /**
     * Sets (as xml) the "overlay" attribute
     */
    void xsetOverlay(org.apache.xmlbeans.XmlBoolean overlay);

    /**
     * Unsets the "overlay" attribute
     */
    void unsetOverlay();
}

/*
 * XML Type:  CT_DataLabel
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_DataLabel(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTDataLabel extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdatalabel1146type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "numFmt" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat getNumFmt();

    /**
     * True if has "numFmt" element
     */
    boolean isSetNumFmt();

    /**
     * Sets the "numFmt" element
     */
    void setNumFmt(com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat numFmt);

    /**
     * Appends and returns a new empty "numFmt" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat addNewNumFmt();

    /**
     * Unsets the "numFmt" element
     */
    void unsetNumFmt();

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
     * Gets the "visibility" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelVisibilities getVisibility();

    /**
     * True if has "visibility" element
     */
    boolean isSetVisibility();

    /**
     * Sets the "visibility" element
     */
    void setVisibility(com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelVisibilities visibility);

    /**
     * Appends and returns a new empty "visibility" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelVisibilities addNewVisibility();

    /**
     * Unsets the "visibility" element
     */
    void unsetVisibility();

    /**
     * Gets the "separator" element
     */
    java.lang.String getSeparator();

    /**
     * Gets (as xml) the "separator" element
     */
    org.apache.xmlbeans.XmlString xgetSeparator();

    /**
     * True if has "separator" element
     */
    boolean isSetSeparator();

    /**
     * Sets the "separator" element
     */
    void setSeparator(java.lang.String separator);

    /**
     * Sets (as xml) the "separator" element
     */
    void xsetSeparator(org.apache.xmlbeans.XmlString separator);

    /**
     * Unsets the "separator" element
     */
    void unsetSeparator();

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
     * Gets the "idx" attribute
     */
    long getIdx();

    /**
     * Gets (as xml) the "idx" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetIdx();

    /**
     * Sets the "idx" attribute
     */
    void setIdx(long idx);

    /**
     * Sets (as xml) the "idx" attribute
     */
    void xsetIdx(org.apache.xmlbeans.XmlUnsignedInt idx);

    /**
     * Gets the "pos" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos.Enum getPos();

    /**
     * Gets (as xml) the "pos" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos xgetPos();

    /**
     * True if has "pos" attribute
     */
    boolean isSetPos();

    /**
     * Sets the "pos" attribute
     */
    void setPos(com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos.Enum pos);

    /**
     * Sets (as xml) the "pos" attribute
     */
    void xsetPos(com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos pos);

    /**
     * Unsets the "pos" attribute
     */
    void unsetPos();
}

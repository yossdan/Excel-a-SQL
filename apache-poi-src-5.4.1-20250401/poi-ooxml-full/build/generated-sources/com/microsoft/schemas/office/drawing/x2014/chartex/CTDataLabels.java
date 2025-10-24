/*
 * XML Type:  CT_DataLabels
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_DataLabels(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTDataLabels extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdatalabels7c1dtype");
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
     * Gets a List of "dataLabel" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel> getDataLabelList();

    /**
     * Gets array of all "dataLabel" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel[] getDataLabelArray();

    /**
     * Gets ith "dataLabel" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel getDataLabelArray(int i);

    /**
     * Returns number of "dataLabel" element
     */
    int sizeOfDataLabelArray();

    /**
     * Sets array of all "dataLabel" element
     */
    void setDataLabelArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel[] dataLabelArray);

    /**
     * Sets ith "dataLabel" element
     */
    void setDataLabelArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel dataLabel);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataLabel" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel insertNewDataLabel(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "dataLabel" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel addNewDataLabel();

    /**
     * Removes the ith "dataLabel" element
     */
    void removeDataLabel(int i);

    /**
     * Gets a List of "dataLabelHidden" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden> getDataLabelHiddenList();

    /**
     * Gets array of all "dataLabelHidden" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden[] getDataLabelHiddenArray();

    /**
     * Gets ith "dataLabelHidden" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden getDataLabelHiddenArray(int i);

    /**
     * Returns number of "dataLabelHidden" element
     */
    int sizeOfDataLabelHiddenArray();

    /**
     * Sets array of all "dataLabelHidden" element
     */
    void setDataLabelHiddenArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden[] dataLabelHiddenArray);

    /**
     * Sets ith "dataLabelHidden" element
     */
    void setDataLabelHiddenArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden dataLabelHidden);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataLabelHidden" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden insertNewDataLabelHidden(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "dataLabelHidden" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden addNewDataLabelHidden();

    /**
     * Removes the ith "dataLabelHidden" element
     */
    void removeDataLabelHidden(int i);

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

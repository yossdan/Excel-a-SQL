/*
 * XML Type:  CT_Axis
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Axis(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTAxis extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctaxisa405type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "catScaling" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling getCatScaling();

    /**
     * True if has "catScaling" element
     */
    boolean isSetCatScaling();

    /**
     * Sets the "catScaling" element
     */
    void setCatScaling(com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling catScaling);

    /**
     * Appends and returns a new empty "catScaling" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling addNewCatScaling();

    /**
     * Unsets the "catScaling" element
     */
    void unsetCatScaling();

    /**
     * Gets the "valScaling" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling getValScaling();

    /**
     * True if has "valScaling" element
     */
    boolean isSetValScaling();

    /**
     * Sets the "valScaling" element
     */
    void setValScaling(com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling valScaling);

    /**
     * Appends and returns a new empty "valScaling" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling addNewValScaling();

    /**
     * Unsets the "valScaling" element
     */
    void unsetValScaling();

    /**
     * Gets the "title" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisTitle getTitle();

    /**
     * True if has "title" element
     */
    boolean isSetTitle();

    /**
     * Sets the "title" element
     */
    void setTitle(com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisTitle title);

    /**
     * Appends and returns a new empty "title" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisTitle addNewTitle();

    /**
     * Unsets the "title" element
     */
    void unsetTitle();

    /**
     * Gets the "units" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits getUnits();

    /**
     * True if has "units" element
     */
    boolean isSetUnits();

    /**
     * Sets the "units" element
     */
    void setUnits(com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits units);

    /**
     * Appends and returns a new empty "units" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits addNewUnits();

    /**
     * Unsets the "units" element
     */
    void unsetUnits();

    /**
     * Gets the "majorGridlines" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines getMajorGridlines();

    /**
     * True if has "majorGridlines" element
     */
    boolean isSetMajorGridlines();

    /**
     * Sets the "majorGridlines" element
     */
    void setMajorGridlines(com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines majorGridlines);

    /**
     * Appends and returns a new empty "majorGridlines" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines addNewMajorGridlines();

    /**
     * Unsets the "majorGridlines" element
     */
    void unsetMajorGridlines();

    /**
     * Gets the "minorGridlines" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines getMinorGridlines();

    /**
     * True if has "minorGridlines" element
     */
    boolean isSetMinorGridlines();

    /**
     * Sets the "minorGridlines" element
     */
    void setMinorGridlines(com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines minorGridlines);

    /**
     * Appends and returns a new empty "minorGridlines" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines addNewMinorGridlines();

    /**
     * Unsets the "minorGridlines" element
     */
    void unsetMinorGridlines();

    /**
     * Gets the "majorTickMarks" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks getMajorTickMarks();

    /**
     * True if has "majorTickMarks" element
     */
    boolean isSetMajorTickMarks();

    /**
     * Sets the "majorTickMarks" element
     */
    void setMajorTickMarks(com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks majorTickMarks);

    /**
     * Appends and returns a new empty "majorTickMarks" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks addNewMajorTickMarks();

    /**
     * Unsets the "majorTickMarks" element
     */
    void unsetMajorTickMarks();

    /**
     * Gets the "minorTickMarks" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks getMinorTickMarks();

    /**
     * True if has "minorTickMarks" element
     */
    boolean isSetMinorTickMarks();

    /**
     * Sets the "minorTickMarks" element
     */
    void setMinorTickMarks(com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks minorTickMarks);

    /**
     * Appends and returns a new empty "minorTickMarks" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks addNewMinorTickMarks();

    /**
     * Unsets the "minorTickMarks" element
     */
    void unsetMinorTickMarks();

    /**
     * Gets the "tickLabels" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTTickLabels getTickLabels();

    /**
     * True if has "tickLabels" element
     */
    boolean isSetTickLabels();

    /**
     * Sets the "tickLabels" element
     */
    void setTickLabels(com.microsoft.schemas.office.drawing.x2014.chartex.CTTickLabels tickLabels);

    /**
     * Appends and returns a new empty "tickLabels" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTTickLabels addNewTickLabels();

    /**
     * Unsets the "tickLabels" element
     */
    void unsetTickLabels();

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
     * Gets the "id" attribute
     */
    long getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId xgetId();

    /**
     * Sets the "id" attribute
     */
    void setId(long id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId id);

    /**
     * Gets the "hidden" attribute
     */
    boolean getHidden();

    /**
     * Gets (as xml) the "hidden" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHidden();

    /**
     * True if has "hidden" attribute
     */
    boolean isSetHidden();

    /**
     * Sets the "hidden" attribute
     */
    void setHidden(boolean hidden);

    /**
     * Sets (as xml) the "hidden" attribute
     */
    void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden);

    /**
     * Unsets the "hidden" attribute
     */
    void unsetHidden();
}

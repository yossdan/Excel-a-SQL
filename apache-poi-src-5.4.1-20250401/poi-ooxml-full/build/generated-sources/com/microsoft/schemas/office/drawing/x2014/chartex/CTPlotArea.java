/*
 * XML Type:  CT_PlotArea
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_PlotArea(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTPlotArea extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctplotarea15b8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "plotAreaRegion" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion getPlotAreaRegion();

    /**
     * Sets the "plotAreaRegion" element
     */
    void setPlotAreaRegion(com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion plotAreaRegion);

    /**
     * Appends and returns a new empty "plotAreaRegion" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion addNewPlotAreaRegion();

    /**
     * Gets a List of "axis" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis> getAxisList();

    /**
     * Gets array of all "axis" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis[] getAxisArray();

    /**
     * Gets ith "axis" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis getAxisArray(int i);

    /**
     * Returns number of "axis" element
     */
    int sizeOfAxisArray();

    /**
     * Sets array of all "axis" element
     */
    void setAxisArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis[] axisArray);

    /**
     * Sets ith "axis" element
     */
    void setAxisArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis axis);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "axis" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis insertNewAxis(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "axis" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis addNewAxis();

    /**
     * Removes the ith "axis" element
     */
    void removeAxis(int i);

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

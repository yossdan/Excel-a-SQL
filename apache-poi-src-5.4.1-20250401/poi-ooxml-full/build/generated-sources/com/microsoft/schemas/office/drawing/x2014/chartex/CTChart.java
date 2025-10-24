/*
 * XML Type:  CT_Chart
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTChart
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Chart(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTChart extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTChart> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctchart07d2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "title" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTChartTitle getTitle();

    /**
     * True if has "title" element
     */
    boolean isSetTitle();

    /**
     * Sets the "title" element
     */
    void setTitle(com.microsoft.schemas.office.drawing.x2014.chartex.CTChartTitle title);

    /**
     * Appends and returns a new empty "title" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTChartTitle addNewTitle();

    /**
     * Unsets the "title" element
     */
    void unsetTitle();

    /**
     * Gets the "plotArea" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea getPlotArea();

    /**
     * Sets the "plotArea" element
     */
    void setPlotArea(com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea plotArea);

    /**
     * Appends and returns a new empty "plotArea" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea addNewPlotArea();

    /**
     * Gets the "legend" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTLegend getLegend();

    /**
     * True if has "legend" element
     */
    boolean isSetLegend();

    /**
     * Sets the "legend" element
     */
    void setLegend(com.microsoft.schemas.office.drawing.x2014.chartex.CTLegend legend);

    /**
     * Appends and returns a new empty "legend" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTLegend addNewLegend();

    /**
     * Unsets the "legend" element
     */
    void unsetLegend();

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

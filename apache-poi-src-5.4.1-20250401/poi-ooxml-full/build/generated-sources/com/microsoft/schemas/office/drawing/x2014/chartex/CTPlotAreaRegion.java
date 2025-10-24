/*
 * XML Type:  CT_PlotAreaRegion
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_PlotAreaRegion(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTPlotAreaRegion extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctplotarearegion9b64type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "plotSurface" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotSurface getPlotSurface();

    /**
     * True if has "plotSurface" element
     */
    boolean isSetPlotSurface();

    /**
     * Sets the "plotSurface" element
     */
    void setPlotSurface(com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotSurface plotSurface);

    /**
     * Appends and returns a new empty "plotSurface" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotSurface addNewPlotSurface();

    /**
     * Unsets the "plotSurface" element
     */
    void unsetPlotSurface();

    /**
     * Gets a List of "series" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries> getSeriesList();

    /**
     * Gets array of all "series" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries[] getSeriesArray();

    /**
     * Gets ith "series" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries getSeriesArray(int i);

    /**
     * Returns number of "series" element
     */
    int sizeOfSeriesArray();

    /**
     * Sets array of all "series" element
     */
    void setSeriesArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries[] seriesArray);

    /**
     * Sets ith "series" element
     */
    void setSeriesArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries series);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "series" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries insertNewSeries(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "series" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries addNewSeries();

    /**
     * Removes the ith "series" element
     */
    void removeSeries(int i);

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

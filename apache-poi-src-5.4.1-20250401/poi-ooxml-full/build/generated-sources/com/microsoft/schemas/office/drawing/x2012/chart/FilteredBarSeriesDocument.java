/*
 * An XML document type.
 * Localname: filteredBarSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredBarSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one filteredBarSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface FilteredBarSeriesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.FilteredBarSeriesDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "filteredbarseries4e5cdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "filteredBarSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBarSer getFilteredBarSeries();

    /**
     * Sets the "filteredBarSeries" element
     */
    void setFilteredBarSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBarSer filteredBarSeries);

    /**
     * Appends and returns a new empty "filteredBarSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBarSer addNewFilteredBarSeries();
}

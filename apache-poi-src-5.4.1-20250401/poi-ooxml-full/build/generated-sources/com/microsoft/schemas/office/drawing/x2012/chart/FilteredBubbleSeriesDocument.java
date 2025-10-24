/*
 * An XML document type.
 * Localname: filteredBubbleSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredBubbleSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one filteredBubbleSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface FilteredBubbleSeriesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.FilteredBubbleSeriesDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "filteredbubbleseriesff23doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "filteredBubbleSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBubbleSer getFilteredBubbleSeries();

    /**
     * Sets the "filteredBubbleSeries" element
     */
    void setFilteredBubbleSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBubbleSer filteredBubbleSeries);

    /**
     * Appends and returns a new empty "filteredBubbleSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBubbleSer addNewFilteredBubbleSeries();
}

/*
 * An XML document type.
 * Localname: filteredScatterSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredScatterSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one filteredScatterSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface FilteredScatterSeriesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.FilteredScatterSeriesDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "filteredscatterseries7b91doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "filteredScatterSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer getFilteredScatterSeries();

    /**
     * Sets the "filteredScatterSeries" element
     */
    void setFilteredScatterSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer filteredScatterSeries);

    /**
     * Appends and returns a new empty "filteredScatterSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer addNewFilteredScatterSeries();
}

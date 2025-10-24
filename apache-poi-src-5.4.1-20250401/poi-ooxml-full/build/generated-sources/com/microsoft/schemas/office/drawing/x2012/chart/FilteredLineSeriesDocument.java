/*
 * An XML document type.
 * Localname: filteredLineSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredLineSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one filteredLineSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface FilteredLineSeriesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.FilteredLineSeriesDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "filteredlineseries10bbdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "filteredLineSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredLineSer getFilteredLineSeries();

    /**
     * Sets the "filteredLineSeries" element
     */
    void setFilteredLineSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredLineSer filteredLineSeries);

    /**
     * Appends and returns a new empty "filteredLineSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredLineSer addNewFilteredLineSeries();
}

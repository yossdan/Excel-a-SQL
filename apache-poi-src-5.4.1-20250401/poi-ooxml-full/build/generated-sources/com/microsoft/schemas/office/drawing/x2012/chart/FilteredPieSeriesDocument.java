/*
 * An XML document type.
 * Localname: filteredPieSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredPieSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one filteredPieSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface FilteredPieSeriesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.FilteredPieSeriesDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "filteredpieseriesfb83doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "filteredPieSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredPieSer getFilteredPieSeries();

    /**
     * Sets the "filteredPieSeries" element
     */
    void setFilteredPieSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredPieSer filteredPieSeries);

    /**
     * Appends and returns a new empty "filteredPieSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredPieSer addNewFilteredPieSeries();
}

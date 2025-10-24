/*
 * An XML document type.
 * Localname: filteredAreaSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredAreaSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one filteredAreaSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface FilteredAreaSeriesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.FilteredAreaSeriesDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "filteredareaseriesa6c2doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "filteredAreaSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredAreaSer getFilteredAreaSeries();

    /**
     * Sets the "filteredAreaSeries" element
     */
    void setFilteredAreaSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredAreaSer filteredAreaSeries);

    /**
     * Appends and returns a new empty "filteredAreaSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredAreaSer addNewFilteredAreaSeries();
}

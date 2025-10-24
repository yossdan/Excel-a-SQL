/*
 * An XML document type.
 * Localname: filteredSurfaceSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredSurfaceSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one filteredSurfaceSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface FilteredSurfaceSeriesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.FilteredSurfaceSeriesDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "filteredsurfaceseriesac02doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "filteredSurfaceSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSurfaceSer getFilteredSurfaceSeries();

    /**
     * Sets the "filteredSurfaceSeries" element
     */
    void setFilteredSurfaceSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSurfaceSer filteredSurfaceSeries);

    /**
     * Appends and returns a new empty "filteredSurfaceSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSurfaceSer addNewFilteredSurfaceSeries();
}

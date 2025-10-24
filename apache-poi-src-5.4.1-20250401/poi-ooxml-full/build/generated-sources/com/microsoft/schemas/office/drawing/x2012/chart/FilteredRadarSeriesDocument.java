/*
 * An XML document type.
 * Localname: filteredRadarSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredRadarSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one filteredRadarSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface FilteredRadarSeriesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.FilteredRadarSeriesDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "filteredradarseriesc049doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "filteredRadarSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredRadarSer getFilteredRadarSeries();

    /**
     * Sets the "filteredRadarSeries" element
     */
    void setFilteredRadarSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredRadarSer filteredRadarSeries);

    /**
     * Appends and returns a new empty "filteredRadarSeries" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredRadarSer addNewFilteredRadarSeries();
}

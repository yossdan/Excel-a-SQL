/*
 * An XML document type.
 * Localname: filteredSeriesTitle
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredSeriesTitleDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one filteredSeriesTitle(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface FilteredSeriesTitleDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.FilteredSeriesTitleDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "filteredseriestitlee6c5doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "filteredSeriesTitle" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSeriesTitle getFilteredSeriesTitle();

    /**
     * Sets the "filteredSeriesTitle" element
     */
    void setFilteredSeriesTitle(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSeriesTitle filteredSeriesTitle);

    /**
     * Appends and returns a new empty "filteredSeriesTitle" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSeriesTitle addNewFilteredSeriesTitle();
}

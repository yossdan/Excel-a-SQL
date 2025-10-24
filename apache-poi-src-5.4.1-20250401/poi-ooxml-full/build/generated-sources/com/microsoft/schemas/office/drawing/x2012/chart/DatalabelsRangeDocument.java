/*
 * An XML document type.
 * Localname: datalabelsRange
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.DatalabelsRangeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one datalabelsRange(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface DatalabelsRangeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.DatalabelsRangeDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "datalabelsrangec4fbdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "datalabelsRange" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange getDatalabelsRange();

    /**
     * Sets the "datalabelsRange" element
     */
    void setDatalabelsRange(com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange datalabelsRange);

    /**
     * Appends and returns a new empty "datalabelsRange" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange addNewDatalabelsRange();
}

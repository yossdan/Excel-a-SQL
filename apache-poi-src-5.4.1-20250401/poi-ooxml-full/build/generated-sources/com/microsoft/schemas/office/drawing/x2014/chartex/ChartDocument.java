/*
 * An XML document type.
 * Localname: chart
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.ChartDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one chart(@http://schemas.microsoft.com/office/drawing/2014/chartex) element.
 *
 * This is a complex type.
 */
public interface ChartDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.ChartDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "chartba26doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "chart" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTRelId getChart();

    /**
     * Sets the "chart" element
     */
    void setChart(com.microsoft.schemas.office.drawing.x2014.chartex.CTRelId chart);

    /**
     * Appends and returns a new empty "chart" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTRelId addNewChart();
}

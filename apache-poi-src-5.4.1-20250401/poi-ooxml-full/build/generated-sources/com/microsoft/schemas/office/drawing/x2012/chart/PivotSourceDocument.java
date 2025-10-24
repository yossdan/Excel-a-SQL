/*
 * An XML document type.
 * Localname: pivotSource
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.PivotSourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one pivotSource(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface PivotSourceDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.PivotSourceDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "pivotsource32f2doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "pivotSource" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource getPivotSource();

    /**
     * Sets the "pivotSource" element
     */
    void setPivotSource(org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource pivotSource);

    /**
     * Appends and returns a new empty "pivotSource" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource addNewPivotSource();
}

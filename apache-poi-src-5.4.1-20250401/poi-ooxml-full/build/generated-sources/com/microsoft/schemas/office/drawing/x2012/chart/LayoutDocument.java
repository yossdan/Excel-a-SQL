/*
 * An XML document type.
 * Localname: layout
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.LayoutDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one layout(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface LayoutDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.LayoutDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "layoute413doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "layout" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout getLayout();

    /**
     * Sets the "layout" element
     */
    void setLayout(org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout layout);

    /**
     * Appends and returns a new empty "layout" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout addNewLayout();
}

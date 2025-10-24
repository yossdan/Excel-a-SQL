/*
 * An XML document type.
 * Localname: autoCat
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.AutoCatDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one autoCat(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface AutoCatDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.AutoCatDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "autocat0f88doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "autoCat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getAutoCat();

    /**
     * Sets the "autoCat" element
     */
    void setAutoCat(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean autoCat);

    /**
     * Appends and returns a new empty "autoCat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewAutoCat();
}

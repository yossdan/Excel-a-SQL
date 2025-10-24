/*
 * An XML document type.
 * Localname: fullRef
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FullRefDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one fullRef(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface FullRefDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.FullRefDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "fullref730bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "fullRef" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFullRef getFullRef();

    /**
     * Sets the "fullRef" element
     */
    void setFullRef(com.microsoft.schemas.office.drawing.x2012.chart.CTFullRef fullRef);

    /**
     * Appends and returns a new empty "fullRef" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFullRef addNewFullRef();
}

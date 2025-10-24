/*
 * An XML document type.
 * Localname: showLeaderLines
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.ShowLeaderLinesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one showLeaderLines(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface ShowLeaderLinesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.ShowLeaderLinesDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "showleaderlinescdb6doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "showLeaderLines" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowLeaderLines();

    /**
     * Sets the "showLeaderLines" element
     */
    void setShowLeaderLines(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showLeaderLines);

    /**
     * Appends and returns a new empty "showLeaderLines" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowLeaderLines();
}

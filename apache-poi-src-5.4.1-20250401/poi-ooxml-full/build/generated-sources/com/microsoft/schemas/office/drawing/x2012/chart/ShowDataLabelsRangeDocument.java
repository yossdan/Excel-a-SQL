/*
 * An XML document type.
 * Localname: showDataLabelsRange
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.ShowDataLabelsRangeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one showDataLabelsRange(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface ShowDataLabelsRangeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.ShowDataLabelsRangeDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "showdatalabelsrangea9f8doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "showDataLabelsRange" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowDataLabelsRange();

    /**
     * Sets the "showDataLabelsRange" element
     */
    void setShowDataLabelsRange(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showDataLabelsRange);

    /**
     * Appends and returns a new empty "showDataLabelsRange" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowDataLabelsRange();
}

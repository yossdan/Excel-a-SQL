/*
 * An XML document type.
 * Localname: xForSave
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.XForSaveDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one xForSave(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface XForSaveDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.XForSaveDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "xforsave62afdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "xForSave" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getXForSave();

    /**
     * Sets the "xForSave" element
     */
    void setXForSave(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean xForSave);

    /**
     * Appends and returns a new empty "xForSave" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewXForSave();
}

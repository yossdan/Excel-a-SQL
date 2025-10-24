/*
 * An XML document type.
 * Localname: numFmt
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.NumFmtDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one numFmt(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface NumFmtDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.NumFmtDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "numfmt7376doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "numFmt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt getNumFmt();

    /**
     * Sets the "numFmt" element
     */
    void setNumFmt(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt numFmt);

    /**
     * Appends and returns a new empty "numFmt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt addNewNumFmt();
}

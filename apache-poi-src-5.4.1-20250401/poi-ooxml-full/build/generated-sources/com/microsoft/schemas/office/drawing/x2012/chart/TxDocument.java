/*
 * An XML document type.
 * Localname: tx
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.TxDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one tx(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface TxDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.TxDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "txbef9doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "tx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTx getTx();

    /**
     * Sets the "tx" element
     */
    void setTx(org.openxmlformats.schemas.drawingml.x2006.chart.CTTx tx);

    /**
     * Appends and returns a new empty "tx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTTx addNewTx();
}

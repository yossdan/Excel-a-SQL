/*
 * An XML document type.
 * Localname: dlblFieldTable
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.DlblFieldTableDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one dlblFieldTable(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface DlblFieldTableDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.DlblFieldTableDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "dlblfieldtablee957doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "dlblFieldTable" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable getDlblFieldTable();

    /**
     * Sets the "dlblFieldTable" element
     */
    void setDlblFieldTable(com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable dlblFieldTable);

    /**
     * Appends and returns a new empty "dlblFieldTable" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable addNewDlblFieldTable();
}

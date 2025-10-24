/*
 * XML Type:  CT_FilteredLineSer
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredLineSer
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_FilteredLineSer(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public interface CTFilteredLineSer extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredLineSer> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctfilteredlinesere266type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer getSer();

    /**
     * Sets the "ser" element
     */
    void setSer(org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer ser);

    /**
     * Appends and returns a new empty "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer addNewSer();
}

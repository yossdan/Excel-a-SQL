/*
 * XML Type:  CT_FilteredAreaSer
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredAreaSer
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_FilteredAreaSer(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public interface CTFilteredAreaSer extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredAreaSer> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctfilteredareaser61bftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer getSer();

    /**
     * Sets the "ser" element
     */
    void setSer(org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer ser);

    /**
     * Appends and returns a new empty "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer addNewSer();
}

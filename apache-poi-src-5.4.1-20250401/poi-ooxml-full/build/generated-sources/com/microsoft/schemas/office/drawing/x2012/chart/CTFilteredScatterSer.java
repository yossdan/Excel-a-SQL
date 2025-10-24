/*
 * XML Type:  CT_FilteredScatterSer
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_FilteredScatterSer(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public interface CTFilteredScatterSer extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctfilteredscatterser2478type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer getSer();

    /**
     * Sets the "ser" element
     */
    void setSer(org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer ser);

    /**
     * Appends and returns a new empty "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer addNewSer();
}

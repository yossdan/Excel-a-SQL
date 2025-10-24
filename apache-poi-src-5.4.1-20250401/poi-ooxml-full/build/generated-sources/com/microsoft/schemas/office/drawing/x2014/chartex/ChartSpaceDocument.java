/*
 * An XML document type.
 * Localname: chartSpace
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.ChartSpaceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one chartSpace(@http://schemas.microsoft.com/office/drawing/2014/chartex) element.
 *
 * This is a complex type.
 */
public interface ChartSpaceDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.ChartSpaceDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "chartspace67aadoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "chartSpace" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTChartSpace getChartSpace();

    /**
     * Sets the "chartSpace" element
     */
    void setChartSpace(com.microsoft.schemas.office.drawing.x2014.chartex.CTChartSpace chartSpace);

    /**
     * Appends and returns a new empty "chartSpace" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTChartSpace addNewChartSpace();
}

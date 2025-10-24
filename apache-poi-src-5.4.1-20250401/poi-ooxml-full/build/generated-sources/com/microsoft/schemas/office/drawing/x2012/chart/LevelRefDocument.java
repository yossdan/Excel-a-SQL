/*
 * An XML document type.
 * Localname: levelRef
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.LevelRefDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one levelRef(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface LevelRefDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.LevelRefDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "levelref216edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "levelRef" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTLevelRef getLevelRef();

    /**
     * Sets the "levelRef" element
     */
    void setLevelRef(com.microsoft.schemas.office.drawing.x2012.chart.CTLevelRef levelRef);

    /**
     * Appends and returns a new empty "levelRef" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTLevelRef addNewLevelRef();
}

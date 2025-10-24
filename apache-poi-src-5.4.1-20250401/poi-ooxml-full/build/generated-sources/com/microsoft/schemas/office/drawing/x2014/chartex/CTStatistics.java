/*
 * XML Type:  CT_Statistics
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Statistics(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTStatistics extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctstatistics5083type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "quartileMethod" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod.Enum getQuartileMethod();

    /**
     * Gets (as xml) the "quartileMethod" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod xgetQuartileMethod();

    /**
     * True if has "quartileMethod" attribute
     */
    boolean isSetQuartileMethod();

    /**
     * Sets the "quartileMethod" attribute
     */
    void setQuartileMethod(com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod.Enum quartileMethod);

    /**
     * Sets (as xml) the "quartileMethod" attribute
     */
    void xsetQuartileMethod(com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod quartileMethod);

    /**
     * Unsets the "quartileMethod" attribute
     */
    void unsetQuartileMethod();
}

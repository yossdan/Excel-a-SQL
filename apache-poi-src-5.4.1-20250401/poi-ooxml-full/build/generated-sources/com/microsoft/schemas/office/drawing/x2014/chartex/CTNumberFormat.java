/*
 * XML Type:  CT_NumberFormat
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_NumberFormat(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTNumberFormat extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctnumberformat84e6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "formatCode" attribute
     */
    java.lang.String getFormatCode();

    /**
     * Gets (as xml) the "formatCode" attribute
     */
    org.apache.xmlbeans.XmlString xgetFormatCode();

    /**
     * Sets the "formatCode" attribute
     */
    void setFormatCode(java.lang.String formatCode);

    /**
     * Sets (as xml) the "formatCode" attribute
     */
    void xsetFormatCode(org.apache.xmlbeans.XmlString formatCode);

    /**
     * Gets the "sourceLinked" attribute
     */
    boolean getSourceLinked();

    /**
     * Gets (as xml) the "sourceLinked" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSourceLinked();

    /**
     * True if has "sourceLinked" attribute
     */
    boolean isSetSourceLinked();

    /**
     * Sets the "sourceLinked" attribute
     */
    void setSourceLinked(boolean sourceLinked);

    /**
     * Sets (as xml) the "sourceLinked" attribute
     */
    void xsetSourceLinked(org.apache.xmlbeans.XmlBoolean sourceLinked);

    /**
     * Unsets the "sourceLinked" attribute
     */
    void unsetSourceLinked();
}

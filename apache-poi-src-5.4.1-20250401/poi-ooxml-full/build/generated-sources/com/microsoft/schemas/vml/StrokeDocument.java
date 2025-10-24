/*
 * An XML document type.
 * Localname: stroke
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.StrokeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one stroke(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface StrokeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.StrokeDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stroked64adoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "stroke" element
     */
    com.microsoft.schemas.vml.CTStroke getStroke();

    /**
     * Sets the "stroke" element
     */
    void setStroke(com.microsoft.schemas.vml.CTStroke stroke);

    /**
     * Appends and returns a new empty "stroke" element
     */
    com.microsoft.schemas.vml.CTStroke addNewStroke();
}

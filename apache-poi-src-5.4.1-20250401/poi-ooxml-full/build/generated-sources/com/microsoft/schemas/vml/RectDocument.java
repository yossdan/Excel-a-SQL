/*
 * An XML document type.
 * Localname: rect
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.RectDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one rect(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface RectDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.RectDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "rectaf36doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "rect" element
     */
    com.microsoft.schemas.vml.CTRect getRect();

    /**
     * Sets the "rect" element
     */
    void setRect(com.microsoft.schemas.vml.CTRect rect);

    /**
     * Appends and returns a new empty "rect" element
     */
    com.microsoft.schemas.vml.CTRect addNewRect();
}

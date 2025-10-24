/*
 * An XML document type.
 * Localname: background
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.BackgroundDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one background(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface BackgroundDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.BackgroundDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "backgroundfe40doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "background" element
     */
    com.microsoft.schemas.vml.CTBackground getBackground();

    /**
     * Sets the "background" element
     */
    void setBackground(com.microsoft.schemas.vml.CTBackground background);

    /**
     * Appends and returns a new empty "background" element
     */
    com.microsoft.schemas.vml.CTBackground addNewBackground();
}

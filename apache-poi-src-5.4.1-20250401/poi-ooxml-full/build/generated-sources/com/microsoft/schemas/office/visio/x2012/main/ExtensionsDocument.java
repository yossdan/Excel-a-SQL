/*
 * An XML document type.
 * Localname: Extensions
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ExtensionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Extensions(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public interface ExtensionsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.ExtensionsDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "extensions1896doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Extensions" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ExtensionsType getExtensions();

    /**
     * Sets the "Extensions" element
     */
    void setExtensions(com.microsoft.schemas.office.visio.x2012.main.ExtensionsType extensions);

    /**
     * Appends and returns a new empty "Extensions" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ExtensionsType addNewExtensions();
}

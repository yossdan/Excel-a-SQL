/*
 * An XML document type.
 * Localname: defaultImageDpi
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.DefaultImageDpiDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one defaultImageDpi(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public interface DefaultImageDpiDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.DefaultImageDpiDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "defaultimagedpi8963doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "defaultImageDpi" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTDefaultImageDpi getDefaultImageDpi();

    /**
     * Sets the "defaultImageDpi" element
     */
    void setDefaultImageDpi(com.microsoft.schemas.office.word.x2010.wordml.CTDefaultImageDpi defaultImageDpi);

    /**
     * Appends and returns a new empty "defaultImageDpi" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTDefaultImageDpi addNewDefaultImageDpi();
}

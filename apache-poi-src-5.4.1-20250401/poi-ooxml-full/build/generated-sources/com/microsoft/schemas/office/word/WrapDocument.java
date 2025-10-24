/*
 * An XML document type.
 * Localname: wrap
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.WrapDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one wrap(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public interface WrapDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.WrapDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "wrape08fdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "wrap" element
     */
    com.microsoft.schemas.office.word.CTWrap getWrap();

    /**
     * Sets the "wrap" element
     */
    void setWrap(com.microsoft.schemas.office.word.CTWrap wrap);

    /**
     * Appends and returns a new empty "wrap" element
     */
    com.microsoft.schemas.office.word.CTWrap addNewWrap();
}

/*
 * An XML document type.
 * Localname: borderright
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.BorderrightDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one borderright(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public interface BorderrightDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.BorderrightDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "borderright28a3doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "borderright" element
     */
    com.microsoft.schemas.office.word.CTBorder getBorderright();

    /**
     * Sets the "borderright" element
     */
    void setBorderright(com.microsoft.schemas.office.word.CTBorder borderright);

    /**
     * Appends and returns a new empty "borderright" element
     */
    com.microsoft.schemas.office.word.CTBorder addNewBorderright();
}

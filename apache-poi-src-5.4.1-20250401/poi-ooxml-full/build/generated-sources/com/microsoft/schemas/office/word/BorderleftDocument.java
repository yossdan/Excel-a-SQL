/*
 * An XML document type.
 * Localname: borderleft
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.BorderleftDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one borderleft(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public interface BorderleftDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.BorderleftDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "borderlefte8f8doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "borderleft" element
     */
    com.microsoft.schemas.office.word.CTBorder getBorderleft();

    /**
     * Sets the "borderleft" element
     */
    void setBorderleft(com.microsoft.schemas.office.word.CTBorder borderleft);

    /**
     * Appends and returns a new empty "borderleft" element
     */
    com.microsoft.schemas.office.word.CTBorder addNewBorderleft();
}

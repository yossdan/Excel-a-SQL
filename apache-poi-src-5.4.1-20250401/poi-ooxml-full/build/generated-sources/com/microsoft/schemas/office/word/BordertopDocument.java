/*
 * An XML document type.
 * Localname: bordertop
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.BordertopDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one bordertop(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public interface BordertopDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.BordertopDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "bordertopf7dcdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "bordertop" element
     */
    com.microsoft.schemas.office.word.CTBorder getBordertop();

    /**
     * Sets the "bordertop" element
     */
    void setBordertop(com.microsoft.schemas.office.word.CTBorder bordertop);

    /**
     * Appends and returns a new empty "bordertop" element
     */
    com.microsoft.schemas.office.word.CTBorder addNewBordertop();
}

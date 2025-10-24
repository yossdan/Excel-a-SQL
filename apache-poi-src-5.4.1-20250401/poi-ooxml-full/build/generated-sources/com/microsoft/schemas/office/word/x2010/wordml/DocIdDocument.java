/*
 * An XML document type.
 * Localname: docId
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.DocIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one docId(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public interface DocIdDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.DocIdDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "docidf193doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "docId" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTLongHexNumber getDocId();

    /**
     * Sets the "docId" element
     */
    void setDocId(com.microsoft.schemas.office.word.x2010.wordml.CTLongHexNumber docId);

    /**
     * Appends and returns a new empty "docId" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTLongHexNumber addNewDocId();
}

/*
 * An XML document type.
 * Localname: discardImageEditingData
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.DiscardImageEditingDataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one discardImageEditingData(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public interface DiscardImageEditingDataDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.DiscardImageEditingDataDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "discardimageeditingdata7f41doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "discardImageEditingData" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTOnOff getDiscardImageEditingData();

    /**
     * Sets the "discardImageEditingData" element
     */
    void setDiscardImageEditingData(com.microsoft.schemas.office.word.x2010.wordml.CTOnOff discardImageEditingData);

    /**
     * Appends and returns a new empty "discardImageEditingData" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTOnOff addNewDiscardImageEditingData();
}

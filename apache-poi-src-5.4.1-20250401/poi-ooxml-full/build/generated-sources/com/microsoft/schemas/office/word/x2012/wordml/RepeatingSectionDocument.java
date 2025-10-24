/*
 * An XML document type.
 * Localname: repeatingSection
 * Namespace: http://schemas.microsoft.com/office/word/2012/wordml
 * Java type: com.microsoft.schemas.office.word.x2012.wordml.RepeatingSectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2012.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one repeatingSection(@http://schemas.microsoft.com/office/word/2012/wordml) element.
 *
 * This is a complex type.
 */
public interface RepeatingSectionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2012.wordml.RepeatingSectionDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "repeatingsectioncc14doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "repeatingSection" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection getRepeatingSection();

    /**
     * Sets the "repeatingSection" element
     */
    void setRepeatingSection(com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection repeatingSection);

    /**
     * Appends and returns a new empty "repeatingSection" element
     */
    com.microsoft.schemas.office.word.x2012.wordml.CTSdtRepeatedSection addNewRepeatingSection();
}

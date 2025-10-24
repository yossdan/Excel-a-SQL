/*
 * An XML document type.
 * Localname: checkbox
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CheckboxDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one checkbox(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public interface CheckboxDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CheckboxDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "checkbox5331doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "checkbox" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox getCheckbox();

    /**
     * Sets the "checkbox" element
     */
    void setCheckbox(com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox checkbox);

    /**
     * Appends and returns a new empty "checkbox" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox addNewCheckbox();
}

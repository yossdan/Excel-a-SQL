/*
 * An XML document type.
 * Localname: entityPicker
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.EntityPickerDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one entityPicker(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public interface EntityPickerDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.EntityPickerDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "entitypickerdde3doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "entityPicker" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getEntityPicker();

    /**
     * Sets the "entityPicker" element
     */
    void setEntityPicker(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty entityPicker);

    /**
     * Appends and returns a new empty "entityPicker" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewEntityPicker();
}

/*
 * An XML document type.
 * Localname: conflictMode
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.ConflictModeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one conflictMode(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public interface ConflictModeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.ConflictModeDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "conflictmodec21fdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "conflictMode" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTOnOff getConflictMode();

    /**
     * Sets the "conflictMode" element
     */
    void setConflictMode(com.microsoft.schemas.office.word.x2010.wordml.CTOnOff conflictMode);

    /**
     * Appends and returns a new empty "conflictMode" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTOnOff addNewConflictMode();
}

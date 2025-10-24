/*
 * An XML document type.
 * Localname: customXmlConflictInsRangeStart
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictInsRangeStartDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one customXmlConflictInsRangeStart(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public interface CustomXmlConflictInsRangeStartDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictInsRangeStartDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "customxmlconflictinsrangestart9cf9doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "customXmlConflictInsRangeStart" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCustomXmlConflictInsRangeStart();

    /**
     * Sets the "customXmlConflictInsRangeStart" element
     */
    void setCustomXmlConflictInsRangeStart(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange customXmlConflictInsRangeStart);

    /**
     * Appends and returns a new empty "customXmlConflictInsRangeStart" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCustomXmlConflictInsRangeStart();
}

/*
 * An XML document type.
 * Localname: customXmlConflictDelRangeStart
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictDelRangeStartDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one customXmlConflictDelRangeStart(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public interface CustomXmlConflictDelRangeStartDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictDelRangeStartDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "customxmlconflictdelrangestarta13cdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "customXmlConflictDelRangeStart" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCustomXmlConflictDelRangeStart();

    /**
     * Sets the "customXmlConflictDelRangeStart" element
     */
    void setCustomXmlConflictDelRangeStart(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange customXmlConflictDelRangeStart);

    /**
     * Appends and returns a new empty "customXmlConflictDelRangeStart" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCustomXmlConflictDelRangeStart();
}

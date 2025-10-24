/*
 * An XML document type.
 * Localname: customXmlConflictInsRangeEnd
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictInsRangeEndDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one customXmlConflictInsRangeEnd(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public interface CustomXmlConflictInsRangeEndDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictInsRangeEndDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "customxmlconflictinsrangeend25a0doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "customXmlConflictInsRangeEnd" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup getCustomXmlConflictInsRangeEnd();

    /**
     * Sets the "customXmlConflictInsRangeEnd" element
     */
    void setCustomXmlConflictInsRangeEnd(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup customXmlConflictInsRangeEnd);

    /**
     * Appends and returns a new empty "customXmlConflictInsRangeEnd" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup addNewCustomXmlConflictInsRangeEnd();
}

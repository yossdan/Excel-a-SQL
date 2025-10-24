/*
 * An XML document type.
 * Localname: customXmlConflictDelRangeEnd
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictDelRangeEndDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one customXmlConflictDelRangeEnd(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public interface CustomXmlConflictDelRangeEndDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictDelRangeEndDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "customxmlconflictdelrangeend5ea3doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "customXmlConflictDelRangeEnd" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup getCustomXmlConflictDelRangeEnd();

    /**
     * Sets the "customXmlConflictDelRangeEnd" element
     */
    void setCustomXmlConflictDelRangeEnd(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup customXmlConflictDelRangeEnd);

    /**
     * Appends and returns a new empty "customXmlConflictDelRangeEnd" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup addNewCustomXmlConflictDelRangeEnd();
}

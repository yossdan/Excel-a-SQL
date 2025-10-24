/*
 * An XML document type.
 * Localname: personList
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.PersonListDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one personList(@http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments) element.
 *
 * This is a complex type.
 */
public interface PersonListDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.PersonListDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "personlist08f8doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "personList" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPersonList getPersonList();

    /**
     * Sets the "personList" element
     */
    void setPersonList(com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPersonList personList);

    /**
     * Appends and returns a new empty "personList" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPersonList addNewPersonList();
}

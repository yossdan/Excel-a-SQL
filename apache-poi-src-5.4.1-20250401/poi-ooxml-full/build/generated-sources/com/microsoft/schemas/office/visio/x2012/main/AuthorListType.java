/*
 * XML Type:  AuthorList_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.AuthorListType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AuthorList_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface AuthorListType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.AuthorListType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "authorlisttyped990type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "AuthorEntry" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType> getAuthorEntryList();

    /**
     * Gets array of all "AuthorEntry" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType[] getAuthorEntryArray();

    /**
     * Gets ith "AuthorEntry" element
     */
    com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType getAuthorEntryArray(int i);

    /**
     * Returns number of "AuthorEntry" element
     */
    int sizeOfAuthorEntryArray();

    /**
     * Sets array of all "AuthorEntry" element
     */
    void setAuthorEntryArray(com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType[] authorEntryArray);

    /**
     * Sets ith "AuthorEntry" element
     */
    void setAuthorEntryArray(int i, com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType authorEntry);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AuthorEntry" element
     */
    com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType insertNewAuthorEntry(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AuthorEntry" element
     */
    com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType addNewAuthorEntry();

    /**
     * Removes the ith "AuthorEntry" element
     */
    void removeAuthorEntry(int i);
}

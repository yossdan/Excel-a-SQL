/*
 * XML Type:  CommentList_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.CommentListType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CommentList_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface CommentListType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.CommentListType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "commentlisttype966etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "CommentEntry" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.CommentEntryType> getCommentEntryList();

    /**
     * Gets array of all "CommentEntry" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.CommentEntryType[] getCommentEntryArray();

    /**
     * Gets ith "CommentEntry" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CommentEntryType getCommentEntryArray(int i);

    /**
     * Returns number of "CommentEntry" element
     */
    int sizeOfCommentEntryArray();

    /**
     * Sets array of all "CommentEntry" element
     */
    void setCommentEntryArray(com.microsoft.schemas.office.visio.x2012.main.CommentEntryType[] commentEntryArray);

    /**
     * Sets ith "CommentEntry" element
     */
    void setCommentEntryArray(int i, com.microsoft.schemas.office.visio.x2012.main.CommentEntryType commentEntry);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CommentEntry" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CommentEntryType insertNewCommentEntry(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CommentEntry" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CommentEntryType addNewCommentEntry();

    /**
     * Removes the ith "CommentEntry" element
     */
    void removeCommentEntry(int i);
}

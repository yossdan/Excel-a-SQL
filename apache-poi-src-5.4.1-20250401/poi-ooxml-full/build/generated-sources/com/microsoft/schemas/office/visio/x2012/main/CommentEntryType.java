/*
 * XML Type:  CommentEntry_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.CommentEntryType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CommentEntry_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.visio.x2012.main.CommentEntryType.
 */
public interface CommentEntryType extends org.apache.xmlbeans.XmlString {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.CommentEntryType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "commententrytype3286type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AuthorID" attribute
     */
    long getAuthorID();

    /**
     * Gets (as xml) the "AuthorID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetAuthorID();

    /**
     * Sets the "AuthorID" attribute
     */
    void setAuthorID(long authorID);

    /**
     * Sets (as xml) the "AuthorID" attribute
     */
    void xsetAuthorID(org.apache.xmlbeans.XmlUnsignedInt authorID);

    /**
     * Gets the "PageID" attribute
     */
    long getPageID();

    /**
     * Gets (as xml) the "PageID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetPageID();

    /**
     * Sets the "PageID" attribute
     */
    void setPageID(long pageID);

    /**
     * Sets (as xml) the "PageID" attribute
     */
    void xsetPageID(org.apache.xmlbeans.XmlUnsignedInt pageID);

    /**
     * Gets the "ShapeID" attribute
     */
    long getShapeID();

    /**
     * Gets (as xml) the "ShapeID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetShapeID();

    /**
     * True if has "ShapeID" attribute
     */
    boolean isSetShapeID();

    /**
     * Sets the "ShapeID" attribute
     */
    void setShapeID(long shapeID);

    /**
     * Sets (as xml) the "ShapeID" attribute
     */
    void xsetShapeID(org.apache.xmlbeans.XmlUnsignedInt shapeID);

    /**
     * Unsets the "ShapeID" attribute
     */
    void unsetShapeID();

    /**
     * Gets the "Date" attribute
     */
    java.util.Calendar getDate();

    /**
     * Gets (as xml) the "Date" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetDate();

    /**
     * Sets the "Date" attribute
     */
    void setDate(java.util.Calendar date);

    /**
     * Sets (as xml) the "Date" attribute
     */
    void xsetDate(org.apache.xmlbeans.XmlDateTime date);

    /**
     * Gets the "EditDate" attribute
     */
    java.util.Calendar getEditDate();

    /**
     * Gets (as xml) the "EditDate" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetEditDate();

    /**
     * True if has "EditDate" attribute
     */
    boolean isSetEditDate();

    /**
     * Sets the "EditDate" attribute
     */
    void setEditDate(java.util.Calendar editDate);

    /**
     * Sets (as xml) the "EditDate" attribute
     */
    void xsetEditDate(org.apache.xmlbeans.XmlDateTime editDate);

    /**
     * Unsets the "EditDate" attribute
     */
    void unsetEditDate();

    /**
     * Gets the "Done" attribute
     */
    boolean getDone();

    /**
     * Gets (as xml) the "Done" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDone();

    /**
     * True if has "Done" attribute
     */
    boolean isSetDone();

    /**
     * Sets the "Done" attribute
     */
    void setDone(boolean done);

    /**
     * Sets (as xml) the "Done" attribute
     */
    void xsetDone(org.apache.xmlbeans.XmlBoolean done);

    /**
     * Unsets the "Done" attribute
     */
    void unsetDone();

    /**
     * Gets the "CommentID" attribute
     */
    long getCommentID();

    /**
     * Gets (as xml) the "CommentID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCommentID();

    /**
     * Sets the "CommentID" attribute
     */
    void setCommentID(long commentID);

    /**
     * Sets (as xml) the "CommentID" attribute
     */
    void xsetCommentID(org.apache.xmlbeans.XmlUnsignedInt commentID);

    /**
     * Gets the "AutoCommentType" attribute
     */
    long getAutoCommentType();

    /**
     * Gets (as xml) the "AutoCommentType" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetAutoCommentType();

    /**
     * True if has "AutoCommentType" attribute
     */
    boolean isSetAutoCommentType();

    /**
     * Sets the "AutoCommentType" attribute
     */
    void setAutoCommentType(long autoCommentType);

    /**
     * Sets (as xml) the "AutoCommentType" attribute
     */
    void xsetAutoCommentType(org.apache.xmlbeans.XmlUnsignedInt autoCommentType);

    /**
     * Unsets the "AutoCommentType" attribute
     */
    void unsetAutoCommentType();
}

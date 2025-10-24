/*
 * XML Type:  Comments_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.CommentsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Comments_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface CommentsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.CommentsType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "commentstype5085type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AuthorList" element
     */
    com.microsoft.schemas.office.visio.x2012.main.AuthorListType getAuthorList();

    /**
     * True if has "AuthorList" element
     */
    boolean isSetAuthorList();

    /**
     * Sets the "AuthorList" element
     */
    void setAuthorList(com.microsoft.schemas.office.visio.x2012.main.AuthorListType authorList);

    /**
     * Appends and returns a new empty "AuthorList" element
     */
    com.microsoft.schemas.office.visio.x2012.main.AuthorListType addNewAuthorList();

    /**
     * Unsets the "AuthorList" element
     */
    void unsetAuthorList();

    /**
     * Gets the "CommentList" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CommentListType getCommentList();

    /**
     * True if has "CommentList" element
     */
    boolean isSetCommentList();

    /**
     * Sets the "CommentList" element
     */
    void setCommentList(com.microsoft.schemas.office.visio.x2012.main.CommentListType commentList);

    /**
     * Appends and returns a new empty "CommentList" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CommentListType addNewCommentList();

    /**
     * Unsets the "CommentList" element
     */
    void unsetCommentList();

    /**
     * Gets the "ShowCommentTags" attribute
     */
    boolean getShowCommentTags();

    /**
     * Gets (as xml) the "ShowCommentTags" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowCommentTags();

    /**
     * True if has "ShowCommentTags" attribute
     */
    boolean isSetShowCommentTags();

    /**
     * Sets the "ShowCommentTags" attribute
     */
    void setShowCommentTags(boolean showCommentTags);

    /**
     * Sets (as xml) the "ShowCommentTags" attribute
     */
    void xsetShowCommentTags(org.apache.xmlbeans.XmlBoolean showCommentTags);

    /**
     * Unsets the "ShowCommentTags" attribute
     */
    void unsetShowCommentTags();
}

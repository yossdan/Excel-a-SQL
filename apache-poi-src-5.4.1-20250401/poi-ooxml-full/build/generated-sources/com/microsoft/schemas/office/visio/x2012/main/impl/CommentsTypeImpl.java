/*
 * XML Type:  Comments_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.CommentsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Comments_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class CommentsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.CommentsType {
    private static final long serialVersionUID = 1L;

    public CommentsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "AuthorList"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "CommentList"),
        new QName("", "ShowCommentTags"),
    };


    /**
     * Gets the "AuthorList" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.AuthorListType getAuthorList() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.AuthorListType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.AuthorListType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "AuthorList" element
     */
    @Override
    public boolean isSetAuthorList() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "AuthorList" element
     */
    @Override
    public void setAuthorList(com.microsoft.schemas.office.visio.x2012.main.AuthorListType authorList) {
        generatedSetterHelperImpl(authorList, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AuthorList" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.AuthorListType addNewAuthorList() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.AuthorListType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.AuthorListType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "AuthorList" element
     */
    @Override
    public void unsetAuthorList() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "CommentList" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CommentListType getCommentList() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CommentListType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CommentListType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "CommentList" element
     */
    @Override
    public boolean isSetCommentList() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "CommentList" element
     */
    @Override
    public void setCommentList(com.microsoft.schemas.office.visio.x2012.main.CommentListType commentList) {
        generatedSetterHelperImpl(commentList, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CommentList" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CommentListType addNewCommentList() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CommentListType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CommentListType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "CommentList" element
     */
    @Override
    public void unsetCommentList() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "ShowCommentTags" attribute
     */
    @Override
    public boolean getShowCommentTags() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "ShowCommentTags" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetShowCommentTags() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "ShowCommentTags" attribute
     */
    @Override
    public boolean isSetShowCommentTags() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "ShowCommentTags" attribute
     */
    @Override
    public void setShowCommentTags(boolean showCommentTags) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(showCommentTags);
        }
    }

    /**
     * Sets (as xml) the "ShowCommentTags" attribute
     */
    @Override
    public void xsetShowCommentTags(org.apache.xmlbeans.XmlBoolean showCommentTags) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(showCommentTags);
        }
    }

    /**
     * Unsets the "ShowCommentTags" attribute
     */
    @Override
    public void unsetShowCommentTags() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }
}

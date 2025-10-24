/*
 * XML Type:  CommentList_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.CommentListType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CommentList_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class CommentListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.CommentListType {
    private static final long serialVersionUID = 1L;

    public CommentListTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "CommentEntry"),
    };


    /**
     * Gets a List of "CommentEntry" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.CommentEntryType> getCommentEntryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCommentEntryArray,
                this::setCommentEntryArray,
                this::insertNewCommentEntry,
                this::removeCommentEntry,
                this::sizeOfCommentEntryArray
            );
        }
    }

    /**
     * Gets array of all "CommentEntry" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CommentEntryType[] getCommentEntryArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.CommentEntryType[0]);
    }

    /**
     * Gets ith "CommentEntry" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CommentEntryType getCommentEntryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CommentEntryType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CommentEntryType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CommentEntry" element
     */
    @Override
    public int sizeOfCommentEntryArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "CommentEntry" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCommentEntryArray(com.microsoft.schemas.office.visio.x2012.main.CommentEntryType[] commentEntryArray) {
        check_orphaned();
        arraySetterHelper(commentEntryArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "CommentEntry" element
     */
    @Override
    public void setCommentEntryArray(int i, com.microsoft.schemas.office.visio.x2012.main.CommentEntryType commentEntry) {
        generatedSetterHelperImpl(commentEntry, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CommentEntry" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CommentEntryType insertNewCommentEntry(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CommentEntryType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CommentEntryType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CommentEntry" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CommentEntryType addNewCommentEntry() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CommentEntryType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CommentEntryType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "CommentEntry" element
     */
    @Override
    public void removeCommentEntry(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

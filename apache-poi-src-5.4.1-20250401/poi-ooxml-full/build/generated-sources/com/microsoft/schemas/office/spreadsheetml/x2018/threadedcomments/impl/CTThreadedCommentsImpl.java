/*
 * XML Type:  CT_ThreadedComments
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_ThreadedComments(@http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments).
 *
 * This is a complex type.
 */
public class CTThreadedCommentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments {
    private static final long serialVersionUID = 1L;

    public CTThreadedCommentsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments", "threadedComment"),
        new QName("http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments", "extLst"),
    };


    /**
     * Gets a List of "threadedComment" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment> getThreadedCommentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getThreadedCommentArray,
                this::setThreadedCommentArray,
                this::insertNewThreadedComment,
                this::removeThreadedComment,
                this::sizeOfThreadedCommentArray
            );
        }
    }

    /**
     * Gets array of all "threadedComment" elements
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment[] getThreadedCommentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment[0]);
    }

    /**
     * Gets ith "threadedComment" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment getThreadedCommentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "threadedComment" element
     */
    @Override
    public int sizeOfThreadedCommentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "threadedComment" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setThreadedCommentArray(com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment[] threadedCommentArray) {
        check_orphaned();
        arraySetterHelper(threadedCommentArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "threadedComment" element
     */
    @Override
    public void setThreadedCommentArray(int i, com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment threadedComment) {
        generatedSetterHelperImpl(threadedComment, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "threadedComment" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment insertNewThreadedComment(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "threadedComment" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment addNewThreadedComment() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "threadedComment" element
     */
    @Override
    public void removeThreadedComment(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "extLst" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}

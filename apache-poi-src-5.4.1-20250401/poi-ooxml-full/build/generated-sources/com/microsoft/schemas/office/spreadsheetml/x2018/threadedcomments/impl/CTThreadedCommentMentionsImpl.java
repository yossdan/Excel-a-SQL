/*
 * XML Type:  CT_ThreadedCommentMentions
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_ThreadedCommentMentions(@http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments).
 *
 * This is a complex type.
 */
public class CTThreadedCommentMentionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions {
    private static final long serialVersionUID = 1L;

    public CTThreadedCommentMentionsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments", "mention"),
    };


    /**
     * Gets a List of "mention" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention> getMentionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMentionArray,
                this::setMentionArray,
                this::insertNewMention,
                this::removeMention,
                this::sizeOfMentionArray
            );
        }
    }

    /**
     * Gets array of all "mention" elements
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention[] getMentionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention[0]);
    }

    /**
     * Gets ith "mention" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention getMentionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "mention" element
     */
    @Override
    public int sizeOfMentionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "mention" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setMentionArray(com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention[] mentionArray) {
        check_orphaned();
        arraySetterHelper(mentionArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "mention" element
     */
    @Override
    public void setMentionArray(int i, com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention mention) {
        generatedSetterHelperImpl(mention, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "mention" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention insertNewMention(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "mention" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention addNewMention() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "mention" element
     */
    @Override
    public void removeMention(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

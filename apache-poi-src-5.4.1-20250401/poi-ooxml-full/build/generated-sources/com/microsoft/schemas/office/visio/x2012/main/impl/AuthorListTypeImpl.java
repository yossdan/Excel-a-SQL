/*
 * XML Type:  AuthorList_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.AuthorListType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AuthorList_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class AuthorListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.AuthorListType {
    private static final long serialVersionUID = 1L;

    public AuthorListTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "AuthorEntry"),
    };


    /**
     * Gets a List of "AuthorEntry" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType> getAuthorEntryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAuthorEntryArray,
                this::setAuthorEntryArray,
                this::insertNewAuthorEntry,
                this::removeAuthorEntry,
                this::sizeOfAuthorEntryArray
            );
        }
    }

    /**
     * Gets array of all "AuthorEntry" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType[] getAuthorEntryArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType[0]);
    }

    /**
     * Gets ith "AuthorEntry" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType getAuthorEntryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AuthorEntry" element
     */
    @Override
    public int sizeOfAuthorEntryArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "AuthorEntry" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAuthorEntryArray(com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType[] authorEntryArray) {
        check_orphaned();
        arraySetterHelper(authorEntryArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "AuthorEntry" element
     */
    @Override
    public void setAuthorEntryArray(int i, com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType authorEntry) {
        generatedSetterHelperImpl(authorEntry, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AuthorEntry" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType insertNewAuthorEntry(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AuthorEntry" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType addNewAuthorEntry() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "AuthorEntry" element
     */
    @Override
    public void removeAuthorEntry(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

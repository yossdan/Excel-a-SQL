/*
 * XML Type:  CT_GradientStopList
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GradientStopList(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTGradientStopListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList {
    private static final long serialVersionUID = 1L;

    public CTGradientStopListImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "gs"),
    };


    /**
     * Gets a List of "gs" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop> getGsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGsArray,
                this::setGsArray,
                this::insertNewGs,
                this::removeGs,
                this::sizeOfGsArray
            );
        }
    }

    /**
     * Gets array of all "gs" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop[] getGsArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop[0]);
    }

    /**
     * Gets ith "gs" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop getGsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "gs" element
     */
    @Override
    public int sizeOfGsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "gs" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setGsArray(com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop[] gsArray) {
        check_orphaned();
        arraySetterHelper(gsArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "gs" element
     */
    @Override
    public void setGsArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop gs) {
        generatedSetterHelperImpl(gs, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "gs" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop insertNewGs(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "gs" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop addNewGs() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "gs" element
     */
    @Override
    public void removeGs(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

/*
 * XML Type:  CT_StylisticSets
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTStylisticSets
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_StylisticSets(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTStylisticSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTStylisticSets {
    private static final long serialVersionUID = 1L;

    public CTStylisticSetsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "styleSet"),
    };


    /**
     * Gets a List of "styleSet" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet> getStyleSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStyleSetArray,
                this::setStyleSetArray,
                this::insertNewStyleSet,
                this::removeStyleSet,
                this::sizeOfStyleSetArray
            );
        }
    }

    /**
     * Gets array of all "styleSet" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet[] getStyleSetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet[0]);
    }

    /**
     * Gets ith "styleSet" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet getStyleSetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "styleSet" element
     */
    @Override
    public int sizeOfStyleSetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "styleSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStyleSetArray(com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet[] styleSetArray) {
        check_orphaned();
        arraySetterHelper(styleSetArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "styleSet" element
     */
    @Override
    public void setStyleSetArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet styleSet) {
        generatedSetterHelperImpl(styleSet, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "styleSet" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet insertNewStyleSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "styleSet" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet addNewStyleSet() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "styleSet" element
     */
    @Override
    public void removeStyleSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

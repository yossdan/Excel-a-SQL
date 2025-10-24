/*
 * XML Type:  CT_Subtotals
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Subtotals(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTSubtotalsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals {
    private static final long serialVersionUID = 1L;

    public CTSubtotalsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "idx"),
    };


    /**
     * Gets a List of "idx" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex> getIdxList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getIdxArray,
                this::setIdxArray,
                this::insertNewIdx,
                this::removeIdx,
                this::sizeOfIdxArray
            );
        }
    }

    /**
     * Gets array of all "idx" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex[] getIdxArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex[0]);
    }

    /**
     * Gets ith "idx" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex getIdxArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "idx" element
     */
    @Override
    public int sizeOfIdxArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "idx" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setIdxArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex[] idxArray) {
        check_orphaned();
        arraySetterHelper(idxArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "idx" element
     */
    @Override
    public void setIdxArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex idx) {
        generatedSetterHelperImpl(idx, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "idx" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex insertNewIdx(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "idx" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex addNewIdx() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "idx" element
     */
    @Override
    public void removeIdx(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

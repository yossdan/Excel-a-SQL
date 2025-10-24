/*
 * XML Type:  CT_DataLabelFieldTable
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_DataLabelFieldTable(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public class CTDataLabelFieldTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable {
    private static final long serialVersionUID = 1L;

    public CTDataLabelFieldTableImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "dlblFTEntry"),
    };


    /**
     * Gets a List of "dlblFTEntry" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry> getDlblFTEntryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDlblFTEntryArray,
                this::setDlblFTEntryArray,
                this::insertNewDlblFTEntry,
                this::removeDlblFTEntry,
                this::sizeOfDlblFTEntryArray
            );
        }
    }

    /**
     * Gets array of all "dlblFTEntry" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry[] getDlblFTEntryArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry[0]);
    }

    /**
     * Gets ith "dlblFTEntry" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry getDlblFTEntryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "dlblFTEntry" element
     */
    @Override
    public int sizeOfDlblFTEntryArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "dlblFTEntry" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDlblFTEntryArray(com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry[] dlblFTEntryArray) {
        check_orphaned();
        arraySetterHelper(dlblFTEntryArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "dlblFTEntry" element
     */
    @Override
    public void setDlblFTEntryArray(int i, com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry dlblFTEntry) {
        generatedSetterHelperImpl(dlblFTEntry, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "dlblFTEntry" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry insertNewDlblFTEntry(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "dlblFTEntry" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry addNewDlblFTEntry() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "dlblFTEntry" element
     */
    @Override
    public void removeDlblFTEntry(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

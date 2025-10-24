/*
 * XML Type:  CT_Copyrights
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTCopyrights
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Copyrights(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTCopyrightsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTCopyrights {
    private static final long serialVersionUID = 1L;

    public CTCopyrightsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "copyright"),
    };


    /**
     * Gets a List of "copyright" elements
     */
    @Override
    public java.util.List<java.lang.String> getCopyrightList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getCopyrightArray,
                this::setCopyrightArray,
                this::insertCopyright,
                this::removeCopyright,
                this::sizeOfCopyrightArray
            );
        }
    }

    /**
     * Gets array of all "copyright" elements
     */
    @Override
    public java.lang.String[] getCopyrightArray() {
        return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "copyright" element
     */
    @Override
    public java.lang.String getCopyrightArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "copyright" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetCopyrightList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetCopyrightArray,
                this::xsetCopyrightArray,
                this::insertNewCopyright,
                this::removeCopyright,
                this::sizeOfCopyrightArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "copyright" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetCopyrightArray() {
        return xgetArray(PROPERTY_QNAME[0], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "copyright" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetCopyrightArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "copyright" element
     */
    @Override
    public int sizeOfCopyrightArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "copyright" element
     */
    @Override
    public void setCopyrightArray(java.lang.String[] copyrightArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(copyrightArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "copyright" element
     */
    @Override
    public void setCopyrightArray(int i, java.lang.String copyright) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(copyright);
        }
    }

    /**
     * Sets (as xml) array of all "copyright" element
     */
    @Override
    public void xsetCopyrightArray(org.apache.xmlbeans.XmlString[]copyrightArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(copyrightArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "copyright" element
     */
    @Override
    public void xsetCopyrightArray(int i, org.apache.xmlbeans.XmlString copyright) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(copyright);
        }
    }

    /**
     * Inserts the value as the ith "copyright" element
     */
    @Override
    public void insertCopyright(int i, java.lang.String copyright) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setStringValue(copyright);
        }
    }

    /**
     * Appends the value as the last "copyright" element
     */
    @Override
    public void addCopyright(java.lang.String copyright) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setStringValue(copyright);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "copyright" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewCopyright(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "copyright" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewCopyright() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "copyright" element
     */
    @Override
    public void removeCopyright(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

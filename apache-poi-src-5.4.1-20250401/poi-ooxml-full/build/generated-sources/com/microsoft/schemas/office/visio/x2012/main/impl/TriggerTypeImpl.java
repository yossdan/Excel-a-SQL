/*
 * XML Type:  Trigger_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.TriggerType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Trigger_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class TriggerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.TriggerType {
    private static final long serialVersionUID = 1L;

    public TriggerTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "RefBy"),
        new QName("", "N"),
    };


    /**
     * Gets a List of "RefBy" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.RefByType> getRefByList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRefByArray,
                this::setRefByArray,
                this::insertNewRefBy,
                this::removeRefBy,
                this::sizeOfRefByArray
            );
        }
    }

    /**
     * Gets array of all "RefBy" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RefByType[] getRefByArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.RefByType[0]);
    }

    /**
     * Gets ith "RefBy" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RefByType getRefByArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RefByType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RefByType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RefBy" element
     */
    @Override
    public int sizeOfRefByArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "RefBy" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRefByArray(com.microsoft.schemas.office.visio.x2012.main.RefByType[] refByArray) {
        check_orphaned();
        arraySetterHelper(refByArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "RefBy" element
     */
    @Override
    public void setRefByArray(int i, com.microsoft.schemas.office.visio.x2012.main.RefByType refBy) {
        generatedSetterHelperImpl(refBy, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RefBy" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RefByType insertNewRefBy(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RefByType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RefByType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RefBy" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RefByType addNewRefBy() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RefByType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RefByType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "RefBy" element
     */
    @Override
    public void removeRefBy(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "N" attribute
     */
    @Override
    public java.lang.String getN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "N" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "N" attribute
     */
    @Override
    public void setN(java.lang.String n) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(n);
        }
    }

    /**
     * Sets (as xml) the "N" attribute
     */
    @Override
    public void xsetN(org.apache.xmlbeans.XmlString n) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(n);
        }
    }
}

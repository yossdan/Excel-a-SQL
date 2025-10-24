/*
 * XML Type:  DataRecordSets_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataRecordSets_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class DataRecordSetsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType {
    private static final long serialVersionUID = 1L;

    public DataRecordSetsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "DataRecordSet"),
        new QName("", "NextID"),
        new QName("", "ActiveRecordsetID"),
        new QName("", "DataWindowOrder"),
    };


    /**
     * Gets a List of "DataRecordSet" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType> getDataRecordSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataRecordSetArray,
                this::setDataRecordSetArray,
                this::insertNewDataRecordSet,
                this::removeDataRecordSet,
                this::sizeOfDataRecordSetArray
            );
        }
    }

    /**
     * Gets array of all "DataRecordSet" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType[] getDataRecordSetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType[0]);
    }

    /**
     * Gets ith "DataRecordSet" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType getDataRecordSetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataRecordSet" element
     */
    @Override
    public int sizeOfDataRecordSetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "DataRecordSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataRecordSetArray(com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType[] dataRecordSetArray) {
        check_orphaned();
        arraySetterHelper(dataRecordSetArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "DataRecordSet" element
     */
    @Override
    public void setDataRecordSetArray(int i, com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType dataRecordSet) {
        generatedSetterHelperImpl(dataRecordSet, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataRecordSet" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType insertNewDataRecordSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataRecordSet" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType addNewDataRecordSet() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "DataRecordSet" element
     */
    @Override
    public void removeDataRecordSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "NextID" attribute
     */
    @Override
    public long getNextID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "NextID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetNextID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "NextID" attribute
     */
    @Override
    public void setNextID(long nextID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setLongValue(nextID);
        }
    }

    /**
     * Sets (as xml) the "NextID" attribute
     */
    @Override
    public void xsetNextID(org.apache.xmlbeans.XmlUnsignedInt nextID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(nextID);
        }
    }

    /**
     * Gets the "ActiveRecordsetID" attribute
     */
    @Override
    public long getActiveRecordsetID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "ActiveRecordsetID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetActiveRecordsetID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "ActiveRecordsetID" attribute
     */
    @Override
    public boolean isSetActiveRecordsetID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "ActiveRecordsetID" attribute
     */
    @Override
    public void setActiveRecordsetID(long activeRecordsetID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setLongValue(activeRecordsetID);
        }
    }

    /**
     * Sets (as xml) the "ActiveRecordsetID" attribute
     */
    @Override
    public void xsetActiveRecordsetID(org.apache.xmlbeans.XmlUnsignedInt activeRecordsetID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(activeRecordsetID);
        }
    }

    /**
     * Unsets the "ActiveRecordsetID" attribute
     */
    @Override
    public void unsetActiveRecordsetID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "DataWindowOrder" attribute
     */
    @Override
    public java.lang.String getDataWindowOrder() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "DataWindowOrder" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetDataWindowOrder() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "DataWindowOrder" attribute
     */
    @Override
    public boolean isSetDataWindowOrder() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "DataWindowOrder" attribute
     */
    @Override
    public void setDataWindowOrder(java.lang.String dataWindowOrder) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(dataWindowOrder);
        }
    }

    /**
     * Sets (as xml) the "DataWindowOrder" attribute
     */
    @Override
    public void xsetDataWindowOrder(org.apache.xmlbeans.XmlString dataWindowOrder) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(dataWindowOrder);
        }
    }

    /**
     * Unsets the "DataWindowOrder" attribute
     */
    @Override
    public void unsetDataWindowOrder() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }
}

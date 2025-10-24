/*
 * XML Type:  PrimaryKey_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML PrimaryKey_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class PrimaryKeyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType {
    private static final long serialVersionUID = 1L;

    public PrimaryKeyTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "RowKeyValue"),
        new QName("", "ColumnNameID"),
    };


    /**
     * Gets a List of "RowKeyValue" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType> getRowKeyValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRowKeyValueArray,
                this::setRowKeyValueArray,
                this::insertNewRowKeyValue,
                this::removeRowKeyValue,
                this::sizeOfRowKeyValueArray
            );
        }
    }

    /**
     * Gets array of all "RowKeyValue" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType[] getRowKeyValueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType[0]);
    }

    /**
     * Gets ith "RowKeyValue" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType getRowKeyValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RowKeyValue" element
     */
    @Override
    public int sizeOfRowKeyValueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "RowKeyValue" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRowKeyValueArray(com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType[] rowKeyValueArray) {
        check_orphaned();
        arraySetterHelper(rowKeyValueArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "RowKeyValue" element
     */
    @Override
    public void setRowKeyValueArray(int i, com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType rowKeyValue) {
        generatedSetterHelperImpl(rowKeyValue, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RowKeyValue" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType insertNewRowKeyValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RowKeyValue" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType addNewRowKeyValue() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "RowKeyValue" element
     */
    @Override
    public void removeRowKeyValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "ColumnNameID" attribute
     */
    @Override
    public java.lang.String getColumnNameID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ColumnNameID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetColumnNameID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "ColumnNameID" attribute
     */
    @Override
    public void setColumnNameID(java.lang.String columnNameID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(columnNameID);
        }
    }

    /**
     * Sets (as xml) the "ColumnNameID" attribute
     */
    @Override
    public void xsetColumnNameID(org.apache.xmlbeans.XmlString columnNameID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(columnNameID);
        }
    }
}

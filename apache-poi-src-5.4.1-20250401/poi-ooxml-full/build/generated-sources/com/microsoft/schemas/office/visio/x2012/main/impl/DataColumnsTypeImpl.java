/*
 * XML Type:  DataColumns_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataColumnsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataColumns_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class DataColumnsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.DataColumnsType {
    private static final long serialVersionUID = 1L;

    public DataColumnsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "DataColumn"),
        new QName("", "SortColumn"),
        new QName("", "SortAsc"),
    };


    /**
     * Gets a List of "DataColumn" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.DataColumnType> getDataColumnList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataColumnArray,
                this::setDataColumnArray,
                this::insertNewDataColumn,
                this::removeDataColumn,
                this::sizeOfDataColumnArray
            );
        }
    }

    /**
     * Gets array of all "DataColumn" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataColumnType[] getDataColumnArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.DataColumnType[0]);
    }

    /**
     * Gets ith "DataColumn" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataColumnType getDataColumnArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataColumnType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataColumnType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataColumn" element
     */
    @Override
    public int sizeOfDataColumnArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "DataColumn" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataColumnArray(com.microsoft.schemas.office.visio.x2012.main.DataColumnType[] dataColumnArray) {
        check_orphaned();
        arraySetterHelper(dataColumnArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "DataColumn" element
     */
    @Override
    public void setDataColumnArray(int i, com.microsoft.schemas.office.visio.x2012.main.DataColumnType dataColumn) {
        generatedSetterHelperImpl(dataColumn, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataColumn" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataColumnType insertNewDataColumn(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataColumnType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataColumnType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataColumn" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataColumnType addNewDataColumn() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataColumnType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataColumnType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "DataColumn" element
     */
    @Override
    public void removeDataColumn(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "SortColumn" attribute
     */
    @Override
    public java.lang.String getSortColumn() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "SortColumn" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetSortColumn() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "SortColumn" attribute
     */
    @Override
    public boolean isSetSortColumn() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "SortColumn" attribute
     */
    @Override
    public void setSortColumn(java.lang.String sortColumn) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(sortColumn);
        }
    }

    /**
     * Sets (as xml) the "SortColumn" attribute
     */
    @Override
    public void xsetSortColumn(org.apache.xmlbeans.XmlString sortColumn) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(sortColumn);
        }
    }

    /**
     * Unsets the "SortColumn" attribute
     */
    @Override
    public void unsetSortColumn() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "SortAsc" attribute
     */
    @Override
    public boolean getSortAsc() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "SortAsc" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetSortAsc() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "SortAsc" attribute
     */
    @Override
    public boolean isSetSortAsc() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "SortAsc" attribute
     */
    @Override
    public void setSortAsc(boolean sortAsc) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(sortAsc);
        }
    }

    /**
     * Sets (as xml) the "SortAsc" attribute
     */
    @Override
    public void xsetSortAsc(org.apache.xmlbeans.XmlBoolean sortAsc) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(sortAsc);
        }
    }

    /**
     * Unsets the "SortAsc" attribute
     */
    @Override
    public void unsetSortAsc() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }
}

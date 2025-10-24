/*
 * XML Type:  CT_GeoChildTypes
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoChildTypes(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoChildTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes {
    private static final long serialVersionUID = 1L;

    public CTGeoChildTypesImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "entityType"),
    };


    /**
     * Gets a List of "entityType" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum> getEntityTypeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getEntityTypeArray,
                this::setEntityTypeArray,
                this::insertEntityType,
                this::removeEntityType,
                this::sizeOfEntityTypeArray
            );
        }
    }

    /**
     * Gets array of all "entityType" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum[] getEntityTypeArray() {
        return getEnumArray(PROPERTY_QNAME[0], com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum[]::new);
    }

    /**
     * Gets ith "entityType" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum getEntityTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "entityType" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType> xgetEntityTypeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetEntityTypeArray,
                this::xsetEntityTypeArray,
                this::insertNewEntityType,
                this::removeEntityType,
                this::sizeOfEntityTypeArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "entityType" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType[] xgetEntityTypeArray() {
        return xgetArray(PROPERTY_QNAME[0], com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType[]::new);
    }

    /**
     * Gets (as xml) ith "entityType" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType xgetEntityTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "entityType" element
     */
    @Override
    public int sizeOfEntityTypeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "entityType" element
     */
    @Override
    public void setEntityTypeArray(com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum[] entityTypeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(entityTypeArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "entityType" element
     */
    @Override
    public void setEntityTypeArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum entityType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(entityType);
        }
    }

    /**
     * Sets (as xml) array of all "entityType" element
     */
    @Override
    public void xsetEntityTypeArray(com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType[]entityTypeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(entityTypeArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "entityType" element
     */
    @Override
    public void xsetEntityTypeArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType entityType) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(entityType);
        }
    }

    /**
     * Inserts the value as the ith "entityType" element
     */
    @Override
    public void insertEntityType(int i, com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum entityType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setEnumValue(entityType);
        }
    }

    /**
     * Appends the value as the last "entityType" element
     */
    @Override
    public void addEntityType(com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum entityType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setEnumValue(entityType);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityType" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType insertNewEntityType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "entityType" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType addNewEntityType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "entityType" element
     */
    @Override
    public void removeEntityType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

/*
 * XML Type:  CT_GeoCache
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoCache(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoCacheImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache {
    private static final long serialVersionUID = 1L;

    public CTGeoCacheImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "binary"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "clear"),
        new QName("", "provider"),
    };


    /**
     * Gets a List of "binary" elements
     */
    @Override
    public java.util.List<byte[]> getBinaryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getBinaryArray,
                this::setBinaryArray,
                this::insertBinary,
                this::removeBinary,
                this::sizeOfBinaryArray
            );
        }
    }

    /**
     * Gets array of all "binary" elements
     */
    @Override
    public byte[][] getBinaryArray() {
        return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getByteArrayValue, byte[][]::new);
    }

    /**
     * Gets ith "binary" element
     */
    @Override
    public byte[] getBinaryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getByteArrayValue();
        }
    }

    /**
     * Gets (as xml) a List of "binary" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlBase64Binary> xgetBinaryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetBinaryArray,
                this::xsetBinaryArray,
                this::insertNewBinary,
                this::removeBinary,
                this::sizeOfBinaryArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "binary" elements
     */
    @Override
    public org.apache.xmlbeans.XmlBase64Binary[] xgetBinaryArray() {
        return xgetArray(PROPERTY_QNAME[0], org.apache.xmlbeans.XmlBase64Binary[]::new);
    }

    /**
     * Gets (as xml) ith "binary" element
     */
    @Override
    public org.apache.xmlbeans.XmlBase64Binary xgetBinaryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "binary" element
     */
    @Override
    public int sizeOfBinaryArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "binary" element
     */
    @Override
    public void setBinaryArray(byte[][] binaryArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(binaryArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "binary" element
     */
    @Override
    public void setBinaryArray(int i, byte[] binary) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setByteArrayValue(binary);
        }
    }

    /**
     * Sets (as xml) array of all "binary" element
     */
    @Override
    public void xsetBinaryArray(org.apache.xmlbeans.XmlBase64Binary[]binaryArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(binaryArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "binary" element
     */
    @Override
    public void xsetBinaryArray(int i, org.apache.xmlbeans.XmlBase64Binary binary) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(binary);
        }
    }

    /**
     * Inserts the value as the ith "binary" element
     */
    @Override
    public void insertBinary(int i, byte[] binary) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setByteArrayValue(binary);
        }
    }

    /**
     * Appends the value as the last "binary" element
     */
    @Override
    public void addBinary(byte[] binary) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setByteArrayValue(binary);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "binary" element
     */
    @Override
    public org.apache.xmlbeans.XmlBase64Binary insertNewBinary(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "binary" element
     */
    @Override
    public org.apache.xmlbeans.XmlBase64Binary addNewBinary() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "binary" element
     */
    @Override
    public void removeBinary(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "clear" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTClear> getClearList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClearArray,
                this::setClearArray,
                this::insertNewClear,
                this::removeClear,
                this::sizeOfClearArray
            );
        }
    }

    /**
     * Gets array of all "clear" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTClear[] getClearArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new com.microsoft.schemas.office.drawing.x2014.chartex.CTClear[0]);
    }

    /**
     * Gets ith "clear" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTClear getClearArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTClear target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTClear)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "clear" element
     */
    @Override
    public int sizeOfClearArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "clear" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClearArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTClear[] clearArray) {
        check_orphaned();
        arraySetterHelper(clearArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "clear" element
     */
    @Override
    public void setClearArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTClear clear) {
        generatedSetterHelperImpl(clear, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "clear" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTClear insertNewClear(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTClear target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTClear)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "clear" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTClear addNewClear() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTClear target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTClear)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "clear" element
     */
    @Override
    public void removeClear(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "provider" attribute
     */
    @Override
    public java.lang.String getProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "provider" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Sets the "provider" attribute
     */
    @Override
    public void setProvider(java.lang.String provider) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(provider);
        }
    }

    /**
     * Sets (as xml) the "provider" attribute
     */
    @Override
    public void xsetProvider(org.apache.xmlbeans.XmlString provider) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(provider);
        }
    }
}

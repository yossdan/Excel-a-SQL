/*
 * XML Type:  CT_R
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTR
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_R(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTRImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.CTR {
    private static final long serialVersionUID = 1L;

    public CTRImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "proxy"),
        new QName("", "id"),
        new QName("", "type"),
        new QName("", "how"),
        new QName("", "idref"),
    };


    /**
     * Gets a List of "proxy" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.office.CTProxy> getProxyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getProxyArray,
                this::setProxyArray,
                this::insertNewProxy,
                this::removeProxy,
                this::sizeOfProxyArray
            );
        }
    }

    /**
     * Gets array of all "proxy" elements
     */
    @Override
    public com.microsoft.schemas.office.office.CTProxy[] getProxyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.office.CTProxy[0]);
    }

    /**
     * Gets ith "proxy" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTProxy getProxyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTProxy target = null;
            target = (com.microsoft.schemas.office.office.CTProxy)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "proxy" element
     */
    @Override
    public int sizeOfProxyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "proxy" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setProxyArray(com.microsoft.schemas.office.office.CTProxy[] proxyArray) {
        check_orphaned();
        arraySetterHelper(proxyArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "proxy" element
     */
    @Override
    public void setProxyArray(int i, com.microsoft.schemas.office.office.CTProxy proxy) {
        generatedSetterHelperImpl(proxy, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "proxy" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTProxy insertNewProxy(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTProxy target = null;
            target = (com.microsoft.schemas.office.office.CTProxy)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "proxy" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTProxy addNewProxy() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTProxy target = null;
            target = (com.microsoft.schemas.office.office.CTProxy)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "proxy" element
     */
    @Override
    public void removeProxy(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "id" attribute
     */
    @Override
    public java.lang.String getId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "id" attribute
     */
    @Override
    public void setId(java.lang.String id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(org.apache.xmlbeans.XmlString id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(id);
        }
    }

    /**
     * Gets the "type" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STRType.Enum getType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STRType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "type" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STRType xgetType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STRType target = null;
            target = (com.microsoft.schemas.office.office.STRType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "type" attribute
     */
    @Override
    public boolean isSetType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "type" attribute
     */
    @Override
    public void setType(com.microsoft.schemas.office.office.STRType.Enum type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setEnumValue(type);
        }
    }

    /**
     * Sets (as xml) the "type" attribute
     */
    @Override
    public void xsetType(com.microsoft.schemas.office.office.STRType type) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STRType target = null;
            target = (com.microsoft.schemas.office.office.STRType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STRType)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(type);
        }
    }

    /**
     * Unsets the "type" attribute
     */
    @Override
    public void unsetType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "how" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STHow.Enum getHow() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STHow.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "how" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STHow xgetHow() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STHow target = null;
            target = (com.microsoft.schemas.office.office.STHow)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "how" attribute
     */
    @Override
    public boolean isSetHow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "how" attribute
     */
    @Override
    public void setHow(com.microsoft.schemas.office.office.STHow.Enum how) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setEnumValue(how);
        }
    }

    /**
     * Sets (as xml) the "how" attribute
     */
    @Override
    public void xsetHow(com.microsoft.schemas.office.office.STHow how) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STHow target = null;
            target = (com.microsoft.schemas.office.office.STHow)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STHow)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(how);
        }
    }

    /**
     * Unsets the "how" attribute
     */
    @Override
    public void unsetHow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "idref" attribute
     */
    @Override
    public java.lang.String getIdref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "idref" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetIdref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "idref" attribute
     */
    @Override
    public boolean isSetIdref() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "idref" attribute
     */
    @Override
    public void setIdref(java.lang.String idref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(idref);
        }
    }

    /**
     * Sets (as xml) the "idref" attribute
     */
    @Override
    public void xsetIdref(org.apache.xmlbeans.XmlString idref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(idref);
        }
    }

    /**
     * Unsets the "idref" attribute
     */
    @Override
    public void unsetIdref() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }
}

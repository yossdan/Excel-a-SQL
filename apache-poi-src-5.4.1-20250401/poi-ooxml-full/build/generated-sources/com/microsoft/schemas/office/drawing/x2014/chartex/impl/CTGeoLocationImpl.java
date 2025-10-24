/*
 * XML Type:  CT_GeoLocation
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoLocation(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoLocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation {
    private static final long serialVersionUID = 1L;

    public CTGeoLocationImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "address"),
        new QName("", "latitude"),
        new QName("", "longitude"),
        new QName("", "entityName"),
        new QName("", "entityType"),
    };


    /**
     * Gets the "address" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAddress getAddress() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTAddress target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTAddress)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "address" element
     */
    @Override
    public boolean isSetAddress() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "address" element
     */
    @Override
    public void setAddress(com.microsoft.schemas.office.drawing.x2014.chartex.CTAddress address) {
        generatedSetterHelperImpl(address, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "address" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAddress addNewAddress() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTAddress target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTAddress)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "address" element
     */
    @Override
    public void unsetAddress() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "latitude" attribute
     */
    @Override
    public double getLatitude() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "latitude" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDouble xgetLatitude() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "latitude" attribute
     */
    @Override
    public boolean isSetLatitude() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "latitude" attribute
     */
    @Override
    public void setLatitude(double latitude) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setDoubleValue(latitude);
        }
    }

    /**
     * Sets (as xml) the "latitude" attribute
     */
    @Override
    public void xsetLatitude(org.apache.xmlbeans.XmlDouble latitude) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(latitude);
        }
    }

    /**
     * Unsets the "latitude" attribute
     */
    @Override
    public void unsetLatitude() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "longitude" attribute
     */
    @Override
    public double getLongitude() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "longitude" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDouble xgetLongitude() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "longitude" attribute
     */
    @Override
    public boolean isSetLongitude() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "longitude" attribute
     */
    @Override
    public void setLongitude(double longitude) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setDoubleValue(longitude);
        }
    }

    /**
     * Sets (as xml) the "longitude" attribute
     */
    @Override
    public void xsetLongitude(org.apache.xmlbeans.XmlDouble longitude) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(longitude);
        }
    }

    /**
     * Unsets the "longitude" attribute
     */
    @Override
    public void unsetLongitude() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "entityName" attribute
     */
    @Override
    public java.lang.String getEntityName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "entityName" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetEntityName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Sets the "entityName" attribute
     */
    @Override
    public void setEntityName(java.lang.String entityName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(entityName);
        }
    }

    /**
     * Sets (as xml) the "entityName" attribute
     */
    @Override
    public void xsetEntityName(org.apache.xmlbeans.XmlString entityName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(entityName);
        }
    }

    /**
     * Gets the "entityType" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum getEntityType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : (com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "entityType" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType xgetEntityType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Sets the "entityType" attribute
     */
    @Override
    public void setEntityType(com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum entityType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setEnumValue(entityType);
        }
    }

    /**
     * Sets (as xml) the "entityType" attribute
     */
    @Override
    public void xsetEntityType(com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType entityType) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(entityType);
        }
    }
}

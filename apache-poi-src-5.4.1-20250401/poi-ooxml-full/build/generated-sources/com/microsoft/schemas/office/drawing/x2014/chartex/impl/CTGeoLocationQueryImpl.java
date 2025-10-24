/*
 * XML Type:  CT_GeoLocationQuery
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoLocationQuery(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoLocationQueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery {
    private static final long serialVersionUID = 1L;

    public CTGeoLocationQueryImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "countryRegion"),
        new QName("", "adminDistrict1"),
        new QName("", "adminDistrict2"),
        new QName("", "postalCode"),
        new QName("", "entityType"),
    };


    /**
     * Gets the "countryRegion" attribute
     */
    @Override
    public java.lang.String getCountryRegion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "countryRegion" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetCountryRegion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "countryRegion" attribute
     */
    @Override
    public boolean isSetCountryRegion() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "countryRegion" attribute
     */
    @Override
    public void setCountryRegion(java.lang.String countryRegion) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(countryRegion);
        }
    }

    /**
     * Sets (as xml) the "countryRegion" attribute
     */
    @Override
    public void xsetCountryRegion(org.apache.xmlbeans.XmlString countryRegion) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(countryRegion);
        }
    }

    /**
     * Unsets the "countryRegion" attribute
     */
    @Override
    public void unsetCountryRegion() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "adminDistrict1" attribute
     */
    @Override
    public java.lang.String getAdminDistrict1() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "adminDistrict1" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetAdminDistrict1() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "adminDistrict1" attribute
     */
    @Override
    public boolean isSetAdminDistrict1() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "adminDistrict1" attribute
     */
    @Override
    public void setAdminDistrict1(java.lang.String adminDistrict1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(adminDistrict1);
        }
    }

    /**
     * Sets (as xml) the "adminDistrict1" attribute
     */
    @Override
    public void xsetAdminDistrict1(org.apache.xmlbeans.XmlString adminDistrict1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(adminDistrict1);
        }
    }

    /**
     * Unsets the "adminDistrict1" attribute
     */
    @Override
    public void unsetAdminDistrict1() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "adminDistrict2" attribute
     */
    @Override
    public java.lang.String getAdminDistrict2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "adminDistrict2" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetAdminDistrict2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "adminDistrict2" attribute
     */
    @Override
    public boolean isSetAdminDistrict2() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "adminDistrict2" attribute
     */
    @Override
    public void setAdminDistrict2(java.lang.String adminDistrict2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(adminDistrict2);
        }
    }

    /**
     * Sets (as xml) the "adminDistrict2" attribute
     */
    @Override
    public void xsetAdminDistrict2(org.apache.xmlbeans.XmlString adminDistrict2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(adminDistrict2);
        }
    }

    /**
     * Unsets the "adminDistrict2" attribute
     */
    @Override
    public void unsetAdminDistrict2() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "postalCode" attribute
     */
    @Override
    public java.lang.String getPostalCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "postalCode" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetPostalCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "postalCode" attribute
     */
    @Override
    public boolean isSetPostalCode() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "postalCode" attribute
     */
    @Override
    public void setPostalCode(java.lang.String postalCode) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(postalCode);
        }
    }

    /**
     * Sets (as xml) the "postalCode" attribute
     */
    @Override
    public void xsetPostalCode(org.apache.xmlbeans.XmlString postalCode) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(postalCode);
        }
    }

    /**
     * Unsets the "postalCode" attribute
     */
    @Override
    public void unsetPostalCode() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
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

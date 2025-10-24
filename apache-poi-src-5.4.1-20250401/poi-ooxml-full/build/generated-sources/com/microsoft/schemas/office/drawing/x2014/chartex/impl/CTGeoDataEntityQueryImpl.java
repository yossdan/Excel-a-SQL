/*
 * XML Type:  CT_GeoDataEntityQuery
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQuery
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoDataEntityQuery(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoDataEntityQueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQuery {
    private static final long serialVersionUID = 1L;

    public CTGeoDataEntityQueryImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "entityType"),
        new QName("", "entityId"),
    };


    /**
     * Gets the "entityType" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum getEntityType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
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
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
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
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(entityType);
        }
    }

    /**
     * Gets the "entityId" attribute
     */
    @Override
    public java.lang.String getEntityId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "entityId" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetEntityId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "entityId" attribute
     */
    @Override
    public void setEntityId(java.lang.String entityId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(entityId);
        }
    }

    /**
     * Sets (as xml) the "entityId" attribute
     */
    @Override
    public void xsetEntityId(org.apache.xmlbeans.XmlString entityId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(entityId);
        }
    }
}

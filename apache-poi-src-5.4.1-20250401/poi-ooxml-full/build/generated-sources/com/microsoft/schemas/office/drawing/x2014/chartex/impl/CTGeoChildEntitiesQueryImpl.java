/*
 * XML Type:  CT_GeoChildEntitiesQuery
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoChildEntitiesQuery(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoChildEntitiesQueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery {
    private static final long serialVersionUID = 1L;

    public CTGeoChildEntitiesQueryImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoChildTypes"),
        new QName("", "entityId"),
    };


    /**
     * Gets the "geoChildTypes" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes getGeoChildTypes() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoChildTypes" element
     */
    @Override
    public boolean isSetGeoChildTypes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "geoChildTypes" element
     */
    @Override
    public void setGeoChildTypes(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes geoChildTypes) {
        generatedSetterHelperImpl(geoChildTypes, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoChildTypes" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes addNewGeoChildTypes() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "geoChildTypes" element
     */
    @Override
    public void unsetGeoChildTypes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
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

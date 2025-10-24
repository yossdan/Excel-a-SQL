/*
 * XML Type:  CT_GeoParentEntitiesQueryResult
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoParentEntitiesQueryResult(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoParentEntitiesQueryResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult {
    private static final long serialVersionUID = 1L;

    public CTGeoParentEntitiesQueryResultImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoParentEntitiesQuery"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoEntity"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoParentEntity"),
    };


    /**
     * Gets the "geoParentEntitiesQuery" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQuery getGeoParentEntitiesQuery() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQuery target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQuery)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "geoParentEntitiesQuery" element
     */
    @Override
    public void setGeoParentEntitiesQuery(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQuery geoParentEntitiesQuery) {
        generatedSetterHelperImpl(geoParentEntitiesQuery, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoParentEntitiesQuery" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQuery addNewGeoParentEntitiesQuery() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQuery target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQuery)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "geoEntity" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoEntity getGeoEntity() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoEntity target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoEntity)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoEntity" element
     */
    @Override
    public boolean isSetGeoEntity() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "geoEntity" element
     */
    @Override
    public void setGeoEntity(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoEntity geoEntity) {
        generatedSetterHelperImpl(geoEntity, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoEntity" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoEntity addNewGeoEntity() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoEntity target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoEntity)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "geoEntity" element
     */
    @Override
    public void unsetGeoEntity() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "geoParentEntity" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntity getGeoParentEntity() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntity target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntity)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoParentEntity" element
     */
    @Override
    public boolean isSetGeoParentEntity() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "geoParentEntity" element
     */
    @Override
    public void setGeoParentEntity(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntity geoParentEntity) {
        generatedSetterHelperImpl(geoParentEntity, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoParentEntity" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntity addNewGeoParentEntity() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntity target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntity)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "geoParentEntity" element
     */
    @Override
    public void unsetGeoParentEntity() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}

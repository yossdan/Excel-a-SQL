/*
 * XML Type:  CT_GeoChildEntitiesQueryResult
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoChildEntitiesQueryResult(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoChildEntitiesQueryResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult {
    private static final long serialVersionUID = 1L;

    public CTGeoChildEntitiesQueryResultImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoChildEntitiesQuery"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoChildEntities"),
    };


    /**
     * Gets the "geoChildEntitiesQuery" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery getGeoChildEntitiesQuery() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoChildEntitiesQuery" element
     */
    @Override
    public boolean isSetGeoChildEntitiesQuery() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "geoChildEntitiesQuery" element
     */
    @Override
    public void setGeoChildEntitiesQuery(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery geoChildEntitiesQuery) {
        generatedSetterHelperImpl(geoChildEntitiesQuery, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoChildEntitiesQuery" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery addNewGeoChildEntitiesQuery() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "geoChildEntitiesQuery" element
     */
    @Override
    public void unsetGeoChildEntitiesQuery() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "geoChildEntities" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities getGeoChildEntities() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoChildEntities" element
     */
    @Override
    public boolean isSetGeoChildEntities() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "geoChildEntities" element
     */
    @Override
    public void setGeoChildEntities(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities geoChildEntities) {
        generatedSetterHelperImpl(geoChildEntities, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoChildEntities" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities addNewGeoChildEntities() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "geoChildEntities" element
     */
    @Override
    public void unsetGeoChildEntities() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}

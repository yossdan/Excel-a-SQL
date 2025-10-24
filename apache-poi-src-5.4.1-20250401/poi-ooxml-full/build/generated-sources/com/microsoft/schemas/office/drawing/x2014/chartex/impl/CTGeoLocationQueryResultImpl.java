/*
 * XML Type:  CT_GeoLocationQueryResult
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoLocationQueryResult(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoLocationQueryResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult {
    private static final long serialVersionUID = 1L;

    public CTGeoLocationQueryResultImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoLocationQuery"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoLocations"),
    };


    /**
     * Gets the "geoLocationQuery" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery getGeoLocationQuery() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoLocationQuery" element
     */
    @Override
    public boolean isSetGeoLocationQuery() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "geoLocationQuery" element
     */
    @Override
    public void setGeoLocationQuery(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery geoLocationQuery) {
        generatedSetterHelperImpl(geoLocationQuery, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoLocationQuery" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery addNewGeoLocationQuery() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "geoLocationQuery" element
     */
    @Override
    public void unsetGeoLocationQuery() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "geoLocations" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations getGeoLocations() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoLocations" element
     */
    @Override
    public boolean isSetGeoLocations() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "geoLocations" element
     */
    @Override
    public void setGeoLocations(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations geoLocations) {
        generatedSetterHelperImpl(geoLocations, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoLocations" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations addNewGeoLocations() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "geoLocations" element
     */
    @Override
    public void unsetGeoLocations() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}

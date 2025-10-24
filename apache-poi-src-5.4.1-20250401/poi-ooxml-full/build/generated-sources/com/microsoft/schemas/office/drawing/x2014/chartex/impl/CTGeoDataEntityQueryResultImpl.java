/*
 * XML Type:  CT_GeoDataEntityQueryResult
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoDataEntityQueryResult(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoDataEntityQueryResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult {
    private static final long serialVersionUID = 1L;

    public CTGeoDataEntityQueryResultImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoDataEntityQuery"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoData"),
    };


    /**
     * Gets the "geoDataEntityQuery" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQuery getGeoDataEntityQuery() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQuery target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQuery)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoDataEntityQuery" element
     */
    @Override
    public boolean isSetGeoDataEntityQuery() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "geoDataEntityQuery" element
     */
    @Override
    public void setGeoDataEntityQuery(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQuery geoDataEntityQuery) {
        generatedSetterHelperImpl(geoDataEntityQuery, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoDataEntityQuery" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQuery addNewGeoDataEntityQuery() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQuery target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQuery)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "geoDataEntityQuery" element
     */
    @Override
    public void unsetGeoDataEntityQuery() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "geoData" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoData getGeoData() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoData target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoData)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoData" element
     */
    @Override
    public boolean isSetGeoData() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "geoData" element
     */
    @Override
    public void setGeoData(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoData geoData) {
        generatedSetterHelperImpl(geoData, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoData" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoData addNewGeoData() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoData target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoData)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "geoData" element
     */
    @Override
    public void unsetGeoData() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}

/*
 * XML Type:  CT_GeoDataPointToEntityQueryResult
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoDataPointToEntityQueryResult(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoDataPointToEntityQueryResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult {
    private static final long serialVersionUID = 1L;

    public CTGeoDataPointToEntityQueryResultImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoDataPointQuery"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoDataPointToEntityQuery"),
    };


    /**
     * Gets the "geoDataPointQuery" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointQuery getGeoDataPointQuery() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointQuery target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointQuery)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoDataPointQuery" element
     */
    @Override
    public boolean isSetGeoDataPointQuery() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "geoDataPointQuery" element
     */
    @Override
    public void setGeoDataPointQuery(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointQuery geoDataPointQuery) {
        generatedSetterHelperImpl(geoDataPointQuery, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoDataPointQuery" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointQuery addNewGeoDataPointQuery() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointQuery target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointQuery)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "geoDataPointQuery" element
     */
    @Override
    public void unsetGeoDataPointQuery() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "geoDataPointToEntityQuery" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQuery getGeoDataPointToEntityQuery() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQuery target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQuery)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoDataPointToEntityQuery" element
     */
    @Override
    public boolean isSetGeoDataPointToEntityQuery() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "geoDataPointToEntityQuery" element
     */
    @Override
    public void setGeoDataPointToEntityQuery(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQuery geoDataPointToEntityQuery) {
        generatedSetterHelperImpl(geoDataPointToEntityQuery, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoDataPointToEntityQuery" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQuery addNewGeoDataPointToEntityQuery() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQuery target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQuery)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "geoDataPointToEntityQuery" element
     */
    @Override
    public void unsetGeoDataPointToEntityQuery() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}

/*
 * XML Type:  CT_GeoLocations
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoLocations(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoLocationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations {
    private static final long serialVersionUID = 1L;

    public CTGeoLocationsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoLocation"),
    };


    /**
     * Gets the "geoLocation" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation getGeoLocation() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoLocation" element
     */
    @Override
    public boolean isSetGeoLocation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "geoLocation" element
     */
    @Override
    public void setGeoLocation(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation geoLocation) {
        generatedSetterHelperImpl(geoLocation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoLocation" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation addNewGeoLocation() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "geoLocation" element
     */
    @Override
    public void unsetGeoLocation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }
}

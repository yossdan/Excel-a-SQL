/*
 * XML Type:  CT_GeoPolygons
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygons
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoPolygons(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoPolygonsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygons {
    private static final long serialVersionUID = 1L;

    public CTGeoPolygonsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoPolygon"),
    };


    /**
     * Gets a List of "geoPolygon" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon> getGeoPolygonList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGeoPolygonArray,
                this::setGeoPolygonArray,
                this::insertNewGeoPolygon,
                this::removeGeoPolygon,
                this::sizeOfGeoPolygonArray
            );
        }
    }

    /**
     * Gets array of all "geoPolygon" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon[] getGeoPolygonArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon[0]);
    }

    /**
     * Gets ith "geoPolygon" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon getGeoPolygonArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "geoPolygon" element
     */
    @Override
    public int sizeOfGeoPolygonArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "geoPolygon" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setGeoPolygonArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon[] geoPolygonArray) {
        check_orphaned();
        arraySetterHelper(geoPolygonArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "geoPolygon" element
     */
    @Override
    public void setGeoPolygonArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon geoPolygon) {
        generatedSetterHelperImpl(geoPolygon, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoPolygon" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon insertNewGeoPolygon(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "geoPolygon" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon addNewGeoPolygon() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "geoPolygon" element
     */
    @Override
    public void removeGeoPolygon(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

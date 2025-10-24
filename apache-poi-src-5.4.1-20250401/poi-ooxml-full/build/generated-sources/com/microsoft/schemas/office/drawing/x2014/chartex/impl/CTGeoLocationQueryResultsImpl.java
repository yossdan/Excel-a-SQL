/*
 * XML Type:  CT_GeoLocationQueryResults
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoLocationQueryResults(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoLocationQueryResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults {
    private static final long serialVersionUID = 1L;

    public CTGeoLocationQueryResultsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoLocationQueryResult"),
    };


    /**
     * Gets a List of "geoLocationQueryResult" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult> getGeoLocationQueryResultList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGeoLocationQueryResultArray,
                this::setGeoLocationQueryResultArray,
                this::insertNewGeoLocationQueryResult,
                this::removeGeoLocationQueryResult,
                this::sizeOfGeoLocationQueryResultArray
            );
        }
    }

    /**
     * Gets array of all "geoLocationQueryResult" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult[] getGeoLocationQueryResultArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult[0]);
    }

    /**
     * Gets ith "geoLocationQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult getGeoLocationQueryResultArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "geoLocationQueryResult" element
     */
    @Override
    public int sizeOfGeoLocationQueryResultArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "geoLocationQueryResult" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setGeoLocationQueryResultArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult[] geoLocationQueryResultArray) {
        check_orphaned();
        arraySetterHelper(geoLocationQueryResultArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "geoLocationQueryResult" element
     */
    @Override
    public void setGeoLocationQueryResultArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult geoLocationQueryResult) {
        generatedSetterHelperImpl(geoLocationQueryResult, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoLocationQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult insertNewGeoLocationQueryResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "geoLocationQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult addNewGeoLocationQueryResult() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "geoLocationQueryResult" element
     */
    @Override
    public void removeGeoLocationQueryResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

/*
 * XML Type:  CT_GeoDataPointToEntityQueryResults
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoDataPointToEntityQueryResults(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoDataPointToEntityQueryResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults {
    private static final long serialVersionUID = 1L;

    public CTGeoDataPointToEntityQueryResultsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoDataPointToEntityQueryResult"),
    };


    /**
     * Gets a List of "geoDataPointToEntityQueryResult" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult> getGeoDataPointToEntityQueryResultList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGeoDataPointToEntityQueryResultArray,
                this::setGeoDataPointToEntityQueryResultArray,
                this::insertNewGeoDataPointToEntityQueryResult,
                this::removeGeoDataPointToEntityQueryResult,
                this::sizeOfGeoDataPointToEntityQueryResultArray
            );
        }
    }

    /**
     * Gets array of all "geoDataPointToEntityQueryResult" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult[] getGeoDataPointToEntityQueryResultArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult[0]);
    }

    /**
     * Gets ith "geoDataPointToEntityQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult getGeoDataPointToEntityQueryResultArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "geoDataPointToEntityQueryResult" element
     */
    @Override
    public int sizeOfGeoDataPointToEntityQueryResultArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "geoDataPointToEntityQueryResult" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setGeoDataPointToEntityQueryResultArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult[] geoDataPointToEntityQueryResultArray) {
        check_orphaned();
        arraySetterHelper(geoDataPointToEntityQueryResultArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "geoDataPointToEntityQueryResult" element
     */
    @Override
    public void setGeoDataPointToEntityQueryResultArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult geoDataPointToEntityQueryResult) {
        generatedSetterHelperImpl(geoDataPointToEntityQueryResult, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoDataPointToEntityQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult insertNewGeoDataPointToEntityQueryResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "geoDataPointToEntityQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult addNewGeoDataPointToEntityQueryResult() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "geoDataPointToEntityQueryResult" element
     */
    @Override
    public void removeGeoDataPointToEntityQueryResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

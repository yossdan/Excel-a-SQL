/*
 * XML Type:  CT_GeoDataEntityQueryResults
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoDataEntityQueryResults(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoDataEntityQueryResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults {
    private static final long serialVersionUID = 1L;

    public CTGeoDataEntityQueryResultsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoDataEntityQueryResult"),
    };


    /**
     * Gets a List of "geoDataEntityQueryResult" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult> getGeoDataEntityQueryResultList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGeoDataEntityQueryResultArray,
                this::setGeoDataEntityQueryResultArray,
                this::insertNewGeoDataEntityQueryResult,
                this::removeGeoDataEntityQueryResult,
                this::sizeOfGeoDataEntityQueryResultArray
            );
        }
    }

    /**
     * Gets array of all "geoDataEntityQueryResult" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult[] getGeoDataEntityQueryResultArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult[0]);
    }

    /**
     * Gets ith "geoDataEntityQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult getGeoDataEntityQueryResultArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "geoDataEntityQueryResult" element
     */
    @Override
    public int sizeOfGeoDataEntityQueryResultArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "geoDataEntityQueryResult" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setGeoDataEntityQueryResultArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult[] geoDataEntityQueryResultArray) {
        check_orphaned();
        arraySetterHelper(geoDataEntityQueryResultArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "geoDataEntityQueryResult" element
     */
    @Override
    public void setGeoDataEntityQueryResultArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult geoDataEntityQueryResult) {
        generatedSetterHelperImpl(geoDataEntityQueryResult, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoDataEntityQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult insertNewGeoDataEntityQueryResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "geoDataEntityQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult addNewGeoDataEntityQueryResult() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "geoDataEntityQueryResult" element
     */
    @Override
    public void removeGeoDataEntityQueryResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

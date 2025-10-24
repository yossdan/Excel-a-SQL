/*
 * XML Type:  CT_GeoChildEntitiesQueryResults
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoChildEntitiesQueryResults(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoChildEntitiesQueryResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults {
    private static final long serialVersionUID = 1L;

    public CTGeoChildEntitiesQueryResultsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoChildEntitiesQueryResult"),
    };


    /**
     * Gets a List of "geoChildEntitiesQueryResult" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult> getGeoChildEntitiesQueryResultList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGeoChildEntitiesQueryResultArray,
                this::setGeoChildEntitiesQueryResultArray,
                this::insertNewGeoChildEntitiesQueryResult,
                this::removeGeoChildEntitiesQueryResult,
                this::sizeOfGeoChildEntitiesQueryResultArray
            );
        }
    }

    /**
     * Gets array of all "geoChildEntitiesQueryResult" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult[] getGeoChildEntitiesQueryResultArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult[0]);
    }

    /**
     * Gets ith "geoChildEntitiesQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult getGeoChildEntitiesQueryResultArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "geoChildEntitiesQueryResult" element
     */
    @Override
    public int sizeOfGeoChildEntitiesQueryResultArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "geoChildEntitiesQueryResult" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setGeoChildEntitiesQueryResultArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult[] geoChildEntitiesQueryResultArray) {
        check_orphaned();
        arraySetterHelper(geoChildEntitiesQueryResultArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "geoChildEntitiesQueryResult" element
     */
    @Override
    public void setGeoChildEntitiesQueryResultArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult geoChildEntitiesQueryResult) {
        generatedSetterHelperImpl(geoChildEntitiesQueryResult, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoChildEntitiesQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult insertNewGeoChildEntitiesQueryResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "geoChildEntitiesQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult addNewGeoChildEntitiesQueryResult() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "geoChildEntitiesQueryResult" element
     */
    @Override
    public void removeGeoChildEntitiesQueryResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

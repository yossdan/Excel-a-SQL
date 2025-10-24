/*
 * XML Type:  CT_GeoParentEntitiesQueryResults
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoParentEntitiesQueryResults(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoParentEntitiesQueryResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults {
    private static final long serialVersionUID = 1L;

    public CTGeoParentEntitiesQueryResultsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoParentEntitiesQueryResult"),
    };


    /**
     * Gets a List of "geoParentEntitiesQueryResult" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult> getGeoParentEntitiesQueryResultList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGeoParentEntitiesQueryResultArray,
                this::setGeoParentEntitiesQueryResultArray,
                this::insertNewGeoParentEntitiesQueryResult,
                this::removeGeoParentEntitiesQueryResult,
                this::sizeOfGeoParentEntitiesQueryResultArray
            );
        }
    }

    /**
     * Gets array of all "geoParentEntitiesQueryResult" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult[] getGeoParentEntitiesQueryResultArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult[0]);
    }

    /**
     * Gets ith "geoParentEntitiesQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult getGeoParentEntitiesQueryResultArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "geoParentEntitiesQueryResult" element
     */
    @Override
    public int sizeOfGeoParentEntitiesQueryResultArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "geoParentEntitiesQueryResult" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setGeoParentEntitiesQueryResultArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult[] geoParentEntitiesQueryResultArray) {
        check_orphaned();
        arraySetterHelper(geoParentEntitiesQueryResultArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "geoParentEntitiesQueryResult" element
     */
    @Override
    public void setGeoParentEntitiesQueryResultArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult geoParentEntitiesQueryResult) {
        generatedSetterHelperImpl(geoParentEntitiesQueryResult, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoParentEntitiesQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult insertNewGeoParentEntitiesQueryResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "geoParentEntitiesQueryResult" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult addNewGeoParentEntitiesQueryResult() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "geoParentEntitiesQueryResult" element
     */
    @Override
    public void removeGeoParentEntitiesQueryResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

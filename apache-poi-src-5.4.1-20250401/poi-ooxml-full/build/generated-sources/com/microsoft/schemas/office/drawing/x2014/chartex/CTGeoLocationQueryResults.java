/*
 * XML Type:  CT_GeoLocationQueryResults
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoLocationQueryResults(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoLocationQueryResults extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeolocationqueryresults31dctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "geoLocationQueryResult" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult> getGeoLocationQueryResultList();

    /**
     * Gets array of all "geoLocationQueryResult" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult[] getGeoLocationQueryResultArray();

    /**
     * Gets ith "geoLocationQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult getGeoLocationQueryResultArray(int i);

    /**
     * Returns number of "geoLocationQueryResult" element
     */
    int sizeOfGeoLocationQueryResultArray();

    /**
     * Sets array of all "geoLocationQueryResult" element
     */
    void setGeoLocationQueryResultArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult[] geoLocationQueryResultArray);

    /**
     * Sets ith "geoLocationQueryResult" element
     */
    void setGeoLocationQueryResultArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult geoLocationQueryResult);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoLocationQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult insertNewGeoLocationQueryResult(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "geoLocationQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult addNewGeoLocationQueryResult();

    /**
     * Removes the ith "geoLocationQueryResult" element
     */
    void removeGeoLocationQueryResult(int i);
}

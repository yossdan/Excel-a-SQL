/*
 * XML Type:  CT_GeoDataPointToEntityQueryResults
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoDataPointToEntityQueryResults(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoDataPointToEntityQueryResults extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeodatapointtoentityqueryresults1e65type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "geoDataPointToEntityQueryResult" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult> getGeoDataPointToEntityQueryResultList();

    /**
     * Gets array of all "geoDataPointToEntityQueryResult" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult[] getGeoDataPointToEntityQueryResultArray();

    /**
     * Gets ith "geoDataPointToEntityQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult getGeoDataPointToEntityQueryResultArray(int i);

    /**
     * Returns number of "geoDataPointToEntityQueryResult" element
     */
    int sizeOfGeoDataPointToEntityQueryResultArray();

    /**
     * Sets array of all "geoDataPointToEntityQueryResult" element
     */
    void setGeoDataPointToEntityQueryResultArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult[] geoDataPointToEntityQueryResultArray);

    /**
     * Sets ith "geoDataPointToEntityQueryResult" element
     */
    void setGeoDataPointToEntityQueryResultArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult geoDataPointToEntityQueryResult);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoDataPointToEntityQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult insertNewGeoDataPointToEntityQueryResult(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "geoDataPointToEntityQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult addNewGeoDataPointToEntityQueryResult();

    /**
     * Removes the ith "geoDataPointToEntityQueryResult" element
     */
    void removeGeoDataPointToEntityQueryResult(int i);
}

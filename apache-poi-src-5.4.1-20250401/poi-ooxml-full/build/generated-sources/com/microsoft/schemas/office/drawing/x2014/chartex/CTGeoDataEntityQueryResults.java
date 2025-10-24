/*
 * XML Type:  CT_GeoDataEntityQueryResults
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoDataEntityQueryResults(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoDataEntityQueryResults extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeodataentityqueryresults3f64type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "geoDataEntityQueryResult" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult> getGeoDataEntityQueryResultList();

    /**
     * Gets array of all "geoDataEntityQueryResult" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult[] getGeoDataEntityQueryResultArray();

    /**
     * Gets ith "geoDataEntityQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult getGeoDataEntityQueryResultArray(int i);

    /**
     * Returns number of "geoDataEntityQueryResult" element
     */
    int sizeOfGeoDataEntityQueryResultArray();

    /**
     * Sets array of all "geoDataEntityQueryResult" element
     */
    void setGeoDataEntityQueryResultArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult[] geoDataEntityQueryResultArray);

    /**
     * Sets ith "geoDataEntityQueryResult" element
     */
    void setGeoDataEntityQueryResultArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult geoDataEntityQueryResult);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoDataEntityQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult insertNewGeoDataEntityQueryResult(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "geoDataEntityQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult addNewGeoDataEntityQueryResult();

    /**
     * Removes the ith "geoDataEntityQueryResult" element
     */
    void removeGeoDataEntityQueryResult(int i);
}

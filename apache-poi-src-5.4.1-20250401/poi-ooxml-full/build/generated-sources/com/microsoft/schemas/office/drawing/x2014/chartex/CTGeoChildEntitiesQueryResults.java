/*
 * XML Type:  CT_GeoChildEntitiesQueryResults
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoChildEntitiesQueryResults(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoChildEntitiesQueryResults extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeochildentitiesqueryresults136ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "geoChildEntitiesQueryResult" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult> getGeoChildEntitiesQueryResultList();

    /**
     * Gets array of all "geoChildEntitiesQueryResult" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult[] getGeoChildEntitiesQueryResultArray();

    /**
     * Gets ith "geoChildEntitiesQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult getGeoChildEntitiesQueryResultArray(int i);

    /**
     * Returns number of "geoChildEntitiesQueryResult" element
     */
    int sizeOfGeoChildEntitiesQueryResultArray();

    /**
     * Sets array of all "geoChildEntitiesQueryResult" element
     */
    void setGeoChildEntitiesQueryResultArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult[] geoChildEntitiesQueryResultArray);

    /**
     * Sets ith "geoChildEntitiesQueryResult" element
     */
    void setGeoChildEntitiesQueryResultArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult geoChildEntitiesQueryResult);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoChildEntitiesQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult insertNewGeoChildEntitiesQueryResult(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "geoChildEntitiesQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult addNewGeoChildEntitiesQueryResult();

    /**
     * Removes the ith "geoChildEntitiesQueryResult" element
     */
    void removeGeoChildEntitiesQueryResult(int i);
}

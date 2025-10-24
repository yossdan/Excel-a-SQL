/*
 * XML Type:  CT_GeoParentEntitiesQueryResults
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoParentEntitiesQueryResults(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoParentEntitiesQueryResults extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeoparententitiesqueryresults1dc6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "geoParentEntitiesQueryResult" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult> getGeoParentEntitiesQueryResultList();

    /**
     * Gets array of all "geoParentEntitiesQueryResult" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult[] getGeoParentEntitiesQueryResultArray();

    /**
     * Gets ith "geoParentEntitiesQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult getGeoParentEntitiesQueryResultArray(int i);

    /**
     * Returns number of "geoParentEntitiesQueryResult" element
     */
    int sizeOfGeoParentEntitiesQueryResultArray();

    /**
     * Sets array of all "geoParentEntitiesQueryResult" element
     */
    void setGeoParentEntitiesQueryResultArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult[] geoParentEntitiesQueryResultArray);

    /**
     * Sets ith "geoParentEntitiesQueryResult" element
     */
    void setGeoParentEntitiesQueryResultArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult geoParentEntitiesQueryResult);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoParentEntitiesQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult insertNewGeoParentEntitiesQueryResult(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "geoParentEntitiesQueryResult" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult addNewGeoParentEntitiesQueryResult();

    /**
     * Removes the ith "geoParentEntitiesQueryResult" element
     */
    void removeGeoParentEntitiesQueryResult(int i);
}

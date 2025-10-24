/*
 * XML Type:  CT_GeoChildEntitiesQueryResult
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoChildEntitiesQueryResult(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoChildEntitiesQueryResult extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResult> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeochildentitiesqueryresultd417type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "geoChildEntitiesQuery" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery getGeoChildEntitiesQuery();

    /**
     * True if has "geoChildEntitiesQuery" element
     */
    boolean isSetGeoChildEntitiesQuery();

    /**
     * Sets the "geoChildEntitiesQuery" element
     */
    void setGeoChildEntitiesQuery(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery geoChildEntitiesQuery);

    /**
     * Appends and returns a new empty "geoChildEntitiesQuery" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery addNewGeoChildEntitiesQuery();

    /**
     * Unsets the "geoChildEntitiesQuery" element
     */
    void unsetGeoChildEntitiesQuery();

    /**
     * Gets the "geoChildEntities" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities getGeoChildEntities();

    /**
     * True if has "geoChildEntities" element
     */
    boolean isSetGeoChildEntities();

    /**
     * Sets the "geoChildEntities" element
     */
    void setGeoChildEntities(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities geoChildEntities);

    /**
     * Appends and returns a new empty "geoChildEntities" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities addNewGeoChildEntities();

    /**
     * Unsets the "geoChildEntities" element
     */
    void unsetGeoChildEntities();
}

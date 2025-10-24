/*
 * XML Type:  CT_GeoParentEntitiesQueryResult
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoParentEntitiesQueryResult(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoParentEntitiesQueryResult extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResult> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeoparententitiesqueryresult167dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "geoParentEntitiesQuery" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQuery getGeoParentEntitiesQuery();

    /**
     * Sets the "geoParentEntitiesQuery" element
     */
    void setGeoParentEntitiesQuery(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQuery geoParentEntitiesQuery);

    /**
     * Appends and returns a new empty "geoParentEntitiesQuery" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQuery addNewGeoParentEntitiesQuery();

    /**
     * Gets the "geoEntity" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoEntity getGeoEntity();

    /**
     * True if has "geoEntity" element
     */
    boolean isSetGeoEntity();

    /**
     * Sets the "geoEntity" element
     */
    void setGeoEntity(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoEntity geoEntity);

    /**
     * Appends and returns a new empty "geoEntity" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoEntity addNewGeoEntity();

    /**
     * Unsets the "geoEntity" element
     */
    void unsetGeoEntity();

    /**
     * Gets the "geoParentEntity" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntity getGeoParentEntity();

    /**
     * True if has "geoParentEntity" element
     */
    boolean isSetGeoParentEntity();

    /**
     * Sets the "geoParentEntity" element
     */
    void setGeoParentEntity(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntity geoParentEntity);

    /**
     * Appends and returns a new empty "geoParentEntity" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntity addNewGeoParentEntity();

    /**
     * Unsets the "geoParentEntity" element
     */
    void unsetGeoParentEntity();
}

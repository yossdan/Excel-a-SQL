/*
 * XML Type:  CT_Clear
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTClear
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Clear(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTClear extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTClear> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctclearf043type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "geoLocationQueryResults" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults getGeoLocationQueryResults();

    /**
     * True if has "geoLocationQueryResults" element
     */
    boolean isSetGeoLocationQueryResults();

    /**
     * Sets the "geoLocationQueryResults" element
     */
    void setGeoLocationQueryResults(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults geoLocationQueryResults);

    /**
     * Appends and returns a new empty "geoLocationQueryResults" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults addNewGeoLocationQueryResults();

    /**
     * Unsets the "geoLocationQueryResults" element
     */
    void unsetGeoLocationQueryResults();

    /**
     * Gets the "geoDataEntityQueryResults" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults getGeoDataEntityQueryResults();

    /**
     * True if has "geoDataEntityQueryResults" element
     */
    boolean isSetGeoDataEntityQueryResults();

    /**
     * Sets the "geoDataEntityQueryResults" element
     */
    void setGeoDataEntityQueryResults(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults geoDataEntityQueryResults);

    /**
     * Appends and returns a new empty "geoDataEntityQueryResults" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults addNewGeoDataEntityQueryResults();

    /**
     * Unsets the "geoDataEntityQueryResults" element
     */
    void unsetGeoDataEntityQueryResults();

    /**
     * Gets the "geoDataPointToEntityQueryResults" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults getGeoDataPointToEntityQueryResults();

    /**
     * True if has "geoDataPointToEntityQueryResults" element
     */
    boolean isSetGeoDataPointToEntityQueryResults();

    /**
     * Sets the "geoDataPointToEntityQueryResults" element
     */
    void setGeoDataPointToEntityQueryResults(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults geoDataPointToEntityQueryResults);

    /**
     * Appends and returns a new empty "geoDataPointToEntityQueryResults" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults addNewGeoDataPointToEntityQueryResults();

    /**
     * Unsets the "geoDataPointToEntityQueryResults" element
     */
    void unsetGeoDataPointToEntityQueryResults();

    /**
     * Gets the "geoChildEntitiesQueryResults" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults getGeoChildEntitiesQueryResults();

    /**
     * True if has "geoChildEntitiesQueryResults" element
     */
    boolean isSetGeoChildEntitiesQueryResults();

    /**
     * Sets the "geoChildEntitiesQueryResults" element
     */
    void setGeoChildEntitiesQueryResults(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults geoChildEntitiesQueryResults);

    /**
     * Appends and returns a new empty "geoChildEntitiesQueryResults" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults addNewGeoChildEntitiesQueryResults();

    /**
     * Unsets the "geoChildEntitiesQueryResults" element
     */
    void unsetGeoChildEntitiesQueryResults();

    /**
     * Gets the "geoParentEntitiesQueryResults" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults getGeoParentEntitiesQueryResults();

    /**
     * True if has "geoParentEntitiesQueryResults" element
     */
    boolean isSetGeoParentEntitiesQueryResults();

    /**
     * Sets the "geoParentEntitiesQueryResults" element
     */
    void setGeoParentEntitiesQueryResults(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults geoParentEntitiesQueryResults);

    /**
     * Appends and returns a new empty "geoParentEntitiesQueryResults" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults addNewGeoParentEntitiesQueryResults();

    /**
     * Unsets the "geoParentEntitiesQueryResults" element
     */
    void unsetGeoParentEntitiesQueryResults();
}

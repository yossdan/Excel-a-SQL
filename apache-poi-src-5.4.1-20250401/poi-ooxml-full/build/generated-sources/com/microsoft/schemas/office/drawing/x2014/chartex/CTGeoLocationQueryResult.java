/*
 * XML Type:  CT_GeoLocationQueryResult
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoLocationQueryResult(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoLocationQueryResult extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResult> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeolocationqueryresult27a7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "geoLocationQuery" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery getGeoLocationQuery();

    /**
     * True if has "geoLocationQuery" element
     */
    boolean isSetGeoLocationQuery();

    /**
     * Sets the "geoLocationQuery" element
     */
    void setGeoLocationQuery(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery geoLocationQuery);

    /**
     * Appends and returns a new empty "geoLocationQuery" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery addNewGeoLocationQuery();

    /**
     * Unsets the "geoLocationQuery" element
     */
    void unsetGeoLocationQuery();

    /**
     * Gets the "geoLocations" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations getGeoLocations();

    /**
     * True if has "geoLocations" element
     */
    boolean isSetGeoLocations();

    /**
     * Sets the "geoLocations" element
     */
    void setGeoLocations(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations geoLocations);

    /**
     * Appends and returns a new empty "geoLocations" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations addNewGeoLocations();

    /**
     * Unsets the "geoLocations" element
     */
    void unsetGeoLocations();
}

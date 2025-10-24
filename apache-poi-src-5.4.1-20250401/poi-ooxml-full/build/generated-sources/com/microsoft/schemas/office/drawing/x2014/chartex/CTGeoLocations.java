/*
 * XML Type:  CT_GeoLocations
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoLocations(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoLocations extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocations> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeolocationsef19type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "geoLocation" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation getGeoLocation();

    /**
     * True if has "geoLocation" element
     */
    boolean isSetGeoLocation();

    /**
     * Sets the "geoLocation" element
     */
    void setGeoLocation(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation geoLocation);

    /**
     * Appends and returns a new empty "geoLocation" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation addNewGeoLocation();

    /**
     * Unsets the "geoLocation" element
     */
    void unsetGeoLocation();
}

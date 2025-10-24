/*
 * XML Type:  CT_GeoDataEntityQueryResult
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoDataEntityQueryResult(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoDataEntityQueryResult extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResult> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeodataentityqueryresult491ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "geoDataEntityQuery" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQuery getGeoDataEntityQuery();

    /**
     * True if has "geoDataEntityQuery" element
     */
    boolean isSetGeoDataEntityQuery();

    /**
     * Sets the "geoDataEntityQuery" element
     */
    void setGeoDataEntityQuery(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQuery geoDataEntityQuery);

    /**
     * Appends and returns a new empty "geoDataEntityQuery" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQuery addNewGeoDataEntityQuery();

    /**
     * Unsets the "geoDataEntityQuery" element
     */
    void unsetGeoDataEntityQuery();

    /**
     * Gets the "geoData" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoData getGeoData();

    /**
     * True if has "geoData" element
     */
    boolean isSetGeoData();

    /**
     * Sets the "geoData" element
     */
    void setGeoData(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoData geoData);

    /**
     * Appends and returns a new empty "geoData" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoData addNewGeoData();

    /**
     * Unsets the "geoData" element
     */
    void unsetGeoData();
}

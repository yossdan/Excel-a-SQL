/*
 * XML Type:  CT_GeoDataPointToEntityQueryResult
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoDataPointToEntityQueryResult(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoDataPointToEntityQueryResult extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResult> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeodatapointtoentityqueryresult05fetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "geoDataPointQuery" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointQuery getGeoDataPointQuery();

    /**
     * True if has "geoDataPointQuery" element
     */
    boolean isSetGeoDataPointQuery();

    /**
     * Sets the "geoDataPointQuery" element
     */
    void setGeoDataPointQuery(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointQuery geoDataPointQuery);

    /**
     * Appends and returns a new empty "geoDataPointQuery" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointQuery addNewGeoDataPointQuery();

    /**
     * Unsets the "geoDataPointQuery" element
     */
    void unsetGeoDataPointQuery();

    /**
     * Gets the "geoDataPointToEntityQuery" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQuery getGeoDataPointToEntityQuery();

    /**
     * True if has "geoDataPointToEntityQuery" element
     */
    boolean isSetGeoDataPointToEntityQuery();

    /**
     * Sets the "geoDataPointToEntityQuery" element
     */
    void setGeoDataPointToEntityQuery(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQuery geoDataPointToEntityQuery);

    /**
     * Appends and returns a new empty "geoDataPointToEntityQuery" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQuery addNewGeoDataPointToEntityQuery();

    /**
     * Unsets the "geoDataPointToEntityQuery" element
     */
    void unsetGeoDataPointToEntityQuery();
}

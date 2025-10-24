/*
 * XML Type:  CT_GeoDataPointQuery
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointQuery
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoDataPointQuery(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoDataPointQuery extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointQuery> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeodatapointqueryb3bdtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "entityType" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum getEntityType();

    /**
     * Gets (as xml) the "entityType" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType xgetEntityType();

    /**
     * Sets the "entityType" attribute
     */
    void setEntityType(com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum entityType);

    /**
     * Sets (as xml) the "entityType" attribute
     */
    void xsetEntityType(com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType entityType);

    /**
     * Gets the "latitude" attribute
     */
    double getLatitude();

    /**
     * Gets (as xml) the "latitude" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetLatitude();

    /**
     * Sets the "latitude" attribute
     */
    void setLatitude(double latitude);

    /**
     * Sets (as xml) the "latitude" attribute
     */
    void xsetLatitude(org.apache.xmlbeans.XmlDouble latitude);

    /**
     * Gets the "longitude" attribute
     */
    double getLongitude();

    /**
     * Gets (as xml) the "longitude" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetLongitude();

    /**
     * Sets the "longitude" attribute
     */
    void setLongitude(double longitude);

    /**
     * Sets (as xml) the "longitude" attribute
     */
    void xsetLongitude(org.apache.xmlbeans.XmlDouble longitude);
}

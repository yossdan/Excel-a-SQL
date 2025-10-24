/*
 * XML Type:  CT_GeoLocation
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoLocation(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoLocation extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocation> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeolocation4ecatype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "address" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAddress getAddress();

    /**
     * True if has "address" element
     */
    boolean isSetAddress();

    /**
     * Sets the "address" element
     */
    void setAddress(com.microsoft.schemas.office.drawing.x2014.chartex.CTAddress address);

    /**
     * Appends and returns a new empty "address" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAddress addNewAddress();

    /**
     * Unsets the "address" element
     */
    void unsetAddress();

    /**
     * Gets the "latitude" attribute
     */
    double getLatitude();

    /**
     * Gets (as xml) the "latitude" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetLatitude();

    /**
     * True if has "latitude" attribute
     */
    boolean isSetLatitude();

    /**
     * Sets the "latitude" attribute
     */
    void setLatitude(double latitude);

    /**
     * Sets (as xml) the "latitude" attribute
     */
    void xsetLatitude(org.apache.xmlbeans.XmlDouble latitude);

    /**
     * Unsets the "latitude" attribute
     */
    void unsetLatitude();

    /**
     * Gets the "longitude" attribute
     */
    double getLongitude();

    /**
     * Gets (as xml) the "longitude" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetLongitude();

    /**
     * True if has "longitude" attribute
     */
    boolean isSetLongitude();

    /**
     * Sets the "longitude" attribute
     */
    void setLongitude(double longitude);

    /**
     * Sets (as xml) the "longitude" attribute
     */
    void xsetLongitude(org.apache.xmlbeans.XmlDouble longitude);

    /**
     * Unsets the "longitude" attribute
     */
    void unsetLongitude();

    /**
     * Gets the "entityName" attribute
     */
    java.lang.String getEntityName();

    /**
     * Gets (as xml) the "entityName" attribute
     */
    org.apache.xmlbeans.XmlString xgetEntityName();

    /**
     * Sets the "entityName" attribute
     */
    void setEntityName(java.lang.String entityName);

    /**
     * Sets (as xml) the "entityName" attribute
     */
    void xsetEntityName(org.apache.xmlbeans.XmlString entityName);

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
}

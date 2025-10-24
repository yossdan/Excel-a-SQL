/*
 * XML Type:  CT_GeoData
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoData
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoData(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoData extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoData> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeodataca75type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "geoPolygons" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygons getGeoPolygons();

    /**
     * True if has "geoPolygons" element
     */
    boolean isSetGeoPolygons();

    /**
     * Sets the "geoPolygons" element
     */
    void setGeoPolygons(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygons geoPolygons);

    /**
     * Appends and returns a new empty "geoPolygons" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygons addNewGeoPolygons();

    /**
     * Unsets the "geoPolygons" element
     */
    void unsetGeoPolygons();

    /**
     * Gets the "copyrights" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTCopyrights getCopyrights();

    /**
     * True if has "copyrights" element
     */
    boolean isSetCopyrights();

    /**
     * Sets the "copyrights" element
     */
    void setCopyrights(com.microsoft.schemas.office.drawing.x2014.chartex.CTCopyrights copyrights);

    /**
     * Appends and returns a new empty "copyrights" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTCopyrights addNewCopyrights();

    /**
     * Unsets the "copyrights" element
     */
    void unsetCopyrights();

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
     * Gets the "entityId" attribute
     */
    java.lang.String getEntityId();

    /**
     * Gets (as xml) the "entityId" attribute
     */
    org.apache.xmlbeans.XmlString xgetEntityId();

    /**
     * Sets the "entityId" attribute
     */
    void setEntityId(java.lang.String entityId);

    /**
     * Sets (as xml) the "entityId" attribute
     */
    void xsetEntityId(org.apache.xmlbeans.XmlString entityId);

    /**
     * Gets the "east" attribute
     */
    double getEast();

    /**
     * Gets (as xml) the "east" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetEast();

    /**
     * Sets the "east" attribute
     */
    void setEast(double east);

    /**
     * Sets (as xml) the "east" attribute
     */
    void xsetEast(org.apache.xmlbeans.XmlDouble east);

    /**
     * Gets the "west" attribute
     */
    double getWest();

    /**
     * Gets (as xml) the "west" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetWest();

    /**
     * Sets the "west" attribute
     */
    void setWest(double west);

    /**
     * Sets (as xml) the "west" attribute
     */
    void xsetWest(org.apache.xmlbeans.XmlDouble west);

    /**
     * Gets the "north" attribute
     */
    double getNorth();

    /**
     * Gets (as xml) the "north" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetNorth();

    /**
     * Sets the "north" attribute
     */
    void setNorth(double north);

    /**
     * Sets (as xml) the "north" attribute
     */
    void xsetNorth(org.apache.xmlbeans.XmlDouble north);

    /**
     * Gets the "south" attribute
     */
    double getSouth();

    /**
     * Gets (as xml) the "south" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetSouth();

    /**
     * Sets the "south" attribute
     */
    void setSouth(double south);

    /**
     * Sets (as xml) the "south" attribute
     */
    void xsetSouth(org.apache.xmlbeans.XmlDouble south);
}

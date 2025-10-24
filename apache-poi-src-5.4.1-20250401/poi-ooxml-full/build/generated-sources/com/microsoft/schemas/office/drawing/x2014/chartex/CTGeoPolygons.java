/*
 * XML Type:  CT_GeoPolygons
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygons
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoPolygons(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoPolygons extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygons> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeopolygons9086type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "geoPolygon" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon> getGeoPolygonList();

    /**
     * Gets array of all "geoPolygon" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon[] getGeoPolygonArray();

    /**
     * Gets ith "geoPolygon" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon getGeoPolygonArray(int i);

    /**
     * Returns number of "geoPolygon" element
     */
    int sizeOfGeoPolygonArray();

    /**
     * Sets array of all "geoPolygon" element
     */
    void setGeoPolygonArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon[] geoPolygonArray);

    /**
     * Sets ith "geoPolygon" element
     */
    void setGeoPolygonArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon geoPolygon);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoPolygon" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon insertNewGeoPolygon(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "geoPolygon" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon addNewGeoPolygon();

    /**
     * Removes the ith "geoPolygon" element
     */
    void removeGeoPolygon(int i);
}

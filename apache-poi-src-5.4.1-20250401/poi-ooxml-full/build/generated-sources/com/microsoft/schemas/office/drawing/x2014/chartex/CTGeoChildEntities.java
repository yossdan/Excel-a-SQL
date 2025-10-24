/*
 * XML Type:  CT_GeoChildEntities
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoChildEntities(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoChildEntities extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeochildentities085atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "geoHierarchyEntity" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity> getGeoHierarchyEntityList();

    /**
     * Gets array of all "geoHierarchyEntity" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity[] getGeoHierarchyEntityArray();

    /**
     * Gets ith "geoHierarchyEntity" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity getGeoHierarchyEntityArray(int i);

    /**
     * Returns number of "geoHierarchyEntity" element
     */
    int sizeOfGeoHierarchyEntityArray();

    /**
     * Sets array of all "geoHierarchyEntity" element
     */
    void setGeoHierarchyEntityArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity[] geoHierarchyEntityArray);

    /**
     * Sets ith "geoHierarchyEntity" element
     */
    void setGeoHierarchyEntityArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity geoHierarchyEntity);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoHierarchyEntity" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity insertNewGeoHierarchyEntity(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "geoHierarchyEntity" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity addNewGeoHierarchyEntity();

    /**
     * Removes the ith "geoHierarchyEntity" element
     */
    void removeGeoHierarchyEntity(int i);
}

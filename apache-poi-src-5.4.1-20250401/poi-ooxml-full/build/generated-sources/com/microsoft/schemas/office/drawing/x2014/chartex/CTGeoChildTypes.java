/*
 * XML Type:  CT_GeoChildTypes
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoChildTypes(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoChildTypes extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeochildtypes7dc2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "entityType" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum> getEntityTypeList();

    /**
     * Gets array of all "entityType" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum[] getEntityTypeArray();

    /**
     * Gets ith "entityType" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum getEntityTypeArray(int i);

    /**
     * Gets (as xml) a List of "entityType" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType> xgetEntityTypeList();

    /**
     * Gets (as xml) array of all "entityType" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType[] xgetEntityTypeArray();

    /**
     * Gets (as xml) ith "entityType" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType xgetEntityTypeArray(int i);

    /**
     * Returns number of "entityType" element
     */
    int sizeOfEntityTypeArray();

    /**
     * Sets array of all "entityType" element
     */
    void setEntityTypeArray(com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum[] entityTypeArray);

    /**
     * Sets ith "entityType" element
     */
    void setEntityTypeArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum entityType);

    /**
     * Sets (as xml) array of all "entityType" element
     */
    void xsetEntityTypeArray(com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType[] entityTypeArray);

    /**
     * Sets (as xml) ith "entityType" element
     */
    void xsetEntityTypeArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType entityType);

    /**
     * Inserts the value as the ith "entityType" element
     */
    void insertEntityType(int i, com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum entityType);

    /**
     * Appends the value as the last "entityType" element
     */
    void addEntityType(com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum entityType);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityType" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType insertNewEntityType(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "entityType" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType addNewEntityType();

    /**
     * Removes the ith "entityType" element
     */
    void removeEntityType(int i);
}

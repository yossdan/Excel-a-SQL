/*
 * XML Type:  CT_GeoChildEntitiesQuery
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoChildEntitiesQuery(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoChildEntitiesQuery extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQuery> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeochildentitiesquery1874type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "geoChildTypes" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes getGeoChildTypes();

    /**
     * True if has "geoChildTypes" element
     */
    boolean isSetGeoChildTypes();

    /**
     * Sets the "geoChildTypes" element
     */
    void setGeoChildTypes(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes geoChildTypes);

    /**
     * Appends and returns a new empty "geoChildTypes" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildTypes addNewGeoChildTypes();

    /**
     * Unsets the "geoChildTypes" element
     */
    void unsetGeoChildTypes();

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
}

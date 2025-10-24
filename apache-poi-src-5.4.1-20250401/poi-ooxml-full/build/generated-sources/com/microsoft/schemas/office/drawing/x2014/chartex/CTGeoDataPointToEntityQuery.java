/*
 * XML Type:  CT_GeoDataPointToEntityQuery
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQuery
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoDataPointToEntityQuery(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoDataPointToEntityQuery extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQuery> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeodatapointtoentityquery839btype");
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

/*
 * XML Type:  CT_ExternalData
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTExternalData
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ExternalData(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTExternalData extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTExternalData> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctexternaldata3111type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id);

    /**
     * Gets the "autoUpdate" attribute
     */
    boolean getAutoUpdate();

    /**
     * Gets (as xml) the "autoUpdate" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAutoUpdate();

    /**
     * True if has "autoUpdate" attribute
     */
    boolean isSetAutoUpdate();

    /**
     * Sets the "autoUpdate" attribute
     */
    void setAutoUpdate(boolean autoUpdate);

    /**
     * Sets (as xml) the "autoUpdate" attribute
     */
    void xsetAutoUpdate(org.apache.xmlbeans.XmlBoolean autoUpdate);

    /**
     * Unsets the "autoUpdate" attribute
     */
    void unsetAutoUpdate();
}

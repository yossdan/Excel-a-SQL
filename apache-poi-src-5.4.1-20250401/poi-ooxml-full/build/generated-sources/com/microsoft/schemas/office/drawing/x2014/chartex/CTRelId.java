/*
 * XML Type:  CT_RelId
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTRelId
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_RelId(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTRelId extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTRelId> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctrelid30dctype");
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
}

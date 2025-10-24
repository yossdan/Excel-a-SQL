/*
 * An XML document type.
 * Localname: shapetype
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.ShapetypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one shapetype(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface ShapetypeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.ShapetypeDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "shapetypeb89bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "shapetype" element
     */
    com.microsoft.schemas.vml.CTShapetype getShapetype();

    /**
     * Sets the "shapetype" element
     */
    void setShapetype(com.microsoft.schemas.vml.CTShapetype shapetype);

    /**
     * Appends and returns a new empty "shapetype" element
     */
    com.microsoft.schemas.vml.CTShapetype addNewShapetype();
}

/*
 * An XML document type.
 * Localname: shape
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.ShapeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one shape(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface ShapeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.ShapeDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "shapeaee1doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "shape" element
     */
    com.microsoft.schemas.vml.CTShape getShape();

    /**
     * Sets the "shape" element
     */
    void setShape(com.microsoft.schemas.vml.CTShape shape);

    /**
     * Appends and returns a new empty "shape" element
     */
    com.microsoft.schemas.vml.CTShape addNewShape();
}

/*
 * An XML document type.
 * Localname: shapedefaults
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ShapedefaultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one shapedefaults(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface ShapedefaultsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.ShapedefaultsDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "shapedefaults88d8doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "shapedefaults" element
     */
    com.microsoft.schemas.office.office.CTShapeDefaults getShapedefaults();

    /**
     * Sets the "shapedefaults" element
     */
    void setShapedefaults(com.microsoft.schemas.office.office.CTShapeDefaults shapedefaults);

    /**
     * Appends and returns a new empty "shapedefaults" element
     */
    com.microsoft.schemas.office.office.CTShapeDefaults addNewShapedefaults();
}

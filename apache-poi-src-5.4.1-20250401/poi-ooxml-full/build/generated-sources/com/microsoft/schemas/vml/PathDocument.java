/*
 * An XML document type.
 * Localname: path
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.PathDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one path(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface PathDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.PathDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "path11b7doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "path" element
     */
    com.microsoft.schemas.vml.CTPath getPath();

    /**
     * Sets the "path" element
     */
    void setPath(com.microsoft.schemas.vml.CTPath path);

    /**
     * Appends and returns a new empty "path" element
     */
    com.microsoft.schemas.vml.CTPath addNewPath();
}

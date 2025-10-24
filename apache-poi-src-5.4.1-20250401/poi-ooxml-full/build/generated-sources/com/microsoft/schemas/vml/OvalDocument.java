/*
 * An XML document type.
 * Localname: oval
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.OvalDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one oval(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface OvalDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.OvalDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "oval1d24doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "oval" element
     */
    com.microsoft.schemas.vml.CTOval getOval();

    /**
     * Sets the "oval" element
     */
    void setOval(com.microsoft.schemas.vml.CTOval oval);

    /**
     * Appends and returns a new empty "oval" element
     */
    com.microsoft.schemas.vml.CTOval addNewOval();
}

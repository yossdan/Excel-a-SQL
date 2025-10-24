/*
 * An XML document type.
 * Localname: shadow
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.ShadowDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one shadow(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface ShadowDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.ShadowDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "shadowd332doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "shadow" element
     */
    com.microsoft.schemas.vml.CTShadow getShadow();

    /**
     * Sets the "shadow" element
     */
    void setShadow(com.microsoft.schemas.vml.CTShadow shadow);

    /**
     * Appends and returns a new empty "shadow" element
     */
    com.microsoft.schemas.vml.CTShadow addNewShadow();
}

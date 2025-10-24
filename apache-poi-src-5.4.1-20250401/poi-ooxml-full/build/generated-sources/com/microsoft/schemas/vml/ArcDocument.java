/*
 * An XML document type.
 * Localname: arc
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.ArcDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one arc(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface ArcDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.ArcDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "arcdb92doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "arc" element
     */
    com.microsoft.schemas.vml.CTArc getArc();

    /**
     * Sets the "arc" element
     */
    void setArc(com.microsoft.schemas.vml.CTArc arc);

    /**
     * Appends and returns a new empty "arc" element
     */
    com.microsoft.schemas.vml.CTArc addNewArc();
}

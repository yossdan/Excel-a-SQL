/*
 * An XML document type.
 * Localname: handles
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.HandlesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one handles(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface HandlesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.HandlesDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "handlesd34bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "handles" element
     */
    com.microsoft.schemas.vml.CTHandles getHandles();

    /**
     * Sets the "handles" element
     */
    void setHandles(com.microsoft.schemas.vml.CTHandles handles);

    /**
     * Appends and returns a new empty "handles" element
     */
    com.microsoft.schemas.vml.CTHandles addNewHandles();
}

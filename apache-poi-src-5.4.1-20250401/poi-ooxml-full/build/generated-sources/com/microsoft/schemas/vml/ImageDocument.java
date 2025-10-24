/*
 * An XML document type.
 * Localname: image
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.ImageDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one image(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface ImageDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.ImageDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "imagec71bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "image" element
     */
    com.microsoft.schemas.vml.CTImage getImage();

    /**
     * Sets the "image" element
     */
    void setImage(com.microsoft.schemas.vml.CTImage image);

    /**
     * Appends and returns a new empty "image" element
     */
    com.microsoft.schemas.vml.CTImage addNewImage();
}

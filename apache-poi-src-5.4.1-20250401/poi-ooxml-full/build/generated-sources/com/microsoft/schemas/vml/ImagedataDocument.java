/*
 * An XML document type.
 * Localname: imagedata
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.ImagedataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one imagedata(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface ImagedataDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.ImagedataDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "imagedata2045doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "imagedata" element
     */
    com.microsoft.schemas.vml.CTImageData getImagedata();

    /**
     * Sets the "imagedata" element
     */
    void setImagedata(com.microsoft.schemas.vml.CTImageData imagedata);

    /**
     * Appends and returns a new empty "imagedata" element
     */
    com.microsoft.schemas.vml.CTImageData addNewImagedata();
}

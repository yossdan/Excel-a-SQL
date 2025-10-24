/*
 * An XML document type.
 * Localname: fill
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.FillDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one fill(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface FillDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.FillDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "fill6a95doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "fill" element
     */
    com.microsoft.schemas.vml.CTFill getFill();

    /**
     * Sets the "fill" element
     */
    void setFill(com.microsoft.schemas.vml.CTFill fill);

    /**
     * Appends and returns a new empty "fill" element
     */
    com.microsoft.schemas.vml.CTFill addNewFill();
}

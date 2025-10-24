/*
 * An XML document type.
 * Localname: line
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.LineDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one line(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface LineDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.LineDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "line0946doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "line" element
     */
    com.microsoft.schemas.vml.CTLine getLine();

    /**
     * Sets the "line" element
     */
    void setLine(com.microsoft.schemas.vml.CTLine line);

    /**
     * Appends and returns a new empty "line" element
     */
    com.microsoft.schemas.vml.CTLine addNewLine();
}

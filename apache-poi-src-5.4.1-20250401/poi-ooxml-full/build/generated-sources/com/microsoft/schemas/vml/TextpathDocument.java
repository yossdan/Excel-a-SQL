/*
 * An XML document type.
 * Localname: textpath
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.TextpathDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one textpath(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface TextpathDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.TextpathDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "textpath0724doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "textpath" element
     */
    com.microsoft.schemas.vml.CTTextPath getTextpath();

    /**
     * Sets the "textpath" element
     */
    void setTextpath(com.microsoft.schemas.vml.CTTextPath textpath);

    /**
     * Appends and returns a new empty "textpath" element
     */
    com.microsoft.schemas.vml.CTTextPath addNewTextpath();
}

/*
 * An XML document type.
 * Localname: textbox
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.TextboxDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one textbox(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface TextboxDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.TextboxDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "textbox6e3edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "textbox" element
     */
    com.microsoft.schemas.vml.CTTextbox getTextbox();

    /**
     * Sets the "textbox" element
     */
    void setTextbox(com.microsoft.schemas.vml.CTTextbox textbox);

    /**
     * Appends and returns a new empty "textbox" element
     */
    com.microsoft.schemas.vml.CTTextbox addNewTextbox();
}

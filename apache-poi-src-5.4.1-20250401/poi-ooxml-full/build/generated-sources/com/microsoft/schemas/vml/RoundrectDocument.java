/*
 * An XML document type.
 * Localname: roundrect
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.RoundrectDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one roundrect(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface RoundrectDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.RoundrectDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "roundrecta472doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "roundrect" element
     */
    com.microsoft.schemas.vml.CTRoundRect getRoundrect();

    /**
     * Sets the "roundrect" element
     */
    void setRoundrect(com.microsoft.schemas.vml.CTRoundRect roundrect);

    /**
     * Appends and returns a new empty "roundrect" element
     */
    com.microsoft.schemas.vml.CTRoundRect addNewRoundrect();
}

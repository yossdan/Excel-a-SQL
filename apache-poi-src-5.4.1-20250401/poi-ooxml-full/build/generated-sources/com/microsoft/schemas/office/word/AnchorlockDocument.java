/*
 * An XML document type.
 * Localname: anchorlock
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.AnchorlockDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one anchorlock(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public interface AnchorlockDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.AnchorlockDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "anchorlock2665doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "anchorlock" element
     */
    com.microsoft.schemas.office.word.CTAnchorLock getAnchorlock();

    /**
     * Sets the "anchorlock" element
     */
    void setAnchorlock(com.microsoft.schemas.office.word.CTAnchorLock anchorlock);

    /**
     * Appends and returns a new empty "anchorlock" element
     */
    com.microsoft.schemas.office.word.CTAnchorLock addNewAnchorlock();
}

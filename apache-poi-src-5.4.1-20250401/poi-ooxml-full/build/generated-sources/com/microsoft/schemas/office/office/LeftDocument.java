/*
 * An XML document type.
 * Localname: left
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.LeftDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one left(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface LeftDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.LeftDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "left99bedoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "left" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild getLeft();

    /**
     * Sets the "left" element
     */
    void setLeft(com.microsoft.schemas.office.office.CTStrokeChild left);

    /**
     * Appends and returns a new empty "left" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild addNewLeft();
}

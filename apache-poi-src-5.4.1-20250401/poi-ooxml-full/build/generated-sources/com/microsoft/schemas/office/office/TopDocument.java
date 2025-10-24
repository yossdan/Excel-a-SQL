/*
 * An XML document type.
 * Localname: top
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.TopDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one top(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface TopDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.TopDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "topa3fadoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "top" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild getTop();

    /**
     * Sets the "top" element
     */
    void setTop(com.microsoft.schemas.office.office.CTStrokeChild top);

    /**
     * Appends and returns a new empty "top" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild addNewTop();
}

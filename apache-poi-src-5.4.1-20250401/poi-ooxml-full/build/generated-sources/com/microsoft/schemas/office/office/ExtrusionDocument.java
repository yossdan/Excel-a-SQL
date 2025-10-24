/*
 * An XML document type.
 * Localname: extrusion
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ExtrusionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one extrusion(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface ExtrusionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.ExtrusionDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "extrusion863edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "extrusion" element
     */
    com.microsoft.schemas.office.office.CTExtrusion getExtrusion();

    /**
     * Sets the "extrusion" element
     */
    void setExtrusion(com.microsoft.schemas.office.office.CTExtrusion extrusion);

    /**
     * Appends and returns a new empty "extrusion" element
     */
    com.microsoft.schemas.office.office.CTExtrusion addNewExtrusion();
}

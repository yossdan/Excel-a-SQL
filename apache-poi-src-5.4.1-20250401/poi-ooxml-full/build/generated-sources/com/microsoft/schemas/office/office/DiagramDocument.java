/*
 * An XML document type.
 * Localname: diagram
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.DiagramDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one diagram(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface DiagramDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.DiagramDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "diagram31f8doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "diagram" element
     */
    com.microsoft.schemas.office.office.CTDiagram getDiagram();

    /**
     * Sets the "diagram" element
     */
    void setDiagram(com.microsoft.schemas.office.office.CTDiagram diagram);

    /**
     * Appends and returns a new empty "diagram" element
     */
    com.microsoft.schemas.office.office.CTDiagram addNewDiagram();
}

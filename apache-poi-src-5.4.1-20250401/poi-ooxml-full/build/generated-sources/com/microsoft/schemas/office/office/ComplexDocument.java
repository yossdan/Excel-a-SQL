/*
 * An XML document type.
 * Localname: complex
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ComplexDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one complex(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface ComplexDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.ComplexDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "complex44d5doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "complex" element
     */
    com.microsoft.schemas.office.office.CTComplex getComplex();

    /**
     * Sets the "complex" element
     */
    void setComplex(com.microsoft.schemas.office.office.CTComplex complex);

    /**
     * Appends and returns a new empty "complex" element
     */
    com.microsoft.schemas.office.office.CTComplex addNewComplex();
}

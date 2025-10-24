/*
 * An XML document type.
 * Localname: skew
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.SkewDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one skew(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface SkewDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.SkewDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "skew5fc1doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "skew" element
     */
    com.microsoft.schemas.office.office.CTSkew getSkew();

    /**
     * Sets the "skew" element
     */
    void setSkew(com.microsoft.schemas.office.office.CTSkew skew);

    /**
     * Appends and returns a new empty "skew" element
     */
    com.microsoft.schemas.office.office.CTSkew addNewSkew();
}

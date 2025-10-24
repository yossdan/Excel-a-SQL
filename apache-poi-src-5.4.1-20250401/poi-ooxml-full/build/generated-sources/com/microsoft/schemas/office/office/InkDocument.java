/*
 * An XML document type.
 * Localname: ink
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.InkDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ink(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface InkDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.InkDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "inkd58bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ink" element
     */
    com.microsoft.schemas.office.office.CTInk getInk();

    /**
     * Sets the "ink" element
     */
    void setInk(com.microsoft.schemas.office.office.CTInk ink);

    /**
     * Appends and returns a new empty "ink" element
     */
    com.microsoft.schemas.office.office.CTInk addNewInk();
}

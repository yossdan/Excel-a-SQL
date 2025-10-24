/*
 * An XML document type.
 * Localname: fill
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.FillDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one fill(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface FillDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.FillDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "fillc33adoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "fill" element
     */
    com.microsoft.schemas.office.office.CTFill getFill();

    /**
     * Sets the "fill" element
     */
    void setFill(com.microsoft.schemas.office.office.CTFill fill);

    /**
     * Appends and returns a new empty "fill" element
     */
    com.microsoft.schemas.office.office.CTFill addNewFill();
}

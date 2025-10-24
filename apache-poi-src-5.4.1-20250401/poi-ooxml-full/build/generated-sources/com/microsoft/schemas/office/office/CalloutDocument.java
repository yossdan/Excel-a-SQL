/*
 * An XML document type.
 * Localname: callout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CalloutDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one callout(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface CalloutDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CalloutDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "callout1055doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "callout" element
     */
    com.microsoft.schemas.office.office.CTCallout getCallout();

    /**
     * Sets the "callout" element
     */
    void setCallout(com.microsoft.schemas.office.office.CTCallout callout);

    /**
     * Appends and returns a new empty "callout" element
     */
    com.microsoft.schemas.office.office.CTCallout addNewCallout();
}

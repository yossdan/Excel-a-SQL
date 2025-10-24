/*
 * An XML document type.
 * Localname: signatureline
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.SignaturelineDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one signatureline(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface SignaturelineDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.SignaturelineDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "signaturelineb791doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "signatureline" element
     */
    com.microsoft.schemas.office.office.CTSignatureLine getSignatureline();

    /**
     * Sets the "signatureline" element
     */
    void setSignatureline(com.microsoft.schemas.office.office.CTSignatureLine signatureline);

    /**
     * Appends and returns a new empty "signatureline" element
     */
    com.microsoft.schemas.office.office.CTSignatureLine addNewSignatureline();
}

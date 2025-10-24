/*
 * An XML document type.
 * Localname: SignatureInfoV2
 * Namespace: http://schemas.microsoft.com/office/2006/digsig
 * Java type: com.microsoft.schemas.office.x2006.digsig.SignatureInfoV2Document
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.digsig;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SignatureInfoV2(@http://schemas.microsoft.com/office/2006/digsig) element.
 *
 * This is a complex type.
 */
public interface SignatureInfoV2Document extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.x2006.digsig.SignatureInfoV2Document> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "signatureinfov2e46cdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SignatureInfoV2" element
     */
    com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2 getSignatureInfoV2();

    /**
     * Sets the "SignatureInfoV2" element
     */
    void setSignatureInfoV2(com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2 signatureInfoV2);

    /**
     * Appends and returns a new empty "SignatureInfoV2" element
     */
    com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2 addNewSignatureInfoV2();
}

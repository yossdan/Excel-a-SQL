/*
 * XML Type:  CT_SignatureInfoV2
 * Namespace: http://schemas.microsoft.com/office/2006/digsig
 * Java type: com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.digsig;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_SignatureInfoV2(@http://schemas.microsoft.com/office/2006/digsig).
 *
 * This is a complex type.
 */
public interface CTSignatureInfoV2 extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsignatureinfov2d460type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Address1" element
     */
    java.lang.String getAddress1();

    /**
     * Gets (as xml) the "Address1" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1();

    /**
     * True if has "Address1" element
     */
    boolean isSetAddress1();

    /**
     * Sets the "Address1" element
     */
    void setAddress1(java.lang.String address1);

    /**
     * Sets (as xml) the "Address1" element
     */
    void xsetAddress1(org.apache.xmlbeans.XmlString address1);

    /**
     * Unsets the "Address1" element
     */
    void unsetAddress1();

    /**
     * Gets the "Address2" element
     */
    java.lang.String getAddress2();

    /**
     * Gets (as xml) the "Address2" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2();

    /**
     * True if has "Address2" element
     */
    boolean isSetAddress2();

    /**
     * Sets the "Address2" element
     */
    void setAddress2(java.lang.String address2);

    /**
     * Sets (as xml) the "Address2" element
     */
    void xsetAddress2(org.apache.xmlbeans.XmlString address2);

    /**
     * Unsets the "Address2" element
     */
    void unsetAddress2();
}

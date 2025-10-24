/*
 * XML Type:  CT_EquationXml
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTEquationXml
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_EquationXml(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTEquationXml extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTEquationXml> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctequationxmlf0a4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "contentType" attribute
     */
    java.lang.String getContentType();

    /**
     * Gets (as xml) the "contentType" attribute
     */
    com.microsoft.schemas.office.office.STAlternateMathContentType xgetContentType();

    /**
     * True if has "contentType" attribute
     */
    boolean isSetContentType();

    /**
     * Sets the "contentType" attribute
     */
    void setContentType(java.lang.String contentType);

    /**
     * Sets (as xml) the "contentType" attribute
     */
    void xsetContentType(com.microsoft.schemas.office.office.STAlternateMathContentType contentType);

    /**
     * Unsets the "contentType" attribute
     */
    void unsetContentType();
}

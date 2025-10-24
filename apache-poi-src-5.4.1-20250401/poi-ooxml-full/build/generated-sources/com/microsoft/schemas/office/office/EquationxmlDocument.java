/*
 * An XML document type.
 * Localname: equationxml
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.EquationxmlDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one equationxml(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface EquationxmlDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.EquationxmlDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "equationxml42f0doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "equationxml" element
     */
    com.microsoft.schemas.office.office.CTEquationXml getEquationxml();

    /**
     * Sets the "equationxml" element
     */
    void setEquationxml(com.microsoft.schemas.office.office.CTEquationXml equationxml);

    /**
     * Appends and returns a new empty "equationxml" element
     */
    com.microsoft.schemas.office.office.CTEquationXml addNewEquationxml();
}

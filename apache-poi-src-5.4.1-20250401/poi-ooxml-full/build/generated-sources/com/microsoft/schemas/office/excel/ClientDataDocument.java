/*
 * An XML document type.
 * Localname: ClientData
 * Namespace: urn:schemas-microsoft-com:office:excel
 * Java type: com.microsoft.schemas.office.excel.ClientDataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.excel;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ClientData(@urn:schemas-microsoft-com:office:excel) element.
 *
 * This is a complex type.
 */
public interface ClientDataDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.excel.ClientDataDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "clientdata1847doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ClientData" element
     */
    com.microsoft.schemas.office.excel.CTClientData getClientData();

    /**
     * Sets the "ClientData" element
     */
    void setClientData(com.microsoft.schemas.office.excel.CTClientData clientData);

    /**
     * Appends and returns a new empty "ClientData" element
     */
    com.microsoft.schemas.office.excel.CTClientData addNewClientData();
}

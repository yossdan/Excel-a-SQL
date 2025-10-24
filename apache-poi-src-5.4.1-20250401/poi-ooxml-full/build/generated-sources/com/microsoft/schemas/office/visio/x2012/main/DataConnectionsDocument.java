/*
 * An XML document type.
 * Localname: DataConnections
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataConnectionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DataConnections(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public interface DataConnectionsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.DataConnectionsDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "dataconnections083bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataConnections" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType getDataConnections();

    /**
     * Sets the "DataConnections" element
     */
    void setDataConnections(com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType dataConnections);

    /**
     * Appends and returns a new empty "DataConnections" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType addNewDataConnections();
}

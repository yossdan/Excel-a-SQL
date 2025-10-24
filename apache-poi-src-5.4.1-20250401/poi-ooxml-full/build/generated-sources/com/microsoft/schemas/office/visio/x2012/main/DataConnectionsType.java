/*
 * XML Type:  DataConnections_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataConnections_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface DataConnectionsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "dataconnectionstypec600type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "DataConnection" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.DataConnectionType> getDataConnectionList();

    /**
     * Gets array of all "DataConnection" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.DataConnectionType[] getDataConnectionArray();

    /**
     * Gets ith "DataConnection" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataConnectionType getDataConnectionArray(int i);

    /**
     * Returns number of "DataConnection" element
     */
    int sizeOfDataConnectionArray();

    /**
     * Sets array of all "DataConnection" element
     */
    void setDataConnectionArray(com.microsoft.schemas.office.visio.x2012.main.DataConnectionType[] dataConnectionArray);

    /**
     * Sets ith "DataConnection" element
     */
    void setDataConnectionArray(int i, com.microsoft.schemas.office.visio.x2012.main.DataConnectionType dataConnection);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConnection" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataConnectionType insertNewDataConnection(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataConnection" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataConnectionType addNewDataConnection();

    /**
     * Removes the ith "DataConnection" element
     */
    void removeDataConnection(int i);

    /**
     * Gets the "NextID" attribute
     */
    long getNextID();

    /**
     * Gets (as xml) the "NextID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetNextID();

    /**
     * Sets the "NextID" attribute
     */
    void setNextID(long nextID);

    /**
     * Sets (as xml) the "NextID" attribute
     */
    void xsetNextID(org.apache.xmlbeans.XmlUnsignedInt nextID);
}

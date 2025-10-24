/*
 * XML Type:  DataConnection_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataConnectionType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataConnection_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface DataConnectionType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.DataConnectionType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "dataconnectiontype1591type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ID" attribute
     */
    long getID();

    /**
     * Gets (as xml) the "ID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetID();

    /**
     * Sets the "ID" attribute
     */
    void setID(long id);

    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.apache.xmlbeans.XmlUnsignedInt id);

    /**
     * Gets the "FileName" attribute
     */
    java.lang.String getFileName();

    /**
     * Gets (as xml) the "FileName" attribute
     */
    org.apache.xmlbeans.XmlString xgetFileName();

    /**
     * Sets the "FileName" attribute
     */
    void setFileName(java.lang.String fileName);

    /**
     * Sets (as xml) the "FileName" attribute
     */
    void xsetFileName(org.apache.xmlbeans.XmlString fileName);

    /**
     * Gets the "ConnectionString" attribute
     */
    java.lang.String getConnectionString();

    /**
     * Gets (as xml) the "ConnectionString" attribute
     */
    org.apache.xmlbeans.XmlString xgetConnectionString();

    /**
     * True if has "ConnectionString" attribute
     */
    boolean isSetConnectionString();

    /**
     * Sets the "ConnectionString" attribute
     */
    void setConnectionString(java.lang.String connectionString);

    /**
     * Sets (as xml) the "ConnectionString" attribute
     */
    void xsetConnectionString(org.apache.xmlbeans.XmlString connectionString);

    /**
     * Unsets the "ConnectionString" attribute
     */
    void unsetConnectionString();

    /**
     * Gets the "Command" attribute
     */
    java.lang.String getCommand();

    /**
     * Gets (as xml) the "Command" attribute
     */
    org.apache.xmlbeans.XmlString xgetCommand();

    /**
     * True if has "Command" attribute
     */
    boolean isSetCommand();

    /**
     * Sets the "Command" attribute
     */
    void setCommand(java.lang.String command);

    /**
     * Sets (as xml) the "Command" attribute
     */
    void xsetCommand(org.apache.xmlbeans.XmlString command);

    /**
     * Unsets the "Command" attribute
     */
    void unsetCommand();

    /**
     * Gets the "FriendlyName" attribute
     */
    java.lang.String getFriendlyName();

    /**
     * Gets (as xml) the "FriendlyName" attribute
     */
    org.apache.xmlbeans.XmlString xgetFriendlyName();

    /**
     * True if has "FriendlyName" attribute
     */
    boolean isSetFriendlyName();

    /**
     * Sets the "FriendlyName" attribute
     */
    void setFriendlyName(java.lang.String friendlyName);

    /**
     * Sets (as xml) the "FriendlyName" attribute
     */
    void xsetFriendlyName(org.apache.xmlbeans.XmlString friendlyName);

    /**
     * Unsets the "FriendlyName" attribute
     */
    void unsetFriendlyName();

    /**
     * Gets the "Timeout" attribute
     */
    long getTimeout();

    /**
     * Gets (as xml) the "Timeout" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetTimeout();

    /**
     * True if has "Timeout" attribute
     */
    boolean isSetTimeout();

    /**
     * Sets the "Timeout" attribute
     */
    void setTimeout(long timeout);

    /**
     * Sets (as xml) the "Timeout" attribute
     */
    void xsetTimeout(org.apache.xmlbeans.XmlUnsignedInt timeout);

    /**
     * Unsets the "Timeout" attribute
     */
    void unsetTimeout();

    /**
     * Gets the "AlwaysUseConnectionFile" attribute
     */
    boolean getAlwaysUseConnectionFile();

    /**
     * Gets (as xml) the "AlwaysUseConnectionFile" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAlwaysUseConnectionFile();

    /**
     * True if has "AlwaysUseConnectionFile" attribute
     */
    boolean isSetAlwaysUseConnectionFile();

    /**
     * Sets the "AlwaysUseConnectionFile" attribute
     */
    void setAlwaysUseConnectionFile(boolean alwaysUseConnectionFile);

    /**
     * Sets (as xml) the "AlwaysUseConnectionFile" attribute
     */
    void xsetAlwaysUseConnectionFile(org.apache.xmlbeans.XmlBoolean alwaysUseConnectionFile);

    /**
     * Unsets the "AlwaysUseConnectionFile" attribute
     */
    void unsetAlwaysUseConnectionFile();
}

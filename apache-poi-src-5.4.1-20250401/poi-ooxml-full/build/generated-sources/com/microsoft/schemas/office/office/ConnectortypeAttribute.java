/*
 * An XML attribute type.
 * Localname: connectortype
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ConnectortypeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one connectortype(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface ConnectortypeAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.ConnectortypeAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "connectortype127aattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "connectortype" attribute
     */
    com.microsoft.schemas.office.office.STConnectorType.Enum getConnectortype();

    /**
     * Gets (as xml) the "connectortype" attribute
     */
    com.microsoft.schemas.office.office.STConnectorType xgetConnectortype();

    /**
     * True if has "connectortype" attribute
     */
    boolean isSetConnectortype();

    /**
     * Sets the "connectortype" attribute
     */
    void setConnectortype(com.microsoft.schemas.office.office.STConnectorType.Enum connectortype);

    /**
     * Sets (as xml) the "connectortype" attribute
     */
    void xsetConnectortype(com.microsoft.schemas.office.office.STConnectorType connectortype);

    /**
     * Unsets the "connectortype" attribute
     */
    void unsetConnectortype();
}

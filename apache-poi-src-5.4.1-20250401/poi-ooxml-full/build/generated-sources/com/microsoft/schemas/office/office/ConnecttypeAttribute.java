/*
 * An XML attribute type.
 * Localname: connecttype
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ConnecttypeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one connecttype(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface ConnecttypeAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.ConnecttypeAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "connecttype08d7attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "connecttype" attribute
     */
    com.microsoft.schemas.office.office.STConnectType.Enum getConnecttype();

    /**
     * Gets (as xml) the "connecttype" attribute
     */
    com.microsoft.schemas.office.office.STConnectType xgetConnecttype();

    /**
     * True if has "connecttype" attribute
     */
    boolean isSetConnecttype();

    /**
     * Sets the "connecttype" attribute
     */
    void setConnecttype(com.microsoft.schemas.office.office.STConnectType.Enum connecttype);

    /**
     * Sets (as xml) the "connecttype" attribute
     */
    void xsetConnecttype(com.microsoft.schemas.office.office.STConnectType connecttype);

    /**
     * Unsets the "connecttype" attribute
     */
    void unsetConnecttype();
}

/*
 * An XML attribute type.
 * Localname: bwnormal
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.BwnormalAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one bwnormal(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface BwnormalAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.BwnormalAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "bwnormal0765attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "bwnormal" attribute
     */
    com.microsoft.schemas.office.office.STBWMode.Enum getBwnormal();

    /**
     * Gets (as xml) the "bwnormal" attribute
     */
    com.microsoft.schemas.office.office.STBWMode xgetBwnormal();

    /**
     * True if has "bwnormal" attribute
     */
    boolean isSetBwnormal();

    /**
     * Sets the "bwnormal" attribute
     */
    void setBwnormal(com.microsoft.schemas.office.office.STBWMode.Enum bwnormal);

    /**
     * Sets (as xml) the "bwnormal" attribute
     */
    void xsetBwnormal(com.microsoft.schemas.office.office.STBWMode bwnormal);

    /**
     * Unsets the "bwnormal" attribute
     */
    void unsetBwnormal();
}

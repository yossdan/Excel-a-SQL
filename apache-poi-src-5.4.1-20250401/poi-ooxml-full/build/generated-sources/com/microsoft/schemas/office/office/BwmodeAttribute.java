/*
 * An XML attribute type.
 * Localname: bwmode
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.BwmodeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one bwmode(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface BwmodeAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.BwmodeAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "bwmode0821attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "bwmode" attribute
     */
    com.microsoft.schemas.office.office.STBWMode.Enum getBwmode();

    /**
     * Gets (as xml) the "bwmode" attribute
     */
    com.microsoft.schemas.office.office.STBWMode xgetBwmode();

    /**
     * True if has "bwmode" attribute
     */
    boolean isSetBwmode();

    /**
     * Sets the "bwmode" attribute
     */
    void setBwmode(com.microsoft.schemas.office.office.STBWMode.Enum bwmode);

    /**
     * Sets (as xml) the "bwmode" attribute
     */
    void xsetBwmode(com.microsoft.schemas.office.office.STBWMode bwmode);

    /**
     * Unsets the "bwmode" attribute
     */
    void unsetBwmode();
}

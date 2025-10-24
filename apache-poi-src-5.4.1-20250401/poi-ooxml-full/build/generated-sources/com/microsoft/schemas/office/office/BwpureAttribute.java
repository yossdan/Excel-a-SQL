/*
 * An XML attribute type.
 * Localname: bwpure
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.BwpureAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one bwpure(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface BwpureAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.BwpureAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "bwpurec476attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "bwpure" attribute
     */
    com.microsoft.schemas.office.office.STBWMode.Enum getBwpure();

    /**
     * Gets (as xml) the "bwpure" attribute
     */
    com.microsoft.schemas.office.office.STBWMode xgetBwpure();

    /**
     * True if has "bwpure" attribute
     */
    boolean isSetBwpure();

    /**
     * Sets the "bwpure" attribute
     */
    void setBwpure(com.microsoft.schemas.office.office.STBWMode.Enum bwpure);

    /**
     * Sets (as xml) the "bwpure" attribute
     */
    void xsetBwpure(com.microsoft.schemas.office.office.STBWMode bwpure);

    /**
     * Unsets the "bwpure" attribute
     */
    void unsetBwpure();
}

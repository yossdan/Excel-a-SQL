/*
 * An XML attribute type.
 * Localname: gfxdata
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.GfxdataAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one gfxdata(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface GfxdataAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.GfxdataAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "gfxdata37d6attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "gfxdata" attribute
     */
    byte[] getGfxdata();

    /**
     * Gets (as xml) the "gfxdata" attribute
     */
    org.apache.xmlbeans.XmlBase64Binary xgetGfxdata();

    /**
     * True if has "gfxdata" attribute
     */
    boolean isSetGfxdata();

    /**
     * Sets the "gfxdata" attribute
     */
    void setGfxdata(byte[] gfxdata);

    /**
     * Sets (as xml) the "gfxdata" attribute
     */
    void xsetGfxdata(org.apache.xmlbeans.XmlBase64Binary gfxdata);

    /**
     * Unsets the "gfxdata" attribute
     */
    void unsetGfxdata();
}

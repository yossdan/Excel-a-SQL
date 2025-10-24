/*
 * XML Type:  CT_ColorMru
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTColorMru
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ColorMru(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTColorMru extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTColorMru> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcolormrue2f0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt.Enum getExt();

    /**
     * Gets (as xml) the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt xgetExt();

    /**
     * True if has "ext" attribute
     */
    boolean isSetExt();

    /**
     * Sets the "ext" attribute
     */
    void setExt(com.microsoft.schemas.vml.STExt.Enum ext);

    /**
     * Sets (as xml) the "ext" attribute
     */
    void xsetExt(com.microsoft.schemas.vml.STExt ext);

    /**
     * Unsets the "ext" attribute
     */
    void unsetExt();

    /**
     * Gets the "colors" attribute
     */
    java.lang.String getColors();

    /**
     * Gets (as xml) the "colors" attribute
     */
    org.apache.xmlbeans.XmlString xgetColors();

    /**
     * True if has "colors" attribute
     */
    boolean isSetColors();

    /**
     * Sets the "colors" attribute
     */
    void setColors(java.lang.String colors);

    /**
     * Sets (as xml) the "colors" attribute
     */
    void xsetColors(org.apache.xmlbeans.XmlString colors);

    /**
     * Unsets the "colors" attribute
     */
    void unsetColors();
}

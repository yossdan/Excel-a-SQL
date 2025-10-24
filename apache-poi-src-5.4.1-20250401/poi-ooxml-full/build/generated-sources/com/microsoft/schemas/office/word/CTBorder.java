/*
 * XML Type:  CT_Border
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.CTBorder
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Border(@urn:schemas-microsoft-com:office:word).
 *
 * This is a complex type.
 */
public interface CTBorder extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.CTBorder> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctborderc15dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "type" attribute
     */
    com.microsoft.schemas.office.word.STBorderType.Enum getType();

    /**
     * Gets (as xml) the "type" attribute
     */
    com.microsoft.schemas.office.word.STBorderType xgetType();

    /**
     * True if has "type" attribute
     */
    boolean isSetType();

    /**
     * Sets the "type" attribute
     */
    void setType(com.microsoft.schemas.office.word.STBorderType.Enum type);

    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(com.microsoft.schemas.office.word.STBorderType type);

    /**
     * Unsets the "type" attribute
     */
    void unsetType();

    /**
     * Gets the "width" attribute
     */
    java.math.BigInteger getWidth();

    /**
     * Gets (as xml) the "width" attribute
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetWidth();

    /**
     * True if has "width" attribute
     */
    boolean isSetWidth();

    /**
     * Sets the "width" attribute
     */
    void setWidth(java.math.BigInteger width);

    /**
     * Sets (as xml) the "width" attribute
     */
    void xsetWidth(org.apache.xmlbeans.XmlPositiveInteger width);

    /**
     * Unsets the "width" attribute
     */
    void unsetWidth();

    /**
     * Gets the "shadow" attribute
     */
    com.microsoft.schemas.office.word.STBorderShadow.Enum getShadow();

    /**
     * Gets (as xml) the "shadow" attribute
     */
    com.microsoft.schemas.office.word.STBorderShadow xgetShadow();

    /**
     * True if has "shadow" attribute
     */
    boolean isSetShadow();

    /**
     * Sets the "shadow" attribute
     */
    void setShadow(com.microsoft.schemas.office.word.STBorderShadow.Enum shadow);

    /**
     * Sets (as xml) the "shadow" attribute
     */
    void xsetShadow(com.microsoft.schemas.office.word.STBorderShadow shadow);

    /**
     * Unsets the "shadow" attribute
     */
    void unsetShadow();
}

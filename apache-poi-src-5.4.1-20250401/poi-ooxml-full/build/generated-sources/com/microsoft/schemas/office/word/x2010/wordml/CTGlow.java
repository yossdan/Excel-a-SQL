/*
 * XML Type:  CT_Glow
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTGlow
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Glow(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTGlow extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTGlow> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctglow85fbtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "srgbClr" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSRgbColor getSrgbClr();

    /**
     * True if has "srgbClr" element
     */
    boolean isSetSrgbClr();

    /**
     * Sets the "srgbClr" element
     */
    void setSrgbClr(com.microsoft.schemas.office.word.x2010.wordml.CTSRgbColor srgbClr);

    /**
     * Appends and returns a new empty "srgbClr" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSRgbColor addNewSrgbClr();

    /**
     * Unsets the "srgbClr" element
     */
    void unsetSrgbClr();

    /**
     * Gets the "schemeClr" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor getSchemeClr();

    /**
     * True if has "schemeClr" element
     */
    boolean isSetSchemeClr();

    /**
     * Sets the "schemeClr" element
     */
    void setSchemeClr(com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor schemeClr);

    /**
     * Appends and returns a new empty "schemeClr" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor addNewSchemeClr();

    /**
     * Unsets the "schemeClr" element
     */
    void unsetSchemeClr();

    /**
     * Gets the "rad" attribute
     */
    long getRad();

    /**
     * Gets (as xml) the "rad" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetRad();

    /**
     * True if has "rad" attribute
     */
    boolean isSetRad();

    /**
     * Sets the "rad" attribute
     */
    void setRad(long rad);

    /**
     * Sets (as xml) the "rad" attribute
     */
    void xsetRad(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate rad);

    /**
     * Unsets the "rad" attribute
     */
    void unsetRad();
}

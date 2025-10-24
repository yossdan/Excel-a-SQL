/*
 * XML Type:  CT_Color
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTColor
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Color(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTColor extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTColor> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcolor5c4ftype");
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
}

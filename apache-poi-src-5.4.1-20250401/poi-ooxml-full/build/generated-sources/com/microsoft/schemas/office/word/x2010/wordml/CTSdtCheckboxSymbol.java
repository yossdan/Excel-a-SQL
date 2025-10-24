/*
 * XML Type:  CT_SdtCheckboxSymbol
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_SdtCheckboxSymbol(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTSdtCheckboxSymbol extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsdtcheckboxsymbol8cb4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "font" attribute
     */
    java.lang.String getFont();

    /**
     * Gets (as xml) the "font" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString xgetFont();

    /**
     * True if has "font" attribute
     */
    boolean isSetFont();

    /**
     * Sets the "font" attribute
     */
    void setFont(java.lang.String font);

    /**
     * Sets (as xml) the "font" attribute
     */
    void xsetFont(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString font);

    /**
     * Unsets the "font" attribute
     */
    void unsetFont();

    /**
     * Gets the "val" attribute
     */
    byte[] getVal();

    /**
     * Gets (as xml) the "val" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber xgetVal();

    /**
     * True if has "val" attribute
     */
    boolean isSetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(byte[] val);

    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber val);

    /**
     * Unsets the "val" attribute
     */
    void unsetVal();
}

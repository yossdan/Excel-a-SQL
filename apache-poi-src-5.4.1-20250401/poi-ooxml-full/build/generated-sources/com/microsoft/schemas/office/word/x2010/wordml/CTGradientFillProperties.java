/*
 * XML Type:  CT_GradientFillProperties
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GradientFillProperties(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTGradientFillProperties extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgradientfillproperties4202type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "gsLst" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList getGsLst();

    /**
     * True if has "gsLst" element
     */
    boolean isSetGsLst();

    /**
     * Sets the "gsLst" element
     */
    void setGsLst(com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList gsLst);

    /**
     * Appends and returns a new empty "gsLst" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList addNewGsLst();

    /**
     * Unsets the "gsLst" element
     */
    void unsetGsLst();

    /**
     * Gets the "lin" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties getLin();

    /**
     * True if has "lin" element
     */
    boolean isSetLin();

    /**
     * Sets the "lin" element
     */
    void setLin(com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties lin);

    /**
     * Appends and returns a new empty "lin" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties addNewLin();

    /**
     * Unsets the "lin" element
     */
    void unsetLin();

    /**
     * Gets the "path" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties getPath();

    /**
     * True if has "path" element
     */
    boolean isSetPath();

    /**
     * Sets the "path" element
     */
    void setPath(com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties path);

    /**
     * Appends and returns a new empty "path" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties addNewPath();

    /**
     * Unsets the "path" element
     */
    void unsetPath();
}

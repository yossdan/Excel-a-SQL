/*
 * XML Type:  CT_FillTextEffect
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTFillTextEffect
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_FillTextEffect(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTFillTextEffect extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTFillTextEffect> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctfilltexteffect3f47type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "noFill" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getNoFill();

    /**
     * True if has "noFill" element
     */
    boolean isSetNoFill();

    /**
     * Sets the "noFill" element
     */
    void setNoFill(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty noFill);

    /**
     * Appends and returns a new empty "noFill" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewNoFill();

    /**
     * Unsets the "noFill" element
     */
    void unsetNoFill();

    /**
     * Gets the "solidFill" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties getSolidFill();

    /**
     * True if has "solidFill" element
     */
    boolean isSetSolidFill();

    /**
     * Sets the "solidFill" element
     */
    void setSolidFill(com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties solidFill);

    /**
     * Appends and returns a new empty "solidFill" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties addNewSolidFill();

    /**
     * Unsets the "solidFill" element
     */
    void unsetSolidFill();

    /**
     * Gets the "gradFill" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties getGradFill();

    /**
     * True if has "gradFill" element
     */
    boolean isSetGradFill();

    /**
     * Sets the "gradFill" element
     */
    void setGradFill(com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties gradFill);

    /**
     * Appends and returns a new empty "gradFill" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties addNewGradFill();

    /**
     * Unsets the "gradFill" element
     */
    void unsetGradFill();
}

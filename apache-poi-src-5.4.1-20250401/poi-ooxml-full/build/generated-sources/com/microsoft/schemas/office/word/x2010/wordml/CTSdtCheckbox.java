/*
 * XML Type:  CT_SdtCheckbox
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_SdtCheckbox(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTSdtCheckbox extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsdtcheckboxd6actype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "checked" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTOnOff getChecked();

    /**
     * True if has "checked" element
     */
    boolean isSetChecked();

    /**
     * Sets the "checked" element
     */
    void setChecked(com.microsoft.schemas.office.word.x2010.wordml.CTOnOff checked);

    /**
     * Appends and returns a new empty "checked" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTOnOff addNewChecked();

    /**
     * Unsets the "checked" element
     */
    void unsetChecked();

    /**
     * Gets the "checkedState" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol getCheckedState();

    /**
     * True if has "checkedState" element
     */
    boolean isSetCheckedState();

    /**
     * Sets the "checkedState" element
     */
    void setCheckedState(com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol checkedState);

    /**
     * Appends and returns a new empty "checkedState" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol addNewCheckedState();

    /**
     * Unsets the "checkedState" element
     */
    void unsetCheckedState();

    /**
     * Gets the "uncheckedState" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol getUncheckedState();

    /**
     * True if has "uncheckedState" element
     */
    boolean isSetUncheckedState();

    /**
     * Sets the "uncheckedState" element
     */
    void setUncheckedState(com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol uncheckedState);

    /**
     * Appends and returns a new empty "uncheckedState" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol addNewUncheckedState();

    /**
     * Unsets the "uncheckedState" element
     */
    void unsetUncheckedState();
}

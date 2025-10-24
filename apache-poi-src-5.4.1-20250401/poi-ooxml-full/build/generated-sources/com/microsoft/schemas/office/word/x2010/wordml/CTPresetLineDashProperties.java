/*
 * XML Type:  CT_PresetLineDashProperties
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTPresetLineDashProperties
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_PresetLineDashProperties(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTPresetLineDashProperties extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTPresetLineDashProperties> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctpresetlinedashpropertiesc430type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "val" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STPresetLineDashVal.Enum getVal();

    /**
     * Gets (as xml) the "val" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STPresetLineDashVal xgetVal();

    /**
     * True if has "val" attribute
     */
    boolean isSetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(com.microsoft.schemas.office.word.x2010.wordml.STPresetLineDashVal.Enum val);

    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(com.microsoft.schemas.office.word.x2010.wordml.STPresetLineDashVal val);

    /**
     * Unsets the "val" attribute
     */
    void unsetVal();
}

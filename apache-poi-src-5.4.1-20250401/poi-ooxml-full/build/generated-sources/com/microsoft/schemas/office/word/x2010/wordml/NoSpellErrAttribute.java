/*
 * An XML attribute type.
 * Localname: noSpellErr
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.NoSpellErrAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one noSpellErr(@http://schemas.microsoft.com/office/word/2010/wordml) attribute.
 *
 * This is a complex type.
 */
public interface NoSpellErrAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.NoSpellErrAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "nospellerr0024attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "noSpellErr" attribute
     */
    java.lang.Object getNoSpellErr();

    /**
     * Gets (as xml) the "noSpellErr" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff xgetNoSpellErr();

    /**
     * True if has "noSpellErr" attribute
     */
    boolean isSetNoSpellErr();

    /**
     * Sets the "noSpellErr" attribute
     */
    void setNoSpellErr(java.lang.Object noSpellErr);

    /**
     * Sets (as xml) the "noSpellErr" attribute
     */
    void xsetNoSpellErr(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STOnOff noSpellErr);

    /**
     * Unsets the "noSpellErr" attribute
     */
    void unsetNoSpellErr();
}

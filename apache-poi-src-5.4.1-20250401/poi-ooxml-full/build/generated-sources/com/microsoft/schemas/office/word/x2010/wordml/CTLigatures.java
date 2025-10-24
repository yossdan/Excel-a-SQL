/*
 * XML Type:  CT_Ligatures
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTLigatures
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Ligatures(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTLigatures extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTLigatures> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctligatures908atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "val" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STLigatures.Enum getVal();

    /**
     * Gets (as xml) the "val" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STLigatures xgetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(com.microsoft.schemas.office.word.x2010.wordml.STLigatures.Enum val);

    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(com.microsoft.schemas.office.word.x2010.wordml.STLigatures val);
}

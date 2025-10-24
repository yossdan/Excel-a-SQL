/*
 * XML Type:  CT_NumSpacing
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTNumSpacing
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_NumSpacing(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTNumSpacing extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTNumSpacing> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctnumspacing176btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "val" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STNumSpacing.Enum getVal();

    /**
     * Gets (as xml) the "val" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STNumSpacing xgetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(com.microsoft.schemas.office.word.x2010.wordml.STNumSpacing.Enum val);

    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(com.microsoft.schemas.office.word.x2010.wordml.STNumSpacing val);
}

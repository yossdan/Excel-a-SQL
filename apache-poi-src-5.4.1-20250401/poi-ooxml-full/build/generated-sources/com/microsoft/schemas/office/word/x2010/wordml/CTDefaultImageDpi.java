/*
 * XML Type:  CT_DefaultImageDpi
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTDefaultImageDpi
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_DefaultImageDpi(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTDefaultImageDpi extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTDefaultImageDpi> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdefaultimagedpie60ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "val" attribute
     */
    java.math.BigInteger getVal();

    /**
     * Gets (as xml) the "val" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(java.math.BigInteger val);

    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber val);
}

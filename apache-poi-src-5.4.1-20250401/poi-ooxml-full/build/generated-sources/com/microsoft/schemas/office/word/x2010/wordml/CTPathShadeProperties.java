/*
 * XML Type:  CT_PathShadeProperties
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_PathShadeProperties(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTPathShadeProperties extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctpathshadeproperties3997type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "fillToRect" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTRelativeRect getFillToRect();

    /**
     * True if has "fillToRect" element
     */
    boolean isSetFillToRect();

    /**
     * Sets the "fillToRect" element
     */
    void setFillToRect(com.microsoft.schemas.office.word.x2010.wordml.CTRelativeRect fillToRect);

    /**
     * Appends and returns a new empty "fillToRect" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTRelativeRect addNewFillToRect();

    /**
     * Unsets the "fillToRect" element
     */
    void unsetFillToRect();

    /**
     * Gets the "path" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType.Enum getPath();

    /**
     * Gets (as xml) the "path" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType xgetPath();

    /**
     * True if has "path" attribute
     */
    boolean isSetPath();

    /**
     * Sets the "path" attribute
     */
    void setPath(com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType.Enum path);

    /**
     * Sets (as xml) the "path" attribute
     */
    void xsetPath(com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType path);

    /**
     * Unsets the "path" attribute
     */
    void unsetPath();
}

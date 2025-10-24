/*
 * XML Type:  CT_Bevel
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTBevel
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Bevel(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTBevel extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTBevel> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctbeveldb98type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "w" attribute
     */
    long getW();

    /**
     * Gets (as xml) the "w" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetW();

    /**
     * True if has "w" attribute
     */
    boolean isSetW();

    /**
     * Sets the "w" attribute
     */
    void setW(long w);

    /**
     * Sets (as xml) the "w" attribute
     */
    void xsetW(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate w);

    /**
     * Unsets the "w" attribute
     */
    void unsetW();

    /**
     * Gets the "h" attribute
     */
    long getH();

    /**
     * Gets (as xml) the "h" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetH();

    /**
     * True if has "h" attribute
     */
    boolean isSetH();

    /**
     * Sets the "h" attribute
     */
    void setH(long h);

    /**
     * Sets (as xml) the "h" attribute
     */
    void xsetH(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate h);

    /**
     * Unsets the "h" attribute
     */
    void unsetH();

    /**
     * Gets the "prst" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STBevelPresetType.Enum getPrst();

    /**
     * Gets (as xml) the "prst" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STBevelPresetType xgetPrst();

    /**
     * True if has "prst" attribute
     */
    boolean isSetPrst();

    /**
     * Sets the "prst" attribute
     */
    void setPrst(com.microsoft.schemas.office.word.x2010.wordml.STBevelPresetType.Enum prst);

    /**
     * Sets (as xml) the "prst" attribute
     */
    void xsetPrst(com.microsoft.schemas.office.word.x2010.wordml.STBevelPresetType prst);

    /**
     * Unsets the "prst" attribute
     */
    void unsetPrst();
}

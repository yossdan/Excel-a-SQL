/*
 * XML Type:  FaceName_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.FaceNameType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML FaceName_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface FaceNameType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.FaceNameType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "facenametype3e71type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "NameU" attribute
     */
    java.lang.String getNameU();

    /**
     * Gets (as xml) the "NameU" attribute
     */
    org.apache.xmlbeans.XmlString xgetNameU();

    /**
     * Sets the "NameU" attribute
     */
    void setNameU(java.lang.String nameU);

    /**
     * Sets (as xml) the "NameU" attribute
     */
    void xsetNameU(org.apache.xmlbeans.XmlString nameU);

    /**
     * Gets the "UnicodeRanges" attribute
     */
    java.lang.String getUnicodeRanges();

    /**
     * Gets (as xml) the "UnicodeRanges" attribute
     */
    org.apache.xmlbeans.XmlString xgetUnicodeRanges();

    /**
     * True if has "UnicodeRanges" attribute
     */
    boolean isSetUnicodeRanges();

    /**
     * Sets the "UnicodeRanges" attribute
     */
    void setUnicodeRanges(java.lang.String unicodeRanges);

    /**
     * Sets (as xml) the "UnicodeRanges" attribute
     */
    void xsetUnicodeRanges(org.apache.xmlbeans.XmlString unicodeRanges);

    /**
     * Unsets the "UnicodeRanges" attribute
     */
    void unsetUnicodeRanges();

    /**
     * Gets the "CharSets" attribute
     */
    java.lang.String getCharSets();

    /**
     * Gets (as xml) the "CharSets" attribute
     */
    org.apache.xmlbeans.XmlString xgetCharSets();

    /**
     * True if has "CharSets" attribute
     */
    boolean isSetCharSets();

    /**
     * Sets the "CharSets" attribute
     */
    void setCharSets(java.lang.String charSets);

    /**
     * Sets (as xml) the "CharSets" attribute
     */
    void xsetCharSets(org.apache.xmlbeans.XmlString charSets);

    /**
     * Unsets the "CharSets" attribute
     */
    void unsetCharSets();

    /**
     * Gets the "Panos" attribute
     */
    java.lang.String getPanos();

    /**
     * Gets (as xml) the "Panos" attribute
     */
    org.apache.xmlbeans.XmlString xgetPanos();

    /**
     * True if has "Panos" attribute
     */
    boolean isSetPanos();

    /**
     * Sets the "Panos" attribute
     */
    void setPanos(java.lang.String panos);

    /**
     * Sets (as xml) the "Panos" attribute
     */
    void xsetPanos(org.apache.xmlbeans.XmlString panos);

    /**
     * Unsets the "Panos" attribute
     */
    void unsetPanos();

    /**
     * Gets the "Panose" attribute
     */
    java.lang.String getPanose();

    /**
     * Gets (as xml) the "Panose" attribute
     */
    org.apache.xmlbeans.XmlString xgetPanose();

    /**
     * True if has "Panose" attribute
     */
    boolean isSetPanose();

    /**
     * Sets the "Panose" attribute
     */
    void setPanose(java.lang.String panose);

    /**
     * Sets (as xml) the "Panose" attribute
     */
    void xsetPanose(org.apache.xmlbeans.XmlString panose);

    /**
     * Unsets the "Panose" attribute
     */
    void unsetPanose();

    /**
     * Gets the "Flags" attribute
     */
    long getFlags();

    /**
     * Gets (as xml) the "Flags" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetFlags();

    /**
     * True if has "Flags" attribute
     */
    boolean isSetFlags();

    /**
     * Sets the "Flags" attribute
     */
    void setFlags(long flags);

    /**
     * Sets (as xml) the "Flags" attribute
     */
    void xsetFlags(org.apache.xmlbeans.XmlUnsignedInt flags);

    /**
     * Unsets the "Flags" attribute
     */
    void unsetFlags();
}

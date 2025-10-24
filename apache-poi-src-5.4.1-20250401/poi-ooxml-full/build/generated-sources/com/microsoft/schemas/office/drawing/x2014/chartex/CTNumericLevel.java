/*
 * XML Type:  CT_NumericLevel
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_NumericLevel(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTNumericLevel extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctnumericlevel44eftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "pt" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericValue> getPtList();

    /**
     * Gets array of all "pt" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericValue[] getPtArray();

    /**
     * Gets ith "pt" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericValue getPtArray(int i);

    /**
     * Returns number of "pt" element
     */
    int sizeOfPtArray();

    /**
     * Sets array of all "pt" element
     */
    void setPtArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericValue[] ptArray);

    /**
     * Sets ith "pt" element
     */
    void setPtArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericValue pt);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "pt" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericValue insertNewPt(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "pt" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericValue addNewPt();

    /**
     * Removes the ith "pt" element
     */
    void removePt(int i);

    /**
     * Gets the "ptCount" attribute
     */
    long getPtCount();

    /**
     * Gets (as xml) the "ptCount" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetPtCount();

    /**
     * Sets the "ptCount" attribute
     */
    void setPtCount(long ptCount);

    /**
     * Sets (as xml) the "ptCount" attribute
     */
    void xsetPtCount(org.apache.xmlbeans.XmlUnsignedInt ptCount);

    /**
     * Gets the "formatCode" attribute
     */
    java.lang.String getFormatCode();

    /**
     * Gets (as xml) the "formatCode" attribute
     */
    org.apache.xmlbeans.XmlString xgetFormatCode();

    /**
     * True if has "formatCode" attribute
     */
    boolean isSetFormatCode();

    /**
     * Sets the "formatCode" attribute
     */
    void setFormatCode(java.lang.String formatCode);

    /**
     * Sets (as xml) the "formatCode" attribute
     */
    void xsetFormatCode(org.apache.xmlbeans.XmlString formatCode);

    /**
     * Unsets the "formatCode" attribute
     */
    void unsetFormatCode();

    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();

    /**
     * True if has "name" attribute
     */
    boolean isSetName();

    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);

    /**
     * Unsets the "name" attribute
     */
    void unsetName();
}

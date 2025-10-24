/*
 * XML Type:  CT_StringLevel
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTStringLevel
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_StringLevel(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTStringLevel extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTStringLevel> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctstringlevel379dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "pt" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTStringValue> getPtList();

    /**
     * Gets array of all "pt" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTStringValue[] getPtArray();

    /**
     * Gets ith "pt" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTStringValue getPtArray(int i);

    /**
     * Returns number of "pt" element
     */
    int sizeOfPtArray();

    /**
     * Sets array of all "pt" element
     */
    void setPtArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTStringValue[] ptArray);

    /**
     * Sets ith "pt" element
     */
    void setPtArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTStringValue pt);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "pt" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTStringValue insertNewPt(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "pt" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTStringValue addNewPt();

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

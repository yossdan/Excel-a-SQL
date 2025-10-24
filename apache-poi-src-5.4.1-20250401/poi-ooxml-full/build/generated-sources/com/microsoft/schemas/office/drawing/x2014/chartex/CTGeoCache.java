/*
 * XML Type:  CT_GeoCache
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoCache(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoCache extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeocache4d75type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "binary" elements
     */
    java.util.List<byte[]> getBinaryList();

    /**
     * Gets array of all "binary" elements
     */
    byte[][] getBinaryArray();

    /**
     * Gets ith "binary" element
     */
    byte[] getBinaryArray(int i);

    /**
     * Gets (as xml) a List of "binary" elements
     */
    java.util.List<org.apache.xmlbeans.XmlBase64Binary> xgetBinaryList();

    /**
     * Gets (as xml) array of all "binary" elements
     */
    org.apache.xmlbeans.XmlBase64Binary[] xgetBinaryArray();

    /**
     * Gets (as xml) ith "binary" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetBinaryArray(int i);

    /**
     * Returns number of "binary" element
     */
    int sizeOfBinaryArray();

    /**
     * Sets array of all "binary" element
     */
    void setBinaryArray(byte[][] binaryArray);

    /**
     * Sets ith "binary" element
     */
    void setBinaryArray(int i, byte[] binary);

    /**
     * Sets (as xml) array of all "binary" element
     */
    void xsetBinaryArray(org.apache.xmlbeans.XmlBase64Binary[] binaryArray);

    /**
     * Sets (as xml) ith "binary" element
     */
    void xsetBinaryArray(int i, org.apache.xmlbeans.XmlBase64Binary binary);

    /**
     * Inserts the value as the ith "binary" element
     */
    void insertBinary(int i, byte[] binary);

    /**
     * Appends the value as the last "binary" element
     */
    void addBinary(byte[] binary);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "binary" element
     */
    org.apache.xmlbeans.XmlBase64Binary insertNewBinary(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "binary" element
     */
    org.apache.xmlbeans.XmlBase64Binary addNewBinary();

    /**
     * Removes the ith "binary" element
     */
    void removeBinary(int i);

    /**
     * Gets a List of "clear" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTClear> getClearList();

    /**
     * Gets array of all "clear" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTClear[] getClearArray();

    /**
     * Gets ith "clear" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTClear getClearArray(int i);

    /**
     * Returns number of "clear" element
     */
    int sizeOfClearArray();

    /**
     * Sets array of all "clear" element
     */
    void setClearArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTClear[] clearArray);

    /**
     * Sets ith "clear" element
     */
    void setClearArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTClear clear);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "clear" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTClear insertNewClear(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "clear" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTClear addNewClear();

    /**
     * Removes the ith "clear" element
     */
    void removeClear(int i);

    /**
     * Gets the "provider" attribute
     */
    java.lang.String getProvider();

    /**
     * Gets (as xml) the "provider" attribute
     */
    org.apache.xmlbeans.XmlString xgetProvider();

    /**
     * Sets the "provider" attribute
     */
    void setProvider(java.lang.String provider);

    /**
     * Sets (as xml) the "provider" attribute
     */
    void xsetProvider(org.apache.xmlbeans.XmlString provider);
}

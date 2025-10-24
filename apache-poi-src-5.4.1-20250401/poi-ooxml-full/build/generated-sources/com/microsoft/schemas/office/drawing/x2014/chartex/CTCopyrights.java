/*
 * XML Type:  CT_Copyrights
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTCopyrights
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Copyrights(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTCopyrights extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTCopyrights> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcopyrightsf83atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "copyright" elements
     */
    java.util.List<java.lang.String> getCopyrightList();

    /**
     * Gets array of all "copyright" elements
     */
    java.lang.String[] getCopyrightArray();

    /**
     * Gets ith "copyright" element
     */
    java.lang.String getCopyrightArray(int i);

    /**
     * Gets (as xml) a List of "copyright" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetCopyrightList();

    /**
     * Gets (as xml) array of all "copyright" elements
     */
    org.apache.xmlbeans.XmlString[] xgetCopyrightArray();

    /**
     * Gets (as xml) ith "copyright" element
     */
    org.apache.xmlbeans.XmlString xgetCopyrightArray(int i);

    /**
     * Returns number of "copyright" element
     */
    int sizeOfCopyrightArray();

    /**
     * Sets array of all "copyright" element
     */
    void setCopyrightArray(java.lang.String[] copyrightArray);

    /**
     * Sets ith "copyright" element
     */
    void setCopyrightArray(int i, java.lang.String copyright);

    /**
     * Sets (as xml) array of all "copyright" element
     */
    void xsetCopyrightArray(org.apache.xmlbeans.XmlString[] copyrightArray);

    /**
     * Sets (as xml) ith "copyright" element
     */
    void xsetCopyrightArray(int i, org.apache.xmlbeans.XmlString copyright);

    /**
     * Inserts the value as the ith "copyright" element
     */
    void insertCopyright(int i, java.lang.String copyright);

    /**
     * Appends the value as the last "copyright" element
     */
    void addCopyright(java.lang.String copyright);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "copyright" element
     */
    org.apache.xmlbeans.XmlString insertNewCopyright(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "copyright" element
     */
    org.apache.xmlbeans.XmlString addNewCopyright();

    /**
     * Removes the ith "copyright" element
     */
    void removeCopyright(int i);
}

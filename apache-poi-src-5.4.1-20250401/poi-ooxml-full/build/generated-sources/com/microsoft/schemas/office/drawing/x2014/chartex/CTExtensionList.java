/*
 * XML Type:  CT_ExtensionList
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ExtensionList(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTExtensionList extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctextensionlist1e13type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ext" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension> getExtList();

    /**
     * Gets array of all "ext" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension[] getExtArray();

    /**
     * Gets ith "ext" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension getExtArray(int i);

    /**
     * Returns number of "ext" element
     */
    int sizeOfExtArray();

    /**
     * Sets array of all "ext" element
     */
    void setExtArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension[] extArray);

    /**
     * Sets ith "ext" element
     */
    void setExtArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension ext);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ext" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension insertNewExt(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ext" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension addNewExt();

    /**
     * Removes the ith "ext" element
     */
    void removeExt(int i);
}

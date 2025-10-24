/*
 * XML Type:  FaceNames_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.FaceNamesType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML FaceNames_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface FaceNamesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.FaceNamesType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "facenamestypeb920type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "FaceName" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.FaceNameType> getFaceNameList();

    /**
     * Gets array of all "FaceName" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.FaceNameType[] getFaceNameArray();

    /**
     * Gets ith "FaceName" element
     */
    com.microsoft.schemas.office.visio.x2012.main.FaceNameType getFaceNameArray(int i);

    /**
     * Returns number of "FaceName" element
     */
    int sizeOfFaceNameArray();

    /**
     * Sets array of all "FaceName" element
     */
    void setFaceNameArray(com.microsoft.schemas.office.visio.x2012.main.FaceNameType[] faceNameArray);

    /**
     * Sets ith "FaceName" element
     */
    void setFaceNameArray(int i, com.microsoft.schemas.office.visio.x2012.main.FaceNameType faceName);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FaceName" element
     */
    com.microsoft.schemas.office.visio.x2012.main.FaceNameType insertNewFaceName(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "FaceName" element
     */
    com.microsoft.schemas.office.visio.x2012.main.FaceNameType addNewFaceName();

    /**
     * Removes the ith "FaceName" element
     */
    void removeFaceName(int i);
}

/*
 * XML Type:  SnapAngles_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SnapAngles_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface SnapAnglesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "snapanglestype8f0ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "SnapAngle" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.SnapAngleType> getSnapAngleList();

    /**
     * Gets array of all "SnapAngle" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.SnapAngleType[] getSnapAngleArray();

    /**
     * Gets ith "SnapAngle" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SnapAngleType getSnapAngleArray(int i);

    /**
     * Returns number of "SnapAngle" element
     */
    int sizeOfSnapAngleArray();

    /**
     * Sets array of all "SnapAngle" element
     */
    void setSnapAngleArray(com.microsoft.schemas.office.visio.x2012.main.SnapAngleType[] snapAngleArray);

    /**
     * Sets ith "SnapAngle" element
     */
    void setSnapAngleArray(int i, com.microsoft.schemas.office.visio.x2012.main.SnapAngleType snapAngle);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SnapAngle" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SnapAngleType insertNewSnapAngle(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SnapAngle" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SnapAngleType addNewSnapAngle();

    /**
     * Removes the ith "SnapAngle" element
     */
    void removeSnapAngle(int i);
}

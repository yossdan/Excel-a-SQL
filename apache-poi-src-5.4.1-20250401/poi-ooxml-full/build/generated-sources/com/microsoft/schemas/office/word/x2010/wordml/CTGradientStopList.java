/*
 * XML Type:  CT_GradientStopList
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GradientStopList(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTGradientStopList extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgradientstoplistffd8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "gs" elements
     */
    java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop> getGsList();

    /**
     * Gets array of all "gs" elements
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop[] getGsArray();

    /**
     * Gets ith "gs" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop getGsArray(int i);

    /**
     * Returns number of "gs" element
     */
    int sizeOfGsArray();

    /**
     * Sets array of all "gs" element
     */
    void setGsArray(com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop[] gsArray);

    /**
     * Sets ith "gs" element
     */
    void setGsArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop gs);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "gs" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop insertNewGs(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "gs" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop addNewGs();

    /**
     * Removes the ith "gs" element
     */
    void removeGs(int i);
}

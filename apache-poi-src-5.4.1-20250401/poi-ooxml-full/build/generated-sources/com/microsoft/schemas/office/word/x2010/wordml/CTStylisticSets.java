/*
 * XML Type:  CT_StylisticSets
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTStylisticSets
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_StylisticSets(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTStylisticSets extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTStylisticSets> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctstylisticsetsba91type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "styleSet" elements
     */
    java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet> getStyleSetList();

    /**
     * Gets array of all "styleSet" elements
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet[] getStyleSetArray();

    /**
     * Gets ith "styleSet" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet getStyleSetArray(int i);

    /**
     * Returns number of "styleSet" element
     */
    int sizeOfStyleSetArray();

    /**
     * Sets array of all "styleSet" element
     */
    void setStyleSetArray(com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet[] styleSetArray);

    /**
     * Sets ith "styleSet" element
     */
    void setStyleSetArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet styleSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "styleSet" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet insertNewStyleSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "styleSet" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTStyleSet addNewStyleSet();

    /**
     * Removes the ith "styleSet" element
     */
    void removeStyleSet(int i);
}

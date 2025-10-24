/*
 * XML Type:  Extensions_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ExtensionsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Extensions_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface ExtensionsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.ExtensionsType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "extensionstype1ca5type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "CellDef" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.CellDefType> getCellDefList();

    /**
     * Gets array of all "CellDef" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.CellDefType[] getCellDefArray();

    /**
     * Gets ith "CellDef" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CellDefType getCellDefArray(int i);

    /**
     * Returns number of "CellDef" element
     */
    int sizeOfCellDefArray();

    /**
     * Sets array of all "CellDef" element
     */
    void setCellDefArray(com.microsoft.schemas.office.visio.x2012.main.CellDefType[] cellDefArray);

    /**
     * Sets ith "CellDef" element
     */
    void setCellDefArray(int i, com.microsoft.schemas.office.visio.x2012.main.CellDefType cellDef);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CellDef" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CellDefType insertNewCellDef(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CellDef" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CellDefType addNewCellDef();

    /**
     * Removes the ith "CellDef" element
     */
    void removeCellDef(int i);

    /**
     * Gets a List of "FunctionDef" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.FunctionDefType> getFunctionDefList();

    /**
     * Gets array of all "FunctionDef" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.FunctionDefType[] getFunctionDefArray();

    /**
     * Gets ith "FunctionDef" element
     */
    com.microsoft.schemas.office.visio.x2012.main.FunctionDefType getFunctionDefArray(int i);

    /**
     * Returns number of "FunctionDef" element
     */
    int sizeOfFunctionDefArray();

    /**
     * Sets array of all "FunctionDef" element
     */
    void setFunctionDefArray(com.microsoft.schemas.office.visio.x2012.main.FunctionDefType[] functionDefArray);

    /**
     * Sets ith "FunctionDef" element
     */
    void setFunctionDefArray(int i, com.microsoft.schemas.office.visio.x2012.main.FunctionDefType functionDef);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FunctionDef" element
     */
    com.microsoft.schemas.office.visio.x2012.main.FunctionDefType insertNewFunctionDef(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "FunctionDef" element
     */
    com.microsoft.schemas.office.visio.x2012.main.FunctionDefType addNewFunctionDef();

    /**
     * Removes the ith "FunctionDef" element
     */
    void removeFunctionDef(int i);

    /**
     * Gets a List of "SectionDef" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.SectionDefType> getSectionDefList();

    /**
     * Gets array of all "SectionDef" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.SectionDefType[] getSectionDefArray();

    /**
     * Gets ith "SectionDef" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SectionDefType getSectionDefArray(int i);

    /**
     * Returns number of "SectionDef" element
     */
    int sizeOfSectionDefArray();

    /**
     * Sets array of all "SectionDef" element
     */
    void setSectionDefArray(com.microsoft.schemas.office.visio.x2012.main.SectionDefType[] sectionDefArray);

    /**
     * Sets ith "SectionDef" element
     */
    void setSectionDefArray(int i, com.microsoft.schemas.office.visio.x2012.main.SectionDefType sectionDef);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SectionDef" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SectionDefType insertNewSectionDef(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SectionDef" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SectionDefType addNewSectionDef();

    /**
     * Removes the ith "SectionDef" element
     */
    void removeSectionDef(int i);
}

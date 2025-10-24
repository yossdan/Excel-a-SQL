/*
 * XML Type:  RowDef_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.RowDefType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RowDef_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface RowDefType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.RowDefType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "rowdeftype284etype");
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
}

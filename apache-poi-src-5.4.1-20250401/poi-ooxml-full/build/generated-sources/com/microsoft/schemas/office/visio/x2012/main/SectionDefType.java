/*
 * XML Type:  SectionDef_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.SectionDefType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SectionDef_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface SectionDefType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.SectionDefType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "sectiondeftype4f59type");
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
     * Gets the "RowDef" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RowDefType getRowDef();

    /**
     * True if has "RowDef" element
     */
    boolean isSetRowDef();

    /**
     * Sets the "RowDef" element
     */
    void setRowDef(com.microsoft.schemas.office.visio.x2012.main.RowDefType rowDef);

    /**
     * Appends and returns a new empty "RowDef" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RowDefType addNewRowDef();

    /**
     * Unsets the "RowDef" element
     */
    void unsetRowDef();

    /**
     * Gets the "N" attribute
     */
    java.lang.String getN();

    /**
     * Gets (as xml) the "N" attribute
     */
    org.apache.xmlbeans.XmlString xgetN();

    /**
     * Sets the "N" attribute
     */
    void setN(java.lang.String n);

    /**
     * Sets (as xml) the "N" attribute
     */
    void xsetN(org.apache.xmlbeans.XmlString n);

    /**
     * Gets the "T" attribute
     */
    java.lang.String getT();

    /**
     * Gets (as xml) the "T" attribute
     */
    org.apache.xmlbeans.XmlString xgetT();

    /**
     * True if has "T" attribute
     */
    boolean isSetT();

    /**
     * Sets the "T" attribute
     */
    void setT(java.lang.String t);

    /**
     * Sets (as xml) the "T" attribute
     */
    void xsetT(org.apache.xmlbeans.XmlString t);

    /**
     * Unsets the "T" attribute
     */
    void unsetT();

    /**
     * Gets the "S" attribute
     */
    short getS();

    /**
     * Gets (as xml) the "S" attribute
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetS();

    /**
     * True if has "S" attribute
     */
    boolean isSetS();

    /**
     * Sets the "S" attribute
     */
    void setS(short s);

    /**
     * Sets (as xml) the "S" attribute
     */
    void xsetS(org.apache.xmlbeans.XmlUnsignedByte s);

    /**
     * Unsets the "S" attribute
     */
    void unsetS();
}

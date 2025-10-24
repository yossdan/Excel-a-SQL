/*
 * XML Type:  PrimaryKey_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PrimaryKey_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface PrimaryKeyType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "primarykeytyped3dctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "RowKeyValue" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType> getRowKeyValueList();

    /**
     * Gets array of all "RowKeyValue" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType[] getRowKeyValueArray();

    /**
     * Gets ith "RowKeyValue" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType getRowKeyValueArray(int i);

    /**
     * Returns number of "RowKeyValue" element
     */
    int sizeOfRowKeyValueArray();

    /**
     * Sets array of all "RowKeyValue" element
     */
    void setRowKeyValueArray(com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType[] rowKeyValueArray);

    /**
     * Sets ith "RowKeyValue" element
     */
    void setRowKeyValueArray(int i, com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType rowKeyValue);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RowKeyValue" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType insertNewRowKeyValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RowKeyValue" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType addNewRowKeyValue();

    /**
     * Removes the ith "RowKeyValue" element
     */
    void removeRowKeyValue(int i);

    /**
     * Gets the "ColumnNameID" attribute
     */
    java.lang.String getColumnNameID();

    /**
     * Gets (as xml) the "ColumnNameID" attribute
     */
    org.apache.xmlbeans.XmlString xgetColumnNameID();

    /**
     * Sets the "ColumnNameID" attribute
     */
    void setColumnNameID(java.lang.String columnNameID);

    /**
     * Sets (as xml) the "ColumnNameID" attribute
     */
    void xsetColumnNameID(org.apache.xmlbeans.XmlString columnNameID);
}

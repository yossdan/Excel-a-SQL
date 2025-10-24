/*
 * XML Type:  DataColumns_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataColumnsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataColumns_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface DataColumnsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.DataColumnsType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "datacolumnstype35f8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "DataColumn" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.DataColumnType> getDataColumnList();

    /**
     * Gets array of all "DataColumn" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.DataColumnType[] getDataColumnArray();

    /**
     * Gets ith "DataColumn" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataColumnType getDataColumnArray(int i);

    /**
     * Returns number of "DataColumn" element
     */
    int sizeOfDataColumnArray();

    /**
     * Sets array of all "DataColumn" element
     */
    void setDataColumnArray(com.microsoft.schemas.office.visio.x2012.main.DataColumnType[] dataColumnArray);

    /**
     * Sets ith "DataColumn" element
     */
    void setDataColumnArray(int i, com.microsoft.schemas.office.visio.x2012.main.DataColumnType dataColumn);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataColumn" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataColumnType insertNewDataColumn(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataColumn" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataColumnType addNewDataColumn();

    /**
     * Removes the ith "DataColumn" element
     */
    void removeDataColumn(int i);

    /**
     * Gets the "SortColumn" attribute
     */
    java.lang.String getSortColumn();

    /**
     * Gets (as xml) the "SortColumn" attribute
     */
    org.apache.xmlbeans.XmlString xgetSortColumn();

    /**
     * True if has "SortColumn" attribute
     */
    boolean isSetSortColumn();

    /**
     * Sets the "SortColumn" attribute
     */
    void setSortColumn(java.lang.String sortColumn);

    /**
     * Sets (as xml) the "SortColumn" attribute
     */
    void xsetSortColumn(org.apache.xmlbeans.XmlString sortColumn);

    /**
     * Unsets the "SortColumn" attribute
     */
    void unsetSortColumn();

    /**
     * Gets the "SortAsc" attribute
     */
    boolean getSortAsc();

    /**
     * Gets (as xml) the "SortAsc" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSortAsc();

    /**
     * True if has "SortAsc" attribute
     */
    boolean isSetSortAsc();

    /**
     * Sets the "SortAsc" attribute
     */
    void setSortAsc(boolean sortAsc);

    /**
     * Sets (as xml) the "SortAsc" attribute
     */
    void xsetSortAsc(org.apache.xmlbeans.XmlBoolean sortAsc);

    /**
     * Unsets the "SortAsc" attribute
     */
    void unsetSortAsc();
}

/*
 * XML Type:  CT_DataLabelFieldTable
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_DataLabelFieldTable(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public interface CTDataLabelFieldTable extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdatalabelfieldtableff7dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "dlblFTEntry" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry> getDlblFTEntryList();

    /**
     * Gets array of all "dlblFTEntry" elements
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry[] getDlblFTEntryArray();

    /**
     * Gets ith "dlblFTEntry" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry getDlblFTEntryArray(int i);

    /**
     * Returns number of "dlblFTEntry" element
     */
    int sizeOfDlblFTEntryArray();

    /**
     * Sets array of all "dlblFTEntry" element
     */
    void setDlblFTEntryArray(com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry[] dlblFTEntryArray);

    /**
     * Sets ith "dlblFTEntry" element
     */
    void setDlblFTEntryArray(int i, com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry dlblFTEntry);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "dlblFTEntry" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry insertNewDlblFTEntry(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "dlblFTEntry" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry addNewDlblFTEntry();

    /**
     * Removes the ith "dlblFTEntry" element
     */
    void removeDlblFTEntry(int i);
}

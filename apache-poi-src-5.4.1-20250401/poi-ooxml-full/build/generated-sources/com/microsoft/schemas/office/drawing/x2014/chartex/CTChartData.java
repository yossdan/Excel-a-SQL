/*
 * XML Type:  CT_ChartData
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTChartData
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ChartData(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTChartData extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTChartData> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctchartdatac7c8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "externalData" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExternalData getExternalData();

    /**
     * True if has "externalData" element
     */
    boolean isSetExternalData();

    /**
     * Sets the "externalData" element
     */
    void setExternalData(com.microsoft.schemas.office.drawing.x2014.chartex.CTExternalData externalData);

    /**
     * Appends and returns a new empty "externalData" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExternalData addNewExternalData();

    /**
     * Unsets the "externalData" element
     */
    void unsetExternalData();

    /**
     * Gets a List of "data" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTData> getDataList();

    /**
     * Gets array of all "data" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTData[] getDataArray();

    /**
     * Gets ith "data" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTData getDataArray(int i);

    /**
     * Returns number of "data" element
     */
    int sizeOfDataArray();

    /**
     * Sets array of all "data" element
     */
    void setDataArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTData[] dataArray);

    /**
     * Sets ith "data" element
     */
    void setDataArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTData data);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "data" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTData insertNewData(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "data" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTData addNewData();

    /**
     * Removes the ith "data" element
     */
    void removeData(int i);

    /**
     * Gets the "extLst" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList getExtLst();

    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();

    /**
     * Sets the "extLst" element
     */
    void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst);

    /**
     * Appends and returns a new empty "extLst" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
}

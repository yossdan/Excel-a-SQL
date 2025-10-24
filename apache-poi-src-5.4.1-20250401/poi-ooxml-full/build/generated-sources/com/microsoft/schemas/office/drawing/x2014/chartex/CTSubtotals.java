/*
 * XML Type:  CT_Subtotals
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Subtotals(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTSubtotals extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsubtotals9261type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "idx" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex> getIdxList();

    /**
     * Gets array of all "idx" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex[] getIdxArray();

    /**
     * Gets ith "idx" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex getIdxArray(int i);

    /**
     * Returns number of "idx" element
     */
    int sizeOfIdxArray();

    /**
     * Sets array of all "idx" element
     */
    void setIdxArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex[] idxArray);

    /**
     * Sets ith "idx" element
     */
    void setIdxArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex idx);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "idx" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex insertNewIdx(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "idx" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex addNewIdx();

    /**
     * Removes the ith "idx" element
     */
    void removeIdx(int i);
}

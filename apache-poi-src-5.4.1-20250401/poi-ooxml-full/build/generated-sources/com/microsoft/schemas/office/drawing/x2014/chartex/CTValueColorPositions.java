/*
 * XML Type:  CT_ValueColorPositions
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ValueColorPositions(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTValueColorPositions extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctvaluecolorpositions6818type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "min" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition getMin();

    /**
     * True if has "min" element
     */
    boolean isSetMin();

    /**
     * Sets the "min" element
     */
    void setMin(com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition min);

    /**
     * Appends and returns a new empty "min" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition addNewMin();

    /**
     * Unsets the "min" element
     */
    void unsetMin();

    /**
     * Gets the "mid" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorMiddlePosition getMid();

    /**
     * True if has "mid" element
     */
    boolean isSetMid();

    /**
     * Sets the "mid" element
     */
    void setMid(com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorMiddlePosition mid);

    /**
     * Appends and returns a new empty "mid" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorMiddlePosition addNewMid();

    /**
     * Unsets the "mid" element
     */
    void unsetMid();

    /**
     * Gets the "max" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition getMax();

    /**
     * True if has "max" element
     */
    boolean isSetMax();

    /**
     * Sets the "max" element
     */
    void setMax(com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition max);

    /**
     * Appends and returns a new empty "max" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition addNewMax();

    /**
     * Unsets the "max" element
     */
    void unsetMax();

    /**
     * Gets the "count" attribute
     */
    int getCount();

    /**
     * Gets (as xml) the "count" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STValueColorPositionCount xgetCount();

    /**
     * True if has "count" attribute
     */
    boolean isSetCount();

    /**
     * Sets the "count" attribute
     */
    void setCount(int count);

    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(com.microsoft.schemas.office.drawing.x2014.chartex.STValueColorPositionCount count);

    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
}

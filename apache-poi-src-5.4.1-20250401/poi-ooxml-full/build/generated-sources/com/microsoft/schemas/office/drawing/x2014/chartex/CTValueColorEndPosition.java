/*
 * XML Type:  CT_ValueColorEndPosition
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ValueColorEndPosition(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTValueColorEndPosition extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctvaluecolorendpositionf4detype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "extremeValue" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtremeValueColorPosition getExtremeValue();

    /**
     * True if has "extremeValue" element
     */
    boolean isSetExtremeValue();

    /**
     * Sets the "extremeValue" element
     */
    void setExtremeValue(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtremeValueColorPosition extremeValue);

    /**
     * Appends and returns a new empty "extremeValue" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtremeValueColorPosition addNewExtremeValue();

    /**
     * Unsets the "extremeValue" element
     */
    void unsetExtremeValue();

    /**
     * Gets the "number" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberColorPosition getNumber();

    /**
     * True if has "number" element
     */
    boolean isSetNumber();

    /**
     * Sets the "number" element
     */
    void setNumber(com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberColorPosition number);

    /**
     * Appends and returns a new empty "number" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberColorPosition addNewNumber();

    /**
     * Unsets the "number" element
     */
    void unsetNumber();

    /**
     * Gets the "percent" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPercentageColorPosition getPercent();

    /**
     * True if has "percent" element
     */
    boolean isSetPercent();

    /**
     * Sets the "percent" element
     */
    void setPercent(com.microsoft.schemas.office.drawing.x2014.chartex.CTPercentageColorPosition percent);

    /**
     * Appends and returns a new empty "percent" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPercentageColorPosition addNewPercent();

    /**
     * Unsets the "percent" element
     */
    void unsetPercent();
}

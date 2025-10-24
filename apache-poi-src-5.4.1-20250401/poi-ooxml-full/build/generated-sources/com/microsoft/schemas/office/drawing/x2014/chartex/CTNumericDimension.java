/*
 * XML Type:  CT_NumericDimension
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_NumericDimension(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTNumericDimension extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctnumericdimension894dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "f" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula getF();

    /**
     * True if has "f" element
     */
    boolean isSetF();

    /**
     * Sets the "f" element
     */
    void setF(com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula f);

    /**
     * Appends and returns a new empty "f" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula addNewF();

    /**
     * Unsets the "f" element
     */
    void unsetF();

    /**
     * Gets the "nf" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula getNf();

    /**
     * True if has "nf" element
     */
    boolean isSetNf();

    /**
     * Sets the "nf" element
     */
    void setNf(com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula nf);

    /**
     * Appends and returns a new empty "nf" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula addNewNf();

    /**
     * Unsets the "nf" element
     */
    void unsetNf();

    /**
     * Gets a List of "lvl" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel> getLvlList();

    /**
     * Gets array of all "lvl" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel[] getLvlArray();

    /**
     * Gets ith "lvl" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel getLvlArray(int i);

    /**
     * Returns number of "lvl" element
     */
    int sizeOfLvlArray();

    /**
     * Sets array of all "lvl" element
     */
    void setLvlArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel[] lvlArray);

    /**
     * Sets ith "lvl" element
     */
    void setLvlArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel lvl);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "lvl" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel insertNewLvl(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "lvl" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel addNewLvl();

    /**
     * Removes the ith "lvl" element
     */
    void removeLvl(int i);

    /**
     * Gets the "type" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType.Enum getType();

    /**
     * Gets (as xml) the "type" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType xgetType();

    /**
     * Sets the "type" attribute
     */
    void setType(com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType.Enum type);

    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType type);
}

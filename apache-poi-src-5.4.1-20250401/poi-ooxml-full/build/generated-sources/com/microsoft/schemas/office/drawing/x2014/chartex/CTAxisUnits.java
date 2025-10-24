/*
 * XML Type:  CT_AxisUnits
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_AxisUnits(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTAxisUnits extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctaxisunitsa6e2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "unitsLabel" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnitsLabel getUnitsLabel();

    /**
     * True if has "unitsLabel" element
     */
    boolean isSetUnitsLabel();

    /**
     * Sets the "unitsLabel" element
     */
    void setUnitsLabel(com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnitsLabel unitsLabel);

    /**
     * Appends and returns a new empty "unitsLabel" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnitsLabel addNewUnitsLabel();

    /**
     * Unsets the "unitsLabel" element
     */
    void unsetUnitsLabel();

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

    /**
     * Gets the "unit" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit.Enum getUnit();

    /**
     * Gets (as xml) the "unit" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit xgetUnit();

    /**
     * True if has "unit" attribute
     */
    boolean isSetUnit();

    /**
     * Sets the "unit" attribute
     */
    void setUnit(com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit.Enum unit);

    /**
     * Sets (as xml) the "unit" attribute
     */
    void xsetUnit(com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit unit);

    /**
     * Unsets the "unit" attribute
     */
    void unsetUnit();
}

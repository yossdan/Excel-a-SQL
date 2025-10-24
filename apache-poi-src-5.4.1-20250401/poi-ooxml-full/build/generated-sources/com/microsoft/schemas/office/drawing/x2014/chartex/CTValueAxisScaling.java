/*
 * XML Type:  CT_ValueAxisScaling
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ValueAxisScaling(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTValueAxisScaling extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctvalueaxisscalingd731type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "max" attribute
     */
    java.lang.Object getMax();

    /**
     * Gets (as xml) the "max" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic xgetMax();

    /**
     * True if has "max" attribute
     */
    boolean isSetMax();

    /**
     * Sets the "max" attribute
     */
    void setMax(java.lang.Object max);

    /**
     * Sets (as xml) the "max" attribute
     */
    void xsetMax(com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic max);

    /**
     * Unsets the "max" attribute
     */
    void unsetMax();

    /**
     * Gets the "min" attribute
     */
    java.lang.Object getMin();

    /**
     * Gets (as xml) the "min" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic xgetMin();

    /**
     * True if has "min" attribute
     */
    boolean isSetMin();

    /**
     * Sets the "min" attribute
     */
    void setMin(java.lang.Object min);

    /**
     * Sets (as xml) the "min" attribute
     */
    void xsetMin(com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic min);

    /**
     * Unsets the "min" attribute
     */
    void unsetMin();

    /**
     * Gets the "majorUnit" attribute
     */
    java.lang.Object getMajorUnit();

    /**
     * Gets (as xml) the "majorUnit" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit xgetMajorUnit();

    /**
     * True if has "majorUnit" attribute
     */
    boolean isSetMajorUnit();

    /**
     * Sets the "majorUnit" attribute
     */
    void setMajorUnit(java.lang.Object majorUnit);

    /**
     * Sets (as xml) the "majorUnit" attribute
     */
    void xsetMajorUnit(com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit majorUnit);

    /**
     * Unsets the "majorUnit" attribute
     */
    void unsetMajorUnit();

    /**
     * Gets the "minorUnit" attribute
     */
    java.lang.Object getMinorUnit();

    /**
     * Gets (as xml) the "minorUnit" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit xgetMinorUnit();

    /**
     * True if has "minorUnit" attribute
     */
    boolean isSetMinorUnit();

    /**
     * Sets the "minorUnit" attribute
     */
    void setMinorUnit(java.lang.Object minorUnit);

    /**
     * Sets (as xml) the "minorUnit" attribute
     */
    void xsetMinorUnit(com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit minorUnit);

    /**
     * Unsets the "minorUnit" attribute
     */
    void unsetMinorUnit();
}

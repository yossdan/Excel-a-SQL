/*
 * XML Type:  CT_DataLabelVisibilities
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelVisibilities
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_DataLabelVisibilities(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTDataLabelVisibilities extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelVisibilities> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdatalabelvisibilitiesdf76type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "seriesName" attribute
     */
    boolean getSeriesName();

    /**
     * Gets (as xml) the "seriesName" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSeriesName();

    /**
     * True if has "seriesName" attribute
     */
    boolean isSetSeriesName();

    /**
     * Sets the "seriesName" attribute
     */
    void setSeriesName(boolean seriesName);

    /**
     * Sets (as xml) the "seriesName" attribute
     */
    void xsetSeriesName(org.apache.xmlbeans.XmlBoolean seriesName);

    /**
     * Unsets the "seriesName" attribute
     */
    void unsetSeriesName();

    /**
     * Gets the "categoryName" attribute
     */
    boolean getCategoryName();

    /**
     * Gets (as xml) the "categoryName" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCategoryName();

    /**
     * True if has "categoryName" attribute
     */
    boolean isSetCategoryName();

    /**
     * Sets the "categoryName" attribute
     */
    void setCategoryName(boolean categoryName);

    /**
     * Sets (as xml) the "categoryName" attribute
     */
    void xsetCategoryName(org.apache.xmlbeans.XmlBoolean categoryName);

    /**
     * Unsets the "categoryName" attribute
     */
    void unsetCategoryName();

    /**
     * Gets the "value" attribute
     */
    boolean getValue();

    /**
     * Gets (as xml) the "value" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetValue();

    /**
     * True if has "value" attribute
     */
    boolean isSetValue();

    /**
     * Sets the "value" attribute
     */
    void setValue(boolean value);

    /**
     * Sets (as xml) the "value" attribute
     */
    void xsetValue(org.apache.xmlbeans.XmlBoolean value);

    /**
     * Unsets the "value" attribute
     */
    void unsetValue();
}

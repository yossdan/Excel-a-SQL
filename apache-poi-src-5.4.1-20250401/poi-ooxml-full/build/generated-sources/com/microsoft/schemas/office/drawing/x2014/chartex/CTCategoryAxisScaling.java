/*
 * XML Type:  CT_CategoryAxisScaling
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_CategoryAxisScaling(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTCategoryAxisScaling extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcategoryaxisscalinge968type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "gapWidth" attribute
     */
    java.lang.Object getGapWidth();

    /**
     * Gets (as xml) the "gapWidth" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STGapWidthRatio xgetGapWidth();

    /**
     * True if has "gapWidth" attribute
     */
    boolean isSetGapWidth();

    /**
     * Sets the "gapWidth" attribute
     */
    void setGapWidth(java.lang.Object gapWidth);

    /**
     * Sets (as xml) the "gapWidth" attribute
     */
    void xsetGapWidth(com.microsoft.schemas.office.drawing.x2014.chartex.STGapWidthRatio gapWidth);

    /**
     * Unsets the "gapWidth" attribute
     */
    void unsetGapWidth();
}

/*
 * XML Type:  CT_SeriesDataLabelsRange
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_SeriesDataLabelsRange(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public interface CTSeriesDataLabelsRange extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctseriesdatalabelsrange805etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "f" element
     */
    java.lang.String getF();

    /**
     * Gets (as xml) the "f" element
     */
    org.apache.xmlbeans.XmlString xgetF();

    /**
     * Sets the "f" element
     */
    void setF(java.lang.String f);

    /**
     * Sets (as xml) the "f" element
     */
    void xsetF(org.apache.xmlbeans.XmlString f);

    /**
     * Gets the "dlblRangeCache" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData getDlblRangeCache();

    /**
     * True if has "dlblRangeCache" element
     */
    boolean isSetDlblRangeCache();

    /**
     * Sets the "dlblRangeCache" element
     */
    void setDlblRangeCache(org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData dlblRangeCache);

    /**
     * Appends and returns a new empty "dlblRangeCache" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData addNewDlblRangeCache();

    /**
     * Unsets the "dlblRangeCache" element
     */
    void unsetDlblRangeCache();
}

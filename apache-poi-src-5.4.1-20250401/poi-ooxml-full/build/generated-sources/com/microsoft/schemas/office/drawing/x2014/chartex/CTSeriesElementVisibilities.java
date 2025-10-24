/*
 * XML Type:  CT_SeriesElementVisibilities
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_SeriesElementVisibilities(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTSeriesElementVisibilities extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctserieselementvisibilities3abbtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "connectorLines" attribute
     */
    boolean getConnectorLines();

    /**
     * Gets (as xml) the "connectorLines" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetConnectorLines();

    /**
     * True if has "connectorLines" attribute
     */
    boolean isSetConnectorLines();

    /**
     * Sets the "connectorLines" attribute
     */
    void setConnectorLines(boolean connectorLines);

    /**
     * Sets (as xml) the "connectorLines" attribute
     */
    void xsetConnectorLines(org.apache.xmlbeans.XmlBoolean connectorLines);

    /**
     * Unsets the "connectorLines" attribute
     */
    void unsetConnectorLines();

    /**
     * Gets the "meanLine" attribute
     */
    boolean getMeanLine();

    /**
     * Gets (as xml) the "meanLine" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMeanLine();

    /**
     * True if has "meanLine" attribute
     */
    boolean isSetMeanLine();

    /**
     * Sets the "meanLine" attribute
     */
    void setMeanLine(boolean meanLine);

    /**
     * Sets (as xml) the "meanLine" attribute
     */
    void xsetMeanLine(org.apache.xmlbeans.XmlBoolean meanLine);

    /**
     * Unsets the "meanLine" attribute
     */
    void unsetMeanLine();

    /**
     * Gets the "meanMarker" attribute
     */
    boolean getMeanMarker();

    /**
     * Gets (as xml) the "meanMarker" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMeanMarker();

    /**
     * True if has "meanMarker" attribute
     */
    boolean isSetMeanMarker();

    /**
     * Sets the "meanMarker" attribute
     */
    void setMeanMarker(boolean meanMarker);

    /**
     * Sets (as xml) the "meanMarker" attribute
     */
    void xsetMeanMarker(org.apache.xmlbeans.XmlBoolean meanMarker);

    /**
     * Unsets the "meanMarker" attribute
     */
    void unsetMeanMarker();

    /**
     * Gets the "nonoutliers" attribute
     */
    boolean getNonoutliers();

    /**
     * Gets (as xml) the "nonoutliers" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetNonoutliers();

    /**
     * True if has "nonoutliers" attribute
     */
    boolean isSetNonoutliers();

    /**
     * Sets the "nonoutliers" attribute
     */
    void setNonoutliers(boolean nonoutliers);

    /**
     * Sets (as xml) the "nonoutliers" attribute
     */
    void xsetNonoutliers(org.apache.xmlbeans.XmlBoolean nonoutliers);

    /**
     * Unsets the "nonoutliers" attribute
     */
    void unsetNonoutliers();

    /**
     * Gets the "outliers" attribute
     */
    boolean getOutliers();

    /**
     * Gets (as xml) the "outliers" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetOutliers();

    /**
     * True if has "outliers" attribute
     */
    boolean isSetOutliers();

    /**
     * Sets the "outliers" attribute
     */
    void setOutliers(boolean outliers);

    /**
     * Sets (as xml) the "outliers" attribute
     */
    void xsetOutliers(org.apache.xmlbeans.XmlBoolean outliers);

    /**
     * Unsets the "outliers" attribute
     */
    void unsetOutliers();
}

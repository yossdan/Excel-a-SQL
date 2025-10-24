/*
 * XML Type:  CT_SeriesLayoutProperties
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_SeriesLayoutProperties(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTSeriesLayoutProperties extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctserieslayoutpropertiese9b2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "parentLabelLayout" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTParentLabelLayout getParentLabelLayout();

    /**
     * True if has "parentLabelLayout" element
     */
    boolean isSetParentLabelLayout();

    /**
     * Sets the "parentLabelLayout" element
     */
    void setParentLabelLayout(com.microsoft.schemas.office.drawing.x2014.chartex.CTParentLabelLayout parentLabelLayout);

    /**
     * Appends and returns a new empty "parentLabelLayout" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTParentLabelLayout addNewParentLabelLayout();

    /**
     * Unsets the "parentLabelLayout" element
     */
    void unsetParentLabelLayout();

    /**
     * Gets the "regionLabelLayout" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTRegionLabelLayout getRegionLabelLayout();

    /**
     * True if has "regionLabelLayout" element
     */
    boolean isSetRegionLabelLayout();

    /**
     * Sets the "regionLabelLayout" element
     */
    void setRegionLabelLayout(com.microsoft.schemas.office.drawing.x2014.chartex.CTRegionLabelLayout regionLabelLayout);

    /**
     * Appends and returns a new empty "regionLabelLayout" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTRegionLabelLayout addNewRegionLabelLayout();

    /**
     * Unsets the "regionLabelLayout" element
     */
    void unsetRegionLabelLayout();

    /**
     * Gets the "visibility" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities getVisibility();

    /**
     * True if has "visibility" element
     */
    boolean isSetVisibility();

    /**
     * Sets the "visibility" element
     */
    void setVisibility(com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities visibility);

    /**
     * Appends and returns a new empty "visibility" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities addNewVisibility();

    /**
     * Unsets the "visibility" element
     */
    void unsetVisibility();

    /**
     * Gets the "aggregation" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAggregation getAggregation();

    /**
     * True if has "aggregation" element
     */
    boolean isSetAggregation();

    /**
     * Sets the "aggregation" element
     */
    void setAggregation(com.microsoft.schemas.office.drawing.x2014.chartex.CTAggregation aggregation);

    /**
     * Appends and returns a new empty "aggregation" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTAggregation addNewAggregation();

    /**
     * Unsets the "aggregation" element
     */
    void unsetAggregation();

    /**
     * Gets the "binning" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning getBinning();

    /**
     * True if has "binning" element
     */
    boolean isSetBinning();

    /**
     * Sets the "binning" element
     */
    void setBinning(com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning binning);

    /**
     * Appends and returns a new empty "binning" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning addNewBinning();

    /**
     * Unsets the "binning" element
     */
    void unsetBinning();

    /**
     * Gets the "geography" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography getGeography();

    /**
     * True if has "geography" element
     */
    boolean isSetGeography();

    /**
     * Sets the "geography" element
     */
    void setGeography(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography geography);

    /**
     * Appends and returns a new empty "geography" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography addNewGeography();

    /**
     * Unsets the "geography" element
     */
    void unsetGeography();

    /**
     * Gets the "statistics" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics getStatistics();

    /**
     * True if has "statistics" element
     */
    boolean isSetStatistics();

    /**
     * Sets the "statistics" element
     */
    void setStatistics(com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics statistics);

    /**
     * Appends and returns a new empty "statistics" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics addNewStatistics();

    /**
     * Unsets the "statistics" element
     */
    void unsetStatistics();

    /**
     * Gets the "subtotals" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals getSubtotals();

    /**
     * True if has "subtotals" element
     */
    boolean isSetSubtotals();

    /**
     * Sets the "subtotals" element
     */
    void setSubtotals(com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals subtotals);

    /**
     * Appends and returns a new empty "subtotals" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals addNewSubtotals();

    /**
     * Unsets the "subtotals" element
     */
    void unsetSubtotals();

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
}

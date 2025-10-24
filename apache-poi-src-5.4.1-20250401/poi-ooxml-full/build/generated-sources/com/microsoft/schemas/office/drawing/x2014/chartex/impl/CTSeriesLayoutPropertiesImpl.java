/*
 * XML Type:  CT_SeriesLayoutProperties
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_SeriesLayoutProperties(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTSeriesLayoutPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties {
    private static final long serialVersionUID = 1L;

    public CTSeriesLayoutPropertiesImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "parentLabelLayout"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "regionLabelLayout"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "visibility"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "aggregation"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "binning"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geography"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "statistics"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "subtotals"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "extLst"),
    };


    /**
     * Gets the "parentLabelLayout" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTParentLabelLayout getParentLabelLayout() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTParentLabelLayout target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTParentLabelLayout)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "parentLabelLayout" element
     */
    @Override
    public boolean isSetParentLabelLayout() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "parentLabelLayout" element
     */
    @Override
    public void setParentLabelLayout(com.microsoft.schemas.office.drawing.x2014.chartex.CTParentLabelLayout parentLabelLayout) {
        generatedSetterHelperImpl(parentLabelLayout, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "parentLabelLayout" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTParentLabelLayout addNewParentLabelLayout() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTParentLabelLayout target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTParentLabelLayout)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "parentLabelLayout" element
     */
    @Override
    public void unsetParentLabelLayout() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "regionLabelLayout" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTRegionLabelLayout getRegionLabelLayout() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTRegionLabelLayout target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTRegionLabelLayout)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "regionLabelLayout" element
     */
    @Override
    public boolean isSetRegionLabelLayout() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "regionLabelLayout" element
     */
    @Override
    public void setRegionLabelLayout(com.microsoft.schemas.office.drawing.x2014.chartex.CTRegionLabelLayout regionLabelLayout) {
        generatedSetterHelperImpl(regionLabelLayout, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "regionLabelLayout" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTRegionLabelLayout addNewRegionLabelLayout() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTRegionLabelLayout target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTRegionLabelLayout)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "regionLabelLayout" element
     */
    @Override
    public void unsetRegionLabelLayout() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "visibility" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities getVisibility() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "visibility" element
     */
    @Override
    public boolean isSetVisibility() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "visibility" element
     */
    @Override
    public void setVisibility(com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities visibility) {
        generatedSetterHelperImpl(visibility, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "visibility" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities addNewVisibility() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "visibility" element
     */
    @Override
    public void unsetVisibility() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "aggregation" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAggregation getAggregation() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTAggregation target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTAggregation)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "aggregation" element
     */
    @Override
    public boolean isSetAggregation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "aggregation" element
     */
    @Override
    public void setAggregation(com.microsoft.schemas.office.drawing.x2014.chartex.CTAggregation aggregation) {
        generatedSetterHelperImpl(aggregation, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "aggregation" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAggregation addNewAggregation() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTAggregation target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTAggregation)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "aggregation" element
     */
    @Override
    public void unsetAggregation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "binning" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning getBinning() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "binning" element
     */
    @Override
    public boolean isSetBinning() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "binning" element
     */
    @Override
    public void setBinning(com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning binning) {
        generatedSetterHelperImpl(binning, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "binning" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning addNewBinning() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "binning" element
     */
    @Override
    public void unsetBinning() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "geography" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography getGeography() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geography" element
     */
    @Override
    public boolean isSetGeography() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "geography" element
     */
    @Override
    public void setGeography(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography geography) {
        generatedSetterHelperImpl(geography, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geography" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography addNewGeography() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "geography" element
     */
    @Override
    public void unsetGeography() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "statistics" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics getStatistics() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "statistics" element
     */
    @Override
    public boolean isSetStatistics() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "statistics" element
     */
    @Override
    public void setStatistics(com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics statistics) {
        generatedSetterHelperImpl(statistics, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "statistics" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics addNewStatistics() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "statistics" element
     */
    @Override
    public void unsetStatistics() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "subtotals" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals getSubtotals() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "subtotals" element
     */
    @Override
    public boolean isSetSubtotals() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "subtotals" element
     */
    @Override
    public void setSubtotals(com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals subtotals) {
        generatedSetterHelperImpl(subtotals, PROPERTY_QNAME[7], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "subtotals" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals addNewSubtotals() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotals)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Unsets the "subtotals" element
     */
    @Override
    public void unsetSubtotals() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList getExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[8], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }
}

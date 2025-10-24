/*
 * XML Type:  CT_PlotAreaRegion
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_PlotAreaRegion(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTPlotAreaRegionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion {
    private static final long serialVersionUID = 1L;

    public CTPlotAreaRegionImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "plotSurface"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "series"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "extLst"),
    };


    /**
     * Gets the "plotSurface" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotSurface getPlotSurface() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotSurface target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotSurface)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "plotSurface" element
     */
    @Override
    public boolean isSetPlotSurface() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "plotSurface" element
     */
    @Override
    public void setPlotSurface(com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotSurface plotSurface) {
        generatedSetterHelperImpl(plotSurface, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "plotSurface" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotSurface addNewPlotSurface() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotSurface target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotSurface)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "plotSurface" element
     */
    @Override
    public void unsetPlotSurface() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "series" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries> getSeriesList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSeriesArray,
                this::setSeriesArray,
                this::insertNewSeries,
                this::removeSeries,
                this::sizeOfSeriesArray
            );
        }
    }

    /**
     * Gets array of all "series" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries[] getSeriesArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries[0]);
    }

    /**
     * Gets ith "series" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries getSeriesArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "series" element
     */
    @Override
    public int sizeOfSeriesArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "series" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSeriesArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries[] seriesArray) {
        check_orphaned();
        arraySetterHelper(seriesArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "series" element
     */
    @Override
    public void setSeriesArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries series) {
        generatedSetterHelperImpl(series, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "series" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries insertNewSeries(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "series" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries addNewSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "series" element
     */
    @Override
    public void removeSeries(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
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
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().find_element_user(PROPERTY_QNAME[2], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().add_element_user(PROPERTY_QNAME[2]);
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
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}

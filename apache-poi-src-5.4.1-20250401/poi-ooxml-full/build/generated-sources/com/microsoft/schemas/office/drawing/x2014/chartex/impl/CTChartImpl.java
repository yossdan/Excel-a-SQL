/*
 * XML Type:  CT_Chart
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTChart
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Chart(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTChartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTChart {
    private static final long serialVersionUID = 1L;

    public CTChartImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "title"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "plotArea"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "legend"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "extLst"),
    };


    /**
     * Gets the "title" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTChartTitle getTitle() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTChartTitle target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTChartTitle)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "title" element
     */
    @Override
    public boolean isSetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "title" element
     */
    @Override
    public void setTitle(com.microsoft.schemas.office.drawing.x2014.chartex.CTChartTitle title) {
        generatedSetterHelperImpl(title, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "title" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTChartTitle addNewTitle() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTChartTitle target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTChartTitle)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "title" element
     */
    @Override
    public void unsetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "plotArea" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea getPlotArea() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "plotArea" element
     */
    @Override
    public void setPlotArea(com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea plotArea) {
        generatedSetterHelperImpl(plotArea, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "plotArea" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea addNewPlotArea() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Gets the "legend" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTLegend getLegend() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTLegend target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTLegend)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "legend" element
     */
    @Override
    public boolean isSetLegend() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "legend" element
     */
    @Override
    public void setLegend(com.microsoft.schemas.office.drawing.x2014.chartex.CTLegend legend) {
        generatedSetterHelperImpl(legend, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "legend" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTLegend addNewLegend() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTLegend target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTLegend)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "legend" element
     */
    @Override
    public void unsetLegend() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
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
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().find_element_user(PROPERTY_QNAME[3], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().add_element_user(PROPERTY_QNAME[3]);
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
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }
}

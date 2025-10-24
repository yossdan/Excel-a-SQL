/*
 * XML Type:  CT_SeriesDataLabelsRange
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_SeriesDataLabelsRange(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public class CTSeriesDataLabelsRangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange {
    private static final long serialVersionUID = 1L;

    public CTSeriesDataLabelsRangeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "f"),
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "dlblRangeCache"),
    };


    /**
     * Gets the "f" element
     */
    @Override
    public java.lang.String getF() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "f" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetF() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "f" element
     */
    @Override
    public void setF(java.lang.String f) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(f);
        }
    }

    /**
     * Sets (as xml) the "f" element
     */
    @Override
    public void xsetF(org.apache.xmlbeans.XmlString f) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(f);
        }
    }

    /**
     * Gets the "dlblRangeCache" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData getDlblRangeCache() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "dlblRangeCache" element
     */
    @Override
    public boolean isSetDlblRangeCache() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "dlblRangeCache" element
     */
    @Override
    public void setDlblRangeCache(org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData dlblRangeCache) {
        generatedSetterHelperImpl(dlblRangeCache, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "dlblRangeCache" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData addNewDlblRangeCache() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "dlblRangeCache" element
     */
    @Override
    public void unsetDlblRangeCache() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}

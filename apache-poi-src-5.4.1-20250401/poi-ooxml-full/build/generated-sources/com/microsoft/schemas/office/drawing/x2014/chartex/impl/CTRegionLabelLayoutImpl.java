/*
 * XML Type:  CT_RegionLabelLayout
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTRegionLabelLayout
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_RegionLabelLayout(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTRegionLabelLayoutImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTRegionLabelLayout {
    private static final long serialVersionUID = 1L;

    public CTRegionLabelLayoutImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "val"),
    };


    /**
     * Gets the "val" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STRegionLabelLayout.Enum getVal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (com.microsoft.schemas.office.drawing.x2014.chartex.STRegionLabelLayout.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "val" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STRegionLabelLayout xgetVal() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STRegionLabelLayout target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STRegionLabelLayout)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "val" attribute
     */
    @Override
    public void setVal(com.microsoft.schemas.office.drawing.x2014.chartex.STRegionLabelLayout.Enum val) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(val);
        }
    }

    /**
     * Sets (as xml) the "val" attribute
     */
    @Override
    public void xsetVal(com.microsoft.schemas.office.drawing.x2014.chartex.STRegionLabelLayout val) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STRegionLabelLayout target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STRegionLabelLayout)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STRegionLabelLayout)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(val);
        }
    }
}

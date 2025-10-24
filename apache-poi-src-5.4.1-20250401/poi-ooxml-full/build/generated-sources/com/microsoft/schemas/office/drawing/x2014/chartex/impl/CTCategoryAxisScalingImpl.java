/*
 * XML Type:  CT_CategoryAxisScaling
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_CategoryAxisScaling(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTCategoryAxisScalingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling {
    private static final long serialVersionUID = 1L;

    public CTCategoryAxisScalingImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "gapWidth"),
    };


    /**
     * Gets the "gapWidth" attribute
     */
    @Override
    public java.lang.Object getGapWidth() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "gapWidth" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STGapWidthRatio xgetGapWidth() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STGapWidthRatio target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STGapWidthRatio)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "gapWidth" attribute
     */
    @Override
    public boolean isSetGapWidth() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "gapWidth" attribute
     */
    @Override
    public void setGapWidth(java.lang.Object gapWidth) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setObjectValue(gapWidth);
        }
    }

    /**
     * Sets (as xml) the "gapWidth" attribute
     */
    @Override
    public void xsetGapWidth(com.microsoft.schemas.office.drawing.x2014.chartex.STGapWidthRatio gapWidth) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STGapWidthRatio target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STGapWidthRatio)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STGapWidthRatio)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(gapWidth);
        }
    }

    /**
     * Unsets the "gapWidth" attribute
     */
    @Override
    public void unsetGapWidth() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

/*
 * XML Type:  CT_ValueColorPositions
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_ValueColorPositions(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTValueColorPositionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions {
    private static final long serialVersionUID = 1L;

    public CTValueColorPositionsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "min"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "mid"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "max"),
        new QName("", "count"),
    };


    /**
     * Gets the "min" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition getMin() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "min" element
     */
    @Override
    public boolean isSetMin() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "min" element
     */
    @Override
    public void setMin(com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition min) {
        generatedSetterHelperImpl(min, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "min" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition addNewMin() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "min" element
     */
    @Override
    public void unsetMin() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "mid" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorMiddlePosition getMid() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorMiddlePosition target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorMiddlePosition)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "mid" element
     */
    @Override
    public boolean isSetMid() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "mid" element
     */
    @Override
    public void setMid(com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorMiddlePosition mid) {
        generatedSetterHelperImpl(mid, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "mid" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorMiddlePosition addNewMid() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorMiddlePosition target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorMiddlePosition)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "mid" element
     */
    @Override
    public void unsetMid() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "max" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition getMax() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "max" element
     */
    @Override
    public boolean isSetMax() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "max" element
     */
    @Override
    public void setMax(com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition max) {
        generatedSetterHelperImpl(max, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "max" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition addNewMax() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorEndPosition)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "max" element
     */
    @Override
    public void unsetMax() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "count" attribute
     */
    @Override
    public int getCount() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "count" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STValueColorPositionCount xgetCount() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STValueColorPositionCount target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STValueColorPositionCount)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STValueColorPositionCount)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return target;
        }
    }

    /**
     * True if has "count" attribute
     */
    @Override
    public boolean isSetCount() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "count" attribute
     */
    @Override
    public void setCount(int count) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setIntValue(count);
        }
    }

    /**
     * Sets (as xml) the "count" attribute
     */
    @Override
    public void xsetCount(com.microsoft.schemas.office.drawing.x2014.chartex.STValueColorPositionCount count) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STValueColorPositionCount target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STValueColorPositionCount)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STValueColorPositionCount)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(count);
        }
    }

    /**
     * Unsets the "count" attribute
     */
    @Override
    public void unsetCount() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }
}

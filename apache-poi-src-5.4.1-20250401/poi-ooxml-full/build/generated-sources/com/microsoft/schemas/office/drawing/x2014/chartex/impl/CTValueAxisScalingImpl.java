/*
 * XML Type:  CT_ValueAxisScaling
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_ValueAxisScaling(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTValueAxisScalingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling {
    private static final long serialVersionUID = 1L;

    public CTValueAxisScalingImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "max"),
        new QName("", "min"),
        new QName("", "majorUnit"),
        new QName("", "minorUnit"),
    };


    /**
     * Gets the "max" attribute
     */
    @Override
    public java.lang.Object getMax() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "max" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic xgetMax() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "max" attribute
     */
    @Override
    public boolean isSetMax() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "max" attribute
     */
    @Override
    public void setMax(java.lang.Object max) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setObjectValue(max);
        }
    }

    /**
     * Sets (as xml) the "max" attribute
     */
    @Override
    public void xsetMax(com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic max) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(max);
        }
    }

    /**
     * Unsets the "max" attribute
     */
    @Override
    public void unsetMax() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "min" attribute
     */
    @Override
    public java.lang.Object getMin() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "min" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic xgetMin() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "min" attribute
     */
    @Override
    public boolean isSetMin() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "min" attribute
     */
    @Override
    public void setMin(java.lang.Object min) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setObjectValue(min);
        }
    }

    /**
     * Sets (as xml) the "min" attribute
     */
    @Override
    public void xsetMin(com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic min) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(min);
        }
    }

    /**
     * Unsets the "min" attribute
     */
    @Override
    public void unsetMin() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "majorUnit" attribute
     */
    @Override
    public java.lang.Object getMajorUnit() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "majorUnit" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit xgetMajorUnit() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "majorUnit" attribute
     */
    @Override
    public boolean isSetMajorUnit() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "majorUnit" attribute
     */
    @Override
    public void setMajorUnit(java.lang.Object majorUnit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setObjectValue(majorUnit);
        }
    }

    /**
     * Sets (as xml) the "majorUnit" attribute
     */
    @Override
    public void xsetMajorUnit(com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit majorUnit) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(majorUnit);
        }
    }

    /**
     * Unsets the "majorUnit" attribute
     */
    @Override
    public void unsetMajorUnit() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "minorUnit" attribute
     */
    @Override
    public java.lang.Object getMinorUnit() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "minorUnit" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit xgetMinorUnit() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "minorUnit" attribute
     */
    @Override
    public boolean isSetMinorUnit() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "minorUnit" attribute
     */
    @Override
    public void setMinorUnit(java.lang.Object minorUnit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setObjectValue(minorUnit);
        }
    }

    /**
     * Sets (as xml) the "minorUnit" attribute
     */
    @Override
    public void xsetMinorUnit(com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit minorUnit) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(minorUnit);
        }
    }

    /**
     * Unsets the "minorUnit" attribute
     */
    @Override
    public void unsetMinorUnit() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }
}

/*
 * XML Type:  CT_Binning
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Binning(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTBinningImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning {
    private static final long serialVersionUID = 1L;

    public CTBinningImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "binSize"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "binCount"),
        new QName("", "intervalClosed"),
        new QName("", "underflow"),
        new QName("", "overflow"),
    };


    /**
     * Gets the "binSize" element
     */
    @Override
    public double getBinSize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "binSize" element
     */
    @Override
    public org.apache.xmlbeans.XmlDouble xgetBinSize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "binSize" element
     */
    @Override
    public boolean isSetBinSize() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "binSize" element
     */
    @Override
    public void setBinSize(double binSize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setDoubleValue(binSize);
        }
    }

    /**
     * Sets (as xml) the "binSize" element
     */
    @Override
    public void xsetBinSize(org.apache.xmlbeans.XmlDouble binSize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(binSize);
        }
    }

    /**
     * Unsets the "binSize" element
     */
    @Override
    public void unsetBinSize() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "binCount" element
     */
    @Override
    public long getBinCount() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "binCount" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetBinCount() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "binCount" element
     */
    @Override
    public boolean isSetBinCount() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "binCount" element
     */
    @Override
    public void setBinCount(long binCount) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setLongValue(binCount);
        }
    }

    /**
     * Sets (as xml) the "binCount" element
     */
    @Override
    public void xsetBinCount(org.apache.xmlbeans.XmlUnsignedInt binCount) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(binCount);
        }
    }

    /**
     * Unsets the "binCount" element
     */
    @Override
    public void unsetBinCount() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "intervalClosed" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide.Enum getIntervalClosed() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : (com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "intervalClosed" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide xgetIntervalClosed() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "intervalClosed" attribute
     */
    @Override
    public boolean isSetIntervalClosed() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "intervalClosed" attribute
     */
    @Override
    public void setIntervalClosed(com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide.Enum intervalClosed) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setEnumValue(intervalClosed);
        }
    }

    /**
     * Sets (as xml) the "intervalClosed" attribute
     */
    @Override
    public void xsetIntervalClosed(com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide intervalClosed) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(intervalClosed);
        }
    }

    /**
     * Unsets the "intervalClosed" attribute
     */
    @Override
    public void unsetIntervalClosed() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "underflow" attribute
     */
    @Override
    public java.lang.Object getUnderflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "underflow" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic xgetUnderflow() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "underflow" attribute
     */
    @Override
    public boolean isSetUnderflow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "underflow" attribute
     */
    @Override
    public void setUnderflow(java.lang.Object underflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setObjectValue(underflow);
        }
    }

    /**
     * Sets (as xml) the "underflow" attribute
     */
    @Override
    public void xsetUnderflow(com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic underflow) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(underflow);
        }
    }

    /**
     * Unsets the "underflow" attribute
     */
    @Override
    public void unsetUnderflow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "overflow" attribute
     */
    @Override
    public java.lang.Object getOverflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "overflow" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic xgetOverflow() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "overflow" attribute
     */
    @Override
    public boolean isSetOverflow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "overflow" attribute
     */
    @Override
    public void setOverflow(java.lang.Object overflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setObjectValue(overflow);
        }
    }

    /**
     * Sets (as xml) the "overflow" attribute
     */
    @Override
    public void xsetOverflow(com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic overflow) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(overflow);
        }
    }

    /**
     * Unsets the "overflow" attribute
     */
    @Override
    public void unsetOverflow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }
}

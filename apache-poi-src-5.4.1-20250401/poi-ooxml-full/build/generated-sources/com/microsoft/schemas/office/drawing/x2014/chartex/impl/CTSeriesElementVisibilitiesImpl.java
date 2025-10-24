/*
 * XML Type:  CT_SeriesElementVisibilities
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_SeriesElementVisibilities(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTSeriesElementVisibilitiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesElementVisibilities {
    private static final long serialVersionUID = 1L;

    public CTSeriesElementVisibilitiesImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "connectorLines"),
        new QName("", "meanLine"),
        new QName("", "meanMarker"),
        new QName("", "nonoutliers"),
        new QName("", "outliers"),
    };


    /**
     * Gets the "connectorLines" attribute
     */
    @Override
    public boolean getConnectorLines() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "connectorLines" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetConnectorLines() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "connectorLines" attribute
     */
    @Override
    public boolean isSetConnectorLines() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "connectorLines" attribute
     */
    @Override
    public void setConnectorLines(boolean connectorLines) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setBooleanValue(connectorLines);
        }
    }

    /**
     * Sets (as xml) the "connectorLines" attribute
     */
    @Override
    public void xsetConnectorLines(org.apache.xmlbeans.XmlBoolean connectorLines) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(connectorLines);
        }
    }

    /**
     * Unsets the "connectorLines" attribute
     */
    @Override
    public void unsetConnectorLines() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "meanLine" attribute
     */
    @Override
    public boolean getMeanLine() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "meanLine" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetMeanLine() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "meanLine" attribute
     */
    @Override
    public boolean isSetMeanLine() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "meanLine" attribute
     */
    @Override
    public void setMeanLine(boolean meanLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setBooleanValue(meanLine);
        }
    }

    /**
     * Sets (as xml) the "meanLine" attribute
     */
    @Override
    public void xsetMeanLine(org.apache.xmlbeans.XmlBoolean meanLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(meanLine);
        }
    }

    /**
     * Unsets the "meanLine" attribute
     */
    @Override
    public void unsetMeanLine() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "meanMarker" attribute
     */
    @Override
    public boolean getMeanMarker() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "meanMarker" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetMeanMarker() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "meanMarker" attribute
     */
    @Override
    public boolean isSetMeanMarker() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "meanMarker" attribute
     */
    @Override
    public void setMeanMarker(boolean meanMarker) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(meanMarker);
        }
    }

    /**
     * Sets (as xml) the "meanMarker" attribute
     */
    @Override
    public void xsetMeanMarker(org.apache.xmlbeans.XmlBoolean meanMarker) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(meanMarker);
        }
    }

    /**
     * Unsets the "meanMarker" attribute
     */
    @Override
    public void unsetMeanMarker() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "nonoutliers" attribute
     */
    @Override
    public boolean getNonoutliers() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "nonoutliers" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetNonoutliers() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "nonoutliers" attribute
     */
    @Override
    public boolean isSetNonoutliers() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "nonoutliers" attribute
     */
    @Override
    public void setNonoutliers(boolean nonoutliers) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setBooleanValue(nonoutliers);
        }
    }

    /**
     * Sets (as xml) the "nonoutliers" attribute
     */
    @Override
    public void xsetNonoutliers(org.apache.xmlbeans.XmlBoolean nonoutliers) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(nonoutliers);
        }
    }

    /**
     * Unsets the "nonoutliers" attribute
     */
    @Override
    public void unsetNonoutliers() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "outliers" attribute
     */
    @Override
    public boolean getOutliers() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "outliers" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetOutliers() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "outliers" attribute
     */
    @Override
    public boolean isSetOutliers() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "outliers" attribute
     */
    @Override
    public void setOutliers(boolean outliers) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setBooleanValue(outliers);
        }
    }

    /**
     * Sets (as xml) the "outliers" attribute
     */
    @Override
    public void xsetOutliers(org.apache.xmlbeans.XmlBoolean outliers) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(outliers);
        }
    }

    /**
     * Unsets the "outliers" attribute
     */
    @Override
    public void unsetOutliers() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }
}

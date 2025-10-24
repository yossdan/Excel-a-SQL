/*
 * XML Type:  CT_Statistics
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Statistics(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTStatisticsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTStatistics {
    private static final long serialVersionUID = 1L;

    public CTStatisticsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "quartileMethod"),
    };


    /**
     * Gets the "quartileMethod" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod.Enum getQuartileMethod() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "quartileMethod" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod xgetQuartileMethod() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "quartileMethod" attribute
     */
    @Override
    public boolean isSetQuartileMethod() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "quartileMethod" attribute
     */
    @Override
    public void setQuartileMethod(com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod.Enum quartileMethod) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(quartileMethod);
        }
    }

    /**
     * Sets (as xml) the "quartileMethod" attribute
     */
    @Override
    public void xsetQuartileMethod(com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod quartileMethod) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STQuartileMethod)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(quartileMethod);
        }
    }

    /**
     * Unsets the "quartileMethod" attribute
     */
    @Override
    public void unsetQuartileMethod() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

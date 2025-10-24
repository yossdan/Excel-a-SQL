/*
 * XML Type:  HeaderMargin_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.HeaderMarginType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML HeaderMargin_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.visio.x2012.main.HeaderMarginType.
 */
public class HeaderMarginTypeImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements com.microsoft.schemas.office.visio.x2012.main.HeaderMarginType {
    private static final long serialVersionUID = 1L;

    public HeaderMarginTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, true);
    }

    protected HeaderMarginTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "Unit"),
    };


    /**
     * Gets the "Unit" attribute
     */
    @Override
    public java.lang.String getUnit() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Unit" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetUnit() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "Unit" attribute
     */
    @Override
    public boolean isSetUnit() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "Unit" attribute
     */
    @Override
    public void setUnit(java.lang.String unit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(unit);
        }
    }

    /**
     * Sets (as xml) the "Unit" attribute
     */
    @Override
    public void xsetUnit(org.apache.xmlbeans.XmlString unit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(unit);
        }
    }

    /**
     * Unsets the "Unit" attribute
     */
    @Override
    public void unsetUnit() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

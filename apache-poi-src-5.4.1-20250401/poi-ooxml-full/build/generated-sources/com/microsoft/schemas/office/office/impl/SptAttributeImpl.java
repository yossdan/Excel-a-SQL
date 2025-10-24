/*
 * An XML attribute type.
 * Localname: spt
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.SptAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one spt(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class SptAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.SptAttribute {
    private static final long serialVersionUID = 1L;

    public SptAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "spt"),
    };


    /**
     * Gets the "spt" attribute
     */
    @Override
    public float getSpt() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? 0.0f : target.getFloatValue();
        }
    }

    /**
     * Gets (as xml) the "spt" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlFloat xgetSpt() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "spt" attribute
     */
    @Override
    public boolean isSetSpt() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "spt" attribute
     */
    @Override
    public void setSpt(float spt) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setFloatValue(spt);
        }
    }

    /**
     * Sets (as xml) the "spt" attribute
     */
    @Override
    public void xsetSpt(org.apache.xmlbeans.XmlFloat spt) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(spt);
        }
    }

    /**
     * Unsets the "spt" attribute
     */
    @Override
    public void unsetSpt() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

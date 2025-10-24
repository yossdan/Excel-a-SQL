/*
 * An XML attribute type.
 * Localname: regroupid
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.RegroupidAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one regroupid(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class RegroupidAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.RegroupidAttribute {
    private static final long serialVersionUID = 1L;

    public RegroupidAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "regroupid"),
    };


    /**
     * Gets the "regroupid" attribute
     */
    @Override
    public java.math.BigInteger getRegroupid() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "regroupid" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetRegroupid() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "regroupid" attribute
     */
    @Override
    public boolean isSetRegroupid() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "regroupid" attribute
     */
    @Override
    public void setRegroupid(java.math.BigInteger regroupid) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setBigIntegerValue(regroupid);
        }
    }

    /**
     * Sets (as xml) the "regroupid" attribute
     */
    @Override
    public void xsetRegroupid(org.apache.xmlbeans.XmlInteger regroupid) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(regroupid);
        }
    }

    /**
     * Unsets the "regroupid" attribute
     */
    @Override
    public void unsetRegroupid() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

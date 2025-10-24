/*
 * An XML attribute type.
 * Localname: bwnormal
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.BwnormalAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one bwnormal(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class BwnormalAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.BwnormalAttribute {
    private static final long serialVersionUID = 1L;

    public BwnormalAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "bwnormal"),
    };


    /**
     * Gets the "bwnormal" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STBWMode.Enum getBwnormal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STBWMode.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "bwnormal" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STBWMode xgetBwnormal() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STBWMode target = null;
            target = (com.microsoft.schemas.office.office.STBWMode)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "bwnormal" attribute
     */
    @Override
    public boolean isSetBwnormal() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "bwnormal" attribute
     */
    @Override
    public void setBwnormal(com.microsoft.schemas.office.office.STBWMode.Enum bwnormal) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(bwnormal);
        }
    }

    /**
     * Sets (as xml) the "bwnormal" attribute
     */
    @Override
    public void xsetBwnormal(com.microsoft.schemas.office.office.STBWMode bwnormal) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STBWMode target = null;
            target = (com.microsoft.schemas.office.office.STBWMode)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STBWMode)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(bwnormal);
        }
    }

    /**
     * Unsets the "bwnormal" attribute
     */
    @Override
    public void unsetBwnormal() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

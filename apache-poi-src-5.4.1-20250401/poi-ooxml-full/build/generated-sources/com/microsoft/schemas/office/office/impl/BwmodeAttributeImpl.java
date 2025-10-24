/*
 * An XML attribute type.
 * Localname: bwmode
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.BwmodeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one bwmode(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class BwmodeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.BwmodeAttribute {
    private static final long serialVersionUID = 1L;

    public BwmodeAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "bwmode"),
    };


    /**
     * Gets the "bwmode" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STBWMode.Enum getBwmode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STBWMode.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "bwmode" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STBWMode xgetBwmode() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STBWMode target = null;
            target = (com.microsoft.schemas.office.office.STBWMode)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "bwmode" attribute
     */
    @Override
    public boolean isSetBwmode() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "bwmode" attribute
     */
    @Override
    public void setBwmode(com.microsoft.schemas.office.office.STBWMode.Enum bwmode) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(bwmode);
        }
    }

    /**
     * Sets (as xml) the "bwmode" attribute
     */
    @Override
    public void xsetBwmode(com.microsoft.schemas.office.office.STBWMode bwmode) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STBWMode target = null;
            target = (com.microsoft.schemas.office.office.STBWMode)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STBWMode)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(bwmode);
        }
    }

    /**
     * Unsets the "bwmode" attribute
     */
    @Override
    public void unsetBwmode() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

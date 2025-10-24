/*
 * An XML attribute type.
 * Localname: gfxdata
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.GfxdataAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one gfxdata(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class GfxdataAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.GfxdataAttribute {
    private static final long serialVersionUID = 1L;

    public GfxdataAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "gfxdata"),
    };


    /**
     * Gets the "gfxdata" attribute
     */
    @Override
    public byte[] getGfxdata() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getByteArrayValue();
        }
    }

    /**
     * Gets (as xml) the "gfxdata" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBase64Binary xgetGfxdata() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "gfxdata" attribute
     */
    @Override
    public boolean isSetGfxdata() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "gfxdata" attribute
     */
    @Override
    public void setGfxdata(byte[] gfxdata) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setByteArrayValue(gfxdata);
        }
    }

    /**
     * Sets (as xml) the "gfxdata" attribute
     */
    @Override
    public void xsetGfxdata(org.apache.xmlbeans.XmlBase64Binary gfxdata) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(gfxdata);
        }
    }

    /**
     * Unsets the "gfxdata" attribute
     */
    @Override
    public void unsetGfxdata() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

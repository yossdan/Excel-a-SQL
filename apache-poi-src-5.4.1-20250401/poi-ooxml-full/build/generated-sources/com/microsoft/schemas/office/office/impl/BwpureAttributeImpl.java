/*
 * An XML attribute type.
 * Localname: bwpure
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.BwpureAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one bwpure(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class BwpureAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.BwpureAttribute {
    private static final long serialVersionUID = 1L;

    public BwpureAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "bwpure"),
    };


    /**
     * Gets the "bwpure" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STBWMode.Enum getBwpure() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STBWMode.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "bwpure" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STBWMode xgetBwpure() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STBWMode target = null;
            target = (com.microsoft.schemas.office.office.STBWMode)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "bwpure" attribute
     */
    @Override
    public boolean isSetBwpure() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "bwpure" attribute
     */
    @Override
    public void setBwpure(com.microsoft.schemas.office.office.STBWMode.Enum bwpure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(bwpure);
        }
    }

    /**
     * Sets (as xml) the "bwpure" attribute
     */
    @Override
    public void xsetBwpure(com.microsoft.schemas.office.office.STBWMode bwpure) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STBWMode target = null;
            target = (com.microsoft.schemas.office.office.STBWMode)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STBWMode)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(bwpure);
        }
    }

    /**
     * Unsets the "bwpure" attribute
     */
    @Override
    public void unsetBwpure() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

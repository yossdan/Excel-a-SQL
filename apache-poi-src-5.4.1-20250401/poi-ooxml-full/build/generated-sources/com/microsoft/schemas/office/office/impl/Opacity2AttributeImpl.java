/*
 * An XML attribute type.
 * Localname: opacity2
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.Opacity2Attribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one opacity2(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class Opacity2AttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.Opacity2Attribute {
    private static final long serialVersionUID = 1L;

    public Opacity2AttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "opacity2"),
    };


    /**
     * Gets the "opacity2" attribute
     */
    @Override
    public java.lang.String getOpacity2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "opacity2" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetOpacity2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "opacity2" attribute
     */
    @Override
    public boolean isSetOpacity2() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "opacity2" attribute
     */
    @Override
    public void setOpacity2(java.lang.String opacity2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(opacity2);
        }
    }

    /**
     * Sets (as xml) the "opacity2" attribute
     */
    @Override
    public void xsetOpacity2(org.apache.xmlbeans.XmlString opacity2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(opacity2);
        }
    }

    /**
     * Unsets the "opacity2" attribute
     */
    @Override
    public void unsetOpacity2() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

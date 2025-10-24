/*
 * An XML attribute type.
 * Localname: MustUnderstand
 * Namespace: http://schemas.openxmlformats.org/markup-compatibility/2006
 * Java type: com.microsoft.schemas.compatibility.MustUnderstandAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.compatibility.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one MustUnderstand(@http://schemas.openxmlformats.org/markup-compatibility/2006) attribute.
 *
 * This is a complex type.
 */
public class MustUnderstandAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.compatibility.MustUnderstandAttribute {
    private static final long serialVersionUID = 1L;

    public MustUnderstandAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "MustUnderstand"),
    };


    /**
     * Gets the "MustUnderstand" attribute
     */
    @Override
    public java.lang.String getMustUnderstand() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "MustUnderstand" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetMustUnderstand() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "MustUnderstand" attribute
     */
    @Override
    public boolean isSetMustUnderstand() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "MustUnderstand" attribute
     */
    @Override
    public void setMustUnderstand(java.lang.String mustUnderstand) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(mustUnderstand);
        }
    }

    /**
     * Sets (as xml) the "MustUnderstand" attribute
     */
    @Override
    public void xsetMustUnderstand(org.apache.xmlbeans.XmlString mustUnderstand) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(mustUnderstand);
        }
    }

    /**
     * Unsets the "MustUnderstand" attribute
     */
    @Override
    public void unsetMustUnderstand() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

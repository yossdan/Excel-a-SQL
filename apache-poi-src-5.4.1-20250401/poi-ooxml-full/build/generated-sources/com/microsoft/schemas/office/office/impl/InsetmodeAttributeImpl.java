/*
 * An XML attribute type.
 * Localname: insetmode
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.InsetmodeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one insetmode(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class InsetmodeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.InsetmodeAttribute {
    private static final long serialVersionUID = 1L;

    public InsetmodeAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "insetmode"),
    };


    /**
     * Gets the "insetmode" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STInsetMode.Enum getInsetmode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? null : (com.microsoft.schemas.office.office.STInsetMode.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "insetmode" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STInsetMode xgetInsetmode() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STInsetMode target = null;
            target = (com.microsoft.schemas.office.office.STInsetMode)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STInsetMode)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return target;
        }
    }

    /**
     * True if has "insetmode" attribute
     */
    @Override
    public boolean isSetInsetmode() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "insetmode" attribute
     */
    @Override
    public void setInsetmode(com.microsoft.schemas.office.office.STInsetMode.Enum insetmode) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(insetmode);
        }
    }

    /**
     * Sets (as xml) the "insetmode" attribute
     */
    @Override
    public void xsetInsetmode(com.microsoft.schemas.office.office.STInsetMode insetmode) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STInsetMode target = null;
            target = (com.microsoft.schemas.office.office.STInsetMode)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STInsetMode)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(insetmode);
        }
    }

    /**
     * Unsets the "insetmode" attribute
     */
    @Override
    public void unsetInsetmode() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

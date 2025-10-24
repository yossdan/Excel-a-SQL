/*
 * An XML attribute type.
 * Localname: hralign
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.HralignAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one hralign(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class HralignAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.HralignAttribute {
    private static final long serialVersionUID = 1L;

    public HralignAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "hralign"),
    };


    /**
     * Gets the "hralign" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STHrAlign.Enum getHralign() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? null : (com.microsoft.schemas.office.office.STHrAlign.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "hralign" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STHrAlign xgetHralign() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STHrAlign target = null;
            target = (com.microsoft.schemas.office.office.STHrAlign)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STHrAlign)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return target;
        }
    }

    /**
     * True if has "hralign" attribute
     */
    @Override
    public boolean isSetHralign() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "hralign" attribute
     */
    @Override
    public void setHralign(com.microsoft.schemas.office.office.STHrAlign.Enum hralign) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(hralign);
        }
    }

    /**
     * Sets (as xml) the "hralign" attribute
     */
    @Override
    public void xsetHralign(com.microsoft.schemas.office.office.STHrAlign hralign) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STHrAlign target = null;
            target = (com.microsoft.schemas.office.office.STHrAlign)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STHrAlign)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(hralign);
        }
    }

    /**
     * Unsets the "hralign" attribute
     */
    @Override
    public void unsetHralign() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

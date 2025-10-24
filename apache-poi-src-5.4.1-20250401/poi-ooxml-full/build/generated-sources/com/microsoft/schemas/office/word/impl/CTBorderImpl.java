/*
 * XML Type:  CT_Border
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.CTBorder
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Border(@urn:schemas-microsoft-com:office:word).
 *
 * This is a complex type.
 */
public class CTBorderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.CTBorder {
    private static final long serialVersionUID = 1L;

    public CTBorderImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "type"),
        new QName("", "width"),
        new QName("", "shadow"),
    };


    /**
     * Gets the "type" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.STBorderType.Enum getType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.STBorderType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "type" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.STBorderType xgetType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.STBorderType target = null;
            target = (com.microsoft.schemas.office.word.STBorderType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "type" attribute
     */
    @Override
    public boolean isSetType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "type" attribute
     */
    @Override
    public void setType(com.microsoft.schemas.office.word.STBorderType.Enum type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(type);
        }
    }

    /**
     * Sets (as xml) the "type" attribute
     */
    @Override
    public void xsetType(com.microsoft.schemas.office.word.STBorderType type) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.STBorderType target = null;
            target = (com.microsoft.schemas.office.word.STBorderType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.STBorderType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(type);
        }
    }

    /**
     * Unsets the "type" attribute
     */
    @Override
    public void unsetType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "width" attribute
     */
    @Override
    public java.math.BigInteger getWidth() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "width" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlPositiveInteger xgetWidth() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "width" attribute
     */
    @Override
    public boolean isSetWidth() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "width" attribute
     */
    @Override
    public void setWidth(java.math.BigInteger width) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setBigIntegerValue(width);
        }
    }

    /**
     * Sets (as xml) the "width" attribute
     */
    @Override
    public void xsetWidth(org.apache.xmlbeans.XmlPositiveInteger width) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(width);
        }
    }

    /**
     * Unsets the "width" attribute
     */
    @Override
    public void unsetWidth() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "shadow" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.STBorderShadow.Enum getShadow() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.STBorderShadow.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "shadow" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.STBorderShadow xgetShadow() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.STBorderShadow target = null;
            target = (com.microsoft.schemas.office.word.STBorderShadow)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "shadow" attribute
     */
    @Override
    public boolean isSetShadow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "shadow" attribute
     */
    @Override
    public void setShadow(com.microsoft.schemas.office.word.STBorderShadow.Enum shadow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setEnumValue(shadow);
        }
    }

    /**
     * Sets (as xml) the "shadow" attribute
     */
    @Override
    public void xsetShadow(com.microsoft.schemas.office.word.STBorderShadow shadow) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.STBorderShadow target = null;
            target = (com.microsoft.schemas.office.word.STBorderShadow)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.STBorderShadow)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(shadow);
        }
    }

    /**
     * Unsets the "shadow" attribute
     */
    @Override
    public void unsetShadow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }
}

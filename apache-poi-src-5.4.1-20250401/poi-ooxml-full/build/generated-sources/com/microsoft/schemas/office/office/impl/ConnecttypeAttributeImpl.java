/*
 * An XML attribute type.
 * Localname: connecttype
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ConnecttypeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one connecttype(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class ConnecttypeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.ConnecttypeAttribute {
    private static final long serialVersionUID = 1L;

    public ConnecttypeAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "connecttype"),
    };


    /**
     * Gets the "connecttype" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STConnectType.Enum getConnecttype() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STConnectType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "connecttype" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STConnectType xgetConnecttype() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STConnectType target = null;
            target = (com.microsoft.schemas.office.office.STConnectType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "connecttype" attribute
     */
    @Override
    public boolean isSetConnecttype() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "connecttype" attribute
     */
    @Override
    public void setConnecttype(com.microsoft.schemas.office.office.STConnectType.Enum connecttype) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(connecttype);
        }
    }

    /**
     * Sets (as xml) the "connecttype" attribute
     */
    @Override
    public void xsetConnecttype(com.microsoft.schemas.office.office.STConnectType connecttype) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STConnectType target = null;
            target = (com.microsoft.schemas.office.office.STConnectType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STConnectType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(connecttype);
        }
    }

    /**
     * Unsets the "connecttype" attribute
     */
    @Override
    public void unsetConnecttype() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

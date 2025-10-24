/*
 * An XML attribute type.
 * Localname: connectortype
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ConnectortypeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one connectortype(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class ConnectortypeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.ConnectortypeAttribute {
    private static final long serialVersionUID = 1L;

    public ConnectortypeAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "connectortype"),
    };


    /**
     * Gets the "connectortype" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STConnectorType.Enum getConnectortype() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? null : (com.microsoft.schemas.office.office.STConnectorType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "connectortype" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STConnectorType xgetConnectortype() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STConnectorType target = null;
            target = (com.microsoft.schemas.office.office.STConnectorType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STConnectorType)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return target;
        }
    }

    /**
     * True if has "connectortype" attribute
     */
    @Override
    public boolean isSetConnectortype() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "connectortype" attribute
     */
    @Override
    public void setConnectortype(com.microsoft.schemas.office.office.STConnectorType.Enum connectortype) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(connectortype);
        }
    }

    /**
     * Sets (as xml) the "connectortype" attribute
     */
    @Override
    public void xsetConnectortype(com.microsoft.schemas.office.office.STConnectorType connectortype) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STConnectorType target = null;
            target = (com.microsoft.schemas.office.office.STConnectorType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STConnectorType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(connectortype);
        }
    }

    /**
     * Unsets the "connectortype" attribute
     */
    @Override
    public void unsetConnectortype() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

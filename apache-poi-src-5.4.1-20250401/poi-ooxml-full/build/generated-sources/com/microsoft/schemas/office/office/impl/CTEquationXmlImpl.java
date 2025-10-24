/*
 * XML Type:  CT_EquationXml
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTEquationXml
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_EquationXml(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTEquationXmlImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.CTEquationXml {
    private static final long serialVersionUID = 1L;

    public CTEquationXmlImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "contentType"),
    };


    /**
     * Gets the "contentType" attribute
     */
    @Override
    public java.lang.String getContentType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "contentType" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STAlternateMathContentType xgetContentType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STAlternateMathContentType target = null;
            target = (com.microsoft.schemas.office.office.STAlternateMathContentType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "contentType" attribute
     */
    @Override
    public boolean isSetContentType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "contentType" attribute
     */
    @Override
    public void setContentType(java.lang.String contentType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(contentType);
        }
    }

    /**
     * Sets (as xml) the "contentType" attribute
     */
    @Override
    public void xsetContentType(com.microsoft.schemas.office.office.STAlternateMathContentType contentType) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STAlternateMathContentType target = null;
            target = (com.microsoft.schemas.office.office.STAlternateMathContentType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STAlternateMathContentType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(contentType);
        }
    }

    /**
     * Unsets the "contentType" attribute
     */
    @Override
    public void unsetContentType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

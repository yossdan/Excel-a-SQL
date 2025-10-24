/*
 * XML Type:  CT_SignatureInfoV2
 * Namespace: http://schemas.microsoft.com/office/2006/digsig
 * Java type: com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.digsig.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_SignatureInfoV2(@http://schemas.microsoft.com/office/2006/digsig).
 *
 * This is a complex type.
 */
public class CTSignatureInfoV2Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2 {
    private static final long serialVersionUID = 1L;

    public CTSignatureInfoV2Impl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/2006/digsig", "Address1"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "Address2"),
    };


    /**
     * Gets the "Address1" element
     */
    @Override
    public java.lang.String getAddress1() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Address1" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetAddress1() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "Address1" element
     */
    @Override
    public boolean isSetAddress1() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "Address1" element
     */
    @Override
    public void setAddress1(java.lang.String address1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(address1);
        }
    }

    /**
     * Sets (as xml) the "Address1" element
     */
    @Override
    public void xsetAddress1(org.apache.xmlbeans.XmlString address1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(address1);
        }
    }

    /**
     * Unsets the "Address1" element
     */
    @Override
    public void unsetAddress1() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "Address2" element
     */
    @Override
    public java.lang.String getAddress2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Address2" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetAddress2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "Address2" element
     */
    @Override
    public boolean isSetAddress2() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Address2" element
     */
    @Override
    public void setAddress2(java.lang.String address2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(address2);
        }
    }

    /**
     * Sets (as xml) the "Address2" element
     */
    @Override
    public void xsetAddress2(org.apache.xmlbeans.XmlString address2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(address2);
        }
    }

    /**
     * Unsets the "Address2" element
     */
    @Override
    public void unsetAddress2() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}

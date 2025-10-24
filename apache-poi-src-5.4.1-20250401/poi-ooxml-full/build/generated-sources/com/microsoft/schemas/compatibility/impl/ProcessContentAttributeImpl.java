/*
 * An XML attribute type.
 * Localname: ProcessContent
 * Namespace: http://schemas.openxmlformats.org/markup-compatibility/2006
 * Java type: com.microsoft.schemas.compatibility.ProcessContentAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.compatibility.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ProcessContent(@http://schemas.openxmlformats.org/markup-compatibility/2006) attribute.
 *
 * This is a complex type.
 */
public class ProcessContentAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.compatibility.ProcessContentAttribute {
    private static final long serialVersionUID = 1L;

    public ProcessContentAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "ProcessContent"),
    };


    /**
     * Gets the "ProcessContent" attribute
     */
    @Override
    public java.lang.String getProcessContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ProcessContent" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetProcessContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "ProcessContent" attribute
     */
    @Override
    public boolean isSetProcessContent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "ProcessContent" attribute
     */
    @Override
    public void setProcessContent(java.lang.String processContent) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(processContent);
        }
    }

    /**
     * Sets (as xml) the "ProcessContent" attribute
     */
    @Override
    public void xsetProcessContent(org.apache.xmlbeans.XmlString processContent) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(processContent);
        }
    }

    /**
     * Unsets the "ProcessContent" attribute
     */
    @Override
    public void unsetProcessContent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

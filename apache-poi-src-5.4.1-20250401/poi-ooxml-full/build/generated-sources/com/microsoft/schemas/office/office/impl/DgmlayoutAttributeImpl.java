/*
 * An XML attribute type.
 * Localname: dgmlayout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.DgmlayoutAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one dgmlayout(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class DgmlayoutAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.DgmlayoutAttribute {
    private static final long serialVersionUID = 1L;

    public DgmlayoutAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "dgmlayout"),
    };


    /**
     * Gets the "dgmlayout" attribute
     */
    @Override
    public java.math.BigInteger getDgmlayout() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "dgmlayout" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STDiagramLayout xgetDgmlayout() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STDiagramLayout target = null;
            target = (com.microsoft.schemas.office.office.STDiagramLayout)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "dgmlayout" attribute
     */
    @Override
    public boolean isSetDgmlayout() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "dgmlayout" attribute
     */
    @Override
    public void setDgmlayout(java.math.BigInteger dgmlayout) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setBigIntegerValue(dgmlayout);
        }
    }

    /**
     * Sets (as xml) the "dgmlayout" attribute
     */
    @Override
    public void xsetDgmlayout(com.microsoft.schemas.office.office.STDiagramLayout dgmlayout) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STDiagramLayout target = null;
            target = (com.microsoft.schemas.office.office.STDiagramLayout)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STDiagramLayout)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(dgmlayout);
        }
    }

    /**
     * Unsets the "dgmlayout" attribute
     */
    @Override
    public void unsetDgmlayout() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

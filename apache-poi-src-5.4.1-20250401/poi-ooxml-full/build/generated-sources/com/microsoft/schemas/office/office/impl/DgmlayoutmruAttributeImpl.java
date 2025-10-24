/*
 * An XML attribute type.
 * Localname: dgmlayoutmru
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.DgmlayoutmruAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one dgmlayoutmru(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class DgmlayoutmruAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.DgmlayoutmruAttribute {
    private static final long serialVersionUID = 1L;

    public DgmlayoutmruAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "dgmlayoutmru"),
    };


    /**
     * Gets the "dgmlayoutmru" attribute
     */
    @Override
    public java.math.BigInteger getDgmlayoutmru() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "dgmlayoutmru" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STDiagramLayout xgetDgmlayoutmru() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STDiagramLayout target = null;
            target = (com.microsoft.schemas.office.office.STDiagramLayout)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "dgmlayoutmru" attribute
     */
    @Override
    public boolean isSetDgmlayoutmru() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "dgmlayoutmru" attribute
     */
    @Override
    public void setDgmlayoutmru(java.math.BigInteger dgmlayoutmru) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setBigIntegerValue(dgmlayoutmru);
        }
    }

    /**
     * Sets (as xml) the "dgmlayoutmru" attribute
     */
    @Override
    public void xsetDgmlayoutmru(com.microsoft.schemas.office.office.STDiagramLayout dgmlayoutmru) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STDiagramLayout target = null;
            target = (com.microsoft.schemas.office.office.STDiagramLayout)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STDiagramLayout)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(dgmlayoutmru);
        }
    }

    /**
     * Unsets the "dgmlayoutmru" attribute
     */
    @Override
    public void unsetDgmlayoutmru() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

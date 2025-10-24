/*
 * XML Type:  fld_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.FldType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML fld_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.visio.x2012.main.FldType.
 */
public class FldTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.microsoft.schemas.office.visio.x2012.main.FldType {
    private static final long serialVersionUID = 1L;

    public FldTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, true);
    }

    protected FldTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "IX"),
    };


    /**
     * Gets the "IX" attribute
     */
    @Override
    public long getIX() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "IX" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetIX() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "IX" attribute
     */
    @Override
    public void setIX(long ix) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setLongValue(ix);
        }
    }

    /**
     * Sets (as xml) the "IX" attribute
     */
    @Override
    public void xsetIX(org.apache.xmlbeans.XmlUnsignedInt ix) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(ix);
        }
    }
}

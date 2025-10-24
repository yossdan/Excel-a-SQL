/*
 * XML Type:  CT_Entry
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTEntry
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Entry(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTEntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.CTEntry {
    private static final long serialVersionUID = 1L;

    public CTEntryImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "new"),
        new QName("", "old"),
    };


    /**
     * Gets the "new" attribute
     */
    @Override
    public int getNew() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "new" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInt xgetNew() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "new" attribute
     */
    @Override
    public boolean isSetNew() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "new" attribute
     */
    @Override
    public void setNew(int xnew) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setIntValue(xnew);
        }
    }

    /**
     * Sets (as xml) the "new" attribute
     */
    @Override
    public void xsetNew(org.apache.xmlbeans.XmlInt xnew) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(xnew);
        }
    }

    /**
     * Unsets the "new" attribute
     */
    @Override
    public void unsetNew() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "old" attribute
     */
    @Override
    public int getOld() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "old" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInt xgetOld() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "old" attribute
     */
    @Override
    public boolean isSetOld() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "old" attribute
     */
    @Override
    public void setOld(int old) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setIntValue(old);
        }
    }

    /**
     * Sets (as xml) the "old" attribute
     */
    @Override
    public void xsetOld(org.apache.xmlbeans.XmlInt old) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(old);
        }
    }

    /**
     * Unsets the "old" attribute
     */
    @Override
    public void unsetOld() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}

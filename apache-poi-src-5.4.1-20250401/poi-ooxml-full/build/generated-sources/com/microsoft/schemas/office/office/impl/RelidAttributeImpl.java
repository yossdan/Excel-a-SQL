/*
 * An XML attribute type.
 * Localname: relid
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.RelidAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one relid(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class RelidAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.RelidAttribute {
    private static final long serialVersionUID = 1L;

    public RelidAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "relid"),
    };


    /**
     * Gets the "relid" attribute
     */
    @Override
    public java.lang.String getRelid() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "relid" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetRelid() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "relid" attribute
     */
    @Override
    public boolean isSetRelid() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "relid" attribute
     */
    @Override
    public void setRelid(java.lang.String relid) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(relid);
        }
    }

    /**
     * Sets (as xml) the "relid" attribute
     */
    @Override
    public void xsetRelid(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId relid) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(relid);
        }
    }

    /**
     * Unsets the "relid" attribute
     */
    @Override
    public void unsetRelid() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

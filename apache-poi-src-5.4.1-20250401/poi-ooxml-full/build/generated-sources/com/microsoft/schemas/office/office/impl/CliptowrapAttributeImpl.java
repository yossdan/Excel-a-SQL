/*
 * An XML attribute type.
 * Localname: cliptowrap
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CliptowrapAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one cliptowrap(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class CliptowrapAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.CliptowrapAttribute {
    private static final long serialVersionUID = 1L;

    public CliptowrapAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "cliptowrap"),
    };


    /**
     * Gets the "cliptowrap" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getCliptowrap() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "cliptowrap" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetCliptowrap() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "cliptowrap" attribute
     */
    @Override
    public boolean isSetCliptowrap() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "cliptowrap" attribute
     */
    @Override
    public void setCliptowrap(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum cliptowrap) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(cliptowrap);
        }
    }

    /**
     * Sets (as xml) the "cliptowrap" attribute
     */
    @Override
    public void xsetCliptowrap(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse cliptowrap) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(cliptowrap);
        }
    }

    /**
     * Unsets the "cliptowrap" attribute
     */
    @Override
    public void unsetCliptowrap() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

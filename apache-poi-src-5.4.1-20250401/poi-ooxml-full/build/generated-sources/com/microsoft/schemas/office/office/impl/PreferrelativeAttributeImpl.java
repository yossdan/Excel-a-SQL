/*
 * An XML attribute type.
 * Localname: preferrelative
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.PreferrelativeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one preferrelative(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class PreferrelativeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.PreferrelativeAttribute {
    private static final long serialVersionUID = 1L;

    public PreferrelativeAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "preferrelative"),
    };


    /**
     * Gets the "preferrelative" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getPreferrelative() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "preferrelative" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetPreferrelative() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "preferrelative" attribute
     */
    @Override
    public boolean isSetPreferrelative() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "preferrelative" attribute
     */
    @Override
    public void setPreferrelative(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum preferrelative) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(preferrelative);
        }
    }

    /**
     * Sets (as xml) the "preferrelative" attribute
     */
    @Override
    public void xsetPreferrelative(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse preferrelative) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(preferrelative);
        }
    }

    /**
     * Unsets the "preferrelative" attribute
     */
    @Override
    public void unsetPreferrelative() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

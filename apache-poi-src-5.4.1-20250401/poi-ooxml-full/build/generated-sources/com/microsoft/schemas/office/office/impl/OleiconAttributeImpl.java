/*
 * An XML attribute type.
 * Localname: oleicon
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.OleiconAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one oleicon(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class OleiconAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.OleiconAttribute {
    private static final long serialVersionUID = 1L;

    public OleiconAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "oleicon"),
    };


    /**
     * Gets the "oleicon" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getOleicon() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "oleicon" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetOleicon() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "oleicon" attribute
     */
    @Override
    public boolean isSetOleicon() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "oleicon" attribute
     */
    @Override
    public void setOleicon(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum oleicon) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(oleicon);
        }
    }

    /**
     * Sets (as xml) the "oleicon" attribute
     */
    @Override
    public void xsetOleicon(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse oleicon) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(oleicon);
        }
    }

    /**
     * Unsets the "oleicon" attribute
     */
    @Override
    public void unsetOleicon() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

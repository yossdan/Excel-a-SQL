/*
 * An XML attribute type.
 * Localname: button
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ButtonAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one button(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class ButtonAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.ButtonAttribute {
    private static final long serialVersionUID = 1L;

    public ButtonAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "button"),
    };


    /**
     * Gets the "button" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getButton() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "button" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetButton() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "button" attribute
     */
    @Override
    public boolean isSetButton() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "button" attribute
     */
    @Override
    public void setButton(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum button) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(button);
        }
    }

    /**
     * Sets (as xml) the "button" attribute
     */
    @Override
    public void xsetButton(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse button) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(button);
        }
    }

    /**
     * Unsets the "button" attribute
     */
    @Override
    public void unsetButton() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

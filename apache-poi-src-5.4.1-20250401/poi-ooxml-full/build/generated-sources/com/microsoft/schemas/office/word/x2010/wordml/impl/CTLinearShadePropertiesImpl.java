/*
 * XML Type:  CT_LinearShadeProperties
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_LinearShadeProperties(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTLinearShadePropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties {
    private static final long serialVersionUID = 1L;

    public CTLinearShadePropertiesImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "ang"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "scaled"),
    };


    /**
     * Gets the "ang" attribute
     */
    @Override
    public int getAng() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "ang" attribute
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetAng() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "ang" attribute
     */
    @Override
    public boolean isSetAng() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "ang" attribute
     */
    @Override
    public void setAng(int ang) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setIntValue(ang);
        }
    }

    /**
     * Sets (as xml) the "ang" attribute
     */
    @Override
    public void xsetAng(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle ang) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(ang);
        }
    }

    /**
     * Unsets the "ang" attribute
     */
    @Override
    public void unsetAng() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "scaled" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STOnOff.Enum getScaled() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.x2010.wordml.STOnOff.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "scaled" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STOnOff xgetScaled() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STOnOff target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STOnOff)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "scaled" attribute
     */
    @Override
    public boolean isSetScaled() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "scaled" attribute
     */
    @Override
    public void setScaled(com.microsoft.schemas.office.word.x2010.wordml.STOnOff.Enum scaled) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(scaled);
        }
    }

    /**
     * Sets (as xml) the "scaled" attribute
     */
    @Override
    public void xsetScaled(com.microsoft.schemas.office.word.x2010.wordml.STOnOff scaled) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STOnOff target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STOnOff)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.x2010.wordml.STOnOff)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(scaled);
        }
    }

    /**
     * Unsets the "scaled" attribute
     */
    @Override
    public void unsetScaled() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}

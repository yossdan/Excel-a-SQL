/*
 * XML Type:  CT_Glow
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTGlow
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Glow(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTGlowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTGlow {
    private static final long serialVersionUID = 1L;

    public CTGlowImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "srgbClr"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "schemeClr"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "rad"),
    };


    /**
     * Gets the "srgbClr" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSRgbColor getSrgbClr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSRgbColor target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSRgbColor)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "srgbClr" element
     */
    @Override
    public boolean isSetSrgbClr() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "srgbClr" element
     */
    @Override
    public void setSrgbClr(com.microsoft.schemas.office.word.x2010.wordml.CTSRgbColor srgbClr) {
        generatedSetterHelperImpl(srgbClr, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "srgbClr" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSRgbColor addNewSrgbClr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSRgbColor target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSRgbColor)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "srgbClr" element
     */
    @Override
    public void unsetSrgbClr() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "schemeClr" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor getSchemeClr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "schemeClr" element
     */
    @Override
    public boolean isSetSchemeClr() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "schemeClr" element
     */
    @Override
    public void setSchemeClr(com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor schemeClr) {
        generatedSetterHelperImpl(schemeClr, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "schemeClr" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor addNewSchemeClr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "schemeClr" element
     */
    @Override
    public void unsetSchemeClr() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "rad" attribute
     */
    @Override
    public long getRad() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "rad" attribute
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetRad() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "rad" attribute
     */
    @Override
    public boolean isSetRad() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "rad" attribute
     */
    @Override
    public void setRad(long rad) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setLongValue(rad);
        }
    }

    /**
     * Sets (as xml) the "rad" attribute
     */
    @Override
    public void xsetRad(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate rad) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(rad);
        }
    }

    /**
     * Unsets the "rad" attribute
     */
    @Override
    public void unsetRad() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }
}

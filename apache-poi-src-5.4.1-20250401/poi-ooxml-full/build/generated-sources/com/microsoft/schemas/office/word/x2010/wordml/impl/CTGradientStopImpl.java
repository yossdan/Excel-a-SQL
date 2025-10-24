/*
 * XML Type:  CT_GradientStop
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GradientStop(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTGradientStopImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTGradientStop {
    private static final long serialVersionUID = 1L;

    public CTGradientStopImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "srgbClr"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "schemeClr"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "pos"),
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
     * Gets the "pos" attribute
     */
    @Override
    public java.lang.Object getPos() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "pos" attribute
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetPos() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Sets the "pos" attribute
     */
    @Override
    public void setPos(java.lang.Object pos) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setObjectValue(pos);
        }
    }

    /**
     * Sets (as xml) the "pos" attribute
     */
    @Override
    public void xsetPos(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage pos) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(pos);
        }
    }
}

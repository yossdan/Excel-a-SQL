/*
 * XML Type:  CT_FillTextEffect
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTFillTextEffect
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_FillTextEffect(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTFillTextEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTFillTextEffect {
    private static final long serialVersionUID = 1L;

    public CTFillTextEffectImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "noFill"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "solidFill"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "gradFill"),
    };


    /**
     * Gets the "noFill" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getNoFill() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "noFill" element
     */
    @Override
    public boolean isSetNoFill() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "noFill" element
     */
    @Override
    public void setNoFill(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty noFill) {
        generatedSetterHelperImpl(noFill, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "noFill" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewNoFill() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "noFill" element
     */
    @Override
    public void unsetNoFill() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "solidFill" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties getSolidFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "solidFill" element
     */
    @Override
    public boolean isSetSolidFill() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "solidFill" element
     */
    @Override
    public void setSolidFill(com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties solidFill) {
        generatedSetterHelperImpl(solidFill, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "solidFill" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties addNewSolidFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "solidFill" element
     */
    @Override
    public void unsetSolidFill() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "gradFill" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties getGradFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "gradFill" element
     */
    @Override
    public boolean isSetGradFill() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "gradFill" element
     */
    @Override
    public void setGradFill(com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties gradFill) {
        generatedSetterHelperImpl(gradFill, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "gradFill" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties addNewGradFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "gradFill" element
     */
    @Override
    public void unsetGradFill() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}

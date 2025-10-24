/*
 * XML Type:  CT_SdtCheckbox
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_SdtCheckbox(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTSdtCheckboxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox {
    private static final long serialVersionUID = 1L;

    public CTSdtCheckboxImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "checked"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "checkedState"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "uncheckedState"),
    };


    /**
     * Gets the "checked" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTOnOff getChecked() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTOnOff target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTOnOff)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "checked" element
     */
    @Override
    public boolean isSetChecked() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "checked" element
     */
    @Override
    public void setChecked(com.microsoft.schemas.office.word.x2010.wordml.CTOnOff checked) {
        generatedSetterHelperImpl(checked, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "checked" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTOnOff addNewChecked() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTOnOff target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTOnOff)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "checked" element
     */
    @Override
    public void unsetChecked() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "checkedState" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol getCheckedState() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "checkedState" element
     */
    @Override
    public boolean isSetCheckedState() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "checkedState" element
     */
    @Override
    public void setCheckedState(com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol checkedState) {
        generatedSetterHelperImpl(checkedState, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "checkedState" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol addNewCheckedState() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "checkedState" element
     */
    @Override
    public void unsetCheckedState() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "uncheckedState" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol getUncheckedState() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "uncheckedState" element
     */
    @Override
    public boolean isSetUncheckedState() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "uncheckedState" element
     */
    @Override
    public void setUncheckedState(com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol uncheckedState) {
        generatedSetterHelperImpl(uncheckedState, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "uncheckedState" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol addNewUncheckedState() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "uncheckedState" element
     */
    @Override
    public void unsetUncheckedState() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}

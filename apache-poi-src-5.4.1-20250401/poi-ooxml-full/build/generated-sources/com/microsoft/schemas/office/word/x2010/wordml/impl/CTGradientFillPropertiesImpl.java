/*
 * XML Type:  CT_GradientFillProperties
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GradientFillProperties(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTGradientFillPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties {
    private static final long serialVersionUID = 1L;

    public CTGradientFillPropertiesImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "gsLst"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "lin"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "path"),
    };


    /**
     * Gets the "gsLst" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList getGsLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "gsLst" element
     */
    @Override
    public boolean isSetGsLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "gsLst" element
     */
    @Override
    public void setGsLst(com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList gsLst) {
        generatedSetterHelperImpl(gsLst, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "gsLst" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList addNewGsLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTGradientStopList)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "gsLst" element
     */
    @Override
    public void unsetGsLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "lin" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties getLin() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "lin" element
     */
    @Override
    public boolean isSetLin() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "lin" element
     */
    @Override
    public void setLin(com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties lin) {
        generatedSetterHelperImpl(lin, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "lin" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties addNewLin() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "lin" element
     */
    @Override
    public void unsetLin() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "path" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties getPath() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "path" element
     */
    @Override
    public boolean isSetPath() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "path" element
     */
    @Override
    public void setPath(com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties path) {
        generatedSetterHelperImpl(path, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "path" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties addNewPath() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "path" element
     */
    @Override
    public void unsetPath() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}

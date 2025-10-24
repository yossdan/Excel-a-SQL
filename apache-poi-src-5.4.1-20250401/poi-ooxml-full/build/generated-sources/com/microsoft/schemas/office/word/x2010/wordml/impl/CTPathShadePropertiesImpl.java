/*
 * XML Type:  CT_PathShadeProperties
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_PathShadeProperties(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTPathShadePropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTPathShadeProperties {
    private static final long serialVersionUID = 1L;

    public CTPathShadePropertiesImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "fillToRect"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "path"),
    };


    /**
     * Gets the "fillToRect" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTRelativeRect getFillToRect() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTRelativeRect target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTRelativeRect)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "fillToRect" element
     */
    @Override
    public boolean isSetFillToRect() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "fillToRect" element
     */
    @Override
    public void setFillToRect(com.microsoft.schemas.office.word.x2010.wordml.CTRelativeRect fillToRect) {
        generatedSetterHelperImpl(fillToRect, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "fillToRect" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTRelativeRect addNewFillToRect() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTRelativeRect target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTRelativeRect)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "fillToRect" element
     */
    @Override
    public void unsetFillToRect() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "path" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType.Enum getPath() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "path" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType xgetPath() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "path" attribute
     */
    @Override
    public boolean isSetPath() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "path" attribute
     */
    @Override
    public void setPath(com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType.Enum path) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(path);
        }
    }

    /**
     * Sets (as xml) the "path" attribute
     */
    @Override
    public void xsetPath(com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType path) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.x2010.wordml.STPathShadeType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(path);
        }
    }

    /**
     * Unsets the "path" attribute
     */
    @Override
    public void unsetPath() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}

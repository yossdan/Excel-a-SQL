/*
 * XML Type:  CT_SdtCheckboxSymbol
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_SdtCheckboxSymbol(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTSdtCheckboxSymbolImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckboxSymbol {
    private static final long serialVersionUID = 1L;

    public CTSdtCheckboxSymbolImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "font"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "val"),
    };


    /**
     * Gets the "font" attribute
     */
    @Override
    public java.lang.String getFont() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "font" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString xgetFont() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "font" attribute
     */
    @Override
    public boolean isSetFont() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "font" attribute
     */
    @Override
    public void setFont(java.lang.String font) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(font);
        }
    }

    /**
     * Sets (as xml) the "font" attribute
     */
    @Override
    public void xsetFont(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString font) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STString)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(font);
        }
    }

    /**
     * Unsets the "font" attribute
     */
    @Override
    public void unsetFont() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "val" attribute
     */
    @Override
    public byte[] getVal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getByteArrayValue();
        }
    }

    /**
     * Gets (as xml) the "val" attribute
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber xgetVal() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "val" attribute
     */
    @Override
    public boolean isSetVal() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "val" attribute
     */
    @Override
    public void setVal(byte[] val) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setByteArrayValue(val);
        }
    }

    /**
     * Sets (as xml) the "val" attribute
     */
    @Override
    public void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber val) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(val);
        }
    }

    /**
     * Unsets the "val" attribute
     */
    @Override
    public void unsetVal() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}

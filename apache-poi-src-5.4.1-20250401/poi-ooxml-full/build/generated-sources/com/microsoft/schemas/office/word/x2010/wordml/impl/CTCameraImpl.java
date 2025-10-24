/*
 * XML Type:  CT_Camera
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTCamera
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Camera(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTCameraImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTCamera {
    private static final long serialVersionUID = 1L;

    public CTCameraImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "prst"),
    };


    /**
     * Gets the "prst" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType.Enum getPrst() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "prst" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType xgetPrst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "prst" attribute
     */
    @Override
    public void setPrst(com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType.Enum prst) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(prst);
        }
    }

    /**
     * Sets (as xml) the "prst" attribute
     */
    @Override
    public void xsetPrst(com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType prst) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(prst);
        }
    }
}

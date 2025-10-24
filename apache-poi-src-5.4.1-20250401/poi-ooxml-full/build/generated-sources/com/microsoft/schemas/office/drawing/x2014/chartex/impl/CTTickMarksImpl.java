/*
 * XML Type:  CT_TickMarks
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_TickMarks(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTTickMarksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks {
    private static final long serialVersionUID = 1L;

    public CTTickMarksImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "extLst"),
        new QName("", "type"),
    };


    /**
     * Gets the "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList getExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "type" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STTickMarksType.Enum getType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : (com.microsoft.schemas.office.drawing.x2014.chartex.STTickMarksType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "type" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STTickMarksType xgetType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STTickMarksType target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STTickMarksType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "type" attribute
     */
    @Override
    public boolean isSetType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "type" attribute
     */
    @Override
    public void setType(com.microsoft.schemas.office.drawing.x2014.chartex.STTickMarksType.Enum type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(type);
        }
    }

    /**
     * Sets (as xml) the "type" attribute
     */
    @Override
    public void xsetType(com.microsoft.schemas.office.drawing.x2014.chartex.STTickMarksType type) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STTickMarksType target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STTickMarksType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STTickMarksType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(type);
        }
    }

    /**
     * Unsets the "type" attribute
     */
    @Override
    public void unsetType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}

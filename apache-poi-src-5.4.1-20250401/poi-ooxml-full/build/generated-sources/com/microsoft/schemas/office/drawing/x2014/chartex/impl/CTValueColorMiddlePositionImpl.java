/*
 * XML Type:  CT_ValueColorMiddlePosition
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorMiddlePosition
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_ValueColorMiddlePosition(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTValueColorMiddlePositionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorMiddlePosition {
    private static final long serialVersionUID = 1L;

    public CTValueColorMiddlePositionImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "number"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "percent"),
    };


    /**
     * Gets the "number" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberColorPosition getNumber() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberColorPosition target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberColorPosition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "number" element
     */
    @Override
    public boolean isSetNumber() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "number" element
     */
    @Override
    public void setNumber(com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberColorPosition number) {
        generatedSetterHelperImpl(number, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "number" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberColorPosition addNewNumber() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberColorPosition target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberColorPosition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "number" element
     */
    @Override
    public void unsetNumber() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "percent" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTPercentageColorPosition getPercent() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTPercentageColorPosition target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTPercentageColorPosition)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "percent" element
     */
    @Override
    public boolean isSetPercent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "percent" element
     */
    @Override
    public void setPercent(com.microsoft.schemas.office.drawing.x2014.chartex.CTPercentageColorPosition percent) {
        generatedSetterHelperImpl(percent, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "percent" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTPercentageColorPosition addNewPercent() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTPercentageColorPosition target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTPercentageColorPosition)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "percent" element
     */
    @Override
    public void unsetPercent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}

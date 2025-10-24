/*
 * XML Type:  CT_ValueColors
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_ValueColors(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTValueColorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors {
    private static final long serialVersionUID = 1L;

    public CTValueColorsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "minColor"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "midColor"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "maxColor"),
    };


    /**
     * Gets the "minColor" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties getMinColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "minColor" element
     */
    @Override
    public boolean isSetMinColor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "minColor" element
     */
    @Override
    public void setMinColor(org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties minColor) {
        generatedSetterHelperImpl(minColor, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "minColor" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties addNewMinColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "minColor" element
     */
    @Override
    public void unsetMinColor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "midColor" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties getMidColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "midColor" element
     */
    @Override
    public boolean isSetMidColor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "midColor" element
     */
    @Override
    public void setMidColor(org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties midColor) {
        generatedSetterHelperImpl(midColor, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "midColor" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties addNewMidColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "midColor" element
     */
    @Override
    public void unsetMidColor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "maxColor" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties getMaxColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "maxColor" element
     */
    @Override
    public boolean isSetMaxColor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "maxColor" element
     */
    @Override
    public void setMaxColor(org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties maxColor) {
        generatedSetterHelperImpl(maxColor, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "maxColor" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties addNewMaxColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "maxColor" element
     */
    @Override
    public void unsetMaxColor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}

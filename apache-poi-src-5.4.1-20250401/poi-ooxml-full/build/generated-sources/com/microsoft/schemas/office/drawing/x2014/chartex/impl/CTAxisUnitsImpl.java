/*
 * XML Type:  CT_AxisUnits
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_AxisUnits(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTAxisUnitsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits {
    private static final long serialVersionUID = 1L;

    public CTAxisUnitsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "unitsLabel"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "extLst"),
        new QName("", "unit"),
    };


    /**
     * Gets the "unitsLabel" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnitsLabel getUnitsLabel() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnitsLabel target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnitsLabel)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "unitsLabel" element
     */
    @Override
    public boolean isSetUnitsLabel() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "unitsLabel" element
     */
    @Override
    public void setUnitsLabel(com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnitsLabel unitsLabel) {
        generatedSetterHelperImpl(unitsLabel, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "unitsLabel" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnitsLabel addNewUnitsLabel() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnitsLabel target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnitsLabel)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "unitsLabel" element
     */
    @Override
    public void unsetUnitsLabel() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList getExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().find_element_user(PROPERTY_QNAME[1], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "unit" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit.Enum getUnit() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : (com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "unit" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit xgetUnit() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "unit" attribute
     */
    @Override
    public boolean isSetUnit() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "unit" attribute
     */
    @Override
    public void setUnit(com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit.Enum unit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setEnumValue(unit);
        }
    }

    /**
     * Sets (as xml) the "unit" attribute
     */
    @Override
    public void xsetUnit(com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit unit) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(unit);
        }
    }

    /**
     * Unsets the "unit" attribute
     */
    @Override
    public void unsetUnit() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }
}

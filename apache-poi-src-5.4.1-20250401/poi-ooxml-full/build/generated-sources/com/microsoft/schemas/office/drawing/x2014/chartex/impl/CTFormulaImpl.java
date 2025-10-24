/*
 * XML Type:  CT_Formula
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Formula(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula.
 */
public class CTFormulaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula {
    private static final long serialVersionUID = 1L;

    public CTFormulaImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, true);
    }

    protected CTFormulaImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "dir"),
    };


    /**
     * Gets the "dir" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection.Enum getDir() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? null : (com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "dir" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection xgetDir() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return target;
        }
    }

    /**
     * True if has "dir" attribute
     */
    @Override
    public boolean isSetDir() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "dir" attribute
     */
    @Override
    public void setDir(com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection.Enum dir) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(dir);
        }
    }

    /**
     * Sets (as xml) the "dir" attribute
     */
    @Override
    public void xsetDir(com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection dir) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(dir);
        }
    }

    /**
     * Unsets the "dir" attribute
     */
    @Override
    public void unsetDir() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

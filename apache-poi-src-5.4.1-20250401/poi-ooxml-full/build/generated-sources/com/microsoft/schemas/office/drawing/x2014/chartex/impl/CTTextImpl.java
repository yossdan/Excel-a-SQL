/*
 * XML Type:  CT_Text
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTText
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Text(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTTextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTText {
    private static final long serialVersionUID = 1L;

    public CTTextImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "txData"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "rich"),
    };


    /**
     * Gets the "txData" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTTextData getTxData() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTTextData target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTTextData)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "txData" element
     */
    @Override
    public boolean isSetTxData() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "txData" element
     */
    @Override
    public void setTxData(com.microsoft.schemas.office.drawing.x2014.chartex.CTTextData txData) {
        generatedSetterHelperImpl(txData, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "txData" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTTextData addNewTxData() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTTextData target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTTextData)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "txData" element
     */
    @Override
    public void unsetTxData() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "rich" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getRich() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "rich" element
     */
    @Override
    public boolean isSetRich() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "rich" element
     */
    @Override
    public void setRich(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody rich) {
        generatedSetterHelperImpl(rich, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "rich" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewRich() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "rich" element
     */
    @Override
    public void unsetRich() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}

/*
 * XML Type:  CT_PrintSettings
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTPrintSettings
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_PrintSettings(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTPrintSettingsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTPrintSettings {
    private static final long serialVersionUID = 1L;

    public CTPrintSettingsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "headerFooter"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "pageMargins"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "pageSetup"),
    };


    /**
     * Gets the "headerFooter" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTHeaderFooter getHeaderFooter() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTHeaderFooter target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTHeaderFooter)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "headerFooter" element
     */
    @Override
    public boolean isSetHeaderFooter() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "headerFooter" element
     */
    @Override
    public void setHeaderFooter(com.microsoft.schemas.office.drawing.x2014.chartex.CTHeaderFooter headerFooter) {
        generatedSetterHelperImpl(headerFooter, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "headerFooter" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTHeaderFooter addNewHeaderFooter() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTHeaderFooter target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTHeaderFooter)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "headerFooter" element
     */
    @Override
    public void unsetHeaderFooter() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "pageMargins" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTPageMargins getPageMargins() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTPageMargins target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTPageMargins)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "pageMargins" element
     */
    @Override
    public boolean isSetPageMargins() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "pageMargins" element
     */
    @Override
    public void setPageMargins(com.microsoft.schemas.office.drawing.x2014.chartex.CTPageMargins pageMargins) {
        generatedSetterHelperImpl(pageMargins, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "pageMargins" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTPageMargins addNewPageMargins() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTPageMargins target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTPageMargins)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "pageMargins" element
     */
    @Override
    public void unsetPageMargins() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "pageSetup" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTPageSetup getPageSetup() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTPageSetup target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTPageSetup)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "pageSetup" element
     */
    @Override
    public boolean isSetPageSetup() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "pageSetup" element
     */
    @Override
    public void setPageSetup(com.microsoft.schemas.office.drawing.x2014.chartex.CTPageSetup pageSetup) {
        generatedSetterHelperImpl(pageSetup, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "pageSetup" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTPageSetup addNewPageSetup() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTPageSetup target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTPageSetup)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "pageSetup" element
     */
    @Override
    public void unsetPageSetup() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}

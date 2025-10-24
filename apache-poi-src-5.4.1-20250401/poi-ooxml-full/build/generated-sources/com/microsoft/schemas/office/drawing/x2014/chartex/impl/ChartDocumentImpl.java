/*
 * An XML document type.
 * Localname: chart
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.ChartDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one chart(@http://schemas.microsoft.com/office/drawing/2014/chartex) element.
 *
 * This is a complex type.
 */
public class ChartDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.ChartDocument {
    private static final long serialVersionUID = 1L;

    public ChartDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "chart"),
    };


    /**
     * Gets the "chart" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTRelId getChart() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTRelId target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTRelId)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "chart" element
     */
    @Override
    public void setChart(com.microsoft.schemas.office.drawing.x2014.chartex.CTRelId chart) {
        generatedSetterHelperImpl(chart, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "chart" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTRelId addNewChart() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTRelId target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTRelId)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

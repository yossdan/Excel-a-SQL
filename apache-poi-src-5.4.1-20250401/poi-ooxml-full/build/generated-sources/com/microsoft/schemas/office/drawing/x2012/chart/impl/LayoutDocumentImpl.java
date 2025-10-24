/*
 * An XML document type.
 * Localname: layout
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.LayoutDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one layout(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class LayoutDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.LayoutDocument {
    private static final long serialVersionUID = 1L;

    public LayoutDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "layout"),
    };


    /**
     * Gets the "layout" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout getLayout() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "layout" element
     */
    @Override
    public void setLayout(org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout layout) {
        generatedSetterHelperImpl(layout, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "layout" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout addNewLayout() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

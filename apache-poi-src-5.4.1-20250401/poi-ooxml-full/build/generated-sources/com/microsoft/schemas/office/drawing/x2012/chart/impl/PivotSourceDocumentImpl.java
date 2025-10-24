/*
 * An XML document type.
 * Localname: pivotSource
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.PivotSourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one pivotSource(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class PivotSourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.PivotSourceDocument {
    private static final long serialVersionUID = 1L;

    public PivotSourceDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "pivotSource"),
    };


    /**
     * Gets the "pivotSource" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource getPivotSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "pivotSource" element
     */
    @Override
    public void setPivotSource(org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource pivotSource) {
        generatedSetterHelperImpl(pivotSource, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "pivotSource" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource addNewPivotSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

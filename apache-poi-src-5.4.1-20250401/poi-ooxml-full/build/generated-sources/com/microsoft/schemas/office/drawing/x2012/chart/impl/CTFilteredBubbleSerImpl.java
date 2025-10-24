/*
 * XML Type:  CT_FilteredBubbleSer
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBubbleSer
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_FilteredBubbleSer(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public class CTFilteredBubbleSerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBubbleSer {
    private static final long serialVersionUID = 1L;

    public CTFilteredBubbleSerImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "ser"),
    };


    /**
     * Gets the "ser" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer getSer() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ser" element
     */
    @Override
    public void setSer(org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer ser) {
        generatedSetterHelperImpl(ser, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ser" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer addNewSer() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleSer)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

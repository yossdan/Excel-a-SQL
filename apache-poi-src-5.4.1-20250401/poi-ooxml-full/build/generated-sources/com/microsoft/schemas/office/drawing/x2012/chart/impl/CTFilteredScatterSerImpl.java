/*
 * XML Type:  CT_FilteredScatterSer
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_FilteredScatterSer(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public class CTFilteredScatterSerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer {
    private static final long serialVersionUID = 1L;

    public CTFilteredScatterSerImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "ser"),
    };


    /**
     * Gets the "ser" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer getSer() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ser" element
     */
    @Override
    public void setSer(org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer ser) {
        generatedSetterHelperImpl(ser, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ser" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer addNewSer() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

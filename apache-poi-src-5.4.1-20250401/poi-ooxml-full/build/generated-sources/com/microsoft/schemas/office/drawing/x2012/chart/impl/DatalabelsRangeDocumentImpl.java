/*
 * An XML document type.
 * Localname: datalabelsRange
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.DatalabelsRangeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one datalabelsRange(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class DatalabelsRangeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.DatalabelsRangeDocument {
    private static final long serialVersionUID = 1L;

    public DatalabelsRangeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "datalabelsRange"),
    };


    /**
     * Gets the "datalabelsRange" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange getDatalabelsRange() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "datalabelsRange" element
     */
    @Override
    public void setDatalabelsRange(com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange datalabelsRange) {
        generatedSetterHelperImpl(datalabelsRange, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "datalabelsRange" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange addNewDatalabelsRange() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTSeriesDataLabelsRange)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

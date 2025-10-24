/*
 * An XML document type.
 * Localname: filteredBubbleSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredBubbleSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one filteredBubbleSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class FilteredBubbleSeriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.FilteredBubbleSeriesDocument {
    private static final long serialVersionUID = 1L;

    public FilteredBubbleSeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "filteredBubbleSeries"),
    };


    /**
     * Gets the "filteredBubbleSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBubbleSer getFilteredBubbleSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBubbleSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBubbleSer)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "filteredBubbleSeries" element
     */
    @Override
    public void setFilteredBubbleSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBubbleSer filteredBubbleSeries) {
        generatedSetterHelperImpl(filteredBubbleSeries, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "filteredBubbleSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBubbleSer addNewFilteredBubbleSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBubbleSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBubbleSer)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

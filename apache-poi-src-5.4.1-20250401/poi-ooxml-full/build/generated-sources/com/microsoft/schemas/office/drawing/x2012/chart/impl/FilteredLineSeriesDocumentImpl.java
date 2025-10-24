/*
 * An XML document type.
 * Localname: filteredLineSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredLineSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one filteredLineSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class FilteredLineSeriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.FilteredLineSeriesDocument {
    private static final long serialVersionUID = 1L;

    public FilteredLineSeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "filteredLineSeries"),
    };


    /**
     * Gets the "filteredLineSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredLineSer getFilteredLineSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredLineSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredLineSer)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "filteredLineSeries" element
     */
    @Override
    public void setFilteredLineSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredLineSer filteredLineSeries) {
        generatedSetterHelperImpl(filteredLineSeries, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "filteredLineSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredLineSer addNewFilteredLineSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredLineSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredLineSer)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

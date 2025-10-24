/*
 * An XML document type.
 * Localname: filteredBarSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredBarSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one filteredBarSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class FilteredBarSeriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.FilteredBarSeriesDocument {
    private static final long serialVersionUID = 1L;

    public FilteredBarSeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "filteredBarSeries"),
    };


    /**
     * Gets the "filteredBarSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBarSer getFilteredBarSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBarSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBarSer)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "filteredBarSeries" element
     */
    @Override
    public void setFilteredBarSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBarSer filteredBarSeries) {
        generatedSetterHelperImpl(filteredBarSeries, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "filteredBarSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBarSer addNewFilteredBarSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBarSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredBarSer)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

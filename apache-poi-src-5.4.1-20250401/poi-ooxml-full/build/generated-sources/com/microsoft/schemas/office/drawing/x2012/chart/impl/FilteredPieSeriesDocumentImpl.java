/*
 * An XML document type.
 * Localname: filteredPieSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredPieSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one filteredPieSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class FilteredPieSeriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.FilteredPieSeriesDocument {
    private static final long serialVersionUID = 1L;

    public FilteredPieSeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "filteredPieSeries"),
    };


    /**
     * Gets the "filteredPieSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredPieSer getFilteredPieSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredPieSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredPieSer)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "filteredPieSeries" element
     */
    @Override
    public void setFilteredPieSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredPieSer filteredPieSeries) {
        generatedSetterHelperImpl(filteredPieSeries, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "filteredPieSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredPieSer addNewFilteredPieSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredPieSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredPieSer)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

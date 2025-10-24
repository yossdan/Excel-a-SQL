/*
 * An XML document type.
 * Localname: filteredAreaSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredAreaSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one filteredAreaSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class FilteredAreaSeriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.FilteredAreaSeriesDocument {
    private static final long serialVersionUID = 1L;

    public FilteredAreaSeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "filteredAreaSeries"),
    };


    /**
     * Gets the "filteredAreaSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredAreaSer getFilteredAreaSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredAreaSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredAreaSer)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "filteredAreaSeries" element
     */
    @Override
    public void setFilteredAreaSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredAreaSer filteredAreaSeries) {
        generatedSetterHelperImpl(filteredAreaSeries, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "filteredAreaSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredAreaSer addNewFilteredAreaSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredAreaSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredAreaSer)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

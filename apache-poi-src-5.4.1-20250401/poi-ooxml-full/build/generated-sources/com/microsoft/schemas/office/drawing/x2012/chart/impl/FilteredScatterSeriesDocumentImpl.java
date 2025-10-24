/*
 * An XML document type.
 * Localname: filteredScatterSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredScatterSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one filteredScatterSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class FilteredScatterSeriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.FilteredScatterSeriesDocument {
    private static final long serialVersionUID = 1L;

    public FilteredScatterSeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "filteredScatterSeries"),
    };


    /**
     * Gets the "filteredScatterSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer getFilteredScatterSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "filteredScatterSeries" element
     */
    @Override
    public void setFilteredScatterSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer filteredScatterSeries) {
        generatedSetterHelperImpl(filteredScatterSeries, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "filteredScatterSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer addNewFilteredScatterSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredScatterSer)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

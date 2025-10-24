/*
 * An XML document type.
 * Localname: filteredSurfaceSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredSurfaceSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one filteredSurfaceSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class FilteredSurfaceSeriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.FilteredSurfaceSeriesDocument {
    private static final long serialVersionUID = 1L;

    public FilteredSurfaceSeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "filteredSurfaceSeries"),
    };


    /**
     * Gets the "filteredSurfaceSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSurfaceSer getFilteredSurfaceSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSurfaceSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSurfaceSer)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "filteredSurfaceSeries" element
     */
    @Override
    public void setFilteredSurfaceSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSurfaceSer filteredSurfaceSeries) {
        generatedSetterHelperImpl(filteredSurfaceSeries, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "filteredSurfaceSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSurfaceSer addNewFilteredSurfaceSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSurfaceSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSurfaceSer)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

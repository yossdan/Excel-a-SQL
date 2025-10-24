/*
 * An XML document type.
 * Localname: filteredRadarSeries
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredRadarSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one filteredRadarSeries(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class FilteredRadarSeriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.FilteredRadarSeriesDocument {
    private static final long serialVersionUID = 1L;

    public FilteredRadarSeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "filteredRadarSeries"),
    };


    /**
     * Gets the "filteredRadarSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredRadarSer getFilteredRadarSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredRadarSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredRadarSer)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "filteredRadarSeries" element
     */
    @Override
    public void setFilteredRadarSeries(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredRadarSer filteredRadarSeries) {
        generatedSetterHelperImpl(filteredRadarSeries, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "filteredRadarSeries" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredRadarSer addNewFilteredRadarSeries() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredRadarSer target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredRadarSer)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

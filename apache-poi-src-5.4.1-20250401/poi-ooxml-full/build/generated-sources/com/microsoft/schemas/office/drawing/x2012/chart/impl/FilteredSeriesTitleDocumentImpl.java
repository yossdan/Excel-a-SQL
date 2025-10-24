/*
 * An XML document type.
 * Localname: filteredSeriesTitle
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredSeriesTitleDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one filteredSeriesTitle(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class FilteredSeriesTitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.FilteredSeriesTitleDocument {
    private static final long serialVersionUID = 1L;

    public FilteredSeriesTitleDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "filteredSeriesTitle"),
    };


    /**
     * Gets the "filteredSeriesTitle" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSeriesTitle getFilteredSeriesTitle() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSeriesTitle target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSeriesTitle)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "filteredSeriesTitle" element
     */
    @Override
    public void setFilteredSeriesTitle(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSeriesTitle filteredSeriesTitle) {
        generatedSetterHelperImpl(filteredSeriesTitle, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "filteredSeriesTitle" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSeriesTitle addNewFilteredSeriesTitle() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSeriesTitle target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredSeriesTitle)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

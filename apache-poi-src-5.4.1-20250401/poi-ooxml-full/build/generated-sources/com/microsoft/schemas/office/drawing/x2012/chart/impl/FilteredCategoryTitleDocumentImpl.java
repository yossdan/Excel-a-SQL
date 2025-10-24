/*
 * An XML document type.
 * Localname: filteredCategoryTitle
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredCategoryTitleDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one filteredCategoryTitle(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class FilteredCategoryTitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.FilteredCategoryTitleDocument {
    private static final long serialVersionUID = 1L;

    public FilteredCategoryTitleDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "filteredCategoryTitle"),
    };


    /**
     * Gets the "filteredCategoryTitle" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredCategoryTitle getFilteredCategoryTitle() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredCategoryTitle target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredCategoryTitle)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "filteredCategoryTitle" element
     */
    @Override
    public void setFilteredCategoryTitle(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredCategoryTitle filteredCategoryTitle) {
        generatedSetterHelperImpl(filteredCategoryTitle, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "filteredCategoryTitle" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredCategoryTitle addNewFilteredCategoryTitle() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredCategoryTitle target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredCategoryTitle)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

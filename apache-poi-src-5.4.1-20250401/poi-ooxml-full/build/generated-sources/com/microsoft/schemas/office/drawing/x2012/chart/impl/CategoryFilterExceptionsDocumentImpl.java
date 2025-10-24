/*
 * An XML document type.
 * Localname: categoryFilterExceptions
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CategoryFilterExceptionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one categoryFilterExceptions(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class CategoryFilterExceptionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.CategoryFilterExceptionsDocument {
    private static final long serialVersionUID = 1L;

    public CategoryFilterExceptionsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "categoryFilterExceptions"),
    };


    /**
     * Gets the "categoryFilterExceptions" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions getCategoryFilterExceptions() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "categoryFilterExceptions" element
     */
    @Override
    public void setCategoryFilterExceptions(com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions categoryFilterExceptions) {
        generatedSetterHelperImpl(categoryFilterExceptions, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "categoryFilterExceptions" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions addNewCategoryFilterExceptions() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

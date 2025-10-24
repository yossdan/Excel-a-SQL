/*
 * XML Type:  CT_CategoryFilterExceptions
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_CategoryFilterExceptions(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public class CTCategoryFilterExceptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions {
    private static final long serialVersionUID = 1L;

    public CTCategoryFilterExceptionsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "categoryFilterException"),
    };


    /**
     * Gets a List of "categoryFilterException" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException> getCategoryFilterExceptionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategoryFilterExceptionArray,
                this::setCategoryFilterExceptionArray,
                this::insertNewCategoryFilterException,
                this::removeCategoryFilterException,
                this::sizeOfCategoryFilterExceptionArray
            );
        }
    }

    /**
     * Gets array of all "categoryFilterException" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException[] getCategoryFilterExceptionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException[0]);
    }

    /**
     * Gets ith "categoryFilterException" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException getCategoryFilterExceptionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "categoryFilterException" element
     */
    @Override
    public int sizeOfCategoryFilterExceptionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "categoryFilterException" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCategoryFilterExceptionArray(com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException[] categoryFilterExceptionArray) {
        check_orphaned();
        arraySetterHelper(categoryFilterExceptionArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "categoryFilterException" element
     */
    @Override
    public void setCategoryFilterExceptionArray(int i, com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException categoryFilterException) {
        generatedSetterHelperImpl(categoryFilterException, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "categoryFilterException" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException insertNewCategoryFilterException(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "categoryFilterException" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException addNewCategoryFilterException() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "categoryFilterException" element
     */
    @Override
    public void removeCategoryFilterException(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

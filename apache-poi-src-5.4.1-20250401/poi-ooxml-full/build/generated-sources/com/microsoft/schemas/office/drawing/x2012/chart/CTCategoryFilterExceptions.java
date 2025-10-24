/*
 * XML Type:  CT_CategoryFilterExceptions
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_CategoryFilterExceptions(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public interface CTCategoryFilterExceptions extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcategoryfilterexceptions5097type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "categoryFilterException" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException> getCategoryFilterExceptionList();

    /**
     * Gets array of all "categoryFilterException" elements
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException[] getCategoryFilterExceptionArray();

    /**
     * Gets ith "categoryFilterException" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException getCategoryFilterExceptionArray(int i);

    /**
     * Returns number of "categoryFilterException" element
     */
    int sizeOfCategoryFilterExceptionArray();

    /**
     * Sets array of all "categoryFilterException" element
     */
    void setCategoryFilterExceptionArray(com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException[] categoryFilterExceptionArray);

    /**
     * Sets ith "categoryFilterException" element
     */
    void setCategoryFilterExceptionArray(int i, com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException categoryFilterException);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "categoryFilterException" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException insertNewCategoryFilterException(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "categoryFilterException" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterException addNewCategoryFilterException();

    /**
     * Removes the ith "categoryFilterException" element
     */
    void removeCategoryFilterException(int i);
}

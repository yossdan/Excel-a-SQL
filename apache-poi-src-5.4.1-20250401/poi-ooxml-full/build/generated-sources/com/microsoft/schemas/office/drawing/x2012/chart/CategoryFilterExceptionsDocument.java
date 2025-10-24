/*
 * An XML document type.
 * Localname: categoryFilterExceptions
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CategoryFilterExceptionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one categoryFilterExceptions(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface CategoryFilterExceptionsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.CategoryFilterExceptionsDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "categoryfilterexceptions10c3doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "categoryFilterExceptions" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions getCategoryFilterExceptions();

    /**
     * Sets the "categoryFilterExceptions" element
     */
    void setCategoryFilterExceptions(com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions categoryFilterExceptions);

    /**
     * Appends and returns a new empty "categoryFilterExceptions" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTCategoryFilterExceptions addNewCategoryFilterExceptions();
}

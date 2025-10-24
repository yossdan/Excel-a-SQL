/*
 * An XML document type.
 * Localname: filteredCategoryTitle
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FilteredCategoryTitleDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one filteredCategoryTitle(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface FilteredCategoryTitleDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.FilteredCategoryTitleDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "filteredcategorytitle9cccdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "filteredCategoryTitle" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredCategoryTitle getFilteredCategoryTitle();

    /**
     * Sets the "filteredCategoryTitle" element
     */
    void setFilteredCategoryTitle(com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredCategoryTitle filteredCategoryTitle);

    /**
     * Appends and returns a new empty "filteredCategoryTitle" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredCategoryTitle addNewFilteredCategoryTitle();
}

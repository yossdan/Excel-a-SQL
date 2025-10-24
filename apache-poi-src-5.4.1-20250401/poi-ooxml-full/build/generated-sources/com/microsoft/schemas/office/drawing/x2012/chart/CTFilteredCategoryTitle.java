/*
 * XML Type:  CT_FilteredCategoryTitle
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredCategoryTitle
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_FilteredCategoryTitle(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public interface CTFilteredCategoryTitle extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.CTFilteredCategoryTitle> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctfilteredcategorytitle8d78type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "cat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource getCat();

    /**
     * Sets the "cat" element
     */
    void setCat(org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource cat);

    /**
     * Appends and returns a new empty "cat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource addNewCat();
}

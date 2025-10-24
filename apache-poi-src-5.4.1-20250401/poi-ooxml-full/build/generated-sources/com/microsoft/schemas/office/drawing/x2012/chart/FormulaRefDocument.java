/*
 * An XML document type.
 * Localname: formulaRef
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FormulaRefDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one formulaRef(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface FormulaRefDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.FormulaRefDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "formularefdb10doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "formulaRef" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFormulaRef getFormulaRef();

    /**
     * Sets the "formulaRef" element
     */
    void setFormulaRef(com.microsoft.schemas.office.drawing.x2012.chart.CTFormulaRef formulaRef);

    /**
     * Appends and returns a new empty "formulaRef" element
     */
    com.microsoft.schemas.office.drawing.x2012.chart.CTFormulaRef addNewFormulaRef();
}

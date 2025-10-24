/*
 * XML Type:  CT_FormulaRef
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTFormulaRef
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_FormulaRef(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public interface CTFormulaRef extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.CTFormulaRef> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctformularef9de4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "sqref" element
     */
    java.lang.String getSqref();

    /**
     * Gets (as xml) the "sqref" element
     */
    org.apache.xmlbeans.XmlString xgetSqref();

    /**
     * Sets the "sqref" element
     */
    void setSqref(java.lang.String sqref);

    /**
     * Sets (as xml) the "sqref" element
     */
    void xsetSqref(org.apache.xmlbeans.XmlString sqref);
}

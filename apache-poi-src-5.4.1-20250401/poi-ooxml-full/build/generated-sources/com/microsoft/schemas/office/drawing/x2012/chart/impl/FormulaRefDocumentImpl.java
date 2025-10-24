/*
 * An XML document type.
 * Localname: formulaRef
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FormulaRefDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one formulaRef(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class FormulaRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.FormulaRefDocument {
    private static final long serialVersionUID = 1L;

    public FormulaRefDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "formulaRef"),
    };


    /**
     * Gets the "formulaRef" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFormulaRef getFormulaRef() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFormulaRef target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFormulaRef)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "formulaRef" element
     */
    @Override
    public void setFormulaRef(com.microsoft.schemas.office.drawing.x2012.chart.CTFormulaRef formulaRef) {
        generatedSetterHelperImpl(formulaRef, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "formulaRef" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFormulaRef addNewFormulaRef() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFormulaRef target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFormulaRef)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

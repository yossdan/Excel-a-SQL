/*
 * An XML document type.
 * Localname: fullRef
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.FullRefDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one fullRef(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class FullRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.FullRefDocument {
    private static final long serialVersionUID = 1L;

    public FullRefDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "fullRef"),
    };


    /**
     * Gets the "fullRef" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFullRef getFullRef() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFullRef target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFullRef)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "fullRef" element
     */
    @Override
    public void setFullRef(com.microsoft.schemas.office.drawing.x2012.chart.CTFullRef fullRef) {
        generatedSetterHelperImpl(fullRef, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "fullRef" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTFullRef addNewFullRef() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTFullRef target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTFullRef)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

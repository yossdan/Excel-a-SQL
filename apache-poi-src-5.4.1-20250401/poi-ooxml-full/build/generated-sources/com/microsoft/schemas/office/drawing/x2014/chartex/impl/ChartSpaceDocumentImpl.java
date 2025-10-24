/*
 * An XML document type.
 * Localname: chartSpace
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.ChartSpaceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one chartSpace(@http://schemas.microsoft.com/office/drawing/2014/chartex) element.
 *
 * This is a complex type.
 */
public class ChartSpaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.ChartSpaceDocument {
    private static final long serialVersionUID = 1L;

    public ChartSpaceDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "chartSpace"),
    };


    /**
     * Gets the "chartSpace" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTChartSpace getChartSpace() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTChartSpace target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTChartSpace)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "chartSpace" element
     */
    @Override
    public void setChartSpace(com.microsoft.schemas.office.drawing.x2014.chartex.CTChartSpace chartSpace) {
        generatedSetterHelperImpl(chartSpace, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "chartSpace" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTChartSpace addNewChartSpace() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTChartSpace target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTChartSpace)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

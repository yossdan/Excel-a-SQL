/*
 * An XML document type.
 * Localname: numFmt
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.NumFmtDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one numFmt(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class NumFmtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.NumFmtDocument {
    private static final long serialVersionUID = 1L;

    public NumFmtDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "numFmt"),
    };


    /**
     * Gets the "numFmt" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt getNumFmt() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "numFmt" element
     */
    @Override
    public void setNumFmt(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt numFmt) {
        generatedSetterHelperImpl(numFmt, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "numFmt" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt addNewNumFmt() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

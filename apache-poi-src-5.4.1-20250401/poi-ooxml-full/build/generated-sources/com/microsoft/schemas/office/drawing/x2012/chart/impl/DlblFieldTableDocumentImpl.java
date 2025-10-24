/*
 * An XML document type.
 * Localname: dlblFieldTable
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.DlblFieldTableDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one dlblFieldTable(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class DlblFieldTableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.DlblFieldTableDocument {
    private static final long serialVersionUID = 1L;

    public DlblFieldTableDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "dlblFieldTable"),
    };


    /**
     * Gets the "dlblFieldTable" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable getDlblFieldTable() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "dlblFieldTable" element
     */
    @Override
    public void setDlblFieldTable(com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable dlblFieldTable) {
        generatedSetterHelperImpl(dlblFieldTable, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "dlblFieldTable" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable addNewDlblFieldTable() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTable)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

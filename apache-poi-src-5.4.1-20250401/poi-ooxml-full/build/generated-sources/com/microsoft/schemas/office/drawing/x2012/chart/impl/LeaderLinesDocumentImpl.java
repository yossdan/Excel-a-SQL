/*
 * An XML document type.
 * Localname: leaderLines
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.LeaderLinesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one leaderLines(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class LeaderLinesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.LeaderLinesDocument {
    private static final long serialVersionUID = 1L;

    public LeaderLinesDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "leaderLines"),
    };


    /**
     * Gets the "leaderLines" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines getLeaderLines() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "leaderLines" element
     */
    @Override
    public void setLeaderLines(org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines leaderLines) {
        generatedSetterHelperImpl(leaderLines, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "leaderLines" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines addNewLeaderLines() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: leaderLines
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.LeaderLinesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one leaderLines(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public interface LeaderLinesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.LeaderLinesDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "leaderlinesee59doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "leaderLines" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines getLeaderLines();

    /**
     * Sets the "leaderLines" element
     */
    void setLeaderLines(org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines leaderLines);

    /**
     * Appends and returns a new empty "leaderLines" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines addNewLeaderLines();
}

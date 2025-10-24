/*
 * XML Type:  CT_GeoPolygon
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoPolygon(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoPolygon extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoPolygon> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeopolygon4bbdtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "polygonId" attribute
     */
    java.lang.String getPolygonId();

    /**
     * Gets (as xml) the "polygonId" attribute
     */
    org.apache.xmlbeans.XmlString xgetPolygonId();

    /**
     * Sets the "polygonId" attribute
     */
    void setPolygonId(java.lang.String polygonId);

    /**
     * Sets (as xml) the "polygonId" attribute
     */
    void xsetPolygonId(org.apache.xmlbeans.XmlString polygonId);

    /**
     * Gets the "numPoints" attribute
     */
    java.math.BigInteger getNumPoints();

    /**
     * Gets (as xml) the "numPoints" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetNumPoints();

    /**
     * Sets the "numPoints" attribute
     */
    void setNumPoints(java.math.BigInteger numPoints);

    /**
     * Sets (as xml) the "numPoints" attribute
     */
    void xsetNumPoints(org.apache.xmlbeans.XmlInteger numPoints);

    /**
     * Gets the "pcaRings" attribute
     */
    java.lang.String getPcaRings();

    /**
     * Gets (as xml) the "pcaRings" attribute
     */
    org.apache.xmlbeans.XmlString xgetPcaRings();

    /**
     * Sets the "pcaRings" attribute
     */
    void setPcaRings(java.lang.String pcaRings);

    /**
     * Sets (as xml) the "pcaRings" attribute
     */
    void xsetPcaRings(org.apache.xmlbeans.XmlString pcaRings);
}

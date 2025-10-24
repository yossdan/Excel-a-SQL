/*
 * XML Type:  CT_SphereCoords
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTSphereCoords
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_SphereCoords(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTSphereCoords extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTSphereCoords> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctspherecoords20fdtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "lat" attribute
     */
    int getLat();

    /**
     * Gets (as xml) the "lat" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetLat();

    /**
     * Sets the "lat" attribute
     */
    void setLat(int lat);

    /**
     * Sets (as xml) the "lat" attribute
     */
    void xsetLat(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle lat);

    /**
     * Gets the "lon" attribute
     */
    int getLon();

    /**
     * Gets (as xml) the "lon" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetLon();

    /**
     * Sets the "lon" attribute
     */
    void setLon(int lon);

    /**
     * Sets (as xml) the "lon" attribute
     */
    void xsetLon(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle lon);

    /**
     * Gets the "rev" attribute
     */
    int getRev();

    /**
     * Gets (as xml) the "rev" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetRev();

    /**
     * Sets the "rev" attribute
     */
    void setRev(int rev);

    /**
     * Sets (as xml) the "rev" attribute
     */
    void xsetRev(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle rev);
}

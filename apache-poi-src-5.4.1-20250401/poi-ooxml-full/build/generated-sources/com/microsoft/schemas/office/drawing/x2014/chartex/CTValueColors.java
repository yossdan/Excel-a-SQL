/*
 * XML Type:  CT_ValueColors
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ValueColors(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTValueColors extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctvaluecolorscf0ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "minColor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties getMinColor();

    /**
     * True if has "minColor" element
     */
    boolean isSetMinColor();

    /**
     * Sets the "minColor" element
     */
    void setMinColor(org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties minColor);

    /**
     * Appends and returns a new empty "minColor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties addNewMinColor();

    /**
     * Unsets the "minColor" element
     */
    void unsetMinColor();

    /**
     * Gets the "midColor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties getMidColor();

    /**
     * True if has "midColor" element
     */
    boolean isSetMidColor();

    /**
     * Sets the "midColor" element
     */
    void setMidColor(org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties midColor);

    /**
     * Appends and returns a new empty "midColor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties addNewMidColor();

    /**
     * Unsets the "midColor" element
     */
    void unsetMidColor();

    /**
     * Gets the "maxColor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties getMaxColor();

    /**
     * True if has "maxColor" element
     */
    boolean isSetMaxColor();

    /**
     * Sets the "maxColor" element
     */
    void setMaxColor(org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties maxColor);

    /**
     * Appends and returns a new empty "maxColor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties addNewMaxColor();

    /**
     * Unsets the "maxColor" element
     */
    void unsetMaxColor();
}

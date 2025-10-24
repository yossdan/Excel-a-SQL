/*
 * XML Type:  CT_DataLabelHidden
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_DataLabelHidden(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTDataLabelHidden extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdatalabelhiddenee7ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "idx" attribute
     */
    long getIdx();

    /**
     * Gets (as xml) the "idx" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetIdx();

    /**
     * Sets the "idx" attribute
     */
    void setIdx(long idx);

    /**
     * Sets (as xml) the "idx" attribute
     */
    void xsetIdx(org.apache.xmlbeans.XmlUnsignedInt idx);
}

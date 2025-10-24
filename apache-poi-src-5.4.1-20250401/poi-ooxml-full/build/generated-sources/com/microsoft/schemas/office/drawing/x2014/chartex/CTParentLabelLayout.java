/*
 * XML Type:  CT_ParentLabelLayout
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTParentLabelLayout
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ParentLabelLayout(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTParentLabelLayout extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTParentLabelLayout> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctparentlabellayout64bctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "val" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STParentLabelLayout.Enum getVal();

    /**
     * Gets (as xml) the "val" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STParentLabelLayout xgetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(com.microsoft.schemas.office.drawing.x2014.chartex.STParentLabelLayout.Enum val);

    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(com.microsoft.schemas.office.drawing.x2014.chartex.STParentLabelLayout val);
}

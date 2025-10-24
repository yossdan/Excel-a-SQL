/*
 * XML Type:  CT_SubtotalIndex
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_SubtotalIndex(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTSubtotalIndex extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTSubtotalIndex> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsubtotalindexee82type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "val" attribute
     */
    long getVal();

    /**
     * Gets (as xml) the "val" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(long val);

    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.apache.xmlbeans.XmlUnsignedInt val);
}

/*
 * XML Type:  CT_TextData
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTTextData
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_TextData(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTTextData extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTTextData> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "cttextdatae06ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "f" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula getF();

    /**
     * True if has "f" element
     */
    boolean isSetF();

    /**
     * Sets the "f" element
     */
    void setF(com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula f);

    /**
     * Appends and returns a new empty "f" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula addNewF();

    /**
     * Unsets the "f" element
     */
    void unsetF();

    /**
     * Gets the "v" element
     */
    java.lang.String getV();

    /**
     * Gets (as xml) the "v" element
     */
    org.apache.xmlbeans.XmlString xgetV();

    /**
     * True if has "v" element
     */
    boolean isSetV();

    /**
     * Sets the "v" element
     */
    void setV(java.lang.String v);

    /**
     * Sets (as xml) the "v" element
     */
    void xsetV(org.apache.xmlbeans.XmlString v);

    /**
     * Unsets the "v" element
     */
    void unsetV();
}

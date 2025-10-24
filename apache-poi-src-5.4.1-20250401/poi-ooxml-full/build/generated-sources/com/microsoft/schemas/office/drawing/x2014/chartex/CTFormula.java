/*
 * XML Type:  CT_Formula
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Formula(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula.
 */
public interface CTFormula extends org.apache.xmlbeans.XmlString {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctformula720atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "dir" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection.Enum getDir();

    /**
     * Gets (as xml) the "dir" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection xgetDir();

    /**
     * True if has "dir" attribute
     */
    boolean isSetDir();

    /**
     * Sets the "dir" attribute
     */
    void setDir(com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection.Enum dir);

    /**
     * Sets (as xml) the "dir" attribute
     */
    void xsetDir(com.microsoft.schemas.office.drawing.x2014.chartex.STFormulaDirection dir);

    /**
     * Unsets the "dir" attribute
     */
    void unsetDir();
}

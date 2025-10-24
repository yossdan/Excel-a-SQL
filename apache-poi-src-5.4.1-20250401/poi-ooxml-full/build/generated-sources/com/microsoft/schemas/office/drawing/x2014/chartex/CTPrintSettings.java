/*
 * XML Type:  CT_PrintSettings
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTPrintSettings
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_PrintSettings(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTPrintSettings extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTPrintSettings> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctprintsettings3500type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "headerFooter" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTHeaderFooter getHeaderFooter();

    /**
     * True if has "headerFooter" element
     */
    boolean isSetHeaderFooter();

    /**
     * Sets the "headerFooter" element
     */
    void setHeaderFooter(com.microsoft.schemas.office.drawing.x2014.chartex.CTHeaderFooter headerFooter);

    /**
     * Appends and returns a new empty "headerFooter" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTHeaderFooter addNewHeaderFooter();

    /**
     * Unsets the "headerFooter" element
     */
    void unsetHeaderFooter();

    /**
     * Gets the "pageMargins" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPageMargins getPageMargins();

    /**
     * True if has "pageMargins" element
     */
    boolean isSetPageMargins();

    /**
     * Sets the "pageMargins" element
     */
    void setPageMargins(com.microsoft.schemas.office.drawing.x2014.chartex.CTPageMargins pageMargins);

    /**
     * Appends and returns a new empty "pageMargins" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPageMargins addNewPageMargins();

    /**
     * Unsets the "pageMargins" element
     */
    void unsetPageMargins();

    /**
     * Gets the "pageSetup" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPageSetup getPageSetup();

    /**
     * True if has "pageSetup" element
     */
    boolean isSetPageSetup();

    /**
     * Sets the "pageSetup" element
     */
    void setPageSetup(com.microsoft.schemas.office.drawing.x2014.chartex.CTPageSetup pageSetup);

    /**
     * Appends and returns a new empty "pageSetup" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTPageSetup addNewPageSetup();

    /**
     * Unsets the "pageSetup" element
     */
    void unsetPageSetup();
}

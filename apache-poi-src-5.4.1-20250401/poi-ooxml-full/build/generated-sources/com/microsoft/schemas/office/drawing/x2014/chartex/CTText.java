/*
 * XML Type:  CT_Text
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTText
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Text(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTText extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTText> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "cttext8bf9type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "txData" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTTextData getTxData();

    /**
     * True if has "txData" element
     */
    boolean isSetTxData();

    /**
     * Sets the "txData" element
     */
    void setTxData(com.microsoft.schemas.office.drawing.x2014.chartex.CTTextData txData);

    /**
     * Appends and returns a new empty "txData" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTTextData addNewTxData();

    /**
     * Unsets the "txData" element
     */
    void unsetTxData();

    /**
     * Gets the "rich" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getRich();

    /**
     * True if has "rich" element
     */
    boolean isSetRich();

    /**
     * Sets the "rich" element
     */
    void setRich(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody rich);

    /**
     * Appends and returns a new empty "rich" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewRich();

    /**
     * Unsets the "rich" element
     */
    void unsetRich();
}

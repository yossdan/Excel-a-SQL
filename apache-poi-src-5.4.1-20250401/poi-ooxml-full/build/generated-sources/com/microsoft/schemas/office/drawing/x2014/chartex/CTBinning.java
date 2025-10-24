/*
 * XML Type:  CT_Binning
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Binning(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTBinning extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTBinning> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctbinningc6d5type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "binSize" element
     */
    double getBinSize();

    /**
     * Gets (as xml) the "binSize" element
     */
    org.apache.xmlbeans.XmlDouble xgetBinSize();

    /**
     * True if has "binSize" element
     */
    boolean isSetBinSize();

    /**
     * Sets the "binSize" element
     */
    void setBinSize(double binSize);

    /**
     * Sets (as xml) the "binSize" element
     */
    void xsetBinSize(org.apache.xmlbeans.XmlDouble binSize);

    /**
     * Unsets the "binSize" element
     */
    void unsetBinSize();

    /**
     * Gets the "binCount" element
     */
    long getBinCount();

    /**
     * Gets (as xml) the "binCount" element
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetBinCount();

    /**
     * True if has "binCount" element
     */
    boolean isSetBinCount();

    /**
     * Sets the "binCount" element
     */
    void setBinCount(long binCount);

    /**
     * Sets (as xml) the "binCount" element
     */
    void xsetBinCount(org.apache.xmlbeans.XmlUnsignedInt binCount);

    /**
     * Unsets the "binCount" element
     */
    void unsetBinCount();

    /**
     * Gets the "intervalClosed" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide.Enum getIntervalClosed();

    /**
     * Gets (as xml) the "intervalClosed" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide xgetIntervalClosed();

    /**
     * True if has "intervalClosed" attribute
     */
    boolean isSetIntervalClosed();

    /**
     * Sets the "intervalClosed" attribute
     */
    void setIntervalClosed(com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide.Enum intervalClosed);

    /**
     * Sets (as xml) the "intervalClosed" attribute
     */
    void xsetIntervalClosed(com.microsoft.schemas.office.drawing.x2014.chartex.STIntervalClosedSide intervalClosed);

    /**
     * Unsets the "intervalClosed" attribute
     */
    void unsetIntervalClosed();

    /**
     * Gets the "underflow" attribute
     */
    java.lang.Object getUnderflow();

    /**
     * Gets (as xml) the "underflow" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic xgetUnderflow();

    /**
     * True if has "underflow" attribute
     */
    boolean isSetUnderflow();

    /**
     * Sets the "underflow" attribute
     */
    void setUnderflow(java.lang.Object underflow);

    /**
     * Sets (as xml) the "underflow" attribute
     */
    void xsetUnderflow(com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic underflow);

    /**
     * Unsets the "underflow" attribute
     */
    void unsetUnderflow();

    /**
     * Gets the "overflow" attribute
     */
    java.lang.Object getOverflow();

    /**
     * Gets (as xml) the "overflow" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic xgetOverflow();

    /**
     * True if has "overflow" attribute
     */
    boolean isSetOverflow();

    /**
     * Sets the "overflow" attribute
     */
    void setOverflow(java.lang.Object overflow);

    /**
     * Sets (as xml) the "overflow" attribute
     */
    void xsetOverflow(com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic overflow);

    /**
     * Unsets the "overflow" attribute
     */
    void unsetOverflow();
}

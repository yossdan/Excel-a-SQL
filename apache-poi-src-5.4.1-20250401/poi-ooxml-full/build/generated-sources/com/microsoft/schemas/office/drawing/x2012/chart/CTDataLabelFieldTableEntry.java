/*
 * XML Type:  CT_DataLabelFieldTableEntry
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_DataLabelFieldTableEntry(@http://schemas.microsoft.com/office/drawing/2012/chart).
 *
 * This is a complex type.
 */
public interface CTDataLabelFieldTableEntry extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2012.chart.CTDataLabelFieldTableEntry> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdatalabelfieldtableentry2cfdtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "txfldGUID" element
     */
    java.lang.String getTxfldGUID();

    /**
     * Gets (as xml) the "txfldGUID" element
     */
    org.apache.xmlbeans.XmlString xgetTxfldGUID();

    /**
     * Sets the "txfldGUID" element
     */
    void setTxfldGUID(java.lang.String txfldGUID);

    /**
     * Sets (as xml) the "txfldGUID" element
     */
    void xsetTxfldGUID(org.apache.xmlbeans.XmlString txfldGUID);

    /**
     * Gets the "f" element
     */
    java.lang.String getF();

    /**
     * Gets (as xml) the "f" element
     */
    org.apache.xmlbeans.XmlString xgetF();

    /**
     * Sets the "f" element
     */
    void setF(java.lang.String f);

    /**
     * Sets (as xml) the "f" element
     */
    void xsetF(org.apache.xmlbeans.XmlString f);

    /**
     * Gets the "dlblFieldTableCache" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData getDlblFieldTableCache();

    /**
     * True if has "dlblFieldTableCache" element
     */
    boolean isSetDlblFieldTableCache();

    /**
     * Sets the "dlblFieldTableCache" element
     */
    void setDlblFieldTableCache(org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData dlblFieldTableCache);

    /**
     * Appends and returns a new empty "dlblFieldTableCache" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData addNewDlblFieldTableCache();

    /**
     * Unsets the "dlblFieldTableCache" element
     */
    void unsetDlblFieldTableCache();
}

/*
 * XML Type:  CT_FormatOverrides
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverrides
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_FormatOverrides(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTFormatOverrides extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverrides> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctformatoverridesf9c0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "fmtOvr" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride> getFmtOvrList();

    /**
     * Gets array of all "fmtOvr" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride[] getFmtOvrArray();

    /**
     * Gets ith "fmtOvr" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride getFmtOvrArray(int i);

    /**
     * Returns number of "fmtOvr" element
     */
    int sizeOfFmtOvrArray();

    /**
     * Sets array of all "fmtOvr" element
     */
    void setFmtOvrArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride[] fmtOvrArray);

    /**
     * Sets ith "fmtOvr" element
     */
    void setFmtOvrArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride fmtOvr);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "fmtOvr" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride insertNewFmtOvr(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "fmtOvr" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride addNewFmtOvr();

    /**
     * Removes the ith "fmtOvr" element
     */
    void removeFmtOvr(int i);
}

/*
 * XML Type:  CT_Props3D
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTProps3D
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Props3D(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTProps3D extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTProps3D> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctprops3d0551type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "bevelT" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTBevel getBevelT();

    /**
     * True if has "bevelT" element
     */
    boolean isSetBevelT();

    /**
     * Sets the "bevelT" element
     */
    void setBevelT(com.microsoft.schemas.office.word.x2010.wordml.CTBevel bevelT);

    /**
     * Appends and returns a new empty "bevelT" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTBevel addNewBevelT();

    /**
     * Unsets the "bevelT" element
     */
    void unsetBevelT();

    /**
     * Gets the "bevelB" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTBevel getBevelB();

    /**
     * True if has "bevelB" element
     */
    boolean isSetBevelB();

    /**
     * Sets the "bevelB" element
     */
    void setBevelB(com.microsoft.schemas.office.word.x2010.wordml.CTBevel bevelB);

    /**
     * Appends and returns a new empty "bevelB" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTBevel addNewBevelB();

    /**
     * Unsets the "bevelB" element
     */
    void unsetBevelB();

    /**
     * Gets the "extrusionClr" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTColor getExtrusionClr();

    /**
     * True if has "extrusionClr" element
     */
    boolean isSetExtrusionClr();

    /**
     * Sets the "extrusionClr" element
     */
    void setExtrusionClr(com.microsoft.schemas.office.word.x2010.wordml.CTColor extrusionClr);

    /**
     * Appends and returns a new empty "extrusionClr" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTColor addNewExtrusionClr();

    /**
     * Unsets the "extrusionClr" element
     */
    void unsetExtrusionClr();

    /**
     * Gets the "contourClr" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTColor getContourClr();

    /**
     * True if has "contourClr" element
     */
    boolean isSetContourClr();

    /**
     * Sets the "contourClr" element
     */
    void setContourClr(com.microsoft.schemas.office.word.x2010.wordml.CTColor contourClr);

    /**
     * Appends and returns a new empty "contourClr" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTColor addNewContourClr();

    /**
     * Unsets the "contourClr" element
     */
    void unsetContourClr();

    /**
     * Gets the "extrusionH" attribute
     */
    long getExtrusionH();

    /**
     * Gets (as xml) the "extrusionH" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetExtrusionH();

    /**
     * True if has "extrusionH" attribute
     */
    boolean isSetExtrusionH();

    /**
     * Sets the "extrusionH" attribute
     */
    void setExtrusionH(long extrusionH);

    /**
     * Sets (as xml) the "extrusionH" attribute
     */
    void xsetExtrusionH(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate extrusionH);

    /**
     * Unsets the "extrusionH" attribute
     */
    void unsetExtrusionH();

    /**
     * Gets the "contourW" attribute
     */
    long getContourW();

    /**
     * Gets (as xml) the "contourW" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetContourW();

    /**
     * True if has "contourW" attribute
     */
    boolean isSetContourW();

    /**
     * Sets the "contourW" attribute
     */
    void setContourW(long contourW);

    /**
     * Sets (as xml) the "contourW" attribute
     */
    void xsetContourW(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate contourW);

    /**
     * Unsets the "contourW" attribute
     */
    void unsetContourW();

    /**
     * Gets the "prstMaterial" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType.Enum getPrstMaterial();

    /**
     * Gets (as xml) the "prstMaterial" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType xgetPrstMaterial();

    /**
     * True if has "prstMaterial" attribute
     */
    boolean isSetPrstMaterial();

    /**
     * Sets the "prstMaterial" attribute
     */
    void setPrstMaterial(com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType.Enum prstMaterial);

    /**
     * Sets (as xml) the "prstMaterial" attribute
     */
    void xsetPrstMaterial(com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType prstMaterial);

    /**
     * Unsets the "prstMaterial" attribute
     */
    void unsetPrstMaterial();
}

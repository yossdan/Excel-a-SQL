/*
 * XML Type:  CT_Shadow
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTShadow
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Shadow(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTShadow extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTShadow> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctshadowe588type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "srgbClr" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSRgbColor getSrgbClr();

    /**
     * True if has "srgbClr" element
     */
    boolean isSetSrgbClr();

    /**
     * Sets the "srgbClr" element
     */
    void setSrgbClr(com.microsoft.schemas.office.word.x2010.wordml.CTSRgbColor srgbClr);

    /**
     * Appends and returns a new empty "srgbClr" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSRgbColor addNewSrgbClr();

    /**
     * Unsets the "srgbClr" element
     */
    void unsetSrgbClr();

    /**
     * Gets the "schemeClr" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor getSchemeClr();

    /**
     * True if has "schemeClr" element
     */
    boolean isSetSchemeClr();

    /**
     * Sets the "schemeClr" element
     */
    void setSchemeClr(com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor schemeClr);

    /**
     * Appends and returns a new empty "schemeClr" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor addNewSchemeClr();

    /**
     * Unsets the "schemeClr" element
     */
    void unsetSchemeClr();

    /**
     * Gets the "blurRad" attribute
     */
    long getBlurRad();

    /**
     * Gets (as xml) the "blurRad" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetBlurRad();

    /**
     * True if has "blurRad" attribute
     */
    boolean isSetBlurRad();

    /**
     * Sets the "blurRad" attribute
     */
    void setBlurRad(long blurRad);

    /**
     * Sets (as xml) the "blurRad" attribute
     */
    void xsetBlurRad(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate blurRad);

    /**
     * Unsets the "blurRad" attribute
     */
    void unsetBlurRad();

    /**
     * Gets the "dist" attribute
     */
    long getDist();

    /**
     * Gets (as xml) the "dist" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetDist();

    /**
     * True if has "dist" attribute
     */
    boolean isSetDist();

    /**
     * Sets the "dist" attribute
     */
    void setDist(long dist);

    /**
     * Sets (as xml) the "dist" attribute
     */
    void xsetDist(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate dist);

    /**
     * Unsets the "dist" attribute
     */
    void unsetDist();

    /**
     * Gets the "dir" attribute
     */
    int getDir();

    /**
     * Gets (as xml) the "dir" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetDir();

    /**
     * True if has "dir" attribute
     */
    boolean isSetDir();

    /**
     * Sets the "dir" attribute
     */
    void setDir(int dir);

    /**
     * Sets (as xml) the "dir" attribute
     */
    void xsetDir(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle dir);

    /**
     * Unsets the "dir" attribute
     */
    void unsetDir();

    /**
     * Gets the "sx" attribute
     */
    java.lang.Object getSx();

    /**
     * Gets (as xml) the "sx" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPercentage xgetSx();

    /**
     * True if has "sx" attribute
     */
    boolean isSetSx();

    /**
     * Sets the "sx" attribute
     */
    void setSx(java.lang.Object sx);

    /**
     * Sets (as xml) the "sx" attribute
     */
    void xsetSx(org.openxmlformats.schemas.drawingml.x2006.main.STPercentage sx);

    /**
     * Unsets the "sx" attribute
     */
    void unsetSx();

    /**
     * Gets the "sy" attribute
     */
    java.lang.Object getSy();

    /**
     * Gets (as xml) the "sy" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPercentage xgetSy();

    /**
     * True if has "sy" attribute
     */
    boolean isSetSy();

    /**
     * Sets the "sy" attribute
     */
    void setSy(java.lang.Object sy);

    /**
     * Sets (as xml) the "sy" attribute
     */
    void xsetSy(org.openxmlformats.schemas.drawingml.x2006.main.STPercentage sy);

    /**
     * Unsets the "sy" attribute
     */
    void unsetSy();

    /**
     * Gets the "kx" attribute
     */
    int getKx();

    /**
     * Gets (as xml) the "kx" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle xgetKx();

    /**
     * True if has "kx" attribute
     */
    boolean isSetKx();

    /**
     * Sets the "kx" attribute
     */
    void setKx(int kx);

    /**
     * Sets (as xml) the "kx" attribute
     */
    void xsetKx(org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle kx);

    /**
     * Unsets the "kx" attribute
     */
    void unsetKx();

    /**
     * Gets the "ky" attribute
     */
    int getKy();

    /**
     * Gets (as xml) the "ky" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle xgetKy();

    /**
     * True if has "ky" attribute
     */
    boolean isSetKy();

    /**
     * Sets the "ky" attribute
     */
    void setKy(int ky);

    /**
     * Sets (as xml) the "ky" attribute
     */
    void xsetKy(org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle ky);

    /**
     * Unsets the "ky" attribute
     */
    void unsetKy();

    /**
     * Gets the "algn" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STRectAlignment.Enum getAlgn();

    /**
     * Gets (as xml) the "algn" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STRectAlignment xgetAlgn();

    /**
     * True if has "algn" attribute
     */
    boolean isSetAlgn();

    /**
     * Sets the "algn" attribute
     */
    void setAlgn(com.microsoft.schemas.office.word.x2010.wordml.STRectAlignment.Enum algn);

    /**
     * Sets (as xml) the "algn" attribute
     */
    void xsetAlgn(com.microsoft.schemas.office.word.x2010.wordml.STRectAlignment algn);

    /**
     * Unsets the "algn" attribute
     */
    void unsetAlgn();
}

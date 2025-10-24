/*
 * XML Type:  CT_ShapeDefaults
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTShapeDefaults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ShapeDefaults(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTShapeDefaults extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTShapeDefaults> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctshapedefaultsadcctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "fill" element
     */
    com.microsoft.schemas.vml.CTFill getFill();

    /**
     * True if has "fill" element
     */
    boolean isSetFill();

    /**
     * Sets the "fill" element
     */
    void setFill(com.microsoft.schemas.vml.CTFill fill);

    /**
     * Appends and returns a new empty "fill" element
     */
    com.microsoft.schemas.vml.CTFill addNewFill();

    /**
     * Unsets the "fill" element
     */
    void unsetFill();

    /**
     * Gets the "stroke" element
     */
    com.microsoft.schemas.vml.CTStroke getStroke();

    /**
     * True if has "stroke" element
     */
    boolean isSetStroke();

    /**
     * Sets the "stroke" element
     */
    void setStroke(com.microsoft.schemas.vml.CTStroke stroke);

    /**
     * Appends and returns a new empty "stroke" element
     */
    com.microsoft.schemas.vml.CTStroke addNewStroke();

    /**
     * Unsets the "stroke" element
     */
    void unsetStroke();

    /**
     * Gets the "textbox" element
     */
    com.microsoft.schemas.vml.CTTextbox getTextbox();

    /**
     * True if has "textbox" element
     */
    boolean isSetTextbox();

    /**
     * Sets the "textbox" element
     */
    void setTextbox(com.microsoft.schemas.vml.CTTextbox textbox);

    /**
     * Appends and returns a new empty "textbox" element
     */
    com.microsoft.schemas.vml.CTTextbox addNewTextbox();

    /**
     * Unsets the "textbox" element
     */
    void unsetTextbox();

    /**
     * Gets the "shadow" element
     */
    com.microsoft.schemas.vml.CTShadow getShadow();

    /**
     * True if has "shadow" element
     */
    boolean isSetShadow();

    /**
     * Sets the "shadow" element
     */
    void setShadow(com.microsoft.schemas.vml.CTShadow shadow);

    /**
     * Appends and returns a new empty "shadow" element
     */
    com.microsoft.schemas.vml.CTShadow addNewShadow();

    /**
     * Unsets the "shadow" element
     */
    void unsetShadow();

    /**
     * Gets the "skew" element
     */
    com.microsoft.schemas.office.office.CTSkew getSkew();

    /**
     * True if has "skew" element
     */
    boolean isSetSkew();

    /**
     * Sets the "skew" element
     */
    void setSkew(com.microsoft.schemas.office.office.CTSkew skew);

    /**
     * Appends and returns a new empty "skew" element
     */
    com.microsoft.schemas.office.office.CTSkew addNewSkew();

    /**
     * Unsets the "skew" element
     */
    void unsetSkew();

    /**
     * Gets the "extrusion" element
     */
    com.microsoft.schemas.office.office.CTExtrusion getExtrusion();

    /**
     * True if has "extrusion" element
     */
    boolean isSetExtrusion();

    /**
     * Sets the "extrusion" element
     */
    void setExtrusion(com.microsoft.schemas.office.office.CTExtrusion extrusion);

    /**
     * Appends and returns a new empty "extrusion" element
     */
    com.microsoft.schemas.office.office.CTExtrusion addNewExtrusion();

    /**
     * Unsets the "extrusion" element
     */
    void unsetExtrusion();

    /**
     * Gets the "callout" element
     */
    com.microsoft.schemas.office.office.CTCallout getCallout();

    /**
     * True if has "callout" element
     */
    boolean isSetCallout();

    /**
     * Sets the "callout" element
     */
    void setCallout(com.microsoft.schemas.office.office.CTCallout callout);

    /**
     * Appends and returns a new empty "callout" element
     */
    com.microsoft.schemas.office.office.CTCallout addNewCallout();

    /**
     * Unsets the "callout" element
     */
    void unsetCallout();

    /**
     * Gets the "lock" element
     */
    com.microsoft.schemas.office.office.CTLock getLock();

    /**
     * True if has "lock" element
     */
    boolean isSetLock();

    /**
     * Sets the "lock" element
     */
    void setLock(com.microsoft.schemas.office.office.CTLock lock);

    /**
     * Appends and returns a new empty "lock" element
     */
    com.microsoft.schemas.office.office.CTLock addNewLock();

    /**
     * Unsets the "lock" element
     */
    void unsetLock();

    /**
     * Gets the "colormru" element
     */
    com.microsoft.schemas.office.office.CTColorMru getColormru();

    /**
     * True if has "colormru" element
     */
    boolean isSetColormru();

    /**
     * Sets the "colormru" element
     */
    void setColormru(com.microsoft.schemas.office.office.CTColorMru colormru);

    /**
     * Appends and returns a new empty "colormru" element
     */
    com.microsoft.schemas.office.office.CTColorMru addNewColormru();

    /**
     * Unsets the "colormru" element
     */
    void unsetColormru();

    /**
     * Gets the "colormenu" element
     */
    com.microsoft.schemas.office.office.CTColorMenu getColormenu();

    /**
     * True if has "colormenu" element
     */
    boolean isSetColormenu();

    /**
     * Sets the "colormenu" element
     */
    void setColormenu(com.microsoft.schemas.office.office.CTColorMenu colormenu);

    /**
     * Appends and returns a new empty "colormenu" element
     */
    com.microsoft.schemas.office.office.CTColorMenu addNewColormenu();

    /**
     * Unsets the "colormenu" element
     */
    void unsetColormenu();

    /**
     * Gets the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt.Enum getExt();

    /**
     * Gets (as xml) the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt xgetExt();

    /**
     * True if has "ext" attribute
     */
    boolean isSetExt();

    /**
     * Sets the "ext" attribute
     */
    void setExt(com.microsoft.schemas.vml.STExt.Enum ext);

    /**
     * Sets (as xml) the "ext" attribute
     */
    void xsetExt(com.microsoft.schemas.vml.STExt ext);

    /**
     * Unsets the "ext" attribute
     */
    void unsetExt();

    /**
     * Gets the "spidmax" attribute
     */
    java.math.BigInteger getSpidmax();

    /**
     * Gets (as xml) the "spidmax" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetSpidmax();

    /**
     * True if has "spidmax" attribute
     */
    boolean isSetSpidmax();

    /**
     * Sets the "spidmax" attribute
     */
    void setSpidmax(java.math.BigInteger spidmax);

    /**
     * Sets (as xml) the "spidmax" attribute
     */
    void xsetSpidmax(org.apache.xmlbeans.XmlInteger spidmax);

    /**
     * Unsets the "spidmax" attribute
     */
    void unsetSpidmax();

    /**
     * Gets the "style" attribute
     */
    java.lang.String getStyle();

    /**
     * Gets (as xml) the "style" attribute
     */
    org.apache.xmlbeans.XmlString xgetStyle();

    /**
     * True if has "style" attribute
     */
    boolean isSetStyle();

    /**
     * Sets the "style" attribute
     */
    void setStyle(java.lang.String style);

    /**
     * Sets (as xml) the "style" attribute
     */
    void xsetStyle(org.apache.xmlbeans.XmlString style);

    /**
     * Unsets the "style" attribute
     */
    void unsetStyle();

    /**
     * Gets the "fill" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getFill2();

    /**
     * Gets (as xml) the "fill" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetFill2();

    /**
     * True if has "fill" attribute
     */
    boolean isSetFill2();

    /**
     * Sets the "fill" attribute
     */
    void setFill2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum fill2);

    /**
     * Sets (as xml) the "fill" attribute
     */
    void xsetFill2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse fill2);

    /**
     * Unsets the "fill" attribute
     */
    void unsetFill2();

    /**
     * Gets the "fillcolor" attribute
     */
    java.lang.String getFillcolor();

    /**
     * Gets (as xml) the "fillcolor" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetFillcolor();

    /**
     * True if has "fillcolor" attribute
     */
    boolean isSetFillcolor();

    /**
     * Sets the "fillcolor" attribute
     */
    void setFillcolor(java.lang.String fillcolor);

    /**
     * Sets (as xml) the "fillcolor" attribute
     */
    void xsetFillcolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType fillcolor);

    /**
     * Unsets the "fillcolor" attribute
     */
    void unsetFillcolor();

    /**
     * Gets the "stroke" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getStroke2();

    /**
     * Gets (as xml) the "stroke" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetStroke2();

    /**
     * True if has "stroke" attribute
     */
    boolean isSetStroke2();

    /**
     * Sets the "stroke" attribute
     */
    void setStroke2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum stroke2);

    /**
     * Sets (as xml) the "stroke" attribute
     */
    void xsetStroke2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse stroke2);

    /**
     * Unsets the "stroke" attribute
     */
    void unsetStroke2();

    /**
     * Gets the "strokecolor" attribute
     */
    java.lang.String getStrokecolor();

    /**
     * Gets (as xml) the "strokecolor" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetStrokecolor();

    /**
     * True if has "strokecolor" attribute
     */
    boolean isSetStrokecolor();

    /**
     * Sets the "strokecolor" attribute
     */
    void setStrokecolor(java.lang.String strokecolor);

    /**
     * Sets (as xml) the "strokecolor" attribute
     */
    void xsetStrokecolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType strokecolor);

    /**
     * Unsets the "strokecolor" attribute
     */
    void unsetStrokecolor();

    /**
     * Gets the "allowincell" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAllowincell();

    /**
     * Gets (as xml) the "allowincell" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAllowincell();

    /**
     * True if has "allowincell" attribute
     */
    boolean isSetAllowincell();

    /**
     * Sets the "allowincell" attribute
     */
    void setAllowincell(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum allowincell);

    /**
     * Sets (as xml) the "allowincell" attribute
     */
    void xsetAllowincell(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse allowincell);

    /**
     * Unsets the "allowincell" attribute
     */
    void unsetAllowincell();
}

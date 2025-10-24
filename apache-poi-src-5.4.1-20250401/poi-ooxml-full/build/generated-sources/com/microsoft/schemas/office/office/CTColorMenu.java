/*
 * XML Type:  CT_ColorMenu
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTColorMenu
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ColorMenu(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTColorMenu extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTColorMenu> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcolormenu029btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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
     * Gets the "shadowcolor" attribute
     */
    java.lang.String getShadowcolor();

    /**
     * Gets (as xml) the "shadowcolor" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetShadowcolor();

    /**
     * True if has "shadowcolor" attribute
     */
    boolean isSetShadowcolor();

    /**
     * Sets the "shadowcolor" attribute
     */
    void setShadowcolor(java.lang.String shadowcolor);

    /**
     * Sets (as xml) the "shadowcolor" attribute
     */
    void xsetShadowcolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType shadowcolor);

    /**
     * Unsets the "shadowcolor" attribute
     */
    void unsetShadowcolor();

    /**
     * Gets the "extrusioncolor" attribute
     */
    java.lang.String getExtrusioncolor();

    /**
     * Gets (as xml) the "extrusioncolor" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetExtrusioncolor();

    /**
     * True if has "extrusioncolor" attribute
     */
    boolean isSetExtrusioncolor();

    /**
     * Sets the "extrusioncolor" attribute
     */
    void setExtrusioncolor(java.lang.String extrusioncolor);

    /**
     * Sets (as xml) the "extrusioncolor" attribute
     */
    void xsetExtrusioncolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType extrusioncolor);

    /**
     * Unsets the "extrusioncolor" attribute
     */
    void unsetExtrusioncolor();
}

/*
 * XML Type:  CT_Extrusion
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTExtrusion
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Extrusion(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTExtrusion extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTExtrusion> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctextrusion7112type");
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
     * Gets the "on" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getOn();

    /**
     * Gets (as xml) the "on" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetOn();

    /**
     * True if has "on" attribute
     */
    boolean isSetOn();

    /**
     * Sets the "on" attribute
     */
    void setOn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum on);

    /**
     * Sets (as xml) the "on" attribute
     */
    void xsetOn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse on);

    /**
     * Unsets the "on" attribute
     */
    void unsetOn();

    /**
     * Gets the "type" attribute
     */
    com.microsoft.schemas.office.office.STExtrusionType.Enum getType();

    /**
     * Gets (as xml) the "type" attribute
     */
    com.microsoft.schemas.office.office.STExtrusionType xgetType();

    /**
     * True if has "type" attribute
     */
    boolean isSetType();

    /**
     * Sets the "type" attribute
     */
    void setType(com.microsoft.schemas.office.office.STExtrusionType.Enum type);

    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(com.microsoft.schemas.office.office.STExtrusionType type);

    /**
     * Unsets the "type" attribute
     */
    void unsetType();

    /**
     * Gets the "render" attribute
     */
    com.microsoft.schemas.office.office.STExtrusionRender.Enum getRender();

    /**
     * Gets (as xml) the "render" attribute
     */
    com.microsoft.schemas.office.office.STExtrusionRender xgetRender();

    /**
     * True if has "render" attribute
     */
    boolean isSetRender();

    /**
     * Sets the "render" attribute
     */
    void setRender(com.microsoft.schemas.office.office.STExtrusionRender.Enum render);

    /**
     * Sets (as xml) the "render" attribute
     */
    void xsetRender(com.microsoft.schemas.office.office.STExtrusionRender render);

    /**
     * Unsets the "render" attribute
     */
    void unsetRender();

    /**
     * Gets the "viewpointorigin" attribute
     */
    java.lang.String getViewpointorigin();

    /**
     * Gets (as xml) the "viewpointorigin" attribute
     */
    org.apache.xmlbeans.XmlString xgetViewpointorigin();

    /**
     * True if has "viewpointorigin" attribute
     */
    boolean isSetViewpointorigin();

    /**
     * Sets the "viewpointorigin" attribute
     */
    void setViewpointorigin(java.lang.String viewpointorigin);

    /**
     * Sets (as xml) the "viewpointorigin" attribute
     */
    void xsetViewpointorigin(org.apache.xmlbeans.XmlString viewpointorigin);

    /**
     * Unsets the "viewpointorigin" attribute
     */
    void unsetViewpointorigin();

    /**
     * Gets the "viewpoint" attribute
     */
    java.lang.String getViewpoint();

    /**
     * Gets (as xml) the "viewpoint" attribute
     */
    org.apache.xmlbeans.XmlString xgetViewpoint();

    /**
     * True if has "viewpoint" attribute
     */
    boolean isSetViewpoint();

    /**
     * Sets the "viewpoint" attribute
     */
    void setViewpoint(java.lang.String viewpoint);

    /**
     * Sets (as xml) the "viewpoint" attribute
     */
    void xsetViewpoint(org.apache.xmlbeans.XmlString viewpoint);

    /**
     * Unsets the "viewpoint" attribute
     */
    void unsetViewpoint();

    /**
     * Gets the "plane" attribute
     */
    com.microsoft.schemas.office.office.STExtrusionPlane.Enum getPlane();

    /**
     * Gets (as xml) the "plane" attribute
     */
    com.microsoft.schemas.office.office.STExtrusionPlane xgetPlane();

    /**
     * True if has "plane" attribute
     */
    boolean isSetPlane();

    /**
     * Sets the "plane" attribute
     */
    void setPlane(com.microsoft.schemas.office.office.STExtrusionPlane.Enum plane);

    /**
     * Sets (as xml) the "plane" attribute
     */
    void xsetPlane(com.microsoft.schemas.office.office.STExtrusionPlane plane);

    /**
     * Unsets the "plane" attribute
     */
    void unsetPlane();

    /**
     * Gets the "skewangle" attribute
     */
    float getSkewangle();

    /**
     * Gets (as xml) the "skewangle" attribute
     */
    org.apache.xmlbeans.XmlFloat xgetSkewangle();

    /**
     * True if has "skewangle" attribute
     */
    boolean isSetSkewangle();

    /**
     * Sets the "skewangle" attribute
     */
    void setSkewangle(float skewangle);

    /**
     * Sets (as xml) the "skewangle" attribute
     */
    void xsetSkewangle(org.apache.xmlbeans.XmlFloat skewangle);

    /**
     * Unsets the "skewangle" attribute
     */
    void unsetSkewangle();

    /**
     * Gets the "skewamt" attribute
     */
    java.lang.String getSkewamt();

    /**
     * Gets (as xml) the "skewamt" attribute
     */
    org.apache.xmlbeans.XmlString xgetSkewamt();

    /**
     * True if has "skewamt" attribute
     */
    boolean isSetSkewamt();

    /**
     * Sets the "skewamt" attribute
     */
    void setSkewamt(java.lang.String skewamt);

    /**
     * Sets (as xml) the "skewamt" attribute
     */
    void xsetSkewamt(org.apache.xmlbeans.XmlString skewamt);

    /**
     * Unsets the "skewamt" attribute
     */
    void unsetSkewamt();

    /**
     * Gets the "foredepth" attribute
     */
    java.lang.String getForedepth();

    /**
     * Gets (as xml) the "foredepth" attribute
     */
    org.apache.xmlbeans.XmlString xgetForedepth();

    /**
     * True if has "foredepth" attribute
     */
    boolean isSetForedepth();

    /**
     * Sets the "foredepth" attribute
     */
    void setForedepth(java.lang.String foredepth);

    /**
     * Sets (as xml) the "foredepth" attribute
     */
    void xsetForedepth(org.apache.xmlbeans.XmlString foredepth);

    /**
     * Unsets the "foredepth" attribute
     */
    void unsetForedepth();

    /**
     * Gets the "backdepth" attribute
     */
    java.lang.String getBackdepth();

    /**
     * Gets (as xml) the "backdepth" attribute
     */
    org.apache.xmlbeans.XmlString xgetBackdepth();

    /**
     * True if has "backdepth" attribute
     */
    boolean isSetBackdepth();

    /**
     * Sets the "backdepth" attribute
     */
    void setBackdepth(java.lang.String backdepth);

    /**
     * Sets (as xml) the "backdepth" attribute
     */
    void xsetBackdepth(org.apache.xmlbeans.XmlString backdepth);

    /**
     * Unsets the "backdepth" attribute
     */
    void unsetBackdepth();

    /**
     * Gets the "orientation" attribute
     */
    java.lang.String getOrientation();

    /**
     * Gets (as xml) the "orientation" attribute
     */
    org.apache.xmlbeans.XmlString xgetOrientation();

    /**
     * True if has "orientation" attribute
     */
    boolean isSetOrientation();

    /**
     * Sets the "orientation" attribute
     */
    void setOrientation(java.lang.String orientation);

    /**
     * Sets (as xml) the "orientation" attribute
     */
    void xsetOrientation(org.apache.xmlbeans.XmlString orientation);

    /**
     * Unsets the "orientation" attribute
     */
    void unsetOrientation();

    /**
     * Gets the "orientationangle" attribute
     */
    float getOrientationangle();

    /**
     * Gets (as xml) the "orientationangle" attribute
     */
    org.apache.xmlbeans.XmlFloat xgetOrientationangle();

    /**
     * True if has "orientationangle" attribute
     */
    boolean isSetOrientationangle();

    /**
     * Sets the "orientationangle" attribute
     */
    void setOrientationangle(float orientationangle);

    /**
     * Sets (as xml) the "orientationangle" attribute
     */
    void xsetOrientationangle(org.apache.xmlbeans.XmlFloat orientationangle);

    /**
     * Unsets the "orientationangle" attribute
     */
    void unsetOrientationangle();

    /**
     * Gets the "lockrotationcenter" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getLockrotationcenter();

    /**
     * Gets (as xml) the "lockrotationcenter" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetLockrotationcenter();

    /**
     * True if has "lockrotationcenter" attribute
     */
    boolean isSetLockrotationcenter();

    /**
     * Sets the "lockrotationcenter" attribute
     */
    void setLockrotationcenter(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum lockrotationcenter);

    /**
     * Sets (as xml) the "lockrotationcenter" attribute
     */
    void xsetLockrotationcenter(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse lockrotationcenter);

    /**
     * Unsets the "lockrotationcenter" attribute
     */
    void unsetLockrotationcenter();

    /**
     * Gets the "autorotationcenter" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAutorotationcenter();

    /**
     * Gets (as xml) the "autorotationcenter" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAutorotationcenter();

    /**
     * True if has "autorotationcenter" attribute
     */
    boolean isSetAutorotationcenter();

    /**
     * Sets the "autorotationcenter" attribute
     */
    void setAutorotationcenter(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum autorotationcenter);

    /**
     * Sets (as xml) the "autorotationcenter" attribute
     */
    void xsetAutorotationcenter(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse autorotationcenter);

    /**
     * Unsets the "autorotationcenter" attribute
     */
    void unsetAutorotationcenter();

    /**
     * Gets the "rotationcenter" attribute
     */
    java.lang.String getRotationcenter();

    /**
     * Gets (as xml) the "rotationcenter" attribute
     */
    org.apache.xmlbeans.XmlString xgetRotationcenter();

    /**
     * True if has "rotationcenter" attribute
     */
    boolean isSetRotationcenter();

    /**
     * Sets the "rotationcenter" attribute
     */
    void setRotationcenter(java.lang.String rotationcenter);

    /**
     * Sets (as xml) the "rotationcenter" attribute
     */
    void xsetRotationcenter(org.apache.xmlbeans.XmlString rotationcenter);

    /**
     * Unsets the "rotationcenter" attribute
     */
    void unsetRotationcenter();

    /**
     * Gets the "rotationangle" attribute
     */
    java.lang.String getRotationangle();

    /**
     * Gets (as xml) the "rotationangle" attribute
     */
    org.apache.xmlbeans.XmlString xgetRotationangle();

    /**
     * True if has "rotationangle" attribute
     */
    boolean isSetRotationangle();

    /**
     * Sets the "rotationangle" attribute
     */
    void setRotationangle(java.lang.String rotationangle);

    /**
     * Sets (as xml) the "rotationangle" attribute
     */
    void xsetRotationangle(org.apache.xmlbeans.XmlString rotationangle);

    /**
     * Unsets the "rotationangle" attribute
     */
    void unsetRotationangle();

    /**
     * Gets the "colormode" attribute
     */
    com.microsoft.schemas.office.office.STColorMode.Enum getColormode();

    /**
     * Gets (as xml) the "colormode" attribute
     */
    com.microsoft.schemas.office.office.STColorMode xgetColormode();

    /**
     * True if has "colormode" attribute
     */
    boolean isSetColormode();

    /**
     * Sets the "colormode" attribute
     */
    void setColormode(com.microsoft.schemas.office.office.STColorMode.Enum colormode);

    /**
     * Sets (as xml) the "colormode" attribute
     */
    void xsetColormode(com.microsoft.schemas.office.office.STColorMode colormode);

    /**
     * Unsets the "colormode" attribute
     */
    void unsetColormode();

    /**
     * Gets the "color" attribute
     */
    java.lang.String getColor();

    /**
     * Gets (as xml) the "color" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetColor();

    /**
     * True if has "color" attribute
     */
    boolean isSetColor();

    /**
     * Sets the "color" attribute
     */
    void setColor(java.lang.String color);

    /**
     * Sets (as xml) the "color" attribute
     */
    void xsetColor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType color);

    /**
     * Unsets the "color" attribute
     */
    void unsetColor();

    /**
     * Gets the "shininess" attribute
     */
    float getShininess();

    /**
     * Gets (as xml) the "shininess" attribute
     */
    org.apache.xmlbeans.XmlFloat xgetShininess();

    /**
     * True if has "shininess" attribute
     */
    boolean isSetShininess();

    /**
     * Sets the "shininess" attribute
     */
    void setShininess(float shininess);

    /**
     * Sets (as xml) the "shininess" attribute
     */
    void xsetShininess(org.apache.xmlbeans.XmlFloat shininess);

    /**
     * Unsets the "shininess" attribute
     */
    void unsetShininess();

    /**
     * Gets the "specularity" attribute
     */
    java.lang.String getSpecularity();

    /**
     * Gets (as xml) the "specularity" attribute
     */
    org.apache.xmlbeans.XmlString xgetSpecularity();

    /**
     * True if has "specularity" attribute
     */
    boolean isSetSpecularity();

    /**
     * Sets the "specularity" attribute
     */
    void setSpecularity(java.lang.String specularity);

    /**
     * Sets (as xml) the "specularity" attribute
     */
    void xsetSpecularity(org.apache.xmlbeans.XmlString specularity);

    /**
     * Unsets the "specularity" attribute
     */
    void unsetSpecularity();

    /**
     * Gets the "diffusity" attribute
     */
    java.lang.String getDiffusity();

    /**
     * Gets (as xml) the "diffusity" attribute
     */
    org.apache.xmlbeans.XmlString xgetDiffusity();

    /**
     * True if has "diffusity" attribute
     */
    boolean isSetDiffusity();

    /**
     * Sets the "diffusity" attribute
     */
    void setDiffusity(java.lang.String diffusity);

    /**
     * Sets (as xml) the "diffusity" attribute
     */
    void xsetDiffusity(org.apache.xmlbeans.XmlString diffusity);

    /**
     * Unsets the "diffusity" attribute
     */
    void unsetDiffusity();

    /**
     * Gets the "metal" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getMetal();

    /**
     * Gets (as xml) the "metal" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetMetal();

    /**
     * True if has "metal" attribute
     */
    boolean isSetMetal();

    /**
     * Sets the "metal" attribute
     */
    void setMetal(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum metal);

    /**
     * Sets (as xml) the "metal" attribute
     */
    void xsetMetal(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse metal);

    /**
     * Unsets the "metal" attribute
     */
    void unsetMetal();

    /**
     * Gets the "edge" attribute
     */
    java.lang.String getEdge();

    /**
     * Gets (as xml) the "edge" attribute
     */
    org.apache.xmlbeans.XmlString xgetEdge();

    /**
     * True if has "edge" attribute
     */
    boolean isSetEdge();

    /**
     * Sets the "edge" attribute
     */
    void setEdge(java.lang.String edge);

    /**
     * Sets (as xml) the "edge" attribute
     */
    void xsetEdge(org.apache.xmlbeans.XmlString edge);

    /**
     * Unsets the "edge" attribute
     */
    void unsetEdge();

    /**
     * Gets the "facet" attribute
     */
    java.lang.String getFacet();

    /**
     * Gets (as xml) the "facet" attribute
     */
    org.apache.xmlbeans.XmlString xgetFacet();

    /**
     * True if has "facet" attribute
     */
    boolean isSetFacet();

    /**
     * Sets the "facet" attribute
     */
    void setFacet(java.lang.String facet);

    /**
     * Sets (as xml) the "facet" attribute
     */
    void xsetFacet(org.apache.xmlbeans.XmlString facet);

    /**
     * Unsets the "facet" attribute
     */
    void unsetFacet();

    /**
     * Gets the "lightface" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getLightface();

    /**
     * Gets (as xml) the "lightface" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetLightface();

    /**
     * True if has "lightface" attribute
     */
    boolean isSetLightface();

    /**
     * Sets the "lightface" attribute
     */
    void setLightface(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum lightface);

    /**
     * Sets (as xml) the "lightface" attribute
     */
    void xsetLightface(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse lightface);

    /**
     * Unsets the "lightface" attribute
     */
    void unsetLightface();

    /**
     * Gets the "brightness" attribute
     */
    java.lang.String getBrightness();

    /**
     * Gets (as xml) the "brightness" attribute
     */
    org.apache.xmlbeans.XmlString xgetBrightness();

    /**
     * True if has "brightness" attribute
     */
    boolean isSetBrightness();

    /**
     * Sets the "brightness" attribute
     */
    void setBrightness(java.lang.String brightness);

    /**
     * Sets (as xml) the "brightness" attribute
     */
    void xsetBrightness(org.apache.xmlbeans.XmlString brightness);

    /**
     * Unsets the "brightness" attribute
     */
    void unsetBrightness();

    /**
     * Gets the "lightposition" attribute
     */
    java.lang.String getLightposition();

    /**
     * Gets (as xml) the "lightposition" attribute
     */
    org.apache.xmlbeans.XmlString xgetLightposition();

    /**
     * True if has "lightposition" attribute
     */
    boolean isSetLightposition();

    /**
     * Sets the "lightposition" attribute
     */
    void setLightposition(java.lang.String lightposition);

    /**
     * Sets (as xml) the "lightposition" attribute
     */
    void xsetLightposition(org.apache.xmlbeans.XmlString lightposition);

    /**
     * Unsets the "lightposition" attribute
     */
    void unsetLightposition();

    /**
     * Gets the "lightlevel" attribute
     */
    java.lang.String getLightlevel();

    /**
     * Gets (as xml) the "lightlevel" attribute
     */
    org.apache.xmlbeans.XmlString xgetLightlevel();

    /**
     * True if has "lightlevel" attribute
     */
    boolean isSetLightlevel();

    /**
     * Sets the "lightlevel" attribute
     */
    void setLightlevel(java.lang.String lightlevel);

    /**
     * Sets (as xml) the "lightlevel" attribute
     */
    void xsetLightlevel(org.apache.xmlbeans.XmlString lightlevel);

    /**
     * Unsets the "lightlevel" attribute
     */
    void unsetLightlevel();

    /**
     * Gets the "lightharsh" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getLightharsh();

    /**
     * Gets (as xml) the "lightharsh" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetLightharsh();

    /**
     * True if has "lightharsh" attribute
     */
    boolean isSetLightharsh();

    /**
     * Sets the "lightharsh" attribute
     */
    void setLightharsh(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum lightharsh);

    /**
     * Sets (as xml) the "lightharsh" attribute
     */
    void xsetLightharsh(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse lightharsh);

    /**
     * Unsets the "lightharsh" attribute
     */
    void unsetLightharsh();

    /**
     * Gets the "lightposition2" attribute
     */
    java.lang.String getLightposition2();

    /**
     * Gets (as xml) the "lightposition2" attribute
     */
    org.apache.xmlbeans.XmlString xgetLightposition2();

    /**
     * True if has "lightposition2" attribute
     */
    boolean isSetLightposition2();

    /**
     * Sets the "lightposition2" attribute
     */
    void setLightposition2(java.lang.String lightposition2);

    /**
     * Sets (as xml) the "lightposition2" attribute
     */
    void xsetLightposition2(org.apache.xmlbeans.XmlString lightposition2);

    /**
     * Unsets the "lightposition2" attribute
     */
    void unsetLightposition2();

    /**
     * Gets the "lightlevel2" attribute
     */
    java.lang.String getLightlevel2();

    /**
     * Gets (as xml) the "lightlevel2" attribute
     */
    org.apache.xmlbeans.XmlString xgetLightlevel2();

    /**
     * True if has "lightlevel2" attribute
     */
    boolean isSetLightlevel2();

    /**
     * Sets the "lightlevel2" attribute
     */
    void setLightlevel2(java.lang.String lightlevel2);

    /**
     * Sets (as xml) the "lightlevel2" attribute
     */
    void xsetLightlevel2(org.apache.xmlbeans.XmlString lightlevel2);

    /**
     * Unsets the "lightlevel2" attribute
     */
    void unsetLightlevel2();

    /**
     * Gets the "lightharsh2" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getLightharsh2();

    /**
     * Gets (as xml) the "lightharsh2" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetLightharsh2();

    /**
     * True if has "lightharsh2" attribute
     */
    boolean isSetLightharsh2();

    /**
     * Sets the "lightharsh2" attribute
     */
    void setLightharsh2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum lightharsh2);

    /**
     * Sets (as xml) the "lightharsh2" attribute
     */
    void xsetLightharsh2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse lightharsh2);

    /**
     * Unsets the "lightharsh2" attribute
     */
    void unsetLightharsh2();
}

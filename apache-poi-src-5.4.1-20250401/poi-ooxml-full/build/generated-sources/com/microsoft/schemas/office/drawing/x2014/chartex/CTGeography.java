/*
 * XML Type:  CT_Geography
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Geography(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeography extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeographyd374type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "geoCache" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache getGeoCache();

    /**
     * True if has "geoCache" element
     */
    boolean isSetGeoCache();

    /**
     * Sets the "geoCache" element
     */
    void setGeoCache(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache geoCache);

    /**
     * Appends and returns a new empty "geoCache" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache addNewGeoCache();

    /**
     * Unsets the "geoCache" element
     */
    void unsetGeoCache();

    /**
     * Gets the "projectionType" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType.Enum getProjectionType();

    /**
     * Gets (as xml) the "projectionType" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType xgetProjectionType();

    /**
     * True if has "projectionType" attribute
     */
    boolean isSetProjectionType();

    /**
     * Sets the "projectionType" attribute
     */
    void setProjectionType(com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType.Enum projectionType);

    /**
     * Sets (as xml) the "projectionType" attribute
     */
    void xsetProjectionType(com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType projectionType);

    /**
     * Unsets the "projectionType" attribute
     */
    void unsetProjectionType();

    /**
     * Gets the "viewedRegionType" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel.Enum getViewedRegionType();

    /**
     * Gets (as xml) the "viewedRegionType" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel xgetViewedRegionType();

    /**
     * True if has "viewedRegionType" attribute
     */
    boolean isSetViewedRegionType();

    /**
     * Sets the "viewedRegionType" attribute
     */
    void setViewedRegionType(com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel.Enum viewedRegionType);

    /**
     * Sets (as xml) the "viewedRegionType" attribute
     */
    void xsetViewedRegionType(com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel viewedRegionType);

    /**
     * Unsets the "viewedRegionType" attribute
     */
    void unsetViewedRegionType();

    /**
     * Gets the "cultureLanguage" attribute
     */
    java.lang.String getCultureLanguage();

    /**
     * Gets (as xml) the "cultureLanguage" attribute
     */
    org.apache.xmlbeans.XmlLanguage xgetCultureLanguage();

    /**
     * Sets the "cultureLanguage" attribute
     */
    void setCultureLanguage(java.lang.String cultureLanguage);

    /**
     * Sets (as xml) the "cultureLanguage" attribute
     */
    void xsetCultureLanguage(org.apache.xmlbeans.XmlLanguage cultureLanguage);

    /**
     * Gets the "cultureRegion" attribute
     */
    java.lang.String getCultureRegion();

    /**
     * Gets (as xml) the "cultureRegion" attribute
     */
    org.apache.xmlbeans.XmlString xgetCultureRegion();

    /**
     * Sets the "cultureRegion" attribute
     */
    void setCultureRegion(java.lang.String cultureRegion);

    /**
     * Sets (as xml) the "cultureRegion" attribute
     */
    void xsetCultureRegion(org.apache.xmlbeans.XmlString cultureRegion);

    /**
     * Gets the "attribution" attribute
     */
    java.lang.String getAttribution();

    /**
     * Gets (as xml) the "attribution" attribute
     */
    org.apache.xmlbeans.XmlString xgetAttribution();

    /**
     * Sets the "attribution" attribute
     */
    void setAttribution(java.lang.String attribution);

    /**
     * Sets (as xml) the "attribution" attribute
     */
    void xsetAttribution(org.apache.xmlbeans.XmlString attribution);
}

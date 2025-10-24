/*
 * XML Type:  CT_GeoLocationQuery
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GeoLocationQuery(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTGeoLocationQuery extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQuery> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgeolocationquery5804type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "countryRegion" attribute
     */
    java.lang.String getCountryRegion();

    /**
     * Gets (as xml) the "countryRegion" attribute
     */
    org.apache.xmlbeans.XmlString xgetCountryRegion();

    /**
     * True if has "countryRegion" attribute
     */
    boolean isSetCountryRegion();

    /**
     * Sets the "countryRegion" attribute
     */
    void setCountryRegion(java.lang.String countryRegion);

    /**
     * Sets (as xml) the "countryRegion" attribute
     */
    void xsetCountryRegion(org.apache.xmlbeans.XmlString countryRegion);

    /**
     * Unsets the "countryRegion" attribute
     */
    void unsetCountryRegion();

    /**
     * Gets the "adminDistrict1" attribute
     */
    java.lang.String getAdminDistrict1();

    /**
     * Gets (as xml) the "adminDistrict1" attribute
     */
    org.apache.xmlbeans.XmlString xgetAdminDistrict1();

    /**
     * True if has "adminDistrict1" attribute
     */
    boolean isSetAdminDistrict1();

    /**
     * Sets the "adminDistrict1" attribute
     */
    void setAdminDistrict1(java.lang.String adminDistrict1);

    /**
     * Sets (as xml) the "adminDistrict1" attribute
     */
    void xsetAdminDistrict1(org.apache.xmlbeans.XmlString adminDistrict1);

    /**
     * Unsets the "adminDistrict1" attribute
     */
    void unsetAdminDistrict1();

    /**
     * Gets the "adminDistrict2" attribute
     */
    java.lang.String getAdminDistrict2();

    /**
     * Gets (as xml) the "adminDistrict2" attribute
     */
    org.apache.xmlbeans.XmlString xgetAdminDistrict2();

    /**
     * True if has "adminDistrict2" attribute
     */
    boolean isSetAdminDistrict2();

    /**
     * Sets the "adminDistrict2" attribute
     */
    void setAdminDistrict2(java.lang.String adminDistrict2);

    /**
     * Sets (as xml) the "adminDistrict2" attribute
     */
    void xsetAdminDistrict2(org.apache.xmlbeans.XmlString adminDistrict2);

    /**
     * Unsets the "adminDistrict2" attribute
     */
    void unsetAdminDistrict2();

    /**
     * Gets the "postalCode" attribute
     */
    java.lang.String getPostalCode();

    /**
     * Gets (as xml) the "postalCode" attribute
     */
    org.apache.xmlbeans.XmlString xgetPostalCode();

    /**
     * True if has "postalCode" attribute
     */
    boolean isSetPostalCode();

    /**
     * Sets the "postalCode" attribute
     */
    void setPostalCode(java.lang.String postalCode);

    /**
     * Sets (as xml) the "postalCode" attribute
     */
    void xsetPostalCode(org.apache.xmlbeans.XmlString postalCode);

    /**
     * Unsets the "postalCode" attribute
     */
    void unsetPostalCode();

    /**
     * Gets the "entityType" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum getEntityType();

    /**
     * Gets (as xml) the "entityType" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType xgetEntityType();

    /**
     * Sets the "entityType" attribute
     */
    void setEntityType(com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.Enum entityType);

    /**
     * Sets (as xml) the "entityType" attribute
     */
    void xsetEntityType(com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType entityType);
}

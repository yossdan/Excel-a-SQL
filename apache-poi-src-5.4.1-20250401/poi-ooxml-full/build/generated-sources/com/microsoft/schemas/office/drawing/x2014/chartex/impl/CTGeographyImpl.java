/*
 * XML Type:  CT_Geography
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Geography(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeographyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeography {
    private static final long serialVersionUID = 1L;

    public CTGeographyImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoCache"),
        new QName("", "projectionType"),
        new QName("", "viewedRegionType"),
        new QName("", "cultureLanguage"),
        new QName("", "cultureRegion"),
        new QName("", "attribution"),
    };


    /**
     * Gets the "geoCache" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache getGeoCache() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoCache" element
     */
    @Override
    public boolean isSetGeoCache() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "geoCache" element
     */
    @Override
    public void setGeoCache(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache geoCache) {
        generatedSetterHelperImpl(geoCache, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoCache" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache addNewGeoCache() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoCache)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "geoCache" element
     */
    @Override
    public void unsetGeoCache() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "projectionType" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType.Enum getProjectionType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : (com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "projectionType" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType xgetProjectionType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "projectionType" attribute
     */
    @Override
    public boolean isSetProjectionType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "projectionType" attribute
     */
    @Override
    public void setProjectionType(com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType.Enum projectionType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(projectionType);
        }
    }

    /**
     * Sets (as xml) the "projectionType" attribute
     */
    @Override
    public void xsetProjectionType(com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType projectionType) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(projectionType);
        }
    }

    /**
     * Unsets the "projectionType" attribute
     */
    @Override
    public void unsetProjectionType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "viewedRegionType" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel.Enum getViewedRegionType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : (com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "viewedRegionType" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel xgetViewedRegionType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "viewedRegionType" attribute
     */
    @Override
    public boolean isSetViewedRegionType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "viewedRegionType" attribute
     */
    @Override
    public void setViewedRegionType(com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel.Enum viewedRegionType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setEnumValue(viewedRegionType);
        }
    }

    /**
     * Sets (as xml) the "viewedRegionType" attribute
     */
    @Override
    public void xsetViewedRegionType(com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel viewedRegionType) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(viewedRegionType);
        }
    }

    /**
     * Unsets the "viewedRegionType" attribute
     */
    @Override
    public void unsetViewedRegionType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "cultureLanguage" attribute
     */
    @Override
    public java.lang.String getCultureLanguage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "cultureLanguage" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage xgetCultureLanguage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Sets the "cultureLanguage" attribute
     */
    @Override
    public void setCultureLanguage(java.lang.String cultureLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(cultureLanguage);
        }
    }

    /**
     * Sets (as xml) the "cultureLanguage" attribute
     */
    @Override
    public void xsetCultureLanguage(org.apache.xmlbeans.XmlLanguage cultureLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(cultureLanguage);
        }
    }

    /**
     * Gets the "cultureRegion" attribute
     */
    @Override
    public java.lang.String getCultureRegion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "cultureRegion" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetCultureRegion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Sets the "cultureRegion" attribute
     */
    @Override
    public void setCultureRegion(java.lang.String cultureRegion) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(cultureRegion);
        }
    }

    /**
     * Sets (as xml) the "cultureRegion" attribute
     */
    @Override
    public void xsetCultureRegion(org.apache.xmlbeans.XmlString cultureRegion) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(cultureRegion);
        }
    }

    /**
     * Gets the "attribution" attribute
     */
    @Override
    public java.lang.String getAttribution() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "attribution" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetAttribution() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Sets the "attribution" attribute
     */
    @Override
    public void setAttribution(java.lang.String attribution) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setStringValue(attribution);
        }
    }

    /**
     * Sets (as xml) the "attribution" attribute
     */
    @Override
    public void xsetAttribution(org.apache.xmlbeans.XmlString attribution) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(attribution);
        }
    }
}

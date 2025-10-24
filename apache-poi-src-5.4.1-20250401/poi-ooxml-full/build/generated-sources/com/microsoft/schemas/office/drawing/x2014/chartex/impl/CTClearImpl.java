/*
 * XML Type:  CT_Clear
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTClear
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Clear(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTClearImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTClear {
    private static final long serialVersionUID = 1L;

    public CTClearImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoLocationQueryResults"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoDataEntityQueryResults"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoDataPointToEntityQueryResults"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoChildEntitiesQueryResults"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoParentEntitiesQueryResults"),
    };


    /**
     * Gets the "geoLocationQueryResults" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults getGeoLocationQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoLocationQueryResults" element
     */
    @Override
    public boolean isSetGeoLocationQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "geoLocationQueryResults" element
     */
    @Override
    public void setGeoLocationQueryResults(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults geoLocationQueryResults) {
        generatedSetterHelperImpl(geoLocationQueryResults, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoLocationQueryResults" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults addNewGeoLocationQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoLocationQueryResults)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "geoLocationQueryResults" element
     */
    @Override
    public void unsetGeoLocationQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "geoDataEntityQueryResults" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults getGeoDataEntityQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoDataEntityQueryResults" element
     */
    @Override
    public boolean isSetGeoDataEntityQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "geoDataEntityQueryResults" element
     */
    @Override
    public void setGeoDataEntityQueryResults(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults geoDataEntityQueryResults) {
        generatedSetterHelperImpl(geoDataEntityQueryResults, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoDataEntityQueryResults" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults addNewGeoDataEntityQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataEntityQueryResults)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "geoDataEntityQueryResults" element
     */
    @Override
    public void unsetGeoDataEntityQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "geoDataPointToEntityQueryResults" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults getGeoDataPointToEntityQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoDataPointToEntityQueryResults" element
     */
    @Override
    public boolean isSetGeoDataPointToEntityQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "geoDataPointToEntityQueryResults" element
     */
    @Override
    public void setGeoDataPointToEntityQueryResults(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults geoDataPointToEntityQueryResults) {
        generatedSetterHelperImpl(geoDataPointToEntityQueryResults, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoDataPointToEntityQueryResults" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults addNewGeoDataPointToEntityQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoDataPointToEntityQueryResults)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "geoDataPointToEntityQueryResults" element
     */
    @Override
    public void unsetGeoDataPointToEntityQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "geoChildEntitiesQueryResults" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults getGeoChildEntitiesQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoChildEntitiesQueryResults" element
     */
    @Override
    public boolean isSetGeoChildEntitiesQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "geoChildEntitiesQueryResults" element
     */
    @Override
    public void setGeoChildEntitiesQueryResults(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults geoChildEntitiesQueryResults) {
        generatedSetterHelperImpl(geoChildEntitiesQueryResults, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoChildEntitiesQueryResults" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults addNewGeoChildEntitiesQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntitiesQueryResults)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "geoChildEntitiesQueryResults" element
     */
    @Override
    public void unsetGeoChildEntitiesQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "geoParentEntitiesQueryResults" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults getGeoParentEntitiesQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geoParentEntitiesQueryResults" element
     */
    @Override
    public boolean isSetGeoParentEntitiesQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "geoParentEntitiesQueryResults" element
     */
    @Override
    public void setGeoParentEntitiesQueryResults(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults geoParentEntitiesQueryResults) {
        generatedSetterHelperImpl(geoParentEntitiesQueryResults, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geoParentEntitiesQueryResults" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults addNewGeoParentEntitiesQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoParentEntitiesQueryResults)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "geoParentEntitiesQueryResults" element
     */
    @Override
    public void unsetGeoParentEntitiesQueryResults() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }
}

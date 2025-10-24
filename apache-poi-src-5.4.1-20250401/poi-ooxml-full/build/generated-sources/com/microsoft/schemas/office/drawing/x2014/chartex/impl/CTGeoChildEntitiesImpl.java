/*
 * XML Type:  CT_GeoChildEntities
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GeoChildEntities(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTGeoChildEntitiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoChildEntities {
    private static final long serialVersionUID = 1L;

    public CTGeoChildEntitiesImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "geoHierarchyEntity"),
    };


    /**
     * Gets a List of "geoHierarchyEntity" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity> getGeoHierarchyEntityList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGeoHierarchyEntityArray,
                this::setGeoHierarchyEntityArray,
                this::insertNewGeoHierarchyEntity,
                this::removeGeoHierarchyEntity,
                this::sizeOfGeoHierarchyEntityArray
            );
        }
    }

    /**
     * Gets array of all "geoHierarchyEntity" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity[] getGeoHierarchyEntityArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity[0]);
    }

    /**
     * Gets ith "geoHierarchyEntity" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity getGeoHierarchyEntityArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "geoHierarchyEntity" element
     */
    @Override
    public int sizeOfGeoHierarchyEntityArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "geoHierarchyEntity" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setGeoHierarchyEntityArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity[] geoHierarchyEntityArray) {
        check_orphaned();
        arraySetterHelper(geoHierarchyEntityArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "geoHierarchyEntity" element
     */
    @Override
    public void setGeoHierarchyEntityArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity geoHierarchyEntity) {
        generatedSetterHelperImpl(geoHierarchyEntity, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoHierarchyEntity" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity insertNewGeoHierarchyEntity(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "geoHierarchyEntity" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity addNewGeoHierarchyEntity() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGeoHierarchyEntity)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "geoHierarchyEntity" element
     */
    @Override
    public void removeGeoHierarchyEntity(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

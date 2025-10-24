/*
 * XML Type:  SnapAngles_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SnapAngles_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class SnapAnglesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType {
    private static final long serialVersionUID = 1L;

    public SnapAnglesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "SnapAngle"),
    };


    /**
     * Gets a List of "SnapAngle" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.SnapAngleType> getSnapAngleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSnapAngleArray,
                this::setSnapAngleArray,
                this::insertNewSnapAngle,
                this::removeSnapAngle,
                this::sizeOfSnapAngleArray
            );
        }
    }

    /**
     * Gets array of all "SnapAngle" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SnapAngleType[] getSnapAngleArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.SnapAngleType[0]);
    }

    /**
     * Gets ith "SnapAngle" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SnapAngleType getSnapAngleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SnapAngleType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SnapAngleType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SnapAngle" element
     */
    @Override
    public int sizeOfSnapAngleArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "SnapAngle" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSnapAngleArray(com.microsoft.schemas.office.visio.x2012.main.SnapAngleType[] snapAngleArray) {
        check_orphaned();
        arraySetterHelper(snapAngleArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "SnapAngle" element
     */
    @Override
    public void setSnapAngleArray(int i, com.microsoft.schemas.office.visio.x2012.main.SnapAngleType snapAngle) {
        generatedSetterHelperImpl(snapAngle, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SnapAngle" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SnapAngleType insertNewSnapAngle(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SnapAngleType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SnapAngleType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SnapAngle" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SnapAngleType addNewSnapAngle() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SnapAngleType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SnapAngleType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "SnapAngle" element
     */
    @Override
    public void removeSnapAngle(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

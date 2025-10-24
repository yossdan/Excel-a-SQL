/*
 * XML Type:  FaceNames_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.FaceNamesType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML FaceNames_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class FaceNamesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.FaceNamesType {
    private static final long serialVersionUID = 1L;

    public FaceNamesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "FaceName"),
    };


    /**
     * Gets a List of "FaceName" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.FaceNameType> getFaceNameList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFaceNameArray,
                this::setFaceNameArray,
                this::insertNewFaceName,
                this::removeFaceName,
                this::sizeOfFaceNameArray
            );
        }
    }

    /**
     * Gets array of all "FaceName" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FaceNameType[] getFaceNameArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.FaceNameType[0]);
    }

    /**
     * Gets ith "FaceName" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FaceNameType getFaceNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FaceNameType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FaceNameType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "FaceName" element
     */
    @Override
    public int sizeOfFaceNameArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "FaceName" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setFaceNameArray(com.microsoft.schemas.office.visio.x2012.main.FaceNameType[] faceNameArray) {
        check_orphaned();
        arraySetterHelper(faceNameArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "FaceName" element
     */
    @Override
    public void setFaceNameArray(int i, com.microsoft.schemas.office.visio.x2012.main.FaceNameType faceName) {
        generatedSetterHelperImpl(faceName, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FaceName" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FaceNameType insertNewFaceName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FaceNameType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FaceNameType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "FaceName" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FaceNameType addNewFaceName() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FaceNameType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FaceNameType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "FaceName" element
     */
    @Override
    public void removeFaceName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

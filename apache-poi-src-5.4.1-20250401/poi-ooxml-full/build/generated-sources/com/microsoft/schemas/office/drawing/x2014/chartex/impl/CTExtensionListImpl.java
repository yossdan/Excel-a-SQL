/*
 * XML Type:  CT_ExtensionList
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_ExtensionList(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTExtensionListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList {
    private static final long serialVersionUID = 1L;

    public CTExtensionListImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "ext"),
    };


    /**
     * Gets a List of "ext" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension> getExtList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getExtArray,
                this::setExtArray,
                this::insertNewExt,
                this::removeExt,
                this::sizeOfExtArray
            );
        }
    }

    /**
     * Gets array of all "ext" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension[] getExtArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension[0]);
    }

    /**
     * Gets ith "ext" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension getExtArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ext" element
     */
    @Override
    public int sizeOfExtArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "ext" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setExtArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension[] extArray) {
        check_orphaned();
        arraySetterHelper(extArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "ext" element
     */
    @Override
    public void setExtArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension ext) {
        generatedSetterHelperImpl(ext, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ext" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension insertNewExt(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ext" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension addNewExt() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtension)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ext" element
     */
    @Override
    public void removeExt(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

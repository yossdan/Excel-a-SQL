/*
 * XML Type:  CT_Data
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTData
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Data(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTData {
    private static final long serialVersionUID = 1L;

    public CTDataImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "numDim"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "strDim"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "extLst"),
        new QName("", "id"),
    };


    /**
     * Gets a List of "numDim" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension> getNumDimList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNumDimArray,
                this::setNumDimArray,
                this::insertNewNumDim,
                this::removeNumDim,
                this::sizeOfNumDimArray
            );
        }
    }

    /**
     * Gets array of all "numDim" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension[] getNumDimArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension[0]);
    }

    /**
     * Gets ith "numDim" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension getNumDimArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "numDim" element
     */
    @Override
    public int sizeOfNumDimArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "numDim" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNumDimArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension[] numDimArray) {
        check_orphaned();
        arraySetterHelper(numDimArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "numDim" element
     */
    @Override
    public void setNumDimArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension numDim) {
        generatedSetterHelperImpl(numDim, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "numDim" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension insertNewNumDim(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "numDim" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension addNewNumDim() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "numDim" element
     */
    @Override
    public void removeNumDim(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "strDim" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension> getStrDimList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStrDimArray,
                this::setStrDimArray,
                this::insertNewStrDim,
                this::removeStrDim,
                this::sizeOfStrDimArray
            );
        }
    }

    /**
     * Gets array of all "strDim" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension[] getStrDimArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension[0]);
    }

    /**
     * Gets ith "strDim" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension getStrDimArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "strDim" element
     */
    @Override
    public int sizeOfStrDimArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "strDim" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStrDimArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension[] strDimArray) {
        check_orphaned();
        arraySetterHelper(strDimArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "strDim" element
     */
    @Override
    public void setStrDimArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension strDim) {
        generatedSetterHelperImpl(strDim, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "strDim" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension insertNewStrDim(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "strDim" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension addNewStrDim() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "strDim" element
     */
    @Override
    public void removeStrDim(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList getExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "id" attribute
     */
    @Override
    public long getId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STDataId xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STDataId target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDataId)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Sets the "id" attribute
     */
    @Override
    public void setId(long id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setLongValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(com.microsoft.schemas.office.drawing.x2014.chartex.STDataId id) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STDataId target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDataId)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDataId)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(id);
        }
    }
}

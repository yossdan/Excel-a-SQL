/*
 * XML Type:  CT_NumericDimension
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_NumericDimension(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTNumericDimensionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension {
    private static final long serialVersionUID = 1L;

    public CTNumericDimensionImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "f"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "nf"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "lvl"),
        new QName("", "type"),
    };


    /**
     * Gets the "f" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula getF() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "f" element
     */
    @Override
    public boolean isSetF() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "f" element
     */
    @Override
    public void setF(com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula f) {
        generatedSetterHelperImpl(f, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "f" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula addNewF() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "f" element
     */
    @Override
    public void unsetF() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "nf" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula getNf() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "nf" element
     */
    @Override
    public boolean isSetNf() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "nf" element
     */
    @Override
    public void setNf(com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula nf) {
        generatedSetterHelperImpl(nf, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "nf" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula addNewNf() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTFormula)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "nf" element
     */
    @Override
    public void unsetNf() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "lvl" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel> getLvlList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLvlArray,
                this::setLvlArray,
                this::insertNewLvl,
                this::removeLvl,
                this::sizeOfLvlArray
            );
        }
    }

    /**
     * Gets array of all "lvl" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel[] getLvlArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel[0]);
    }

    /**
     * Gets ith "lvl" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel getLvlArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "lvl" element
     */
    @Override
    public int sizeOfLvlArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "lvl" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLvlArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel[] lvlArray) {
        check_orphaned();
        arraySetterHelper(lvlArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "lvl" element
     */
    @Override
    public void setLvlArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel lvl) {
        generatedSetterHelperImpl(lvl, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "lvl" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel insertNewLvl(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "lvl" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel addNewLvl() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericLevel)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "lvl" element
     */
    @Override
    public void removeLvl(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets the "type" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType.Enum getType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : (com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "type" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType xgetType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Sets the "type" attribute
     */
    @Override
    public void setType(com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType.Enum type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setEnumValue(type);
        }
    }

    /**
     * Sets (as xml) the "type" attribute
     */
    @Override
    public void xsetType(com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType type) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STNumericDimensionType)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(type);
        }
    }
}

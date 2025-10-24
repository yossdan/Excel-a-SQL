/*
 * XML Type:  CT_Rules
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTRules
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Rules(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTRulesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.CTRules {
    private static final long serialVersionUID = 1L;

    public CTRulesImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "r"),
        new QName("urn:schemas-microsoft-com:vml", "ext"),
    };


    /**
     * Gets a List of "r" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.office.CTR> getRList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRArray,
                this::setRArray,
                this::insertNewR,
                this::removeR,
                this::sizeOfRArray
            );
        }
    }

    /**
     * Gets array of all "r" elements
     */
    @Override
    public com.microsoft.schemas.office.office.CTR[] getRArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.office.CTR[0]);
    }

    /**
     * Gets ith "r" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTR getRArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTR target = null;
            target = (com.microsoft.schemas.office.office.CTR)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "r" element
     */
    @Override
    public int sizeOfRArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "r" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRArray(com.microsoft.schemas.office.office.CTR[] rArray) {
        check_orphaned();
        arraySetterHelper(rArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "r" element
     */
    @Override
    public void setRArray(int i, com.microsoft.schemas.office.office.CTR r) {
        generatedSetterHelperImpl(r, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "r" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTR insertNewR(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTR target = null;
            target = (com.microsoft.schemas.office.office.CTR)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "r" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTR addNewR() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTR target = null;
            target = (com.microsoft.schemas.office.office.CTR)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "r" element
     */
    @Override
    public void removeR(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "ext" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STExt.Enum getExt() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STExt.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "ext" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STExt xgetExt() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STExt target = null;
            target = (com.microsoft.schemas.vml.STExt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "ext" attribute
     */
    @Override
    public boolean isSetExt() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "ext" attribute
     */
    @Override
    public void setExt(com.microsoft.schemas.vml.STExt.Enum ext) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(ext);
        }
    }

    /**
     * Sets (as xml) the "ext" attribute
     */
    @Override
    public void xsetExt(com.microsoft.schemas.vml.STExt ext) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STExt target = null;
            target = (com.microsoft.schemas.vml.STExt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STExt)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(ext);
        }
    }

    /**
     * Unsets the "ext" attribute
     */
    @Override
    public void unsetExt() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}

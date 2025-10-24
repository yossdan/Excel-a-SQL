/*
 * XML Type:  CT_FormatOverrides
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverrides
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_FormatOverrides(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTFormatOverridesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverrides {
    private static final long serialVersionUID = 1L;

    public CTFormatOverridesImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "fmtOvr"),
    };


    /**
     * Gets a List of "fmtOvr" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride> getFmtOvrList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFmtOvrArray,
                this::setFmtOvrArray,
                this::insertNewFmtOvr,
                this::removeFmtOvr,
                this::sizeOfFmtOvrArray
            );
        }
    }

    /**
     * Gets array of all "fmtOvr" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride[] getFmtOvrArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride[0]);
    }

    /**
     * Gets ith "fmtOvr" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride getFmtOvrArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "fmtOvr" element
     */
    @Override
    public int sizeOfFmtOvrArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "fmtOvr" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setFmtOvrArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride[] fmtOvrArray) {
        check_orphaned();
        arraySetterHelper(fmtOvrArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "fmtOvr" element
     */
    @Override
    public void setFmtOvrArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride fmtOvr) {
        generatedSetterHelperImpl(fmtOvr, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "fmtOvr" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride insertNewFmtOvr(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "fmtOvr" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride addNewFmtOvr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTFormatOverride)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "fmtOvr" element
     */
    @Override
    public void removeFmtOvr(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

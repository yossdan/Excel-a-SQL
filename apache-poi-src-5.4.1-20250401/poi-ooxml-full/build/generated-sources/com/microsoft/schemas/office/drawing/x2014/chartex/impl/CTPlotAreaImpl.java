/*
 * XML Type:  CT_PlotArea
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_PlotArea(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTPlotAreaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotArea {
    private static final long serialVersionUID = 1L;

    public CTPlotAreaImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "plotAreaRegion"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "axis"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "spPr"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "extLst"),
    };


    /**
     * Gets the "plotAreaRegion" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion getPlotAreaRegion() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "plotAreaRegion" element
     */
    @Override
    public void setPlotAreaRegion(com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion plotAreaRegion) {
        generatedSetterHelperImpl(plotAreaRegion, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "plotAreaRegion" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion addNewPlotAreaRegion() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTPlotAreaRegion)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets a List of "axis" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis> getAxisList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAxisArray,
                this::setAxisArray,
                this::insertNewAxis,
                this::removeAxis,
                this::sizeOfAxisArray
            );
        }
    }

    /**
     * Gets array of all "axis" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis[] getAxisArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis[0]);
    }

    /**
     * Gets ith "axis" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis getAxisArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "axis" element
     */
    @Override
    public int sizeOfAxisArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "axis" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAxisArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis[] axisArray) {
        check_orphaned();
        arraySetterHelper(axisArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "axis" element
     */
    @Override
    public void setAxisArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis axis) {
        generatedSetterHelperImpl(axis, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "axis" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis insertNewAxis(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "axis" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis addNewAxis() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "axis" element
     */
    @Override
    public void removeAxis(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "spPr" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "spPr" element
     */
    @Override
    public boolean isSetSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "spPr" element
     */
    @Override
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr) {
        generatedSetterHelperImpl(spPr, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "spPr" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "spPr" element
     */
    @Override
    public void unsetSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
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
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().find_element_user(PROPERTY_QNAME[3], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().add_element_user(PROPERTY_QNAME[3]);
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
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }
}

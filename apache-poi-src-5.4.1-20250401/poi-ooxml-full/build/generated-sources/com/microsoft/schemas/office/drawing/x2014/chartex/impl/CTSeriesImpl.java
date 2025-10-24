/*
 * XML Type:  CT_Series
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Series(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTSeriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries {
    private static final long serialVersionUID = 1L;

    public CTSeriesImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "tx"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "spPr"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "valueColors"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "valueColorPositions"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "dataPt"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "dataLabels"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "dataId"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "layoutPr"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "axisId"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "extLst"),
        new QName("", "layoutId"),
        new QName("", "hidden"),
        new QName("", "ownerIdx"),
        new QName("", "uniqueId"),
        new QName("", "formatIdx"),
    };


    /**
     * Gets the "tx" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTText getTx() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTText target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTText)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "tx" element
     */
    @Override
    public boolean isSetTx() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "tx" element
     */
    @Override
    public void setTx(com.microsoft.schemas.office.drawing.x2014.chartex.CTText tx) {
        generatedSetterHelperImpl(tx, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "tx" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTText addNewTx() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTText target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTText)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "tx" element
     */
    @Override
    public void unsetTx() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(PROPERTY_QNAME[1], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "spPr" element
     */
    @Override
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr) {
        generatedSetterHelperImpl(spPr, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "spPr" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "valueColors" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors getValueColors() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "valueColors" element
     */
    @Override
    public boolean isSetValueColors() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "valueColors" element
     */
    @Override
    public void setValueColors(com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors valueColors) {
        generatedSetterHelperImpl(valueColors, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "valueColors" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors addNewValueColors() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "valueColors" element
     */
    @Override
    public void unsetValueColors() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "valueColorPositions" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions getValueColorPositions() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "valueColorPositions" element
     */
    @Override
    public boolean isSetValueColorPositions() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "valueColorPositions" element
     */
    @Override
    public void setValueColorPositions(com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions valueColorPositions) {
        generatedSetterHelperImpl(valueColorPositions, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "valueColorPositions" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions addNewValueColorPositions() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "valueColorPositions" element
     */
    @Override
    public void unsetValueColorPositions() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets a List of "dataPt" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint> getDataPtList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataPtArray,
                this::setDataPtArray,
                this::insertNewDataPt,
                this::removeDataPt,
                this::sizeOfDataPtArray
            );
        }
    }

    /**
     * Gets array of all "dataPt" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint[] getDataPtArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint[0]);
    }

    /**
     * Gets ith "dataPt" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint getDataPtArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "dataPt" element
     */
    @Override
    public int sizeOfDataPtArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "dataPt" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataPtArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint[] dataPtArray) {
        check_orphaned();
        arraySetterHelper(dataPtArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "dataPt" element
     */
    @Override
    public void setDataPtArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint dataPt) {
        generatedSetterHelperImpl(dataPt, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataPt" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint insertNewDataPt(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "dataPt" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint addNewDataPt() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "dataPt" element
     */
    @Override
    public void removeDataPt(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets the "dataLabels" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels getDataLabels() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "dataLabels" element
     */
    @Override
    public boolean isSetDataLabels() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "dataLabels" element
     */
    @Override
    public void setDataLabels(com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels dataLabels) {
        generatedSetterHelperImpl(dataLabels, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "dataLabels" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels addNewDataLabels() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "dataLabels" element
     */
    @Override
    public void unsetDataLabels() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "dataId" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataId getDataId() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataId target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataId)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "dataId" element
     */
    @Override
    public boolean isSetDataId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "dataId" element
     */
    @Override
    public void setDataId(com.microsoft.schemas.office.drawing.x2014.chartex.CTDataId dataId) {
        generatedSetterHelperImpl(dataId, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "dataId" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataId addNewDataId() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataId target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataId)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "dataId" element
     */
    @Override
    public void unsetDataId() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "layoutPr" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties getLayoutPr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "layoutPr" element
     */
    @Override
    public boolean isSetLayoutPr() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "layoutPr" element
     */
    @Override
    public void setLayoutPr(com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties layoutPr) {
        generatedSetterHelperImpl(layoutPr, PROPERTY_QNAME[7], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "layoutPr" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties addNewLayoutPr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Unsets the "layoutPr" element
     */
    @Override
    public void unsetLayoutPr() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets a List of "axisId" elements
     */
    @Override
    public java.util.List<java.lang.Long> getAxisIdList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getAxisIdArray,
                this::setAxisIdArray,
                this::insertAxisId,
                this::removeAxisId,
                this::sizeOfAxisIdArray
            );
        }
    }

    /**
     * Gets array of all "axisId" elements
     */
    @Override
    public long[] getAxisIdArray() {
        return getLongArray(PROPERTY_QNAME[8]);
    }

    /**
     * Gets ith "axisId" element
     */
    @Override
    public long getAxisIdArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getLongValue();
        }
    }

    /**
     * Gets (as xml) a List of "axisId" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId> xgetAxisIdList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetAxisIdArray,
                this::xsetAxisIdArray,
                this::insertNewAxisId,
                this::removeAxisId,
                this::sizeOfAxisIdArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "axisId" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId[] xgetAxisIdArray() {
        return xgetArray(PROPERTY_QNAME[8], com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId[]::new);
    }

    /**
     * Gets (as xml) ith "axisId" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId xgetAxisIdArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "axisId" element
     */
    @Override
    public int sizeOfAxisIdArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets array of all "axisId" element
     */
    @Override
    public void setAxisIdArray(long[] axisIdArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(axisIdArray, PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets ith "axisId" element
     */
    @Override
    public void setAxisIdArray(int i, long axisId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setLongValue(axisId);
        }
    }

    /**
     * Sets (as xml) array of all "axisId" element
     */
    @Override
    public void xsetAxisIdArray(com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId[]axisIdArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(axisIdArray, PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets (as xml) ith "axisId" element
     */
    @Override
    public void xsetAxisIdArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId axisId) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(axisId);
        }
    }

    /**
     * Inserts the value as the ith "axisId" element
     */
    @Override
    public void insertAxisId(int i, long axisId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            target.setLongValue(axisId);
        }
    }

    /**
     * Appends the value as the last "axisId" element
     */
    @Override
    public void addAxisId(long axisId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[8]);
            target.setLongValue(axisId);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "axisId" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId insertNewAxisId(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "axisId" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId addNewAxisId() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Removes the ith "axisId" element
     */
    @Override
    public void removeAxisId(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], i);
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
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().find_element_user(PROPERTY_QNAME[9], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[9], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().add_element_user(PROPERTY_QNAME[9]);
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
            get_store().remove_element(PROPERTY_QNAME[9], 0);
        }
    }

    /**
     * Gets the "layoutId" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout.Enum getLayoutId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return (target == null) ? null : (com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "layoutId" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout xgetLayoutId() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Sets the "layoutId" attribute
     */
    @Override
    public void setLayoutId(com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout.Enum layoutId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setEnumValue(layoutId);
        }
    }

    /**
     * Sets (as xml) the "layoutId" attribute
     */
    @Override
    public void xsetLayoutId(com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout layoutId) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(layoutId);
        }
    }

    /**
     * Gets the "hidden" attribute
     */
    @Override
    public boolean getHidden() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[11]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "hidden" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetHidden() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[11]);
            }
            return target;
        }
    }

    /**
     * True if has "hidden" attribute
     */
    @Override
    public boolean isSetHidden() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "hidden" attribute
     */
    @Override
    public void setHidden(boolean hidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setBooleanValue(hidden);
        }
    }

    /**
     * Sets (as xml) the "hidden" attribute
     */
    @Override
    public void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.set(hidden);
        }
    }

    /**
     * Unsets the "hidden" attribute
     */
    @Override
    public void unsetHidden() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Gets the "ownerIdx" attribute
     */
    @Override
    public long getOwnerIdx() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "ownerIdx" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetOwnerIdx() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "ownerIdx" attribute
     */
    @Override
    public boolean isSetOwnerIdx() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "ownerIdx" attribute
     */
    @Override
    public void setOwnerIdx(long ownerIdx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setLongValue(ownerIdx);
        }
    }

    /**
     * Sets (as xml) the "ownerIdx" attribute
     */
    @Override
    public void xsetOwnerIdx(org.apache.xmlbeans.XmlUnsignedInt ownerIdx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(ownerIdx);
        }
    }

    /**
     * Unsets the "ownerIdx" attribute
     */
    @Override
    public void unsetOwnerIdx() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "uniqueId" attribute
     */
    @Override
    public java.lang.String getUniqueId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "uniqueId" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetUniqueId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "uniqueId" attribute
     */
    @Override
    public boolean isSetUniqueId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "uniqueId" attribute
     */
    @Override
    public void setUniqueId(java.lang.String uniqueId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setStringValue(uniqueId);
        }
    }

    /**
     * Sets (as xml) the "uniqueId" attribute
     */
    @Override
    public void xsetUniqueId(org.apache.xmlbeans.XmlString uniqueId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(uniqueId);
        }
    }

    /**
     * Unsets the "uniqueId" attribute
     */
    @Override
    public void unsetUniqueId() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Gets the "formatIdx" attribute
     */
    @Override
    public long getFormatIdx() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "formatIdx" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetFormatIdx() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * True if has "formatIdx" attribute
     */
    @Override
    public boolean isSetFormatIdx() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
        }
    }

    /**
     * Sets the "formatIdx" attribute
     */
    @Override
    public void setFormatIdx(long formatIdx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.setLongValue(formatIdx);
        }
    }

    /**
     * Sets (as xml) the "formatIdx" attribute
     */
    @Override
    public void xsetFormatIdx(org.apache.xmlbeans.XmlUnsignedInt formatIdx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.set(formatIdx);
        }
    }

    /**
     * Unsets the "formatIdx" attribute
     */
    @Override
    public void unsetFormatIdx() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[14]);
        }
    }
}

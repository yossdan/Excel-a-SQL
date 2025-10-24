/*
 * XML Type:  CT_Series
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Series(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTSeries extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTSeries> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctseriescf2ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "tx" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTText getTx();

    /**
     * True if has "tx" element
     */
    boolean isSetTx();

    /**
     * Sets the "tx" element
     */
    void setTx(com.microsoft.schemas.office.drawing.x2014.chartex.CTText tx);

    /**
     * Appends and returns a new empty "tx" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTText addNewTx();

    /**
     * Unsets the "tx" element
     */
    void unsetTx();

    /**
     * Gets the "spPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr();

    /**
     * True if has "spPr" element
     */
    boolean isSetSpPr();

    /**
     * Sets the "spPr" element
     */
    void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr);

    /**
     * Appends and returns a new empty "spPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr();

    /**
     * Unsets the "spPr" element
     */
    void unsetSpPr();

    /**
     * Gets the "valueColors" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors getValueColors();

    /**
     * True if has "valueColors" element
     */
    boolean isSetValueColors();

    /**
     * Sets the "valueColors" element
     */
    void setValueColors(com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors valueColors);

    /**
     * Appends and returns a new empty "valueColors" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColors addNewValueColors();

    /**
     * Unsets the "valueColors" element
     */
    void unsetValueColors();

    /**
     * Gets the "valueColorPositions" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions getValueColorPositions();

    /**
     * True if has "valueColorPositions" element
     */
    boolean isSetValueColorPositions();

    /**
     * Sets the "valueColorPositions" element
     */
    void setValueColorPositions(com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions valueColorPositions);

    /**
     * Appends and returns a new empty "valueColorPositions" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTValueColorPositions addNewValueColorPositions();

    /**
     * Unsets the "valueColorPositions" element
     */
    void unsetValueColorPositions();

    /**
     * Gets a List of "dataPt" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint> getDataPtList();

    /**
     * Gets array of all "dataPt" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint[] getDataPtArray();

    /**
     * Gets ith "dataPt" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint getDataPtArray(int i);

    /**
     * Returns number of "dataPt" element
     */
    int sizeOfDataPtArray();

    /**
     * Sets array of all "dataPt" element
     */
    void setDataPtArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint[] dataPtArray);

    /**
     * Sets ith "dataPt" element
     */
    void setDataPtArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint dataPt);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataPt" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint insertNewDataPt(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "dataPt" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataPoint addNewDataPt();

    /**
     * Removes the ith "dataPt" element
     */
    void removeDataPt(int i);

    /**
     * Gets the "dataLabels" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels getDataLabels();

    /**
     * True if has "dataLabels" element
     */
    boolean isSetDataLabels();

    /**
     * Sets the "dataLabels" element
     */
    void setDataLabels(com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels dataLabels);

    /**
     * Appends and returns a new empty "dataLabels" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels addNewDataLabels();

    /**
     * Unsets the "dataLabels" element
     */
    void unsetDataLabels();

    /**
     * Gets the "dataId" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataId getDataId();

    /**
     * True if has "dataId" element
     */
    boolean isSetDataId();

    /**
     * Sets the "dataId" element
     */
    void setDataId(com.microsoft.schemas.office.drawing.x2014.chartex.CTDataId dataId);

    /**
     * Appends and returns a new empty "dataId" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTDataId addNewDataId();

    /**
     * Unsets the "dataId" element
     */
    void unsetDataId();

    /**
     * Gets the "layoutPr" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties getLayoutPr();

    /**
     * True if has "layoutPr" element
     */
    boolean isSetLayoutPr();

    /**
     * Sets the "layoutPr" element
     */
    void setLayoutPr(com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties layoutPr);

    /**
     * Appends and returns a new empty "layoutPr" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTSeriesLayoutProperties addNewLayoutPr();

    /**
     * Unsets the "layoutPr" element
     */
    void unsetLayoutPr();

    /**
     * Gets a List of "axisId" elements
     */
    java.util.List<java.lang.Long> getAxisIdList();

    /**
     * Gets array of all "axisId" elements
     */
    long[] getAxisIdArray();

    /**
     * Gets ith "axisId" element
     */
    long getAxisIdArray(int i);

    /**
     * Gets (as xml) a List of "axisId" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId> xgetAxisIdList();

    /**
     * Gets (as xml) array of all "axisId" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId[] xgetAxisIdArray();

    /**
     * Gets (as xml) ith "axisId" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId xgetAxisIdArray(int i);

    /**
     * Returns number of "axisId" element
     */
    int sizeOfAxisIdArray();

    /**
     * Sets array of all "axisId" element
     */
    void setAxisIdArray(long[] axisIdArray);

    /**
     * Sets ith "axisId" element
     */
    void setAxisIdArray(int i, long axisId);

    /**
     * Sets (as xml) array of all "axisId" element
     */
    void xsetAxisIdArray(com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId[] axisIdArray);

    /**
     * Sets (as xml) ith "axisId" element
     */
    void xsetAxisIdArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId axisId);

    /**
     * Inserts the value as the ith "axisId" element
     */
    void insertAxisId(int i, long axisId);

    /**
     * Appends the value as the last "axisId" element
     */
    void addAxisId(long axisId);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "axisId" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId insertNewAxisId(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "axisId" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId addNewAxisId();

    /**
     * Removes the ith "axisId" element
     */
    void removeAxisId(int i);

    /**
     * Gets the "extLst" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList getExtLst();

    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();

    /**
     * Sets the "extLst" element
     */
    void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst);

    /**
     * Appends and returns a new empty "extLst" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();

    /**
     * Gets the "layoutId" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout.Enum getLayoutId();

    /**
     * Gets (as xml) the "layoutId" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout xgetLayoutId();

    /**
     * Sets the "layoutId" attribute
     */
    void setLayoutId(com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout.Enum layoutId);

    /**
     * Sets (as xml) the "layoutId" attribute
     */
    void xsetLayoutId(com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout layoutId);

    /**
     * Gets the "hidden" attribute
     */
    boolean getHidden();

    /**
     * Gets (as xml) the "hidden" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHidden();

    /**
     * True if has "hidden" attribute
     */
    boolean isSetHidden();

    /**
     * Sets the "hidden" attribute
     */
    void setHidden(boolean hidden);

    /**
     * Sets (as xml) the "hidden" attribute
     */
    void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden);

    /**
     * Unsets the "hidden" attribute
     */
    void unsetHidden();

    /**
     * Gets the "ownerIdx" attribute
     */
    long getOwnerIdx();

    /**
     * Gets (as xml) the "ownerIdx" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetOwnerIdx();

    /**
     * True if has "ownerIdx" attribute
     */
    boolean isSetOwnerIdx();

    /**
     * Sets the "ownerIdx" attribute
     */
    void setOwnerIdx(long ownerIdx);

    /**
     * Sets (as xml) the "ownerIdx" attribute
     */
    void xsetOwnerIdx(org.apache.xmlbeans.XmlUnsignedInt ownerIdx);

    /**
     * Unsets the "ownerIdx" attribute
     */
    void unsetOwnerIdx();

    /**
     * Gets the "uniqueId" attribute
     */
    java.lang.String getUniqueId();

    /**
     * Gets (as xml) the "uniqueId" attribute
     */
    org.apache.xmlbeans.XmlString xgetUniqueId();

    /**
     * True if has "uniqueId" attribute
     */
    boolean isSetUniqueId();

    /**
     * Sets the "uniqueId" attribute
     */
    void setUniqueId(java.lang.String uniqueId);

    /**
     * Sets (as xml) the "uniqueId" attribute
     */
    void xsetUniqueId(org.apache.xmlbeans.XmlString uniqueId);

    /**
     * Unsets the "uniqueId" attribute
     */
    void unsetUniqueId();

    /**
     * Gets the "formatIdx" attribute
     */
    long getFormatIdx();

    /**
     * Gets (as xml) the "formatIdx" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetFormatIdx();

    /**
     * True if has "formatIdx" attribute
     */
    boolean isSetFormatIdx();

    /**
     * Sets the "formatIdx" attribute
     */
    void setFormatIdx(long formatIdx);

    /**
     * Sets (as xml) the "formatIdx" attribute
     */
    void xsetFormatIdx(org.apache.xmlbeans.XmlUnsignedInt formatIdx);

    /**
     * Unsets the "formatIdx" attribute
     */
    void unsetFormatIdx();
}

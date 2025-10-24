/*
 * XML Type:  CT_DataLabels
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_DataLabels(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTDataLabelsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabels {
    private static final long serialVersionUID = 1L;

    public CTDataLabelsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "numFmt"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "spPr"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "txPr"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "visibility"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "separator"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "dataLabel"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "dataLabelHidden"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "extLst"),
        new QName("", "pos"),
    };


    /**
     * Gets the "numFmt" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat getNumFmt() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "numFmt" element
     */
    @Override
    public boolean isSetNumFmt() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "numFmt" element
     */
    @Override
    public void setNumFmt(com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat numFmt) {
        generatedSetterHelperImpl(numFmt, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "numFmt" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat addNewNumFmt() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "numFmt" element
     */
    @Override
    public void unsetNumFmt() {
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
     * Gets the "txPr" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "txPr" element
     */
    @Override
    public boolean isSetTxPr() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "txPr" element
     */
    @Override
    public void setTxPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txPr) {
        generatedSetterHelperImpl(txPr, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "txPr" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "txPr" element
     */
    @Override
    public void unsetTxPr() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "visibility" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelVisibilities getVisibility() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelVisibilities target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelVisibilities)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "visibility" element
     */
    @Override
    public boolean isSetVisibility() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "visibility" element
     */
    @Override
    public void setVisibility(com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelVisibilities visibility) {
        generatedSetterHelperImpl(visibility, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "visibility" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelVisibilities addNewVisibility() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelVisibilities target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelVisibilities)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "visibility" element
     */
    @Override
    public void unsetVisibility() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "separator" element
     */
    @Override
    public java.lang.String getSeparator() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "separator" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetSeparator() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return target;
        }
    }

    /**
     * True if has "separator" element
     */
    @Override
    public boolean isSetSeparator() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "separator" element
     */
    @Override
    public void setSeparator(java.lang.String separator) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(separator);
        }
    }

    /**
     * Sets (as xml) the "separator" element
     */
    @Override
    public void xsetSeparator(org.apache.xmlbeans.XmlString separator) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.set(separator);
        }
    }

    /**
     * Unsets the "separator" element
     */
    @Override
    public void unsetSeparator() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets a List of "dataLabel" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel> getDataLabelList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataLabelArray,
                this::setDataLabelArray,
                this::insertNewDataLabel,
                this::removeDataLabel,
                this::sizeOfDataLabelArray
            );
        }
    }

    /**
     * Gets array of all "dataLabel" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel[] getDataLabelArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel[0]);
    }

    /**
     * Gets ith "dataLabel" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel getDataLabelArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "dataLabel" element
     */
    @Override
    public int sizeOfDataLabelArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "dataLabel" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataLabelArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel[] dataLabelArray) {
        check_orphaned();
        arraySetterHelper(dataLabelArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "dataLabel" element
     */
    @Override
    public void setDataLabelArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel dataLabel) {
        generatedSetterHelperImpl(dataLabel, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataLabel" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel insertNewDataLabel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "dataLabel" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel addNewDataLabel() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabel)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "dataLabel" element
     */
    @Override
    public void removeDataLabel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "dataLabelHidden" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden> getDataLabelHiddenList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataLabelHiddenArray,
                this::setDataLabelHiddenArray,
                this::insertNewDataLabelHidden,
                this::removeDataLabelHidden,
                this::sizeOfDataLabelHiddenArray
            );
        }
    }

    /**
     * Gets array of all "dataLabelHidden" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden[] getDataLabelHiddenArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden[0]);
    }

    /**
     * Gets ith "dataLabelHidden" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden getDataLabelHiddenArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "dataLabelHidden" element
     */
    @Override
    public int sizeOfDataLabelHiddenArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "dataLabelHidden" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataLabelHiddenArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden[] dataLabelHiddenArray) {
        check_orphaned();
        arraySetterHelper(dataLabelHiddenArray, PROPERTY_QNAME[6]);
    }

    /**
     * Sets ith "dataLabelHidden" element
     */
    @Override
    public void setDataLabelHiddenArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden dataLabelHidden) {
        generatedSetterHelperImpl(dataLabelHidden, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataLabelHidden" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden insertNewDataLabelHidden(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "dataLabelHidden" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden addNewDataLabelHidden() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTDataLabelHidden)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "dataLabelHidden" element
     */
    @Override
    public void removeDataLabelHidden(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
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
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().find_element_user(PROPERTY_QNAME[7], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[7], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().add_element_user(PROPERTY_QNAME[7]);
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
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "pos" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos.Enum getPos() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : (com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "pos" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos xgetPos() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "pos" attribute
     */
    @Override
    public boolean isSetPos() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "pos" attribute
     */
    @Override
    public void setPos(com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos.Enum pos) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setEnumValue(pos);
        }
    }

    /**
     * Sets (as xml) the "pos" attribute
     */
    @Override
    public void xsetPos(com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos pos) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STDataLabelPos)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(pos);
        }
    }

    /**
     * Unsets the "pos" attribute
     */
    @Override
    public void unsetPos() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }
}

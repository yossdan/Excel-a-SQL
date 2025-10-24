/*
 * XML Type:  CT_Axis
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Axis(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public class CTAxisImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.CTAxis {
    private static final long serialVersionUID = 1L;

    public CTAxisImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "catScaling"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "valScaling"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "title"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "units"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "majorGridlines"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "minorGridlines"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "majorTickMarks"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "minorTickMarks"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "tickLabels"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "numFmt"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "spPr"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "txPr"),
        new QName("http://schemas.microsoft.com/office/drawing/2014/chartex", "extLst"),
        new QName("", "id"),
        new QName("", "hidden"),
    };


    /**
     * Gets the "catScaling" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling getCatScaling() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "catScaling" element
     */
    @Override
    public boolean isSetCatScaling() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "catScaling" element
     */
    @Override
    public void setCatScaling(com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling catScaling) {
        generatedSetterHelperImpl(catScaling, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "catScaling" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling addNewCatScaling() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTCategoryAxisScaling)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "catScaling" element
     */
    @Override
    public void unsetCatScaling() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "valScaling" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling getValScaling() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "valScaling" element
     */
    @Override
    public boolean isSetValScaling() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "valScaling" element
     */
    @Override
    public void setValScaling(com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling valScaling) {
        generatedSetterHelperImpl(valScaling, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "valScaling" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling addNewValScaling() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTValueAxisScaling)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "valScaling" element
     */
    @Override
    public void unsetValScaling() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "title" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisTitle getTitle() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisTitle target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisTitle)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "title" element
     */
    @Override
    public boolean isSetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "title" element
     */
    @Override
    public void setTitle(com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisTitle title) {
        generatedSetterHelperImpl(title, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "title" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisTitle addNewTitle() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisTitle target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisTitle)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "title" element
     */
    @Override
    public void unsetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "units" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits getUnits() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "units" element
     */
    @Override
    public boolean isSetUnits() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "units" element
     */
    @Override
    public void setUnits(com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits units) {
        generatedSetterHelperImpl(units, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "units" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits addNewUnits() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTAxisUnits)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "units" element
     */
    @Override
    public void unsetUnits() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "majorGridlines" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines getMajorGridlines() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "majorGridlines" element
     */
    @Override
    public boolean isSetMajorGridlines() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "majorGridlines" element
     */
    @Override
    public void setMajorGridlines(com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines majorGridlines) {
        generatedSetterHelperImpl(majorGridlines, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "majorGridlines" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines addNewMajorGridlines() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "majorGridlines" element
     */
    @Override
    public void unsetMajorGridlines() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "minorGridlines" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines getMinorGridlines() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "minorGridlines" element
     */
    @Override
    public boolean isSetMinorGridlines() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "minorGridlines" element
     */
    @Override
    public void setMinorGridlines(com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines minorGridlines) {
        generatedSetterHelperImpl(minorGridlines, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "minorGridlines" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines addNewMinorGridlines() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTGridlines)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "minorGridlines" element
     */
    @Override
    public void unsetMinorGridlines() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "majorTickMarks" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks getMajorTickMarks() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "majorTickMarks" element
     */
    @Override
    public boolean isSetMajorTickMarks() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "majorTickMarks" element
     */
    @Override
    public void setMajorTickMarks(com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks majorTickMarks) {
        generatedSetterHelperImpl(majorTickMarks, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "majorTickMarks" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks addNewMajorTickMarks() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "majorTickMarks" element
     */
    @Override
    public void unsetMajorTickMarks() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "minorTickMarks" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks getMinorTickMarks() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "minorTickMarks" element
     */
    @Override
    public boolean isSetMinorTickMarks() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "minorTickMarks" element
     */
    @Override
    public void setMinorTickMarks(com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks minorTickMarks) {
        generatedSetterHelperImpl(minorTickMarks, PROPERTY_QNAME[7], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "minorTickMarks" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks addNewMinorTickMarks() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTTickMarks)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Unsets the "minorTickMarks" element
     */
    @Override
    public void unsetMinorTickMarks() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "tickLabels" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTTickLabels getTickLabels() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTTickLabels target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTTickLabels)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "tickLabels" element
     */
    @Override
    public boolean isSetTickLabels() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "tickLabels" element
     */
    @Override
    public void setTickLabels(com.microsoft.schemas.office.drawing.x2014.chartex.CTTickLabels tickLabels) {
        generatedSetterHelperImpl(tickLabels, PROPERTY_QNAME[8], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "tickLabels" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTTickLabels addNewTickLabels() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTTickLabels target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTTickLabels)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Unsets the "tickLabels" element
     */
    @Override
    public void unsetTickLabels() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "numFmt" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat getNumFmt() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat)get_store().find_element_user(PROPERTY_QNAME[9], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "numFmt" element
     */
    @Override
    public void setNumFmt(com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat numFmt) {
        generatedSetterHelperImpl(numFmt, PROPERTY_QNAME[9], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "numFmt" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat addNewNumFmt() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTNumberFormat)get_store().add_element_user(PROPERTY_QNAME[9]);
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
            get_store().remove_element(PROPERTY_QNAME[9], 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(PROPERTY_QNAME[10], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[10]) != 0;
        }
    }

    /**
     * Sets the "spPr" element
     */
    @Override
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr) {
        generatedSetterHelperImpl(spPr, PROPERTY_QNAME[10], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "spPr" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(PROPERTY_QNAME[10]);
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
            get_store().remove_element(PROPERTY_QNAME[10], 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(PROPERTY_QNAME[11], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[11]) != 0;
        }
    }

    /**
     * Sets the "txPr" element
     */
    @Override
    public void setTxPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txPr) {
        generatedSetterHelperImpl(txPr, PROPERTY_QNAME[11], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "txPr" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(PROPERTY_QNAME[11]);
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
            get_store().remove_element(PROPERTY_QNAME[11], 0);
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
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().find_element_user(PROPERTY_QNAME[12], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[12]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[12], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList)get_store().add_element_user(PROPERTY_QNAME[12]);
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
            get_store().remove_element(PROPERTY_QNAME[12], 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId)get_store().find_attribute_user(PROPERTY_QNAME[13]);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setLongValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId id) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId target = null;
            target = (com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (com.microsoft.schemas.office.drawing.x2014.chartex.STAxisId)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(id);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[14]);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[14]);
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
            return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[14]);
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
            get_store().remove_attribute(PROPERTY_QNAME[14]);
        }
    }
}

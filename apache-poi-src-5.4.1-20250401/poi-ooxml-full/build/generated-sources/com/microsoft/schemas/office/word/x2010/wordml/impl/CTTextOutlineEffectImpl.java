/*
 * XML Type:  CT_TextOutlineEffect
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTTextOutlineEffect
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_TextOutlineEffect(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTTextOutlineEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTTextOutlineEffect {
    private static final long serialVersionUID = 1L;

    public CTTextOutlineEffectImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "noFill"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "solidFill"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "gradFill"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "prstDash"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "round"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "bevel"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "miter"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "w"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "cap"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "cmpd"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "algn"),
    };


    /**
     * Gets the "noFill" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getNoFill() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "noFill" element
     */
    @Override
    public boolean isSetNoFill() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "noFill" element
     */
    @Override
    public void setNoFill(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty noFill) {
        generatedSetterHelperImpl(noFill, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "noFill" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewNoFill() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "noFill" element
     */
    @Override
    public void unsetNoFill() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "solidFill" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties getSolidFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "solidFill" element
     */
    @Override
    public boolean isSetSolidFill() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "solidFill" element
     */
    @Override
    public void setSolidFill(com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties solidFill) {
        generatedSetterHelperImpl(solidFill, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "solidFill" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties addNewSolidFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "solidFill" element
     */
    @Override
    public void unsetSolidFill() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "gradFill" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties getGradFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "gradFill" element
     */
    @Override
    public boolean isSetGradFill() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "gradFill" element
     */
    @Override
    public void setGradFill(com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties gradFill) {
        generatedSetterHelperImpl(gradFill, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "gradFill" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties addNewGradFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "gradFill" element
     */
    @Override
    public void unsetGradFill() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "prstDash" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPresetLineDashProperties getPrstDash() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPresetLineDashProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPresetLineDashProperties)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "prstDash" element
     */
    @Override
    public boolean isSetPrstDash() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "prstDash" element
     */
    @Override
    public void setPrstDash(com.microsoft.schemas.office.word.x2010.wordml.CTPresetLineDashProperties prstDash) {
        generatedSetterHelperImpl(prstDash, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "prstDash" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPresetLineDashProperties addNewPrstDash() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPresetLineDashProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPresetLineDashProperties)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "prstDash" element
     */
    @Override
    public void unsetPrstDash() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "round" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getRound() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "round" element
     */
    @Override
    public boolean isSetRound() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "round" element
     */
    @Override
    public void setRound(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty round) {
        generatedSetterHelperImpl(round, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "round" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewRound() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "round" element
     */
    @Override
    public void unsetRound() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "bevel" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getBevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "bevel" element
     */
    @Override
    public boolean isSetBevel() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "bevel" element
     */
    @Override
    public void setBevel(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty bevel) {
        generatedSetterHelperImpl(bevel, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "bevel" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewBevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "bevel" element
     */
    @Override
    public void unsetBevel() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "miter" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTLineJoinMiterProperties getMiter() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTLineJoinMiterProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTLineJoinMiterProperties)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "miter" element
     */
    @Override
    public boolean isSetMiter() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "miter" element
     */
    @Override
    public void setMiter(com.microsoft.schemas.office.word.x2010.wordml.CTLineJoinMiterProperties miter) {
        generatedSetterHelperImpl(miter, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "miter" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTLineJoinMiterProperties addNewMiter() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTLineJoinMiterProperties target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTLineJoinMiterProperties)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "miter" element
     */
    @Override
    public void unsetMiter() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "w" attribute
     */
    @Override
    public int getW() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "w" attribute
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth xgetW() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "w" attribute
     */
    @Override
    public boolean isSetW() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "w" attribute
     */
    @Override
    public void setW(int w) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setIntValue(w);
        }
    }

    /**
     * Sets (as xml) the "w" attribute
     */
    @Override
    public void xsetW(org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth w) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(w);
        }
    }

    /**
     * Unsets the "w" attribute
     */
    @Override
    public void unsetW() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "cap" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STLineCap.Enum getCap() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.x2010.wordml.STLineCap.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "cap" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STLineCap xgetCap() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STLineCap target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STLineCap)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "cap" attribute
     */
    @Override
    public boolean isSetCap() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "cap" attribute
     */
    @Override
    public void setCap(com.microsoft.schemas.office.word.x2010.wordml.STLineCap.Enum cap) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setEnumValue(cap);
        }
    }

    /**
     * Sets (as xml) the "cap" attribute
     */
    @Override
    public void xsetCap(com.microsoft.schemas.office.word.x2010.wordml.STLineCap cap) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STLineCap target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STLineCap)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.x2010.wordml.STLineCap)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(cap);
        }
    }

    /**
     * Unsets the "cap" attribute
     */
    @Override
    public void unsetCap() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "cmpd" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine.Enum getCmpd() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "cmpd" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine xgetCmpd() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "cmpd" attribute
     */
    @Override
    public boolean isSetCmpd() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "cmpd" attribute
     */
    @Override
    public void setCmpd(com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine.Enum cmpd) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setEnumValue(cmpd);
        }
    }

    /**
     * Sets (as xml) the "cmpd" attribute
     */
    @Override
    public void xsetCmpd(com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine cmpd) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(cmpd);
        }
    }

    /**
     * Unsets the "cmpd" attribute
     */
    @Override
    public void unsetCmpd() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "algn" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment.Enum getAlgn() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "algn" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment xgetAlgn() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * True if has "algn" attribute
     */
    @Override
    public boolean isSetAlgn() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "algn" attribute
     */
    @Override
    public void setAlgn(com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment.Enum algn) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setEnumValue(algn);
        }
    }

    /**
     * Sets (as xml) the "algn" attribute
     */
    @Override
    public void xsetAlgn(com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment algn) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(algn);
        }
    }

    /**
     * Unsets the "algn" attribute
     */
    @Override
    public void unsetAlgn() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }
}

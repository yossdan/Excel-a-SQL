/*
 * XML Type:  CT_Props3D
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTProps3D
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Props3D(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTProps3DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTProps3D {
    private static final long serialVersionUID = 1L;

    public CTProps3DImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "bevelT"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "bevelB"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "extrusionClr"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "contourClr"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "extrusionH"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "contourW"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "prstMaterial"),
    };


    /**
     * Gets the "bevelT" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTBevel getBevelT() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTBevel target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTBevel)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "bevelT" element
     */
    @Override
    public boolean isSetBevelT() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "bevelT" element
     */
    @Override
    public void setBevelT(com.microsoft.schemas.office.word.x2010.wordml.CTBevel bevelT) {
        generatedSetterHelperImpl(bevelT, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "bevelT" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTBevel addNewBevelT() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTBevel target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTBevel)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "bevelT" element
     */
    @Override
    public void unsetBevelT() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "bevelB" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTBevel getBevelB() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTBevel target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTBevel)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "bevelB" element
     */
    @Override
    public boolean isSetBevelB() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "bevelB" element
     */
    @Override
    public void setBevelB(com.microsoft.schemas.office.word.x2010.wordml.CTBevel bevelB) {
        generatedSetterHelperImpl(bevelB, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "bevelB" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTBevel addNewBevelB() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTBevel target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTBevel)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "bevelB" element
     */
    @Override
    public void unsetBevelB() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "extrusionClr" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTColor getExtrusionClr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTColor target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTColor)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "extrusionClr" element
     */
    @Override
    public boolean isSetExtrusionClr() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "extrusionClr" element
     */
    @Override
    public void setExtrusionClr(com.microsoft.schemas.office.word.x2010.wordml.CTColor extrusionClr) {
        generatedSetterHelperImpl(extrusionClr, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extrusionClr" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTColor addNewExtrusionClr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTColor target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTColor)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "extrusionClr" element
     */
    @Override
    public void unsetExtrusionClr() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "contourClr" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTColor getContourClr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTColor target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTColor)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "contourClr" element
     */
    @Override
    public boolean isSetContourClr() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "contourClr" element
     */
    @Override
    public void setContourClr(com.microsoft.schemas.office.word.x2010.wordml.CTColor contourClr) {
        generatedSetterHelperImpl(contourClr, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "contourClr" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTColor addNewContourClr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTColor target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTColor)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "contourClr" element
     */
    @Override
    public void unsetContourClr() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "extrusionH" attribute
     */
    @Override
    public long getExtrusionH() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "extrusionH" attribute
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetExtrusionH() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "extrusionH" attribute
     */
    @Override
    public boolean isSetExtrusionH() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "extrusionH" attribute
     */
    @Override
    public void setExtrusionH(long extrusionH) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setLongValue(extrusionH);
        }
    }

    /**
     * Sets (as xml) the "extrusionH" attribute
     */
    @Override
    public void xsetExtrusionH(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate extrusionH) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(extrusionH);
        }
    }

    /**
     * Unsets the "extrusionH" attribute
     */
    @Override
    public void unsetExtrusionH() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "contourW" attribute
     */
    @Override
    public long getContourW() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "contourW" attribute
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetContourW() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "contourW" attribute
     */
    @Override
    public boolean isSetContourW() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "contourW" attribute
     */
    @Override
    public void setContourW(long contourW) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setLongValue(contourW);
        }
    }

    /**
     * Sets (as xml) the "contourW" attribute
     */
    @Override
    public void xsetContourW(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate contourW) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(contourW);
        }
    }

    /**
     * Unsets the "contourW" attribute
     */
    @Override
    public void unsetContourW() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "prstMaterial" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType.Enum getPrstMaterial() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "prstMaterial" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType xgetPrstMaterial() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "prstMaterial" attribute
     */
    @Override
    public boolean isSetPrstMaterial() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "prstMaterial" attribute
     */
    @Override
    public void setPrstMaterial(com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType.Enum prstMaterial) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setEnumValue(prstMaterial);
        }
    }

    /**
     * Sets (as xml) the "prstMaterial" attribute
     */
    @Override
    public void xsetPrstMaterial(com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType prstMaterial) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.x2010.wordml.STPresetMaterialType)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(prstMaterial);
        }
    }

    /**
     * Unsets the "prstMaterial" attribute
     */
    @Override
    public void unsetPrstMaterial() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }
}

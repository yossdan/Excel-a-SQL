/*
 * XML Type:  CT_ShapeDefaults
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTShapeDefaults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_ShapeDefaults(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTShapeDefaultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.CTShapeDefaults {
    private static final long serialVersionUID = 1L;

    public CTShapeDefaultsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "fill"),
        new QName("urn:schemas-microsoft-com:vml", "stroke"),
        new QName("urn:schemas-microsoft-com:vml", "textbox"),
        new QName("urn:schemas-microsoft-com:vml", "shadow"),
        new QName("urn:schemas-microsoft-com:office:office", "skew"),
        new QName("urn:schemas-microsoft-com:office:office", "extrusion"),
        new QName("urn:schemas-microsoft-com:office:office", "callout"),
        new QName("urn:schemas-microsoft-com:office:office", "lock"),
        new QName("urn:schemas-microsoft-com:office:office", "colormru"),
        new QName("urn:schemas-microsoft-com:office:office", "colormenu"),
        new QName("urn:schemas-microsoft-com:vml", "ext"),
        new QName("", "spidmax"),
        new QName("", "style"),
        new QName("", "fill"),
        new QName("", "fillcolor"),
        new QName("", "stroke"),
        new QName("", "strokecolor"),
        new QName("urn:schemas-microsoft-com:office:office", "allowincell"),
    };


    /**
     * Gets the "fill" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFill getFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFill target = null;
            target = (com.microsoft.schemas.vml.CTFill)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "fill" element
     */
    @Override
    public boolean isSetFill() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "fill" element
     */
    @Override
    public void setFill(com.microsoft.schemas.vml.CTFill fill) {
        generatedSetterHelperImpl(fill, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "fill" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFill addNewFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFill target = null;
            target = (com.microsoft.schemas.vml.CTFill)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "fill" element
     */
    @Override
    public void unsetFill() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "stroke" element
     */
    @Override
    public com.microsoft.schemas.vml.CTStroke getStroke() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTStroke target = null;
            target = (com.microsoft.schemas.vml.CTStroke)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "stroke" element
     */
    @Override
    public boolean isSetStroke() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "stroke" element
     */
    @Override
    public void setStroke(com.microsoft.schemas.vml.CTStroke stroke) {
        generatedSetterHelperImpl(stroke, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "stroke" element
     */
    @Override
    public com.microsoft.schemas.vml.CTStroke addNewStroke() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTStroke target = null;
            target = (com.microsoft.schemas.vml.CTStroke)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "stroke" element
     */
    @Override
    public void unsetStroke() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "textbox" element
     */
    @Override
    public com.microsoft.schemas.vml.CTTextbox getTextbox() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTTextbox target = null;
            target = (com.microsoft.schemas.vml.CTTextbox)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "textbox" element
     */
    @Override
    public boolean isSetTextbox() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "textbox" element
     */
    @Override
    public void setTextbox(com.microsoft.schemas.vml.CTTextbox textbox) {
        generatedSetterHelperImpl(textbox, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "textbox" element
     */
    @Override
    public com.microsoft.schemas.vml.CTTextbox addNewTextbox() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTTextbox target = null;
            target = (com.microsoft.schemas.vml.CTTextbox)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "textbox" element
     */
    @Override
    public void unsetTextbox() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "shadow" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShadow getShadow() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShadow target = null;
            target = (com.microsoft.schemas.vml.CTShadow)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "shadow" element
     */
    @Override
    public boolean isSetShadow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "shadow" element
     */
    @Override
    public void setShadow(com.microsoft.schemas.vml.CTShadow shadow) {
        generatedSetterHelperImpl(shadow, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "shadow" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShadow addNewShadow() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShadow target = null;
            target = (com.microsoft.schemas.vml.CTShadow)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "shadow" element
     */
    @Override
    public void unsetShadow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "skew" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTSkew getSkew() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTSkew target = null;
            target = (com.microsoft.schemas.office.office.CTSkew)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "skew" element
     */
    @Override
    public boolean isSetSkew() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "skew" element
     */
    @Override
    public void setSkew(com.microsoft.schemas.office.office.CTSkew skew) {
        generatedSetterHelperImpl(skew, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "skew" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTSkew addNewSkew() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTSkew target = null;
            target = (com.microsoft.schemas.office.office.CTSkew)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "skew" element
     */
    @Override
    public void unsetSkew() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "extrusion" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTExtrusion getExtrusion() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTExtrusion target = null;
            target = (com.microsoft.schemas.office.office.CTExtrusion)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "extrusion" element
     */
    @Override
    public boolean isSetExtrusion() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "extrusion" element
     */
    @Override
    public void setExtrusion(com.microsoft.schemas.office.office.CTExtrusion extrusion) {
        generatedSetterHelperImpl(extrusion, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extrusion" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTExtrusion addNewExtrusion() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTExtrusion target = null;
            target = (com.microsoft.schemas.office.office.CTExtrusion)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "extrusion" element
     */
    @Override
    public void unsetExtrusion() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "callout" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTCallout getCallout() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTCallout target = null;
            target = (com.microsoft.schemas.office.office.CTCallout)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "callout" element
     */
    @Override
    public boolean isSetCallout() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "callout" element
     */
    @Override
    public void setCallout(com.microsoft.schemas.office.office.CTCallout callout) {
        generatedSetterHelperImpl(callout, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "callout" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTCallout addNewCallout() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTCallout target = null;
            target = (com.microsoft.schemas.office.office.CTCallout)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "callout" element
     */
    @Override
    public void unsetCallout() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "lock" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTLock getLock() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTLock target = null;
            target = (com.microsoft.schemas.office.office.CTLock)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "lock" element
     */
    @Override
    public boolean isSetLock() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "lock" element
     */
    @Override
    public void setLock(com.microsoft.schemas.office.office.CTLock lock) {
        generatedSetterHelperImpl(lock, PROPERTY_QNAME[7], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "lock" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTLock addNewLock() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTLock target = null;
            target = (com.microsoft.schemas.office.office.CTLock)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Unsets the "lock" element
     */
    @Override
    public void unsetLock() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "colormru" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTColorMru getColormru() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTColorMru target = null;
            target = (com.microsoft.schemas.office.office.CTColorMru)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "colormru" element
     */
    @Override
    public boolean isSetColormru() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "colormru" element
     */
    @Override
    public void setColormru(com.microsoft.schemas.office.office.CTColorMru colormru) {
        generatedSetterHelperImpl(colormru, PROPERTY_QNAME[8], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "colormru" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTColorMru addNewColormru() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTColorMru target = null;
            target = (com.microsoft.schemas.office.office.CTColorMru)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Unsets the "colormru" element
     */
    @Override
    public void unsetColormru() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "colormenu" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTColorMenu getColormenu() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTColorMenu target = null;
            target = (com.microsoft.schemas.office.office.CTColorMenu)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "colormenu" element
     */
    @Override
    public boolean isSetColormenu() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "colormenu" element
     */
    @Override
    public void setColormenu(com.microsoft.schemas.office.office.CTColorMenu colormenu) {
        generatedSetterHelperImpl(colormenu, PROPERTY_QNAME[9], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "colormenu" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTColorMenu addNewColormenu() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTColorMenu target = null;
            target = (com.microsoft.schemas.office.office.CTColorMenu)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Unsets the "colormenu" element
     */
    @Override
    public void unsetColormenu() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
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
            target = (com.microsoft.schemas.vml.STExt)get_store().find_attribute_user(PROPERTY_QNAME[10]);
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
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
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
            target = (com.microsoft.schemas.vml.STExt)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STExt)get_store().add_attribute_user(PROPERTY_QNAME[10]);
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
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "spidmax" attribute
     */
    @Override
    public java.math.BigInteger getSpidmax() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "spidmax" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetSpidmax() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * True if has "spidmax" attribute
     */
    @Override
    public boolean isSetSpidmax() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "spidmax" attribute
     */
    @Override
    public void setSpidmax(java.math.BigInteger spidmax) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setBigIntegerValue(spidmax);
        }
    }

    /**
     * Sets (as xml) the "spidmax" attribute
     */
    @Override
    public void xsetSpidmax(org.apache.xmlbeans.XmlInteger spidmax) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.set(spidmax);
        }
    }

    /**
     * Unsets the "spidmax" attribute
     */
    @Override
    public void unsetSpidmax() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Gets the "style" attribute
     */
    @Override
    public java.lang.String getStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "style" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "style" attribute
     */
    @Override
    public boolean isSetStyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "style" attribute
     */
    @Override
    public void setStyle(java.lang.String style) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setStringValue(style);
        }
    }

    /**
     * Sets (as xml) the "style" attribute
     */
    @Override
    public void xsetStyle(org.apache.xmlbeans.XmlString style) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(style);
        }
    }

    /**
     * Unsets the "style" attribute
     */
    @Override
    public void unsetStyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "fill" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getFill2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "fill" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetFill2() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "fill" attribute
     */
    @Override
    public boolean isSetFill2() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "fill" attribute
     */
    @Override
    public void setFill2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum fill2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setEnumValue(fill2);
        }
    }

    /**
     * Sets (as xml) the "fill" attribute
     */
    @Override
    public void xsetFill2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse fill2) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(fill2);
        }
    }

    /**
     * Unsets the "fill" attribute
     */
    @Override
    public void unsetFill2() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Gets the "fillcolor" attribute
     */
    @Override
    public java.lang.String getFillcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "fillcolor" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetFillcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * True if has "fillcolor" attribute
     */
    @Override
    public boolean isSetFillcolor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
        }
    }

    /**
     * Sets the "fillcolor" attribute
     */
    @Override
    public void setFillcolor(java.lang.String fillcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.setStringValue(fillcolor);
        }
    }

    /**
     * Sets (as xml) the "fillcolor" attribute
     */
    @Override
    public void xsetFillcolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType fillcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.set(fillcolor);
        }
    }

    /**
     * Unsets the "fillcolor" attribute
     */
    @Override
    public void unsetFillcolor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Gets the "stroke" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getStroke2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "stroke" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetStroke2() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * True if has "stroke" attribute
     */
    @Override
    public boolean isSetStroke2() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[15]) != null;
        }
    }

    /**
     * Sets the "stroke" attribute
     */
    @Override
    public void setStroke2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum stroke2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.setEnumValue(stroke2);
        }
    }

    /**
     * Sets (as xml) the "stroke" attribute
     */
    @Override
    public void xsetStroke2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse stroke2) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.set(stroke2);
        }
    }

    /**
     * Unsets the "stroke" attribute
     */
    @Override
    public void unsetStroke2() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Gets the "strokecolor" attribute
     */
    @Override
    public java.lang.String getStrokecolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "strokecolor" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetStrokecolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * True if has "strokecolor" attribute
     */
    @Override
    public boolean isSetStrokecolor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[16]) != null;
        }
    }

    /**
     * Sets the "strokecolor" attribute
     */
    @Override
    public void setStrokecolor(java.lang.String strokecolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.setStringValue(strokecolor);
        }
    }

    /**
     * Sets (as xml) the "strokecolor" attribute
     */
    @Override
    public void xsetStrokecolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType strokecolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.set(strokecolor);
        }
    }

    /**
     * Unsets the "strokecolor" attribute
     */
    @Override
    public void unsetStrokecolor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[16]);
        }
    }

    /**
     * Gets the "allowincell" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAllowincell() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "allowincell" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAllowincell() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * True if has "allowincell" attribute
     */
    @Override
    public boolean isSetAllowincell() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[17]) != null;
        }
    }

    /**
     * Sets the "allowincell" attribute
     */
    @Override
    public void setAllowincell(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum allowincell) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[17]);
            }
            target.setEnumValue(allowincell);
        }
    }

    /**
     * Sets (as xml) the "allowincell" attribute
     */
    @Override
    public void xsetAllowincell(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse allowincell) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[17]);
            }
            target.set(allowincell);
        }
    }

    /**
     * Unsets the "allowincell" attribute
     */
    @Override
    public void unsetAllowincell() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[17]);
        }
    }
}

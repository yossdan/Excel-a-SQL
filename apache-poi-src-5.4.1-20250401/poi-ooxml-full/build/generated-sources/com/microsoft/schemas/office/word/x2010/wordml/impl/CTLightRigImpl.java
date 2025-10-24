/*
 * XML Type:  CT_LightRig
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTLightRig
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_LightRig(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTLightRigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTLightRig {
    private static final long serialVersionUID = 1L;

    public CTLightRigImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "rot"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "rig"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "dir"),
    };


    /**
     * Gets the "rot" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSphereCoords getRot() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSphereCoords target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSphereCoords)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "rot" element
     */
    @Override
    public boolean isSetRot() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "rot" element
     */
    @Override
    public void setRot(com.microsoft.schemas.office.word.x2010.wordml.CTSphereCoords rot) {
        generatedSetterHelperImpl(rot, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "rot" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSphereCoords addNewRot() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSphereCoords target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSphereCoords)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "rot" element
     */
    @Override
    public void unsetRot() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "rig" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STLightRigType.Enum getRig() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.x2010.wordml.STLightRigType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "rig" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STLightRigType xgetRig() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STLightRigType target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STLightRigType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "rig" attribute
     */
    @Override
    public void setRig(com.microsoft.schemas.office.word.x2010.wordml.STLightRigType.Enum rig) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(rig);
        }
    }

    /**
     * Sets (as xml) the "rig" attribute
     */
    @Override
    public void xsetRig(com.microsoft.schemas.office.word.x2010.wordml.STLightRigType rig) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STLightRigType target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STLightRigType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.x2010.wordml.STLightRigType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(rig);
        }
    }

    /**
     * Gets the "dir" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection.Enum getDir() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "dir" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection xgetDir() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Sets the "dir" attribute
     */
    @Override
    public void setDir(com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection.Enum dir) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setEnumValue(dir);
        }
    }

    /**
     * Sets (as xml) the "dir" attribute
     */
    @Override
    public void xsetDir(com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection dir) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(dir);
        }
    }
}

/*
 * XML Type:  CT_Scene3D
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTScene3D
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Scene3D(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTScene3DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTScene3D {
    private static final long serialVersionUID = 1L;

    public CTScene3DImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "camera"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "lightRig"),
    };


    /**
     * Gets the "camera" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTCamera getCamera() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTCamera target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTCamera)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "camera" element
     */
    @Override
    public void setCamera(com.microsoft.schemas.office.word.x2010.wordml.CTCamera camera) {
        generatedSetterHelperImpl(camera, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "camera" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTCamera addNewCamera() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTCamera target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTCamera)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "lightRig" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTLightRig getLightRig() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTLightRig target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTLightRig)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "lightRig" element
     */
    @Override
    public void setLightRig(com.microsoft.schemas.office.word.x2010.wordml.CTLightRig lightRig) {
        generatedSetterHelperImpl(lightRig, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "lightRig" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTLightRig addNewLightRig() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTLightRig target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTLightRig)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: entityPicker
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.EntityPickerDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one entityPicker(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public class EntityPickerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.EntityPickerDocument {
    private static final long serialVersionUID = 1L;

    public EntityPickerDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "entityPicker"),
    };


    /**
     * Gets the "entityPicker" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getEntityPicker() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "entityPicker" element
     */
    @Override
    public void setEntityPicker(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty entityPicker) {
        generatedSetterHelperImpl(entityPicker, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "entityPicker" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewEntityPicker() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

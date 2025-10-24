/*
 * An XML document type.
 * Localname: checkbox
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CheckboxDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one checkbox(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public class CheckboxDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CheckboxDocument {
    private static final long serialVersionUID = 1L;

    public CheckboxDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "checkbox"),
    };


    /**
     * Gets the "checkbox" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox getCheckbox() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "checkbox" element
     */
    @Override
    public void setCheckbox(com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox checkbox) {
        generatedSetterHelperImpl(checkbox, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "checkbox" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox addNewCheckbox() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTSdtCheckbox)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

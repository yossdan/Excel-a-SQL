/*
 * An XML document type.
 * Localname: discardImageEditingData
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.DiscardImageEditingDataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one discardImageEditingData(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public class DiscardImageEditingDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.DiscardImageEditingDataDocument {
    private static final long serialVersionUID = 1L;

    public DiscardImageEditingDataDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "discardImageEditingData"),
    };


    /**
     * Gets the "discardImageEditingData" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTOnOff getDiscardImageEditingData() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTOnOff target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTOnOff)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "discardImageEditingData" element
     */
    @Override
    public void setDiscardImageEditingData(com.microsoft.schemas.office.word.x2010.wordml.CTOnOff discardImageEditingData) {
        generatedSetterHelperImpl(discardImageEditingData, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "discardImageEditingData" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTOnOff addNewDiscardImageEditingData() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTOnOff target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTOnOff)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

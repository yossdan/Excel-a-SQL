/*
 * An XML document type.
 * Localname: conflictMode
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.ConflictModeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one conflictMode(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public class ConflictModeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.ConflictModeDocument {
    private static final long serialVersionUID = 1L;

    public ConflictModeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "conflictMode"),
    };


    /**
     * Gets the "conflictMode" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTOnOff getConflictMode() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTOnOff target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTOnOff)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "conflictMode" element
     */
    @Override
    public void setConflictMode(com.microsoft.schemas.office.word.x2010.wordml.CTOnOff conflictMode) {
        generatedSetterHelperImpl(conflictMode, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "conflictMode" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTOnOff addNewConflictMode() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTOnOff target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTOnOff)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

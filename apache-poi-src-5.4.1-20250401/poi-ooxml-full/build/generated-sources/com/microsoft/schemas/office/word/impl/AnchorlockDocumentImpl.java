/*
 * An XML document type.
 * Localname: anchorlock
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.AnchorlockDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one anchorlock(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public class AnchorlockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.AnchorlockDocument {
    private static final long serialVersionUID = 1L;

    public AnchorlockDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:word", "anchorlock"),
    };


    /**
     * Gets the "anchorlock" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTAnchorLock getAnchorlock() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTAnchorLock target = null;
            target = (com.microsoft.schemas.office.word.CTAnchorLock)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "anchorlock" element
     */
    @Override
    public void setAnchorlock(com.microsoft.schemas.office.word.CTAnchorLock anchorlock) {
        generatedSetterHelperImpl(anchorlock, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "anchorlock" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTAnchorLock addNewAnchorlock() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTAnchorLock target = null;
            target = (com.microsoft.schemas.office.word.CTAnchorLock)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

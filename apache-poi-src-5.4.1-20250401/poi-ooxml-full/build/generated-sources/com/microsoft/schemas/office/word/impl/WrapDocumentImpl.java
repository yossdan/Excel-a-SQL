/*
 * An XML document type.
 * Localname: wrap
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.WrapDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one wrap(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public class WrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.WrapDocument {
    private static final long serialVersionUID = 1L;

    public WrapDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:word", "wrap"),
    };


    /**
     * Gets the "wrap" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTWrap getWrap() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTWrap target = null;
            target = (com.microsoft.schemas.office.word.CTWrap)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "wrap" element
     */
    @Override
    public void setWrap(com.microsoft.schemas.office.word.CTWrap wrap) {
        generatedSetterHelperImpl(wrap, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "wrap" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTWrap addNewWrap() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTWrap target = null;
            target = (com.microsoft.schemas.office.word.CTWrap)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

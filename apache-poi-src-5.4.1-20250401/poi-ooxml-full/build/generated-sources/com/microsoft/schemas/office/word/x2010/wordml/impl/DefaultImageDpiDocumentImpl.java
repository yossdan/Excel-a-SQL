/*
 * An XML document type.
 * Localname: defaultImageDpi
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.DefaultImageDpiDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one defaultImageDpi(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public class DefaultImageDpiDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.DefaultImageDpiDocument {
    private static final long serialVersionUID = 1L;

    public DefaultImageDpiDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "defaultImageDpi"),
    };


    /**
     * Gets the "defaultImageDpi" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTDefaultImageDpi getDefaultImageDpi() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTDefaultImageDpi target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTDefaultImageDpi)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "defaultImageDpi" element
     */
    @Override
    public void setDefaultImageDpi(com.microsoft.schemas.office.word.x2010.wordml.CTDefaultImageDpi defaultImageDpi) {
        generatedSetterHelperImpl(defaultImageDpi, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "defaultImageDpi" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTDefaultImageDpi addNewDefaultImageDpi() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTDefaultImageDpi target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTDefaultImageDpi)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

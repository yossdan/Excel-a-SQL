/*
 * An XML document type.
 * Localname: bordertop
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.BordertopDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one bordertop(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public class BordertopDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.BordertopDocument {
    private static final long serialVersionUID = 1L;

    public BordertopDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:word", "bordertop"),
    };


    /**
     * Gets the "bordertop" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder getBordertop() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "bordertop" element
     */
    @Override
    public void setBordertop(com.microsoft.schemas.office.word.CTBorder bordertop) {
        generatedSetterHelperImpl(bordertop, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "bordertop" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder addNewBordertop() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

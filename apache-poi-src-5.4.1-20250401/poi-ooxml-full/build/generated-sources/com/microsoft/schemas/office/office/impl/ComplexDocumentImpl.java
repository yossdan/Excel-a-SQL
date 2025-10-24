/*
 * An XML document type.
 * Localname: complex
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ComplexDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one complex(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class ComplexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.ComplexDocument {
    private static final long serialVersionUID = 1L;

    public ComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "complex"),
    };


    /**
     * Gets the "complex" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTComplex getComplex() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTComplex target = null;
            target = (com.microsoft.schemas.office.office.CTComplex)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "complex" element
     */
    @Override
    public void setComplex(com.microsoft.schemas.office.office.CTComplex complex) {
        generatedSetterHelperImpl(complex, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "complex" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTComplex addNewComplex() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTComplex target = null;
            target = (com.microsoft.schemas.office.office.CTComplex)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

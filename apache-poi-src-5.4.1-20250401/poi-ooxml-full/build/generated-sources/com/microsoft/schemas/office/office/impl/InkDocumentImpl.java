/*
 * An XML document type.
 * Localname: ink
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.InkDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ink(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class InkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.InkDocument {
    private static final long serialVersionUID = 1L;

    public InkDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "ink"),
    };


    /**
     * Gets the "ink" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTInk getInk() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTInk target = null;
            target = (com.microsoft.schemas.office.office.CTInk)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ink" element
     */
    @Override
    public void setInk(com.microsoft.schemas.office.office.CTInk ink) {
        generatedSetterHelperImpl(ink, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ink" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTInk addNewInk() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTInk target = null;
            target = (com.microsoft.schemas.office.office.CTInk)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

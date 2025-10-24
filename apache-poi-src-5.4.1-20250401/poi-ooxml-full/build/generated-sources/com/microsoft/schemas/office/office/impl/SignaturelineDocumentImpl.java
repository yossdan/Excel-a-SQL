/*
 * An XML document type.
 * Localname: signatureline
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.SignaturelineDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one signatureline(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class SignaturelineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.SignaturelineDocument {
    private static final long serialVersionUID = 1L;

    public SignaturelineDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "signatureline"),
    };


    /**
     * Gets the "signatureline" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTSignatureLine getSignatureline() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTSignatureLine target = null;
            target = (com.microsoft.schemas.office.office.CTSignatureLine)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "signatureline" element
     */
    @Override
    public void setSignatureline(com.microsoft.schemas.office.office.CTSignatureLine signatureline) {
        generatedSetterHelperImpl(signatureline, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "signatureline" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTSignatureLine addNewSignatureline() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTSignatureLine target = null;
            target = (com.microsoft.schemas.office.office.CTSignatureLine)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

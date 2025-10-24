/*
 * An XML document type.
 * Localname: SignatureInfoV2
 * Namespace: http://schemas.microsoft.com/office/2006/digsig
 * Java type: com.microsoft.schemas.office.x2006.digsig.SignatureInfoV2Document
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.digsig.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SignatureInfoV2(@http://schemas.microsoft.com/office/2006/digsig) element.
 *
 * This is a complex type.
 */
public class SignatureInfoV2DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.x2006.digsig.SignatureInfoV2Document {
    private static final long serialVersionUID = 1L;

    public SignatureInfoV2DocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureInfoV2"),
    };


    /**
     * Gets the "SignatureInfoV2" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2 getSignatureInfoV2() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2 target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SignatureInfoV2" element
     */
    @Override
    public void setSignatureInfoV2(com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2 signatureInfoV2) {
        generatedSetterHelperImpl(signatureInfoV2, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SignatureInfoV2" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2 addNewSignatureInfoV2() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2 target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV2)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: callout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CalloutDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one callout(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class CalloutDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.CalloutDocument {
    private static final long serialVersionUID = 1L;

    public CalloutDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "callout"),
    };


    /**
     * Gets the "callout" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTCallout getCallout() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTCallout target = null;
            target = (com.microsoft.schemas.office.office.CTCallout)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "callout" element
     */
    @Override
    public void setCallout(com.microsoft.schemas.office.office.CTCallout callout) {
        generatedSetterHelperImpl(callout, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "callout" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTCallout addNewCallout() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTCallout target = null;
            target = (com.microsoft.schemas.office.office.CTCallout)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

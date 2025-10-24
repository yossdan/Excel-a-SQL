/*
 * An XML document type.
 * Localname: iscomment
 * Namespace: urn:schemas-microsoft-com:office:powerpoint
 * Java type: com.microsoft.schemas.office.powerpoint.IscommentDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.powerpoint.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one iscomment(@urn:schemas-microsoft-com:office:powerpoint) element.
 *
 * This is a complex type.
 */
public class IscommentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.powerpoint.IscommentDocument {
    private static final long serialVersionUID = 1L;

    public IscommentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:powerpoint", "iscomment"),
    };


    /**
     * Gets the "iscomment" element
     */
    @Override
    public com.microsoft.schemas.office.powerpoint.CTEmpty getIscomment() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.powerpoint.CTEmpty target = null;
            target = (com.microsoft.schemas.office.powerpoint.CTEmpty)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "iscomment" element
     */
    @Override
    public void setIscomment(com.microsoft.schemas.office.powerpoint.CTEmpty iscomment) {
        generatedSetterHelperImpl(iscomment, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "iscomment" element
     */
    @Override
    public com.microsoft.schemas.office.powerpoint.CTEmpty addNewIscomment() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.powerpoint.CTEmpty target = null;
            target = (com.microsoft.schemas.office.powerpoint.CTEmpty)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

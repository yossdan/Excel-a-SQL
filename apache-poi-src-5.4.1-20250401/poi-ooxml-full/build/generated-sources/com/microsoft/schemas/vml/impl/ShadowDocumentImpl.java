/*
 * An XML document type.
 * Localname: shadow
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.ShadowDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one shadow(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class ShadowDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.ShadowDocument {
    private static final long serialVersionUID = 1L;

    public ShadowDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "shadow"),
    };


    /**
     * Gets the "shadow" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShadow getShadow() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShadow target = null;
            target = (com.microsoft.schemas.vml.CTShadow)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "shadow" element
     */
    @Override
    public void setShadow(com.microsoft.schemas.vml.CTShadow shadow) {
        generatedSetterHelperImpl(shadow, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "shadow" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShadow addNewShadow() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShadow target = null;
            target = (com.microsoft.schemas.vml.CTShadow)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

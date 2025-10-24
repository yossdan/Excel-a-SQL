/*
 * An XML document type.
 * Localname: arc
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.ArcDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one arc(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class ArcDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.ArcDocument {
    private static final long serialVersionUID = 1L;

    public ArcDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "arc"),
    };


    /**
     * Gets the "arc" element
     */
    @Override
    public com.microsoft.schemas.vml.CTArc getArc() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTArc target = null;
            target = (com.microsoft.schemas.vml.CTArc)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "arc" element
     */
    @Override
    public void setArc(com.microsoft.schemas.vml.CTArc arc) {
        generatedSetterHelperImpl(arc, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "arc" element
     */
    @Override
    public com.microsoft.schemas.vml.CTArc addNewArc() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTArc target = null;
            target = (com.microsoft.schemas.vml.CTArc)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

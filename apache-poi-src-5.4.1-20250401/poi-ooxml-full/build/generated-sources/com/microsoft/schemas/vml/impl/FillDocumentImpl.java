/*
 * An XML document type.
 * Localname: fill
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.FillDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one fill(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class FillDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.FillDocument {
    private static final long serialVersionUID = 1L;

    public FillDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "fill"),
    };


    /**
     * Gets the "fill" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFill getFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFill target = null;
            target = (com.microsoft.schemas.vml.CTFill)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "fill" element
     */
    @Override
    public void setFill(com.microsoft.schemas.vml.CTFill fill) {
        generatedSetterHelperImpl(fill, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "fill" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFill addNewFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFill target = null;
            target = (com.microsoft.schemas.vml.CTFill)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

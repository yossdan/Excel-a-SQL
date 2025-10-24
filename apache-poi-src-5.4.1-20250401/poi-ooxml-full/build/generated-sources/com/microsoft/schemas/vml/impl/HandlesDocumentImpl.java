/*
 * An XML document type.
 * Localname: handles
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.HandlesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one handles(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class HandlesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.HandlesDocument {
    private static final long serialVersionUID = 1L;

    public HandlesDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "handles"),
    };


    /**
     * Gets the "handles" element
     */
    @Override
    public com.microsoft.schemas.vml.CTHandles getHandles() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTHandles target = null;
            target = (com.microsoft.schemas.vml.CTHandles)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "handles" element
     */
    @Override
    public void setHandles(com.microsoft.schemas.vml.CTHandles handles) {
        generatedSetterHelperImpl(handles, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "handles" element
     */
    @Override
    public com.microsoft.schemas.vml.CTHandles addNewHandles() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTHandles target = null;
            target = (com.microsoft.schemas.vml.CTHandles)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

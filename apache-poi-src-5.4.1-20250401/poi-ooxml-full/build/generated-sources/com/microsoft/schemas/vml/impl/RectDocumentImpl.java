/*
 * An XML document type.
 * Localname: rect
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.RectDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one rect(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class RectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.RectDocument {
    private static final long serialVersionUID = 1L;

    public RectDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "rect"),
    };


    /**
     * Gets the "rect" element
     */
    @Override
    public com.microsoft.schemas.vml.CTRect getRect() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTRect target = null;
            target = (com.microsoft.schemas.vml.CTRect)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "rect" element
     */
    @Override
    public void setRect(com.microsoft.schemas.vml.CTRect rect) {
        generatedSetterHelperImpl(rect, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "rect" element
     */
    @Override
    public com.microsoft.schemas.vml.CTRect addNewRect() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTRect target = null;
            target = (com.microsoft.schemas.vml.CTRect)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

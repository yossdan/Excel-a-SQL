/*
 * An XML document type.
 * Localname: stroke
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.StrokeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one stroke(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class StrokeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.StrokeDocument {
    private static final long serialVersionUID = 1L;

    public StrokeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "stroke"),
    };


    /**
     * Gets the "stroke" element
     */
    @Override
    public com.microsoft.schemas.vml.CTStroke getStroke() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTStroke target = null;
            target = (com.microsoft.schemas.vml.CTStroke)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "stroke" element
     */
    @Override
    public void setStroke(com.microsoft.schemas.vml.CTStroke stroke) {
        generatedSetterHelperImpl(stroke, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "stroke" element
     */
    @Override
    public com.microsoft.schemas.vml.CTStroke addNewStroke() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTStroke target = null;
            target = (com.microsoft.schemas.vml.CTStroke)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

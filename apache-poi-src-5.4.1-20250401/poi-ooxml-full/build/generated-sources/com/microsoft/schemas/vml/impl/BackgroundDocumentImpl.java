/*
 * An XML document type.
 * Localname: background
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.BackgroundDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one background(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class BackgroundDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.BackgroundDocument {
    private static final long serialVersionUID = 1L;

    public BackgroundDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "background"),
    };


    /**
     * Gets the "background" element
     */
    @Override
    public com.microsoft.schemas.vml.CTBackground getBackground() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTBackground target = null;
            target = (com.microsoft.schemas.vml.CTBackground)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "background" element
     */
    @Override
    public void setBackground(com.microsoft.schemas.vml.CTBackground background) {
        generatedSetterHelperImpl(background, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "background" element
     */
    @Override
    public com.microsoft.schemas.vml.CTBackground addNewBackground() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTBackground target = null;
            target = (com.microsoft.schemas.vml.CTBackground)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

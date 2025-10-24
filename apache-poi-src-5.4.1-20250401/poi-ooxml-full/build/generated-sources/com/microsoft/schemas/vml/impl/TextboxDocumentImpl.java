/*
 * An XML document type.
 * Localname: textbox
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.TextboxDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one textbox(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class TextboxDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.TextboxDocument {
    private static final long serialVersionUID = 1L;

    public TextboxDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "textbox"),
    };


    /**
     * Gets the "textbox" element
     */
    @Override
    public com.microsoft.schemas.vml.CTTextbox getTextbox() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTTextbox target = null;
            target = (com.microsoft.schemas.vml.CTTextbox)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "textbox" element
     */
    @Override
    public void setTextbox(com.microsoft.schemas.vml.CTTextbox textbox) {
        generatedSetterHelperImpl(textbox, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "textbox" element
     */
    @Override
    public com.microsoft.schemas.vml.CTTextbox addNewTextbox() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTTextbox target = null;
            target = (com.microsoft.schemas.vml.CTTextbox)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

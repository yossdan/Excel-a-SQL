/*
 * An XML document type.
 * Localname: textpath
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.TextpathDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one textpath(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class TextpathDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.TextpathDocument {
    private static final long serialVersionUID = 1L;

    public TextpathDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "textpath"),
    };


    /**
     * Gets the "textpath" element
     */
    @Override
    public com.microsoft.schemas.vml.CTTextPath getTextpath() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTTextPath target = null;
            target = (com.microsoft.schemas.vml.CTTextPath)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "textpath" element
     */
    @Override
    public void setTextpath(com.microsoft.schemas.vml.CTTextPath textpath) {
        generatedSetterHelperImpl(textpath, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "textpath" element
     */
    @Override
    public com.microsoft.schemas.vml.CTTextPath addNewTextpath() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTTextPath target = null;
            target = (com.microsoft.schemas.vml.CTTextPath)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

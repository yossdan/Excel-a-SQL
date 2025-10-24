/*
 * An XML document type.
 * Localname: clippath
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ClippathDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one clippath(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class ClippathDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.ClippathDocument {
    private static final long serialVersionUID = 1L;

    public ClippathDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "clippath"),
    };


    /**
     * Gets the "clippath" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTClipPath getClippath() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTClipPath target = null;
            target = (com.microsoft.schemas.office.office.CTClipPath)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "clippath" element
     */
    @Override
    public void setClippath(com.microsoft.schemas.office.office.CTClipPath clippath) {
        generatedSetterHelperImpl(clippath, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "clippath" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTClipPath addNewClippath() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTClipPath target = null;
            target = (com.microsoft.schemas.office.office.CTClipPath)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

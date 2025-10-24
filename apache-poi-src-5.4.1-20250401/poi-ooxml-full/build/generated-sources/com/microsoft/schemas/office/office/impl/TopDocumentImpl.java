/*
 * An XML document type.
 * Localname: top
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.TopDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one top(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class TopDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.TopDocument {
    private static final long serialVersionUID = 1L;

    public TopDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "top"),
    };


    /**
     * Gets the "top" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTStrokeChild getTop() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTStrokeChild target = null;
            target = (com.microsoft.schemas.office.office.CTStrokeChild)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "top" element
     */
    @Override
    public void setTop(com.microsoft.schemas.office.office.CTStrokeChild top) {
        generatedSetterHelperImpl(top, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "top" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTStrokeChild addNewTop() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTStrokeChild target = null;
            target = (com.microsoft.schemas.office.office.CTStrokeChild)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

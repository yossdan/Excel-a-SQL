/*
 * An XML document type.
 * Localname: OLEObject
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.OLEObjectDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one OLEObject(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class OLEObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.OLEObjectDocument {
    private static final long serialVersionUID = 1L;

    public OLEObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "OLEObject"),
    };


    /**
     * Gets the "OLEObject" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTOLEObject getOLEObject() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTOLEObject target = null;
            target = (com.microsoft.schemas.office.office.CTOLEObject)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "OLEObject" element
     */
    @Override
    public void setOLEObject(com.microsoft.schemas.office.office.CTOLEObject oleObject) {
        generatedSetterHelperImpl(oleObject, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "OLEObject" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTOLEObject addNewOLEObject() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTOLEObject target = null;
            target = (com.microsoft.schemas.office.office.CTOLEObject)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

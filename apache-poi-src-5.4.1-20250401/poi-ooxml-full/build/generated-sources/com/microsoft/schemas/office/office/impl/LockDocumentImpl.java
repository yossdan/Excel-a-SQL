/*
 * An XML document type.
 * Localname: lock
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.LockDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one lock(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class LockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.LockDocument {
    private static final long serialVersionUID = 1L;

    public LockDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "lock"),
    };


    /**
     * Gets the "lock" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTLock getLock() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTLock target = null;
            target = (com.microsoft.schemas.office.office.CTLock)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "lock" element
     */
    @Override
    public void setLock(com.microsoft.schemas.office.office.CTLock lock) {
        generatedSetterHelperImpl(lock, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "lock" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTLock addNewLock() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTLock target = null;
            target = (com.microsoft.schemas.office.office.CTLock)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

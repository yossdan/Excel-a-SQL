/*
 * An XML document type.
 * Localname: extrusion
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ExtrusionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one extrusion(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class ExtrusionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.ExtrusionDocument {
    private static final long serialVersionUID = 1L;

    public ExtrusionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "extrusion"),
    };


    /**
     * Gets the "extrusion" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTExtrusion getExtrusion() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTExtrusion target = null;
            target = (com.microsoft.schemas.office.office.CTExtrusion)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "extrusion" element
     */
    @Override
    public void setExtrusion(com.microsoft.schemas.office.office.CTExtrusion extrusion) {
        generatedSetterHelperImpl(extrusion, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extrusion" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTExtrusion addNewExtrusion() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTExtrusion target = null;
            target = (com.microsoft.schemas.office.office.CTExtrusion)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

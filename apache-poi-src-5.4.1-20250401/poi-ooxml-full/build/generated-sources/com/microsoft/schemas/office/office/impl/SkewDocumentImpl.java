/*
 * An XML document type.
 * Localname: skew
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.SkewDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one skew(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class SkewDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.SkewDocument {
    private static final long serialVersionUID = 1L;

    public SkewDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "skew"),
    };


    /**
     * Gets the "skew" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTSkew getSkew() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTSkew target = null;
            target = (com.microsoft.schemas.office.office.CTSkew)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "skew" element
     */
    @Override
    public void setSkew(com.microsoft.schemas.office.office.CTSkew skew) {
        generatedSetterHelperImpl(skew, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "skew" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTSkew addNewSkew() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTSkew target = null;
            target = (com.microsoft.schemas.office.office.CTSkew)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

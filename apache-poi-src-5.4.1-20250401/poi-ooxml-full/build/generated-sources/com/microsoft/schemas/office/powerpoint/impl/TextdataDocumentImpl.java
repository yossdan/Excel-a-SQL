/*
 * An XML document type.
 * Localname: textdata
 * Namespace: urn:schemas-microsoft-com:office:powerpoint
 * Java type: com.microsoft.schemas.office.powerpoint.TextdataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.powerpoint.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one textdata(@urn:schemas-microsoft-com:office:powerpoint) element.
 *
 * This is a complex type.
 */
public class TextdataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.powerpoint.TextdataDocument {
    private static final long serialVersionUID = 1L;

    public TextdataDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:powerpoint", "textdata"),
    };


    /**
     * Gets the "textdata" element
     */
    @Override
    public com.microsoft.schemas.office.powerpoint.CTRel getTextdata() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.powerpoint.CTRel target = null;
            target = (com.microsoft.schemas.office.powerpoint.CTRel)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "textdata" element
     */
    @Override
    public void setTextdata(com.microsoft.schemas.office.powerpoint.CTRel textdata) {
        generatedSetterHelperImpl(textdata, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "textdata" element
     */
    @Override
    public com.microsoft.schemas.office.powerpoint.CTRel addNewTextdata() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.powerpoint.CTRel target = null;
            target = (com.microsoft.schemas.office.powerpoint.CTRel)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

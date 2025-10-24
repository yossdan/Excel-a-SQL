/*
 * An XML document type.
 * Localname: roundrect
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.RoundrectDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one roundrect(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class RoundrectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.RoundrectDocument {
    private static final long serialVersionUID = 1L;

    public RoundrectDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "roundrect"),
    };


    /**
     * Gets the "roundrect" element
     */
    @Override
    public com.microsoft.schemas.vml.CTRoundRect getRoundrect() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTRoundRect target = null;
            target = (com.microsoft.schemas.vml.CTRoundRect)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "roundrect" element
     */
    @Override
    public void setRoundrect(com.microsoft.schemas.vml.CTRoundRect roundrect) {
        generatedSetterHelperImpl(roundrect, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "roundrect" element
     */
    @Override
    public com.microsoft.schemas.vml.CTRoundRect addNewRoundrect() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTRoundRect target = null;
            target = (com.microsoft.schemas.vml.CTRoundRect)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

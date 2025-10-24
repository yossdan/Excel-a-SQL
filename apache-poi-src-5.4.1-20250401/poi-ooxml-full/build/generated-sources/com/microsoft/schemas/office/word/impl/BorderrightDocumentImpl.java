/*
 * An XML document type.
 * Localname: borderright
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.BorderrightDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one borderright(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public class BorderrightDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.BorderrightDocument {
    private static final long serialVersionUID = 1L;

    public BorderrightDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:word", "borderright"),
    };


    /**
     * Gets the "borderright" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder getBorderright() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "borderright" element
     */
    @Override
    public void setBorderright(com.microsoft.schemas.office.word.CTBorder borderright) {
        generatedSetterHelperImpl(borderright, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "borderright" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder addNewBorderright() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

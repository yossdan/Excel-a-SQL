/*
 * An XML document type.
 * Localname: borderbottom
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.BorderbottomDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one borderbottom(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public class BorderbottomDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.BorderbottomDocument {
    private static final long serialVersionUID = 1L;

    public BorderbottomDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:word", "borderbottom"),
    };


    /**
     * Gets the "borderbottom" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder getBorderbottom() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "borderbottom" element
     */
    @Override
    public void setBorderbottom(com.microsoft.schemas.office.word.CTBorder borderbottom) {
        generatedSetterHelperImpl(borderbottom, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "borderbottom" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder addNewBorderbottom() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: borderleft
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.BorderleftDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one borderleft(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public class BorderleftDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.BorderleftDocument {
    private static final long serialVersionUID = 1L;

    public BorderleftDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:word", "borderleft"),
    };


    /**
     * Gets the "borderleft" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder getBorderleft() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "borderleft" element
     */
    @Override
    public void setBorderleft(com.microsoft.schemas.office.word.CTBorder borderleft) {
        generatedSetterHelperImpl(borderleft, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "borderleft" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder addNewBorderleft() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

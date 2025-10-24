/*
 * An XML document type.
 * Localname: formulas
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.FormulasDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one formulas(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class FormulasDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.FormulasDocument {
    private static final long serialVersionUID = 1L;

    public FormulasDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "formulas"),
    };


    /**
     * Gets the "formulas" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFormulas getFormulas() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFormulas target = null;
            target = (com.microsoft.schemas.vml.CTFormulas)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "formulas" element
     */
    @Override
    public void setFormulas(com.microsoft.schemas.vml.CTFormulas formulas) {
        generatedSetterHelperImpl(formulas, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "formulas" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFormulas addNewFormulas() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFormulas target = null;
            target = (com.microsoft.schemas.vml.CTFormulas)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

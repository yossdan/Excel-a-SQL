/*
 * An XML document type.
 * Localname: Extensions
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ExtensionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Extensions(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public class ExtensionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.ExtensionsDocument {
    private static final long serialVersionUID = 1L;

    public ExtensionsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Extensions"),
    };


    /**
     * Gets the "Extensions" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ExtensionsType getExtensions() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ExtensionsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ExtensionsType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Extensions" element
     */
    @Override
    public void setExtensions(com.microsoft.schemas.office.visio.x2012.main.ExtensionsType extensions) {
        generatedSetterHelperImpl(extensions, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Extensions" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ExtensionsType addNewExtensions() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ExtensionsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ExtensionsType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

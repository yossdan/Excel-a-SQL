/*
 * An XML document type.
 * Localname: path
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.PathDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one path(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class PathDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.PathDocument {
    private static final long serialVersionUID = 1L;

    public PathDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "path"),
    };


    /**
     * Gets the "path" element
     */
    @Override
    public com.microsoft.schemas.vml.CTPath getPath() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTPath target = null;
            target = (com.microsoft.schemas.vml.CTPath)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "path" element
     */
    @Override
    public void setPath(com.microsoft.schemas.vml.CTPath path) {
        generatedSetterHelperImpl(path, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "path" element
     */
    @Override
    public com.microsoft.schemas.vml.CTPath addNewPath() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTPath target = null;
            target = (com.microsoft.schemas.vml.CTPath)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

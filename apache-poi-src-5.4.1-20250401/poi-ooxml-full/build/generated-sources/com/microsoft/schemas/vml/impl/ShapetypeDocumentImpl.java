/*
 * An XML document type.
 * Localname: shapetype
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.ShapetypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one shapetype(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class ShapetypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.ShapetypeDocument {
    private static final long serialVersionUID = 1L;

    public ShapetypeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "shapetype"),
    };


    /**
     * Gets the "shapetype" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShapetype getShapetype() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShapetype target = null;
            target = (com.microsoft.schemas.vml.CTShapetype)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "shapetype" element
     */
    @Override
    public void setShapetype(com.microsoft.schemas.vml.CTShapetype shapetype) {
        generatedSetterHelperImpl(shapetype, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "shapetype" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShapetype addNewShapetype() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShapetype target = null;
            target = (com.microsoft.schemas.vml.CTShapetype)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

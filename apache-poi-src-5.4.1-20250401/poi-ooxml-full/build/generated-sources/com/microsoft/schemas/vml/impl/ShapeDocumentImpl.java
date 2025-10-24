/*
 * An XML document type.
 * Localname: shape
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.ShapeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one shape(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class ShapeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.ShapeDocument {
    private static final long serialVersionUID = 1L;

    public ShapeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "shape"),
    };


    /**
     * Gets the "shape" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShape getShape() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShape target = null;
            target = (com.microsoft.schemas.vml.CTShape)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "shape" element
     */
    @Override
    public void setShape(com.microsoft.schemas.vml.CTShape shape) {
        generatedSetterHelperImpl(shape, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "shape" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShape addNewShape() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShape target = null;
            target = (com.microsoft.schemas.vml.CTShape)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

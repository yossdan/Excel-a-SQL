/*
 * An XML document type.
 * Localname: image
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.ImageDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one image(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class ImageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.ImageDocument {
    private static final long serialVersionUID = 1L;

    public ImageDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "image"),
    };


    /**
     * Gets the "image" element
     */
    @Override
    public com.microsoft.schemas.vml.CTImage getImage() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTImage target = null;
            target = (com.microsoft.schemas.vml.CTImage)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "image" element
     */
    @Override
    public void setImage(com.microsoft.schemas.vml.CTImage image) {
        generatedSetterHelperImpl(image, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "image" element
     */
    @Override
    public com.microsoft.schemas.vml.CTImage addNewImage() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTImage target = null;
            target = (com.microsoft.schemas.vml.CTImage)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

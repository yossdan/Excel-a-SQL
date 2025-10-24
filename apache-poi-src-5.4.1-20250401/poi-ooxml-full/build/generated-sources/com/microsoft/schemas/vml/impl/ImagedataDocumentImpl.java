/*
 * An XML document type.
 * Localname: imagedata
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.ImagedataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one imagedata(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class ImagedataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.ImagedataDocument {
    private static final long serialVersionUID = 1L;

    public ImagedataDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "imagedata"),
    };


    /**
     * Gets the "imagedata" element
     */
    @Override
    public com.microsoft.schemas.vml.CTImageData getImagedata() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTImageData target = null;
            target = (com.microsoft.schemas.vml.CTImageData)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "imagedata" element
     */
    @Override
    public void setImagedata(com.microsoft.schemas.vml.CTImageData imagedata) {
        generatedSetterHelperImpl(imagedata, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "imagedata" element
     */
    @Override
    public com.microsoft.schemas.vml.CTImageData addNewImagedata() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTImageData target = null;
            target = (com.microsoft.schemas.vml.CTImageData)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

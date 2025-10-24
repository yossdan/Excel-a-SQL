/*
 * An XML document type.
 * Localname: curve
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CurveDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one curve(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class CurveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.CurveDocument {
    private static final long serialVersionUID = 1L;

    public CurveDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "curve"),
    };


    /**
     * Gets the "curve" element
     */
    @Override
    public com.microsoft.schemas.vml.CTCurve getCurve() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTCurve target = null;
            target = (com.microsoft.schemas.vml.CTCurve)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "curve" element
     */
    @Override
    public void setCurve(com.microsoft.schemas.vml.CTCurve curve) {
        generatedSetterHelperImpl(curve, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "curve" element
     */
    @Override
    public com.microsoft.schemas.vml.CTCurve addNewCurve() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTCurve target = null;
            target = (com.microsoft.schemas.vml.CTCurve)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

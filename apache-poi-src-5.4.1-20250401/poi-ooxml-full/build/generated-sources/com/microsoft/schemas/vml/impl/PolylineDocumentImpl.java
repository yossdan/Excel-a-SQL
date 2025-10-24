/*
 * An XML document type.
 * Localname: polyline
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.PolylineDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one polyline(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class PolylineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.PolylineDocument {
    private static final long serialVersionUID = 1L;

    public PolylineDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "polyline"),
    };


    /**
     * Gets the "polyline" element
     */
    @Override
    public com.microsoft.schemas.vml.CTPolyLine getPolyline() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTPolyLine target = null;
            target = (com.microsoft.schemas.vml.CTPolyLine)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "polyline" element
     */
    @Override
    public void setPolyline(com.microsoft.schemas.vml.CTPolyLine polyline) {
        generatedSetterHelperImpl(polyline, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "polyline" element
     */
    @Override
    public com.microsoft.schemas.vml.CTPolyLine addNewPolyline() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTPolyLine target = null;
            target = (com.microsoft.schemas.vml.CTPolyLine)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

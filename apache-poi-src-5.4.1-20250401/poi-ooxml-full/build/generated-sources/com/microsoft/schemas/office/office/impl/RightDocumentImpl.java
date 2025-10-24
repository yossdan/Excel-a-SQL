/*
 * An XML document type.
 * Localname: right
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.RightDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one right(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class RightDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.RightDocument {
    private static final long serialVersionUID = 1L;

    public RightDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "right"),
    };


    /**
     * Gets the "right" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTStrokeChild getRight() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTStrokeChild target = null;
            target = (com.microsoft.schemas.office.office.CTStrokeChild)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "right" element
     */
    @Override
    public void setRight(com.microsoft.schemas.office.office.CTStrokeChild right) {
        generatedSetterHelperImpl(right, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "right" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTStrokeChild addNewRight() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTStrokeChild target = null;
            target = (com.microsoft.schemas.office.office.CTStrokeChild)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

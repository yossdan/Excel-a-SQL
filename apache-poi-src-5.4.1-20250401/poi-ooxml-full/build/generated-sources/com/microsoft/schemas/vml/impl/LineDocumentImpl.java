/*
 * An XML document type.
 * Localname: line
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.LineDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one line(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class LineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.LineDocument {
    private static final long serialVersionUID = 1L;

    public LineDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "line"),
    };


    /**
     * Gets the "line" element
     */
    @Override
    public com.microsoft.schemas.vml.CTLine getLine() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTLine target = null;
            target = (com.microsoft.schemas.vml.CTLine)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "line" element
     */
    @Override
    public void setLine(com.microsoft.schemas.vml.CTLine line) {
        generatedSetterHelperImpl(line, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "line" element
     */
    @Override
    public com.microsoft.schemas.vml.CTLine addNewLine() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTLine target = null;
            target = (com.microsoft.schemas.vml.CTLine)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

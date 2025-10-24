/*
 * An XML document type.
 * Localname: diagram
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.DiagramDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one diagram(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class DiagramDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.DiagramDocument {
    private static final long serialVersionUID = 1L;

    public DiagramDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "diagram"),
    };


    /**
     * Gets the "diagram" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTDiagram getDiagram() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTDiagram target = null;
            target = (com.microsoft.schemas.office.office.CTDiagram)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "diagram" element
     */
    @Override
    public void setDiagram(com.microsoft.schemas.office.office.CTDiagram diagram) {
        generatedSetterHelperImpl(diagram, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "diagram" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTDiagram addNewDiagram() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTDiagram target = null;
            target = (com.microsoft.schemas.office.office.CTDiagram)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

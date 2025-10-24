/*
 * An XML document type.
 * Localname: equationxml
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.EquationxmlDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one equationxml(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class EquationxmlDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.EquationxmlDocument {
    private static final long serialVersionUID = 1L;

    public EquationxmlDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "equationxml"),
    };


    /**
     * Gets the "equationxml" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTEquationXml getEquationxml() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTEquationXml target = null;
            target = (com.microsoft.schemas.office.office.CTEquationXml)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "equationxml" element
     */
    @Override
    public void setEquationxml(com.microsoft.schemas.office.office.CTEquationXml equationxml) {
        generatedSetterHelperImpl(equationxml, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "equationxml" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTEquationXml addNewEquationxml() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTEquationXml target = null;
            target = (com.microsoft.schemas.office.office.CTEquationXml)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

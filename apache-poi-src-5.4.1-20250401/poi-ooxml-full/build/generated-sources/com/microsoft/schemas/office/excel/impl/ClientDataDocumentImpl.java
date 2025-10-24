/*
 * An XML document type.
 * Localname: ClientData
 * Namespace: urn:schemas-microsoft-com:office:excel
 * Java type: com.microsoft.schemas.office.excel.ClientDataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.excel.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ClientData(@urn:schemas-microsoft-com:office:excel) element.
 *
 * This is a complex type.
 */
public class ClientDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.excel.ClientDataDocument {
    private static final long serialVersionUID = 1L;

    public ClientDataDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:excel", "ClientData"),
    };


    /**
     * Gets the "ClientData" element
     */
    @Override
    public com.microsoft.schemas.office.excel.CTClientData getClientData() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.excel.CTClientData target = null;
            target = (com.microsoft.schemas.office.excel.CTClientData)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ClientData" element
     */
    @Override
    public void setClientData(com.microsoft.schemas.office.excel.CTClientData clientData) {
        generatedSetterHelperImpl(clientData, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ClientData" element
     */
    @Override
    public com.microsoft.schemas.office.excel.CTClientData addNewClientData() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.excel.CTClientData target = null;
            target = (com.microsoft.schemas.office.excel.CTClientData)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

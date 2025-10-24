/*
 * An XML document type.
 * Localname: DataConnections
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataConnectionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DataConnections(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public class DataConnectionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.DataConnectionsDocument {
    private static final long serialVersionUID = 1L;

    public DataConnectionsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "DataConnections"),
    };


    /**
     * Gets the "DataConnections" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType getDataConnections() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DataConnections" element
     */
    @Override
    public void setDataConnections(com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType dataConnections) {
        generatedSetterHelperImpl(dataConnections, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataConnections" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType addNewDataConnections() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

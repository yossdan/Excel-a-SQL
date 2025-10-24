/*
 * An XML document type.
 * Localname: DataRecordSets
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DataRecordSets(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public class DataRecordSetsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsDocument {
    private static final long serialVersionUID = 1L;

    public DataRecordSetsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "DataRecordSets"),
    };


    /**
     * Gets the "DataRecordSets" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType getDataRecordSets() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DataRecordSets" element
     */
    @Override
    public void setDataRecordSets(com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType dataRecordSets) {
        generatedSetterHelperImpl(dataRecordSets, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataRecordSets" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType addNewDataRecordSets() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

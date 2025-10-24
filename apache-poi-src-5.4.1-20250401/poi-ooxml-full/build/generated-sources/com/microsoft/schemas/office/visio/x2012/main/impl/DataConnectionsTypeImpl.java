/*
 * XML Type:  DataConnections_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataConnections_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class DataConnectionsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.DataConnectionsType {
    private static final long serialVersionUID = 1L;

    public DataConnectionsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "DataConnection"),
        new QName("", "NextID"),
    };


    /**
     * Gets a List of "DataConnection" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.DataConnectionType> getDataConnectionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataConnectionArray,
                this::setDataConnectionArray,
                this::insertNewDataConnection,
                this::removeDataConnection,
                this::sizeOfDataConnectionArray
            );
        }
    }

    /**
     * Gets array of all "DataConnection" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataConnectionType[] getDataConnectionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.DataConnectionType[0]);
    }

    /**
     * Gets ith "DataConnection" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataConnectionType getDataConnectionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataConnectionType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataConnectionType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataConnection" element
     */
    @Override
    public int sizeOfDataConnectionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "DataConnection" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataConnectionArray(com.microsoft.schemas.office.visio.x2012.main.DataConnectionType[] dataConnectionArray) {
        check_orphaned();
        arraySetterHelper(dataConnectionArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "DataConnection" element
     */
    @Override
    public void setDataConnectionArray(int i, com.microsoft.schemas.office.visio.x2012.main.DataConnectionType dataConnection) {
        generatedSetterHelperImpl(dataConnection, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConnection" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataConnectionType insertNewDataConnection(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataConnectionType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataConnectionType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataConnection" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataConnectionType addNewDataConnection() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataConnectionType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataConnectionType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "DataConnection" element
     */
    @Override
    public void removeDataConnection(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "NextID" attribute
     */
    @Override
    public long getNextID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "NextID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetNextID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "NextID" attribute
     */
    @Override
    public void setNextID(long nextID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setLongValue(nextID);
        }
    }

    /**
     * Sets (as xml) the "NextID" attribute
     */
    @Override
    public void xsetNextID(org.apache.xmlbeans.XmlUnsignedInt nextID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(nextID);
        }
    }
}

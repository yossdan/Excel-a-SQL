/*
 * XML Type:  DataRecordSets_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataRecordSets_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface DataRecordSetsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "datarecordsetstype9cadtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "DataRecordSet" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType> getDataRecordSetList();

    /**
     * Gets array of all "DataRecordSet" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType[] getDataRecordSetArray();

    /**
     * Gets ith "DataRecordSet" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType getDataRecordSetArray(int i);

    /**
     * Returns number of "DataRecordSet" element
     */
    int sizeOfDataRecordSetArray();

    /**
     * Sets array of all "DataRecordSet" element
     */
    void setDataRecordSetArray(com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType[] dataRecordSetArray);

    /**
     * Sets ith "DataRecordSet" element
     */
    void setDataRecordSetArray(int i, com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType dataRecordSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataRecordSet" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType insertNewDataRecordSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataRecordSet" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType addNewDataRecordSet();

    /**
     * Removes the ith "DataRecordSet" element
     */
    void removeDataRecordSet(int i);

    /**
     * Gets the "NextID" attribute
     */
    long getNextID();

    /**
     * Gets (as xml) the "NextID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetNextID();

    /**
     * Sets the "NextID" attribute
     */
    void setNextID(long nextID);

    /**
     * Sets (as xml) the "NextID" attribute
     */
    void xsetNextID(org.apache.xmlbeans.XmlUnsignedInt nextID);

    /**
     * Gets the "ActiveRecordsetID" attribute
     */
    long getActiveRecordsetID();

    /**
     * Gets (as xml) the "ActiveRecordsetID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetActiveRecordsetID();

    /**
     * True if has "ActiveRecordsetID" attribute
     */
    boolean isSetActiveRecordsetID();

    /**
     * Sets the "ActiveRecordsetID" attribute
     */
    void setActiveRecordsetID(long activeRecordsetID);

    /**
     * Sets (as xml) the "ActiveRecordsetID" attribute
     */
    void xsetActiveRecordsetID(org.apache.xmlbeans.XmlUnsignedInt activeRecordsetID);

    /**
     * Unsets the "ActiveRecordsetID" attribute
     */
    void unsetActiveRecordsetID();

    /**
     * Gets the "DataWindowOrder" attribute
     */
    java.lang.String getDataWindowOrder();

    /**
     * Gets (as xml) the "DataWindowOrder" attribute
     */
    org.apache.xmlbeans.XmlString xgetDataWindowOrder();

    /**
     * True if has "DataWindowOrder" attribute
     */
    boolean isSetDataWindowOrder();

    /**
     * Sets the "DataWindowOrder" attribute
     */
    void setDataWindowOrder(java.lang.String dataWindowOrder);

    /**
     * Sets (as xml) the "DataWindowOrder" attribute
     */
    void xsetDataWindowOrder(org.apache.xmlbeans.XmlString dataWindowOrder);

    /**
     * Unsets the "DataWindowOrder" attribute
     */
    void unsetDataWindowOrder();
}

/*
 * XML Type:  EventList_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.EventListType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML EventList_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface EventListType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.EventListType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "eventlisttype3a53type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "EventItem" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.EventItemType> getEventItemList();

    /**
     * Gets array of all "EventItem" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.EventItemType[] getEventItemArray();

    /**
     * Gets ith "EventItem" element
     */
    com.microsoft.schemas.office.visio.x2012.main.EventItemType getEventItemArray(int i);

    /**
     * Returns number of "EventItem" element
     */
    int sizeOfEventItemArray();

    /**
     * Sets array of all "EventItem" element
     */
    void setEventItemArray(com.microsoft.schemas.office.visio.x2012.main.EventItemType[] eventItemArray);

    /**
     * Sets ith "EventItem" element
     */
    void setEventItemArray(int i, com.microsoft.schemas.office.visio.x2012.main.EventItemType eventItem);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "EventItem" element
     */
    com.microsoft.schemas.office.visio.x2012.main.EventItemType insertNewEventItem(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "EventItem" element
     */
    com.microsoft.schemas.office.visio.x2012.main.EventItemType addNewEventItem();

    /**
     * Removes the ith "EventItem" element
     */
    void removeEventItem(int i);
}

/*
 * XML Type:  EventList_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.EventListType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML EventList_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class EventListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.EventListType {
    private static final long serialVersionUID = 1L;

    public EventListTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "EventItem"),
    };


    /**
     * Gets a List of "EventItem" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.EventItemType> getEventItemList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getEventItemArray,
                this::setEventItemArray,
                this::insertNewEventItem,
                this::removeEventItem,
                this::sizeOfEventItemArray
            );
        }
    }

    /**
     * Gets array of all "EventItem" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.EventItemType[] getEventItemArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.EventItemType[0]);
    }

    /**
     * Gets ith "EventItem" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.EventItemType getEventItemArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.EventItemType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.EventItemType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "EventItem" element
     */
    @Override
    public int sizeOfEventItemArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "EventItem" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setEventItemArray(com.microsoft.schemas.office.visio.x2012.main.EventItemType[] eventItemArray) {
        check_orphaned();
        arraySetterHelper(eventItemArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "EventItem" element
     */
    @Override
    public void setEventItemArray(int i, com.microsoft.schemas.office.visio.x2012.main.EventItemType eventItem) {
        generatedSetterHelperImpl(eventItem, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "EventItem" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.EventItemType insertNewEventItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.EventItemType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.EventItemType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "EventItem" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.EventItemType addNewEventItem() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.EventItemType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.EventItemType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "EventItem" element
     */
    @Override
    public void removeEventItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

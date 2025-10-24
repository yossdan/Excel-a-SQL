/*
 * XML Type:  PublishSettings_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML PublishSettings_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class PublishSettingsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType {
    private static final long serialVersionUID = 1L;

    public PublishSettingsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "PublishedPage"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "RefreshableData"),
    };


    /**
     * Gets a List of "PublishedPage" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.PublishedPageType> getPublishedPageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPublishedPageArray,
                this::setPublishedPageArray,
                this::insertNewPublishedPage,
                this::removePublishedPage,
                this::sizeOfPublishedPageArray
            );
        }
    }

    /**
     * Gets array of all "PublishedPage" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PublishedPageType[] getPublishedPageArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.PublishedPageType[0]);
    }

    /**
     * Gets ith "PublishedPage" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PublishedPageType getPublishedPageArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PublishedPageType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PublishedPageType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PublishedPage" element
     */
    @Override
    public int sizeOfPublishedPageArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "PublishedPage" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPublishedPageArray(com.microsoft.schemas.office.visio.x2012.main.PublishedPageType[] publishedPageArray) {
        check_orphaned();
        arraySetterHelper(publishedPageArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "PublishedPage" element
     */
    @Override
    public void setPublishedPageArray(int i, com.microsoft.schemas.office.visio.x2012.main.PublishedPageType publishedPage) {
        generatedSetterHelperImpl(publishedPage, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PublishedPage" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PublishedPageType insertNewPublishedPage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PublishedPageType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PublishedPageType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PublishedPage" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PublishedPageType addNewPublishedPage() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PublishedPageType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PublishedPageType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "PublishedPage" element
     */
    @Override
    public void removePublishedPage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "RefreshableData" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType> getRefreshableDataList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRefreshableDataArray,
                this::setRefreshableDataArray,
                this::insertNewRefreshableData,
                this::removeRefreshableData,
                this::sizeOfRefreshableDataArray
            );
        }
    }

    /**
     * Gets array of all "RefreshableData" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType[] getRefreshableDataArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType[0]);
    }

    /**
     * Gets ith "RefreshableData" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType getRefreshableDataArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RefreshableData" element
     */
    @Override
    public int sizeOfRefreshableDataArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "RefreshableData" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRefreshableDataArray(com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType[] refreshableDataArray) {
        check_orphaned();
        arraySetterHelper(refreshableDataArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "RefreshableData" element
     */
    @Override
    public void setRefreshableDataArray(int i, com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType refreshableData) {
        generatedSetterHelperImpl(refreshableData, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RefreshableData" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType insertNewRefreshableData(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RefreshableData" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType addNewRefreshableData() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "RefreshableData" element
     */
    @Override
    public void removeRefreshableData(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}

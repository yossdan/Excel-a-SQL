/*
 * XML Type:  PublishSettings_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PublishSettings_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface PublishSettingsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "publishsettingstype90d9type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "PublishedPage" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.PublishedPageType> getPublishedPageList();

    /**
     * Gets array of all "PublishedPage" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.PublishedPageType[] getPublishedPageArray();

    /**
     * Gets ith "PublishedPage" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PublishedPageType getPublishedPageArray(int i);

    /**
     * Returns number of "PublishedPage" element
     */
    int sizeOfPublishedPageArray();

    /**
     * Sets array of all "PublishedPage" element
     */
    void setPublishedPageArray(com.microsoft.schemas.office.visio.x2012.main.PublishedPageType[] publishedPageArray);

    /**
     * Sets ith "PublishedPage" element
     */
    void setPublishedPageArray(int i, com.microsoft.schemas.office.visio.x2012.main.PublishedPageType publishedPage);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PublishedPage" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PublishedPageType insertNewPublishedPage(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PublishedPage" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PublishedPageType addNewPublishedPage();

    /**
     * Removes the ith "PublishedPage" element
     */
    void removePublishedPage(int i);

    /**
     * Gets a List of "RefreshableData" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType> getRefreshableDataList();

    /**
     * Gets array of all "RefreshableData" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType[] getRefreshableDataArray();

    /**
     * Gets ith "RefreshableData" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType getRefreshableDataArray(int i);

    /**
     * Returns number of "RefreshableData" element
     */
    int sizeOfRefreshableDataArray();

    /**
     * Sets array of all "RefreshableData" element
     */
    void setRefreshableDataArray(com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType[] refreshableDataArray);

    /**
     * Sets ith "RefreshableData" element
     */
    void setRefreshableDataArray(int i, com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType refreshableData);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RefreshableData" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType insertNewRefreshableData(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RefreshableData" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RefreshableDataType addNewRefreshableData();

    /**
     * Removes the ith "RefreshableData" element
     */
    void removeRefreshableData(int i);
}

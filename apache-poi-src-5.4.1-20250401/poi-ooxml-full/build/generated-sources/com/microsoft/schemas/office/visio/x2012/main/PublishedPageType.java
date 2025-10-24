/*
 * XML Type:  PublishedPage_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PublishedPageType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PublishedPage_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface PublishedPageType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.PublishedPageType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "publishedpagetypef22etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ID" attribute
     */
    long getID();

    /**
     * Gets (as xml) the "ID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetID();

    /**
     * Sets the "ID" attribute
     */
    void setID(long id);

    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.apache.xmlbeans.XmlUnsignedInt id);
}

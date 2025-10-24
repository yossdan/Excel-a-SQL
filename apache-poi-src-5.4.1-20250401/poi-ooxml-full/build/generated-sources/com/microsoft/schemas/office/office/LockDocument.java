/*
 * An XML document type.
 * Localname: lock
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.LockDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one lock(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface LockDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.LockDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "lockcae2doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "lock" element
     */
    com.microsoft.schemas.office.office.CTLock getLock();

    /**
     * Sets the "lock" element
     */
    void setLock(com.microsoft.schemas.office.office.CTLock lock);

    /**
     * Appends and returns a new empty "lock" element
     */
    com.microsoft.schemas.office.office.CTLock addNewLock();
}

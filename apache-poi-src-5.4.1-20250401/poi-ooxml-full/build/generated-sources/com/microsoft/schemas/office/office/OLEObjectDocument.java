/*
 * An XML document type.
 * Localname: OLEObject
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.OLEObjectDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one OLEObject(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface OLEObjectDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.OLEObjectDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "oleobjectbaccdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "OLEObject" element
     */
    com.microsoft.schemas.office.office.CTOLEObject getOLEObject();

    /**
     * Sets the "OLEObject" element
     */
    void setOLEObject(com.microsoft.schemas.office.office.CTOLEObject oleObject);

    /**
     * Appends and returns a new empty "OLEObject" element
     */
    com.microsoft.schemas.office.office.CTOLEObject addNewOLEObject();
}

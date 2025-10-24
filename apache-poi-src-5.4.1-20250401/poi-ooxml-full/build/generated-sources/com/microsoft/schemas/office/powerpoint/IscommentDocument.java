/*
 * An XML document type.
 * Localname: iscomment
 * Namespace: urn:schemas-microsoft-com:office:powerpoint
 * Java type: com.microsoft.schemas.office.powerpoint.IscommentDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.powerpoint;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one iscomment(@urn:schemas-microsoft-com:office:powerpoint) element.
 *
 * This is a complex type.
 */
public interface IscommentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.powerpoint.IscommentDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "iscomment0149doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "iscomment" element
     */
    com.microsoft.schemas.office.powerpoint.CTEmpty getIscomment();

    /**
     * Sets the "iscomment" element
     */
    void setIscomment(com.microsoft.schemas.office.powerpoint.CTEmpty iscomment);

    /**
     * Appends and returns a new empty "iscomment" element
     */
    com.microsoft.schemas.office.powerpoint.CTEmpty addNewIscomment();
}

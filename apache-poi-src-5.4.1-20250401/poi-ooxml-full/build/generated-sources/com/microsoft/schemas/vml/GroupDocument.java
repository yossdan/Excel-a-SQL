/*
 * An XML document type.
 * Localname: group
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one group(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface GroupDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.GroupDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "group7d3fdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "group" element
     */
    com.microsoft.schemas.vml.CTGroup getGroup();

    /**
     * Sets the "group" element
     */
    void setGroup(com.microsoft.schemas.vml.CTGroup group);

    /**
     * Appends and returns a new empty "group" element
     */
    com.microsoft.schemas.vml.CTGroup addNewGroup();
}

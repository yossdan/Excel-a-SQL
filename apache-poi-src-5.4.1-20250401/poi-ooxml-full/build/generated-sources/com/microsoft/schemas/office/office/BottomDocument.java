/*
 * An XML document type.
 * Localname: bottom
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.BottomDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one bottom(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface BottomDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.BottomDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "bottomc5a2doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "bottom" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild getBottom();

    /**
     * Sets the "bottom" element
     */
    void setBottom(com.microsoft.schemas.office.office.CTStrokeChild bottom);

    /**
     * Appends and returns a new empty "bottom" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild addNewBottom();
}

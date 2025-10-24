/*
 * An XML document type.
 * Localname: right
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.RightDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one right(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface RightDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.RightDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "right3401doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "right" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild getRight();

    /**
     * Sets the "right" element
     */
    void setRight(com.microsoft.schemas.office.office.CTStrokeChild right);

    /**
     * Appends and returns a new empty "right" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild addNewRight();
}

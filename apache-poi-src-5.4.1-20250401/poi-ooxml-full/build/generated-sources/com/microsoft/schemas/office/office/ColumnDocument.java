/*
 * An XML document type.
 * Localname: column
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ColumnDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one column(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface ColumnDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.ColumnDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "column37cddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "column" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild getColumn();

    /**
     * Sets the "column" element
     */
    void setColumn(com.microsoft.schemas.office.office.CTStrokeChild column);

    /**
     * Appends and returns a new empty "column" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild addNewColumn();
}

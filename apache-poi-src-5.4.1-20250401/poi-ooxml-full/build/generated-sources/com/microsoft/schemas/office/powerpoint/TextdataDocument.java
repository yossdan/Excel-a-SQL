/*
 * An XML document type.
 * Localname: textdata
 * Namespace: urn:schemas-microsoft-com:office:powerpoint
 * Java type: com.microsoft.schemas.office.powerpoint.TextdataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.powerpoint;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one textdata(@urn:schemas-microsoft-com:office:powerpoint) element.
 *
 * This is a complex type.
 */
public interface TextdataDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.powerpoint.TextdataDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "textdatacb7ddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "textdata" element
     */
    com.microsoft.schemas.office.powerpoint.CTRel getTextdata();

    /**
     * Sets the "textdata" element
     */
    void setTextdata(com.microsoft.schemas.office.powerpoint.CTRel textdata);

    /**
     * Appends and returns a new empty "textdata" element
     */
    com.microsoft.schemas.office.powerpoint.CTRel addNewTextdata();
}

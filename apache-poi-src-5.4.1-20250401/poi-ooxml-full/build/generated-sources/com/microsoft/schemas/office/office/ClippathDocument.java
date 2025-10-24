/*
 * An XML document type.
 * Localname: clippath
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ClippathDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one clippath(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface ClippathDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.ClippathDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "clippath2eacdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "clippath" element
     */
    com.microsoft.schemas.office.office.CTClipPath getClippath();

    /**
     * Sets the "clippath" element
     */
    void setClippath(com.microsoft.schemas.office.office.CTClipPath clippath);

    /**
     * Appends and returns a new empty "clippath" element
     */
    com.microsoft.schemas.office.office.CTClipPath addNewClippath();
}

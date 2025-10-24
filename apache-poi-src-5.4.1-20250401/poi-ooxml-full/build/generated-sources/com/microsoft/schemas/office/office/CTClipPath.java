/*
 * XML Type:  CT_ClipPath
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTClipPath
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ClipPath(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTClipPath extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTClipPath> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctclippath6d78type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "v" attribute
     */
    java.lang.String getV();

    /**
     * Gets (as xml) the "v" attribute
     */
    org.apache.xmlbeans.XmlString xgetV();

    /**
     * Sets the "v" attribute
     */
    void setV(java.lang.String v);

    /**
     * Sets (as xml) the "v" attribute
     */
    void xsetV(org.apache.xmlbeans.XmlString v);
}

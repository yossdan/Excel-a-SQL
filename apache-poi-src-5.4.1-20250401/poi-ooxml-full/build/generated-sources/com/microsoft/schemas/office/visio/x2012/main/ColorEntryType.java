/*
 * XML Type:  ColorEntry_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ColorEntryType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ColorEntry_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface ColorEntryType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.ColorEntryType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "colorentrytype9e4atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "IX" attribute
     */
    long getIX();

    /**
     * Gets (as xml) the "IX" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetIX();

    /**
     * Sets the "IX" attribute
     */
    void setIX(long ix);

    /**
     * Sets (as xml) the "IX" attribute
     */
    void xsetIX(org.apache.xmlbeans.XmlUnsignedInt ix);

    /**
     * Gets the "RGB" attribute
     */
    java.lang.String getRGB();

    /**
     * Gets (as xml) the "RGB" attribute
     */
    org.apache.xmlbeans.XmlString xgetRGB();

    /**
     * Sets the "RGB" attribute
     */
    void setRGB(java.lang.String rgb);

    /**
     * Sets (as xml) the "RGB" attribute
     */
    void xsetRGB(org.apache.xmlbeans.XmlString rgb);
}

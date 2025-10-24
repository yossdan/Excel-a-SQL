/*
 * An XML attribute type.
 * Localname: insetmode
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.InsetmodeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one insetmode(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface InsetmodeAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.InsetmodeAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "insetmode7733attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "insetmode" attribute
     */
    com.microsoft.schemas.office.office.STInsetMode.Enum getInsetmode();

    /**
     * Gets (as xml) the "insetmode" attribute
     */
    com.microsoft.schemas.office.office.STInsetMode xgetInsetmode();

    /**
     * True if has "insetmode" attribute
     */
    boolean isSetInsetmode();

    /**
     * Sets the "insetmode" attribute
     */
    void setInsetmode(com.microsoft.schemas.office.office.STInsetMode.Enum insetmode);

    /**
     * Sets (as xml) the "insetmode" attribute
     */
    void xsetInsetmode(com.microsoft.schemas.office.office.STInsetMode insetmode);

    /**
     * Unsets the "insetmode" attribute
     */
    void unsetInsetmode();
}

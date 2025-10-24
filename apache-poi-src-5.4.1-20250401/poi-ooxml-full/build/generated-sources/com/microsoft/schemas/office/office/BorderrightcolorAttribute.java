/*
 * An XML attribute type.
 * Localname: borderrightcolor
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.BorderrightcolorAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one borderrightcolor(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface BorderrightcolorAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.BorderrightcolorAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "borderrightcolorbfdcattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "borderrightcolor" attribute
     */
    java.lang.String getBorderrightcolor();

    /**
     * Gets (as xml) the "borderrightcolor" attribute
     */
    org.apache.xmlbeans.XmlString xgetBorderrightcolor();

    /**
     * True if has "borderrightcolor" attribute
     */
    boolean isSetBorderrightcolor();

    /**
     * Sets the "borderrightcolor" attribute
     */
    void setBorderrightcolor(java.lang.String borderrightcolor);

    /**
     * Sets (as xml) the "borderrightcolor" attribute
     */
    void xsetBorderrightcolor(org.apache.xmlbeans.XmlString borderrightcolor);

    /**
     * Unsets the "borderrightcolor" attribute
     */
    void unsetBorderrightcolor();
}

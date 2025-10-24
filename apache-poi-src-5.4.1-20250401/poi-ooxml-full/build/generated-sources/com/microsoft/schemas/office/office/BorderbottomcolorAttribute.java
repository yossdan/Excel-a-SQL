/*
 * An XML attribute type.
 * Localname: borderbottomcolor
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.BorderbottomcolorAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one borderbottomcolor(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface BorderbottomcolorAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.BorderbottomcolorAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "borderbottomcolorc25fattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "borderbottomcolor" attribute
     */
    java.lang.String getBorderbottomcolor();

    /**
     * Gets (as xml) the "borderbottomcolor" attribute
     */
    org.apache.xmlbeans.XmlString xgetBorderbottomcolor();

    /**
     * True if has "borderbottomcolor" attribute
     */
    boolean isSetBorderbottomcolor();

    /**
     * Sets the "borderbottomcolor" attribute
     */
    void setBorderbottomcolor(java.lang.String borderbottomcolor);

    /**
     * Sets (as xml) the "borderbottomcolor" attribute
     */
    void xsetBorderbottomcolor(org.apache.xmlbeans.XmlString borderbottomcolor);

    /**
     * Unsets the "borderbottomcolor" attribute
     */
    void unsetBorderbottomcolor();
}

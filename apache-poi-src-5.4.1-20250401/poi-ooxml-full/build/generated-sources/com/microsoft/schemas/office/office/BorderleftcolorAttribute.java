/*
 * An XML attribute type.
 * Localname: borderleftcolor
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.BorderleftcolorAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one borderleftcolor(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface BorderleftcolorAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.BorderleftcolorAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "borderleftcolor2043attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "borderleftcolor" attribute
     */
    java.lang.String getBorderleftcolor();

    /**
     * Gets (as xml) the "borderleftcolor" attribute
     */
    org.apache.xmlbeans.XmlString xgetBorderleftcolor();

    /**
     * True if has "borderleftcolor" attribute
     */
    boolean isSetBorderleftcolor();

    /**
     * Sets the "borderleftcolor" attribute
     */
    void setBorderleftcolor(java.lang.String borderleftcolor);

    /**
     * Sets (as xml) the "borderleftcolor" attribute
     */
    void xsetBorderleftcolor(org.apache.xmlbeans.XmlString borderleftcolor);

    /**
     * Unsets the "borderleftcolor" attribute
     */
    void unsetBorderleftcolor();
}

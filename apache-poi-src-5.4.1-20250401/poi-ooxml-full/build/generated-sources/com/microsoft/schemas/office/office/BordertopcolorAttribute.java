/*
 * An XML attribute type.
 * Localname: bordertopcolor
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.BordertopcolorAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one bordertopcolor(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface BordertopcolorAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.BordertopcolorAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "bordertopcolor5303attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "bordertopcolor" attribute
     */
    java.lang.String getBordertopcolor();

    /**
     * Gets (as xml) the "bordertopcolor" attribute
     */
    org.apache.xmlbeans.XmlString xgetBordertopcolor();

    /**
     * True if has "bordertopcolor" attribute
     */
    boolean isSetBordertopcolor();

    /**
     * Sets the "bordertopcolor" attribute
     */
    void setBordertopcolor(java.lang.String bordertopcolor);

    /**
     * Sets (as xml) the "bordertopcolor" attribute
     */
    void xsetBordertopcolor(org.apache.xmlbeans.XmlString bordertopcolor);

    /**
     * Unsets the "bordertopcolor" attribute
     */
    void unsetBordertopcolor();
}

/*
 * An XML attribute type.
 * Localname: opacity2
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.Opacity2Attribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one opacity2(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface Opacity2Attribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.Opacity2Attribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "opacity27470attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "opacity2" attribute
     */
    java.lang.String getOpacity2();

    /**
     * Gets (as xml) the "opacity2" attribute
     */
    org.apache.xmlbeans.XmlString xgetOpacity2();

    /**
     * True if has "opacity2" attribute
     */
    boolean isSetOpacity2();

    /**
     * Sets the "opacity2" attribute
     */
    void setOpacity2(java.lang.String opacity2);

    /**
     * Sets (as xml) the "opacity2" attribute
     */
    void xsetOpacity2(org.apache.xmlbeans.XmlString opacity2);

    /**
     * Unsets the "opacity2" attribute
     */
    void unsetOpacity2();
}

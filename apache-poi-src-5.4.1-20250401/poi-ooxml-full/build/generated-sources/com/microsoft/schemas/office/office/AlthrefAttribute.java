/*
 * An XML attribute type.
 * Localname: althref
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.AlthrefAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one althref(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface AlthrefAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.AlthrefAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "althref5487attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "althref" attribute
     */
    java.lang.String getAlthref();

    /**
     * Gets (as xml) the "althref" attribute
     */
    org.apache.xmlbeans.XmlString xgetAlthref();

    /**
     * True if has "althref" attribute
     */
    boolean isSetAlthref();

    /**
     * Sets the "althref" attribute
     */
    void setAlthref(java.lang.String althref);

    /**
     * Sets (as xml) the "althref" attribute
     */
    void xsetAlthref(org.apache.xmlbeans.XmlString althref);

    /**
     * Unsets the "althref" attribute
     */
    void unsetAlthref();
}

/*
 * An XML attribute type.
 * Localname: wrapcoords
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.WrapcoordsAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one wrapcoords(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface WrapcoordsAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.WrapcoordsAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "wrapcoords6c11attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "wrapcoords" attribute
     */
    java.lang.String getWrapcoords();

    /**
     * Gets (as xml) the "wrapcoords" attribute
     */
    org.apache.xmlbeans.XmlString xgetWrapcoords();

    /**
     * True if has "wrapcoords" attribute
     */
    boolean isSetWrapcoords();

    /**
     * Sets the "wrapcoords" attribute
     */
    void setWrapcoords(java.lang.String wrapcoords);

    /**
     * Sets (as xml) the "wrapcoords" attribute
     */
    void xsetWrapcoords(org.apache.xmlbeans.XmlString wrapcoords);

    /**
     * Unsets the "wrapcoords" attribute
     */
    void unsetWrapcoords();
}

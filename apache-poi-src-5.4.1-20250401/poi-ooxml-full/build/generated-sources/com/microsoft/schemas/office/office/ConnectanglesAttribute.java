/*
 * An XML attribute type.
 * Localname: connectangles
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ConnectanglesAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one connectangles(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface ConnectanglesAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.ConnectanglesAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "connectangles61ddattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "connectangles" attribute
     */
    java.lang.String getConnectangles();

    /**
     * Gets (as xml) the "connectangles" attribute
     */
    org.apache.xmlbeans.XmlString xgetConnectangles();

    /**
     * True if has "connectangles" attribute
     */
    boolean isSetConnectangles();

    /**
     * Sets the "connectangles" attribute
     */
    void setConnectangles(java.lang.String connectangles);

    /**
     * Sets (as xml) the "connectangles" attribute
     */
    void xsetConnectangles(org.apache.xmlbeans.XmlString connectangles);

    /**
     * Unsets the "connectangles" attribute
     */
    void unsetConnectangles();
}

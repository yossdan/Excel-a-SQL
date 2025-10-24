/*
 * An XML attribute type.
 * Localname: connectlocs
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ConnectlocsAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one connectlocs(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface ConnectlocsAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.ConnectlocsAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "connectlocs11d0attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "connectlocs" attribute
     */
    java.lang.String getConnectlocs();

    /**
     * Gets (as xml) the "connectlocs" attribute
     */
    org.apache.xmlbeans.XmlString xgetConnectlocs();

    /**
     * True if has "connectlocs" attribute
     */
    boolean isSetConnectlocs();

    /**
     * Sets the "connectlocs" attribute
     */
    void setConnectlocs(java.lang.String connectlocs);

    /**
     * Sets (as xml) the "connectlocs" attribute
     */
    void xsetConnectlocs(org.apache.xmlbeans.XmlString connectlocs);

    /**
     * Unsets the "connectlocs" attribute
     */
    void unsetConnectlocs();
}

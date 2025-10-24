/*
 * An XML attribute type.
 * Localname: regroupid
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.RegroupidAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one regroupid(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface RegroupidAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.RegroupidAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "regroupid623aattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "regroupid" attribute
     */
    java.math.BigInteger getRegroupid();

    /**
     * Gets (as xml) the "regroupid" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetRegroupid();

    /**
     * True if has "regroupid" attribute
     */
    boolean isSetRegroupid();

    /**
     * Sets the "regroupid" attribute
     */
    void setRegroupid(java.math.BigInteger regroupid);

    /**
     * Sets (as xml) the "regroupid" attribute
     */
    void xsetRegroupid(org.apache.xmlbeans.XmlInteger regroupid);

    /**
     * Unsets the "regroupid" attribute
     */
    void unsetRegroupid();
}

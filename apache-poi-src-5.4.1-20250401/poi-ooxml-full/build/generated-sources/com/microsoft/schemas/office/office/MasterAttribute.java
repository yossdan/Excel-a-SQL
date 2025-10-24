/*
 * An XML attribute type.
 * Localname: master
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.MasterAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one master(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface MasterAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.MasterAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "master6d0battrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "master" attribute
     */
    java.lang.String getMaster();

    /**
     * Gets (as xml) the "master" attribute
     */
    org.apache.xmlbeans.XmlString xgetMaster();

    /**
     * True if has "master" attribute
     */
    boolean isSetMaster();

    /**
     * Sets the "master" attribute
     */
    void setMaster(java.lang.String master);

    /**
     * Sets (as xml) the "master" attribute
     */
    void xsetMaster(org.apache.xmlbeans.XmlString master);

    /**
     * Unsets the "master" attribute
     */
    void unsetMaster();
}

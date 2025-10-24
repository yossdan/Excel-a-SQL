/*
 * An XML attribute type.
 * Localname: relid
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.RelidAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one relid(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface RelidAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.RelidAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "relid54e7attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "relid" attribute
     */
    java.lang.String getRelid();

    /**
     * Gets (as xml) the "relid" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetRelid();

    /**
     * True if has "relid" attribute
     */
    boolean isSetRelid();

    /**
     * Sets the "relid" attribute
     */
    void setRelid(java.lang.String relid);

    /**
     * Sets (as xml) the "relid" attribute
     */
    void xsetRelid(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId relid);

    /**
     * Unsets the "relid" attribute
     */
    void unsetRelid();
}

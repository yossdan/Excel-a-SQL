/*
 * An XML attribute type.
 * Localname: spt
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.SptAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one spt(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface SptAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.SptAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "sptb96aattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "spt" attribute
     */
    float getSpt();

    /**
     * Gets (as xml) the "spt" attribute
     */
    org.apache.xmlbeans.XmlFloat xgetSpt();

    /**
     * True if has "spt" attribute
     */
    boolean isSetSpt();

    /**
     * Sets the "spt" attribute
     */
    void setSpt(float spt);

    /**
     * Sets (as xml) the "spt" attribute
     */
    void xsetSpt(org.apache.xmlbeans.XmlFloat spt);

    /**
     * Unsets the "spt" attribute
     */
    void unsetSpt();
}

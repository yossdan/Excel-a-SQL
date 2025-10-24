/*
 * An XML attribute type.
 * Localname: oleid
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.OleidAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one oleid(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface OleidAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.OleidAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "oleide7b6attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "oleid" attribute
     */
    float getOleid();

    /**
     * Gets (as xml) the "oleid" attribute
     */
    org.apache.xmlbeans.XmlFloat xgetOleid();

    /**
     * True if has "oleid" attribute
     */
    boolean isSetOleid();

    /**
     * Sets the "oleid" attribute
     */
    void setOleid(float oleid);

    /**
     * Sets (as xml) the "oleid" attribute
     */
    void xsetOleid(org.apache.xmlbeans.XmlFloat oleid);

    /**
     * Unsets the "oleid" attribute
     */
    void unsetOleid();
}

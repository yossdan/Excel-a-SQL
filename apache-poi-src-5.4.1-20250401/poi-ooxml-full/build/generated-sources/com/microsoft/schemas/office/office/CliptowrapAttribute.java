/*
 * An XML attribute type.
 * Localname: cliptowrap
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CliptowrapAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one cliptowrap(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface CliptowrapAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CliptowrapAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "cliptowrap76beattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "cliptowrap" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getCliptowrap();

    /**
     * Gets (as xml) the "cliptowrap" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetCliptowrap();

    /**
     * True if has "cliptowrap" attribute
     */
    boolean isSetCliptowrap();

    /**
     * Sets the "cliptowrap" attribute
     */
    void setCliptowrap(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum cliptowrap);

    /**
     * Sets (as xml) the "cliptowrap" attribute
     */
    void xsetCliptowrap(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse cliptowrap);

    /**
     * Unsets the "cliptowrap" attribute
     */
    void unsetCliptowrap();
}

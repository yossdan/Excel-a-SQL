/*
 * An XML attribute type.
 * Localname: oleicon
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.OleiconAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one oleicon(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface OleiconAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.OleiconAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "oleicon5dd4attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "oleicon" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getOleicon();

    /**
     * Gets (as xml) the "oleicon" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetOleicon();

    /**
     * True if has "oleicon" attribute
     */
    boolean isSetOleicon();

    /**
     * Sets the "oleicon" attribute
     */
    void setOleicon(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum oleicon);

    /**
     * Sets (as xml) the "oleicon" attribute
     */
    void xsetOleicon(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse oleicon);

    /**
     * Unsets the "oleicon" attribute
     */
    void unsetOleicon();
}

/*
 * An XML attribute type.
 * Localname: preferrelative
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.PreferrelativeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one preferrelative(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface PreferrelativeAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.PreferrelativeAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "preferrelative4285attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "preferrelative" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getPreferrelative();

    /**
     * Gets (as xml) the "preferrelative" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetPreferrelative();

    /**
     * True if has "preferrelative" attribute
     */
    boolean isSetPreferrelative();

    /**
     * Sets the "preferrelative" attribute
     */
    void setPreferrelative(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum preferrelative);

    /**
     * Sets (as xml) the "preferrelative" attribute
     */
    void xsetPreferrelative(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse preferrelative);

    /**
     * Unsets the "preferrelative" attribute
     */
    void unsetPreferrelative();
}

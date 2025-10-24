/*
 * An XML attribute type.
 * Localname: hrstd
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.HrstdAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one hrstd(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface HrstdAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.HrstdAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "hrstd654cattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "hrstd" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getHrstd();

    /**
     * Gets (as xml) the "hrstd" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetHrstd();

    /**
     * True if has "hrstd" attribute
     */
    boolean isSetHrstd();

    /**
     * Sets the "hrstd" attribute
     */
    void setHrstd(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum hrstd);

    /**
     * Sets (as xml) the "hrstd" attribute
     */
    void xsetHrstd(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse hrstd);

    /**
     * Unsets the "hrstd" attribute
     */
    void unsetHrstd();
}

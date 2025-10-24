/*
 * An XML attribute type.
 * Localname: ole
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.OleAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ole(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface OleAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.OleAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "olea4dbattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ole" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getOle();

    /**
     * Gets (as xml) the "ole" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetOle();

    /**
     * True if has "ole" attribute
     */
    boolean isSetOle();

    /**
     * Sets the "ole" attribute
     */
    void setOle(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum ole);

    /**
     * Sets (as xml) the "ole" attribute
     */
    void xsetOle(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank ole);

    /**
     * Unsets the "ole" attribute
     */
    void unsetOle();
}

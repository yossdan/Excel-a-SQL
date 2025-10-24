/*
 * An XML attribute type.
 * Localname: hr
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.HrAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one hr(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface HrAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.HrAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "hrb533attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "hr" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getHr();

    /**
     * Gets (as xml) the "hr" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetHr();

    /**
     * True if has "hr" attribute
     */
    boolean isSetHr();

    /**
     * Sets the "hr" attribute
     */
    void setHr(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum hr);

    /**
     * Sets (as xml) the "hr" attribute
     */
    void xsetHr(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse hr);

    /**
     * Unsets the "hr" attribute
     */
    void unsetHr();
}

/*
 * An XML attribute type.
 * Localname: userdrawn
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.UserdrawnAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one userdrawn(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface UserdrawnAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.UserdrawnAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "userdrawn3eb2attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "userdrawn" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getUserdrawn();

    /**
     * Gets (as xml) the "userdrawn" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetUserdrawn();

    /**
     * True if has "userdrawn" attribute
     */
    boolean isSetUserdrawn();

    /**
     * Sets the "userdrawn" attribute
     */
    void setUserdrawn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum userdrawn);

    /**
     * Sets (as xml) the "userdrawn" attribute
     */
    void xsetUserdrawn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse userdrawn);

    /**
     * Unsets the "userdrawn" attribute
     */
    void unsetUserdrawn();
}

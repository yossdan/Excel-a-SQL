/*
 * An XML attribute type.
 * Localname: userhidden
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.UserhiddenAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one userhidden(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface UserhiddenAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.UserhiddenAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "userhidden8b5eattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "userhidden" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getUserhidden();

    /**
     * Gets (as xml) the "userhidden" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetUserhidden();

    /**
     * True if has "userhidden" attribute
     */
    boolean isSetUserhidden();

    /**
     * Sets the "userhidden" attribute
     */
    void setUserhidden(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum userhidden);

    /**
     * Sets (as xml) the "userhidden" attribute
     */
    void xsetUserhidden(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse userhidden);

    /**
     * Unsets the "userhidden" attribute
     */
    void unsetUserhidden();
}

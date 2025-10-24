/*
 * An XML attribute type.
 * Localname: clip
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ClipAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one clip(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface ClipAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.ClipAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "clip9eb9attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "clip" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getClip();

    /**
     * Gets (as xml) the "clip" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetClip();

    /**
     * True if has "clip" attribute
     */
    boolean isSetClip();

    /**
     * Sets the "clip" attribute
     */
    void setClip(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum clip);

    /**
     * Sets (as xml) the "clip" attribute
     */
    void xsetClip(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse clip);

    /**
     * Unsets the "clip" attribute
     */
    void unsetClip();
}

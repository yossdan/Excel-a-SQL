/*
 * An XML attribute type.
 * Localname: detectmouseclick
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.DetectmouseclickAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one detectmouseclick(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface DetectmouseclickAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.DetectmouseclickAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "detectmouseclick23cfattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "detectmouseclick" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getDetectmouseclick();

    /**
     * Gets (as xml) the "detectmouseclick" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetDetectmouseclick();

    /**
     * True if has "detectmouseclick" attribute
     */
    boolean isSetDetectmouseclick();

    /**
     * Sets the "detectmouseclick" attribute
     */
    void setDetectmouseclick(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum detectmouseclick);

    /**
     * Sets (as xml) the "detectmouseclick" attribute
     */
    void xsetDetectmouseclick(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse detectmouseclick);

    /**
     * Unsets the "detectmouseclick" attribute
     */
    void unsetDetectmouseclick();
}

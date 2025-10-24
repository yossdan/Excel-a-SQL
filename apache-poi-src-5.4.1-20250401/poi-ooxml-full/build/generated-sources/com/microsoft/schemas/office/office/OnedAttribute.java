/*
 * An XML attribute type.
 * Localname: oned
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.OnedAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one oned(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface OnedAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.OnedAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "oned9427attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "oned" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getOned();

    /**
     * Gets (as xml) the "oned" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetOned();

    /**
     * True if has "oned" attribute
     */
    boolean isSetOned();

    /**
     * Sets the "oned" attribute
     */
    void setOned(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum oned);

    /**
     * Sets (as xml) the "oned" attribute
     */
    void xsetOned(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse oned);

    /**
     * Unsets the "oned" attribute
     */
    void unsetOned();
}

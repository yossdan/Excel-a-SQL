/*
 * An XML attribute type.
 * Localname: extrusionok
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ExtrusionokAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one extrusionok(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface ExtrusionokAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.ExtrusionokAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "extrusionok1d28attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "extrusionok" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getExtrusionok();

    /**
     * Gets (as xml) the "extrusionok" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetExtrusionok();

    /**
     * True if has "extrusionok" attribute
     */
    boolean isSetExtrusionok();

    /**
     * Sets the "extrusionok" attribute
     */
    void setExtrusionok(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum extrusionok);

    /**
     * Sets (as xml) the "extrusionok" attribute
     */
    void xsetExtrusionok(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse extrusionok);

    /**
     * Unsets the "extrusionok" attribute
     */
    void unsetExtrusionok();
}

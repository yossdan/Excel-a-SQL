/*
 * An XML attribute type.
 * Localname: bullet
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.BulletAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one bullet(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface BulletAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.BulletAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "bullet87abattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "bullet" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getBullet();

    /**
     * Gets (as xml) the "bullet" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetBullet();

    /**
     * True if has "bullet" attribute
     */
    boolean isSetBullet();

    /**
     * Sets the "bullet" attribute
     */
    void setBullet(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum bullet);

    /**
     * Sets (as xml) the "bullet" attribute
     */
    void xsetBullet(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse bullet);

    /**
     * Unsets the "bullet" attribute
     */
    void unsetBullet();
}

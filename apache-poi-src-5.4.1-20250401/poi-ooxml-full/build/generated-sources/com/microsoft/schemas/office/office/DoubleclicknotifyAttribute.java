/*
 * An XML attribute type.
 * Localname: doubleclicknotify
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.DoubleclicknotifyAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one doubleclicknotify(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface DoubleclicknotifyAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.DoubleclicknotifyAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "doubleclicknotifycc53attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "doubleclicknotify" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getDoubleclicknotify();

    /**
     * Gets (as xml) the "doubleclicknotify" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetDoubleclicknotify();

    /**
     * True if has "doubleclicknotify" attribute
     */
    boolean isSetDoubleclicknotify();

    /**
     * Sets the "doubleclicknotify" attribute
     */
    void setDoubleclicknotify(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum doubleclicknotify);

    /**
     * Sets (as xml) the "doubleclicknotify" attribute
     */
    void xsetDoubleclicknotify(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse doubleclicknotify);

    /**
     * Unsets the "doubleclicknotify" attribute
     */
    void unsetDoubleclicknotify();
}

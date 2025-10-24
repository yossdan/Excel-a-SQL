/*
 * An XML attribute type.
 * Localname: hralign
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.HralignAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one hralign(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface HralignAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.HralignAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "hralignc56eattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "hralign" attribute
     */
    com.microsoft.schemas.office.office.STHrAlign.Enum getHralign();

    /**
     * Gets (as xml) the "hralign" attribute
     */
    com.microsoft.schemas.office.office.STHrAlign xgetHralign();

    /**
     * True if has "hralign" attribute
     */
    boolean isSetHralign();

    /**
     * Sets the "hralign" attribute
     */
    void setHralign(com.microsoft.schemas.office.office.STHrAlign.Enum hralign);

    /**
     * Sets (as xml) the "hralign" attribute
     */
    void xsetHralign(com.microsoft.schemas.office.office.STHrAlign hralign);

    /**
     * Unsets the "hralign" attribute
     */
    void unsetHralign();
}

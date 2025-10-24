/*
 * An XML attribute type.
 * Localname: singleclick
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.SingleclickAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one singleclick(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface SingleclickAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.SingleclickAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "singleclicke7f3attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "singleclick" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getSingleclick();

    /**
     * Gets (as xml) the "singleclick" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetSingleclick();

    /**
     * True if has "singleclick" attribute
     */
    boolean isSetSingleclick();

    /**
     * Sets the "singleclick" attribute
     */
    void setSingleclick(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum singleclick);

    /**
     * Sets (as xml) the "singleclick" attribute
     */
    void xsetSingleclick(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse singleclick);

    /**
     * Unsets the "singleclick" attribute
     */
    void unsetSingleclick();
}

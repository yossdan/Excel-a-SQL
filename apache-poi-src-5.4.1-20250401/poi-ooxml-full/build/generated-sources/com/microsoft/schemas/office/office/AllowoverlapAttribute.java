/*
 * An XML attribute type.
 * Localname: allowoverlap
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.AllowoverlapAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one allowoverlap(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface AllowoverlapAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.AllowoverlapAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "allowoverlap0747attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "allowoverlap" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAllowoverlap();

    /**
     * Gets (as xml) the "allowoverlap" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAllowoverlap();

    /**
     * True if has "allowoverlap" attribute
     */
    boolean isSetAllowoverlap();

    /**
     * Sets the "allowoverlap" attribute
     */
    void setAllowoverlap(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum allowoverlap);

    /**
     * Sets (as xml) the "allowoverlap" attribute
     */
    void xsetAllowoverlap(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse allowoverlap);

    /**
     * Unsets the "allowoverlap" attribute
     */
    void unsetAllowoverlap();
}

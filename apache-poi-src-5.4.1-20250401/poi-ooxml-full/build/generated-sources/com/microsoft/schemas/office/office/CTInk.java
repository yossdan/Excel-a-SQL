/*
 * XML Type:  CT_Ink
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTInk
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Ink(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTInk extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTInk> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctink6f5ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "i" attribute
     */
    java.lang.String getI();

    /**
     * Gets (as xml) the "i" attribute
     */
    org.apache.xmlbeans.XmlString xgetI();

    /**
     * True if has "i" attribute
     */
    boolean isSetI();

    /**
     * Sets the "i" attribute
     */
    void setI(java.lang.String iValue);

    /**
     * Sets (as xml) the "i" attribute
     */
    void xsetI(org.apache.xmlbeans.XmlString iValue);

    /**
     * Unsets the "i" attribute
     */
    void unsetI();

    /**
     * Gets the "annotation" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAnnotation();

    /**
     * Gets (as xml) the "annotation" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAnnotation();

    /**
     * True if has "annotation" attribute
     */
    boolean isSetAnnotation();

    /**
     * Sets the "annotation" attribute
     */
    void setAnnotation(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum annotation);

    /**
     * Sets (as xml) the "annotation" attribute
     */
    void xsetAnnotation(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse annotation);

    /**
     * Unsets the "annotation" attribute
     */
    void unsetAnnotation();

    /**
     * Gets the "contentType" attribute
     */
    java.lang.String getContentType();

    /**
     * Gets (as xml) the "contentType" attribute
     */
    com.microsoft.schemas.office.office.STContentType xgetContentType();

    /**
     * True if has "contentType" attribute
     */
    boolean isSetContentType();

    /**
     * Sets the "contentType" attribute
     */
    void setContentType(java.lang.String contentType);

    /**
     * Sets (as xml) the "contentType" attribute
     */
    void xsetContentType(com.microsoft.schemas.office.office.STContentType contentType);

    /**
     * Unsets the "contentType" attribute
     */
    void unsetContentType();
}

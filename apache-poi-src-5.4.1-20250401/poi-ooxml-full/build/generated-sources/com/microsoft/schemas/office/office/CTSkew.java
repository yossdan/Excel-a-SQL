/*
 * XML Type:  CT_Skew
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTSkew
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Skew(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTSkew extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTSkew> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctskew006dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt.Enum getExt();

    /**
     * Gets (as xml) the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt xgetExt();

    /**
     * True if has "ext" attribute
     */
    boolean isSetExt();

    /**
     * Sets the "ext" attribute
     */
    void setExt(com.microsoft.schemas.vml.STExt.Enum ext);

    /**
     * Sets (as xml) the "ext" attribute
     */
    void xsetExt(com.microsoft.schemas.vml.STExt ext);

    /**
     * Unsets the "ext" attribute
     */
    void unsetExt();

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();

    /**
     * True if has "id" attribute
     */
    boolean isSetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();

    /**
     * Gets the "on" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getOn();

    /**
     * Gets (as xml) the "on" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetOn();

    /**
     * True if has "on" attribute
     */
    boolean isSetOn();

    /**
     * Sets the "on" attribute
     */
    void setOn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum on);

    /**
     * Sets (as xml) the "on" attribute
     */
    void xsetOn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse on);

    /**
     * Unsets the "on" attribute
     */
    void unsetOn();

    /**
     * Gets the "offset" attribute
     */
    java.lang.String getOffset();

    /**
     * Gets (as xml) the "offset" attribute
     */
    org.apache.xmlbeans.XmlString xgetOffset();

    /**
     * True if has "offset" attribute
     */
    boolean isSetOffset();

    /**
     * Sets the "offset" attribute
     */
    void setOffset(java.lang.String offset);

    /**
     * Sets (as xml) the "offset" attribute
     */
    void xsetOffset(org.apache.xmlbeans.XmlString offset);

    /**
     * Unsets the "offset" attribute
     */
    void unsetOffset();

    /**
     * Gets the "origin" attribute
     */
    java.lang.String getOrigin();

    /**
     * Gets (as xml) the "origin" attribute
     */
    org.apache.xmlbeans.XmlString xgetOrigin();

    /**
     * True if has "origin" attribute
     */
    boolean isSetOrigin();

    /**
     * Sets the "origin" attribute
     */
    void setOrigin(java.lang.String origin);

    /**
     * Sets (as xml) the "origin" attribute
     */
    void xsetOrigin(org.apache.xmlbeans.XmlString origin);

    /**
     * Unsets the "origin" attribute
     */
    void unsetOrigin();

    /**
     * Gets the "matrix" attribute
     */
    java.lang.String getMatrix();

    /**
     * Gets (as xml) the "matrix" attribute
     */
    org.apache.xmlbeans.XmlString xgetMatrix();

    /**
     * True if has "matrix" attribute
     */
    boolean isSetMatrix();

    /**
     * Sets the "matrix" attribute
     */
    void setMatrix(java.lang.String matrix);

    /**
     * Sets (as xml) the "matrix" attribute
     */
    void xsetMatrix(org.apache.xmlbeans.XmlString matrix);

    /**
     * Unsets the "matrix" attribute
     */
    void unsetMatrix();
}

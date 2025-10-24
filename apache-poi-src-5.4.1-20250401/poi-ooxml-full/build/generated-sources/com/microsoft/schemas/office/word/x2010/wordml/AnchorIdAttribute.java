/*
 * An XML attribute type.
 * Localname: anchorId
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.AnchorIdAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one anchorId(@http://schemas.microsoft.com/office/word/2010/wordml) attribute.
 *
 * This is a complex type.
 */
public interface AnchorIdAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.AnchorIdAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "anchoridb1f2attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "anchorId" attribute
     */
    byte[] getAnchorId();

    /**
     * Gets (as xml) the "anchorId" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetAnchorId();

    /**
     * True if has "anchorId" attribute
     */
    boolean isSetAnchorId();

    /**
     * Sets the "anchorId" attribute
     */
    void setAnchorId(byte[] anchorId);

    /**
     * Sets (as xml) the "anchorId" attribute
     */
    void xsetAnchorId(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber anchorId);

    /**
     * Unsets the "anchorId" attribute
     */
    void unsetAnchorId();
}

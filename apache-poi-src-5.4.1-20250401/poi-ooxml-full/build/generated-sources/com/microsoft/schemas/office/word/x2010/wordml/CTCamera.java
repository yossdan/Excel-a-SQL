/*
 * XML Type:  CT_Camera
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTCamera
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Camera(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTCamera extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTCamera> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcamera54a3type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "prst" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType.Enum getPrst();

    /**
     * Gets (as xml) the "prst" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType xgetPrst();

    /**
     * Sets the "prst" attribute
     */
    void setPrst(com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType.Enum prst);

    /**
     * Sets (as xml) the "prst" attribute
     */
    void xsetPrst(com.microsoft.schemas.office.word.x2010.wordml.STPresetCameraType prst);
}

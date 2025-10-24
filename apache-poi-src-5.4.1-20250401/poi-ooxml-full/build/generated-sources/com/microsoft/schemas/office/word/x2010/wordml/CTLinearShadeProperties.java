/*
 * XML Type:  CT_LinearShadeProperties
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_LinearShadeProperties(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTLinearShadeProperties extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTLinearShadeProperties> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctlinearshadepropertiesef57type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ang" attribute
     */
    int getAng();

    /**
     * Gets (as xml) the "ang" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle xgetAng();

    /**
     * True if has "ang" attribute
     */
    boolean isSetAng();

    /**
     * Sets the "ang" attribute
     */
    void setAng(int ang);

    /**
     * Sets (as xml) the "ang" attribute
     */
    void xsetAng(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle ang);

    /**
     * Unsets the "ang" attribute
     */
    void unsetAng();

    /**
     * Gets the "scaled" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STOnOff.Enum getScaled();

    /**
     * Gets (as xml) the "scaled" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STOnOff xgetScaled();

    /**
     * True if has "scaled" attribute
     */
    boolean isSetScaled();

    /**
     * Sets the "scaled" attribute
     */
    void setScaled(com.microsoft.schemas.office.word.x2010.wordml.STOnOff.Enum scaled);

    /**
     * Sets (as xml) the "scaled" attribute
     */
    void xsetScaled(com.microsoft.schemas.office.word.x2010.wordml.STOnOff scaled);

    /**
     * Unsets the "scaled" attribute
     */
    void unsetScaled();
}

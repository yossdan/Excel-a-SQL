/*
 * XML Type:  CT_Scene3D
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTScene3D
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Scene3D(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTScene3D extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTScene3D> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctscene3de6b5type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "camera" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTCamera getCamera();

    /**
     * Sets the "camera" element
     */
    void setCamera(com.microsoft.schemas.office.word.x2010.wordml.CTCamera camera);

    /**
     * Appends and returns a new empty "camera" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTCamera addNewCamera();

    /**
     * Gets the "lightRig" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTLightRig getLightRig();

    /**
     * Sets the "lightRig" element
     */
    void setLightRig(com.microsoft.schemas.office.word.x2010.wordml.CTLightRig lightRig);

    /**
     * Appends and returns a new empty "lightRig" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTLightRig addNewLightRig();
}

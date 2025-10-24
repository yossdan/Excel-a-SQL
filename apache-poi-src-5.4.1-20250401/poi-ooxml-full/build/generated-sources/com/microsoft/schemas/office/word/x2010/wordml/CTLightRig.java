/*
 * XML Type:  CT_LightRig
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTLightRig
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_LightRig(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTLightRig extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTLightRig> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctlightrigd80etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "rot" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSphereCoords getRot();

    /**
     * True if has "rot" element
     */
    boolean isSetRot();

    /**
     * Sets the "rot" element
     */
    void setRot(com.microsoft.schemas.office.word.x2010.wordml.CTSphereCoords rot);

    /**
     * Appends and returns a new empty "rot" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSphereCoords addNewRot();

    /**
     * Unsets the "rot" element
     */
    void unsetRot();

    /**
     * Gets the "rig" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STLightRigType.Enum getRig();

    /**
     * Gets (as xml) the "rig" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STLightRigType xgetRig();

    /**
     * Sets the "rig" attribute
     */
    void setRig(com.microsoft.schemas.office.word.x2010.wordml.STLightRigType.Enum rig);

    /**
     * Sets (as xml) the "rig" attribute
     */
    void xsetRig(com.microsoft.schemas.office.word.x2010.wordml.STLightRigType rig);

    /**
     * Gets the "dir" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection.Enum getDir();

    /**
     * Gets (as xml) the "dir" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection xgetDir();

    /**
     * Sets the "dir" attribute
     */
    void setDir(com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection.Enum dir);

    /**
     * Sets (as xml) the "dir" attribute
     */
    void xsetDir(com.microsoft.schemas.office.word.x2010.wordml.STLightRigDirection dir);
}

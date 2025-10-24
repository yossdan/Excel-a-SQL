/*
 * An XML attribute type.
 * Localname: targetscreensize
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.TargetscreensizeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one targetscreensize(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface TargetscreensizeAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.TargetscreensizeAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "targetscreensize47a7attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "targetscreensize" attribute
     */
    com.microsoft.schemas.office.office.STScreenSize.Enum getTargetscreensize();

    /**
     * Gets (as xml) the "targetscreensize" attribute
     */
    com.microsoft.schemas.office.office.STScreenSize xgetTargetscreensize();

    /**
     * True if has "targetscreensize" attribute
     */
    boolean isSetTargetscreensize();

    /**
     * Sets the "targetscreensize" attribute
     */
    void setTargetscreensize(com.microsoft.schemas.office.office.STScreenSize.Enum targetscreensize);

    /**
     * Sets (as xml) the "targetscreensize" attribute
     */
    void xsetTargetscreensize(com.microsoft.schemas.office.office.STScreenSize targetscreensize);

    /**
     * Unsets the "targetscreensize" attribute
     */
    void unsetTargetscreensize();
}

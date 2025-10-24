/*
 * XML Type:  CT_DataModelExtBlock
 * Namespace: http://schemas.microsoft.com/office/drawing/2008/diagram
 * Java type: com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2008.diagram;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_DataModelExtBlock(@http://schemas.microsoft.com/office/drawing/2008/diagram).
 *
 * This is a complex type.
 */
public interface CTDataModelExtBlock extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdatamodelextblock49cctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "relId" attribute
     */
    java.lang.String getRelId();

    /**
     * Gets (as xml) the "relId" attribute
     */
    org.apache.xmlbeans.XmlString xgetRelId();

    /**
     * True if has "relId" attribute
     */
    boolean isSetRelId();

    /**
     * Sets the "relId" attribute
     */
    void setRelId(java.lang.String relId);

    /**
     * Sets (as xml) the "relId" attribute
     */
    void xsetRelId(org.apache.xmlbeans.XmlString relId);

    /**
     * Unsets the "relId" attribute
     */
    void unsetRelId();

    /**
     * Gets the "minVer" attribute
     */
    java.lang.String getMinVer();

    /**
     * Gets (as xml) the "minVer" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetMinVer();

    /**
     * True if has "minVer" attribute
     */
    boolean isSetMinVer();

    /**
     * Sets the "minVer" attribute
     */
    void setMinVer(java.lang.String minVer);

    /**
     * Sets (as xml) the "minVer" attribute
     */
    void xsetMinVer(org.apache.xmlbeans.XmlAnyURI minVer);

    /**
     * Unsets the "minVer" attribute
     */
    void unsetMinVer();
}

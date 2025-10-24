/*
 * An XML document type.
 * Localname: dataModelExt
 * Namespace: http://schemas.microsoft.com/office/drawing/2008/diagram
 * Java type: com.microsoft.schemas.office.drawing.x2008.diagram.DataModelExtDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2008.diagram;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one dataModelExt(@http://schemas.microsoft.com/office/drawing/2008/diagram) element.
 *
 * This is a complex type.
 */
public interface DataModelExtDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2008.diagram.DataModelExtDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "datamodelextdd97doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "dataModelExt" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock getDataModelExt();

    /**
     * Sets the "dataModelExt" element
     */
    void setDataModelExt(com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock dataModelExt);

    /**
     * Appends and returns a new empty "dataModelExt" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock addNewDataModelExt();
}

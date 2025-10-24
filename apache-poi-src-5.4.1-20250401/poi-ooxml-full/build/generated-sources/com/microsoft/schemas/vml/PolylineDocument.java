/*
 * An XML document type.
 * Localname: polyline
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.PolylineDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one polyline(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface PolylineDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.PolylineDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "polylinee992doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "polyline" element
     */
    com.microsoft.schemas.vml.CTPolyLine getPolyline();

    /**
     * Sets the "polyline" element
     */
    void setPolyline(com.microsoft.schemas.vml.CTPolyLine polyline);

    /**
     * Appends and returns a new empty "polyline" element
     */
    com.microsoft.schemas.vml.CTPolyLine addNewPolyline();
}

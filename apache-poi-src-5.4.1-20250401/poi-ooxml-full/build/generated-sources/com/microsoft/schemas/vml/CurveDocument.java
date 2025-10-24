/*
 * An XML document type.
 * Localname: curve
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CurveDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one curve(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface CurveDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.CurveDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "curvea3afdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "curve" element
     */
    com.microsoft.schemas.vml.CTCurve getCurve();

    /**
     * Sets the "curve" element
     */
    void setCurve(com.microsoft.schemas.vml.CTCurve curve);

    /**
     * Appends and returns a new empty "curve" element
     */
    com.microsoft.schemas.vml.CTCurve addNewCurve();
}

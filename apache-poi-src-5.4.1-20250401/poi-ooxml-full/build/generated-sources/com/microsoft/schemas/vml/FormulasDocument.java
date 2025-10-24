/*
 * An XML document type.
 * Localname: formulas
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.FormulasDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one formulas(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface FormulasDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.FormulasDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "formulaseedfdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "formulas" element
     */
    com.microsoft.schemas.vml.CTFormulas getFormulas();

    /**
     * Sets the "formulas" element
     */
    void setFormulas(com.microsoft.schemas.vml.CTFormulas formulas);

    /**
     * Appends and returns a new empty "formulas" element
     */
    com.microsoft.schemas.vml.CTFormulas addNewFormulas();
}

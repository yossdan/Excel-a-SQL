/*
 * An XML document type.
 * Localname: borderbottom
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.BorderbottomDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one borderbottom(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public interface BorderbottomDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.BorderbottomDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "borderbottomd2dcdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "borderbottom" element
     */
    com.microsoft.schemas.office.word.CTBorder getBorderbottom();

    /**
     * Sets the "borderbottom" element
     */
    void setBorderbottom(com.microsoft.schemas.office.word.CTBorder borderbottom);

    /**
     * Appends and returns a new empty "borderbottom" element
     */
    com.microsoft.schemas.office.word.CTBorder addNewBorderbottom();
}

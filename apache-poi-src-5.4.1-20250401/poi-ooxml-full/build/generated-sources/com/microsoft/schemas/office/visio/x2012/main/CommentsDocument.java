/*
 * An XML document type.
 * Localname: Comments
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.CommentsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Comments(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public interface CommentsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.CommentsDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "comments3cb6doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Comments" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CommentsType getComments();

    /**
     * Sets the "Comments" element
     */
    void setComments(com.microsoft.schemas.office.visio.x2012.main.CommentsType comments);

    /**
     * Appends and returns a new empty "Comments" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CommentsType addNewComments();
}

/*
 * An XML document type.
 * Localname: ThreadedComments
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.ThreadedCommentsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ThreadedComments(@http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments) element.
 *
 * This is a complex type.
 */
public interface ThreadedCommentsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.ThreadedCommentsDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "threadedcomments8002doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ThreadedComments" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments getThreadedComments();

    /**
     * Sets the "ThreadedComments" element
     */
    void setThreadedComments(com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments threadedComments);

    /**
     * Appends and returns a new empty "ThreadedComments" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments addNewThreadedComments();
}

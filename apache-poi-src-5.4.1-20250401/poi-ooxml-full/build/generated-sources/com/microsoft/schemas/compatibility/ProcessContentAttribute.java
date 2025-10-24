/*
 * An XML attribute type.
 * Localname: ProcessContent
 * Namespace: http://schemas.openxmlformats.org/markup-compatibility/2006
 * Java type: com.microsoft.schemas.compatibility.ProcessContentAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.compatibility;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ProcessContent(@http://schemas.openxmlformats.org/markup-compatibility/2006) attribute.
 *
 * This is a complex type.
 */
public interface ProcessContentAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.compatibility.ProcessContentAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "processcontentd4c1attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ProcessContent" attribute
     */
    java.lang.String getProcessContent();

    /**
     * Gets (as xml) the "ProcessContent" attribute
     */
    org.apache.xmlbeans.XmlString xgetProcessContent();

    /**
     * True if has "ProcessContent" attribute
     */
    boolean isSetProcessContent();

    /**
     * Sets the "ProcessContent" attribute
     */
    void setProcessContent(java.lang.String processContent);

    /**
     * Sets (as xml) the "ProcessContent" attribute
     */
    void xsetProcessContent(org.apache.xmlbeans.XmlString processContent);

    /**
     * Unsets the "ProcessContent" attribute
     */
    void unsetProcessContent();
}

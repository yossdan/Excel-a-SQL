/*
 * An XML attribute type.
 * Localname: Ignorable
 * Namespace: http://schemas.openxmlformats.org/markup-compatibility/2006
 * Java type: com.microsoft.schemas.compatibility.IgnorableAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.compatibility;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Ignorable(@http://schemas.openxmlformats.org/markup-compatibility/2006) attribute.
 *
 * This is a complex type.
 */
public interface IgnorableAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.compatibility.IgnorableAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ignorable240eattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Ignorable" attribute
     */
    java.lang.String getIgnorable();

    /**
     * Gets (as xml) the "Ignorable" attribute
     */
    org.apache.xmlbeans.XmlString xgetIgnorable();

    /**
     * True if has "Ignorable" attribute
     */
    boolean isSetIgnorable();

    /**
     * Sets the "Ignorable" attribute
     */
    void setIgnorable(java.lang.String ignorable);

    /**
     * Sets (as xml) the "Ignorable" attribute
     */
    void xsetIgnorable(org.apache.xmlbeans.XmlString ignorable);

    /**
     * Unsets the "Ignorable" attribute
     */
    void unsetIgnorable();
}

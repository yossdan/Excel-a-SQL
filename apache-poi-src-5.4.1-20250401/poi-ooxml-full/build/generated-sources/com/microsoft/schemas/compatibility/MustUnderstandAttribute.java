/*
 * An XML attribute type.
 * Localname: MustUnderstand
 * Namespace: http://schemas.openxmlformats.org/markup-compatibility/2006
 * Java type: com.microsoft.schemas.compatibility.MustUnderstandAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.compatibility;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one MustUnderstand(@http://schemas.openxmlformats.org/markup-compatibility/2006) attribute.
 *
 * This is a complex type.
 */
public interface MustUnderstandAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.compatibility.MustUnderstandAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "mustunderstandff1eattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MustUnderstand" attribute
     */
    java.lang.String getMustUnderstand();

    /**
     * Gets (as xml) the "MustUnderstand" attribute
     */
    org.apache.xmlbeans.XmlString xgetMustUnderstand();

    /**
     * True if has "MustUnderstand" attribute
     */
    boolean isSetMustUnderstand();

    /**
     * Sets the "MustUnderstand" attribute
     */
    void setMustUnderstand(java.lang.String mustUnderstand);

    /**
     * Sets (as xml) the "MustUnderstand" attribute
     */
    void xsetMustUnderstand(org.apache.xmlbeans.XmlString mustUnderstand);

    /**
     * Unsets the "MustUnderstand" attribute
     */
    void unsetMustUnderstand();
}

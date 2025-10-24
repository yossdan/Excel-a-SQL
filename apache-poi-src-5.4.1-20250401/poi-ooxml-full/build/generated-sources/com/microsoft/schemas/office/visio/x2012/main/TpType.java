/*
 * XML Type:  tp_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.TpType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML tp_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface TpType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.TpType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "tptype7e5dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "IX" attribute
     */
    long getIX();

    /**
     * Gets (as xml) the "IX" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetIX();

    /**
     * Sets the "IX" attribute
     */
    void setIX(long ix);

    /**
     * Sets (as xml) the "IX" attribute
     */
    void xsetIX(org.apache.xmlbeans.XmlUnsignedInt ix);
}

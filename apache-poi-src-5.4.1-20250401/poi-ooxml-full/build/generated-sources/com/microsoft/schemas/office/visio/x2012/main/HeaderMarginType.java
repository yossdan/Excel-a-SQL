/*
 * XML Type:  HeaderMargin_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.HeaderMarginType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML HeaderMargin_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.visio.x2012.main.HeaderMarginType.
 */
public interface HeaderMarginType extends org.apache.xmlbeans.XmlDouble {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.HeaderMarginType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "headermargintypeaa3etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Unit" attribute
     */
    java.lang.String getUnit();

    /**
     * Gets (as xml) the "Unit" attribute
     */
    org.apache.xmlbeans.XmlString xgetUnit();

    /**
     * True if has "Unit" attribute
     */
    boolean isSetUnit();

    /**
     * Sets the "Unit" attribute
     */
    void setUnit(java.lang.String unit);

    /**
     * Sets (as xml) the "Unit" attribute
     */
    void xsetUnit(org.apache.xmlbeans.XmlString unit);

    /**
     * Unsets the "Unit" attribute
     */
    void unsetUnit();
}

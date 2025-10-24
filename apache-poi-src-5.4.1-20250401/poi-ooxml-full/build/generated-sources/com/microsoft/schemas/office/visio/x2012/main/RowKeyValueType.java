/*
 * XML Type:  RowKeyValue_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RowKeyValue_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface RowKeyValueType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.RowKeyValueType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "rowkeyvaluetype269ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "RowID" attribute
     */
    long getRowID();

    /**
     * Gets (as xml) the "RowID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetRowID();

    /**
     * Sets the "RowID" attribute
     */
    void setRowID(long rowID);

    /**
     * Sets (as xml) the "RowID" attribute
     */
    void xsetRowID(org.apache.xmlbeans.XmlUnsignedInt rowID);

    /**
     * Gets the "Value" attribute
     */
    java.lang.String getValue();

    /**
     * Gets (as xml) the "Value" attribute
     */
    org.apache.xmlbeans.XmlString xgetValue();

    /**
     * Sets the "Value" attribute
     */
    void setValue(java.lang.String value);

    /**
     * Sets (as xml) the "Value" attribute
     */
    void xsetValue(org.apache.xmlbeans.XmlString value);
}

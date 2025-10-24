/*
 * XML Type:  AutoLinkComparison_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AutoLinkComparison_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface AutoLinkComparisonType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "autolinkcomparisontype8447type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ColumnName" attribute
     */
    java.lang.String getColumnName();

    /**
     * Gets (as xml) the "ColumnName" attribute
     */
    org.apache.xmlbeans.XmlString xgetColumnName();

    /**
     * Sets the "ColumnName" attribute
     */
    void setColumnName(java.lang.String columnName);

    /**
     * Sets (as xml) the "ColumnName" attribute
     */
    void xsetColumnName(org.apache.xmlbeans.XmlString columnName);

    /**
     * Gets the "ContextType" attribute
     */
    long getContextType();

    /**
     * Gets (as xml) the "ContextType" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetContextType();

    /**
     * Sets the "ContextType" attribute
     */
    void setContextType(long contextType);

    /**
     * Sets (as xml) the "ContextType" attribute
     */
    void xsetContextType(org.apache.xmlbeans.XmlUnsignedInt contextType);

    /**
     * Gets the "ContextTypeLabel" attribute
     */
    java.lang.String getContextTypeLabel();

    /**
     * Gets (as xml) the "ContextTypeLabel" attribute
     */
    org.apache.xmlbeans.XmlString xgetContextTypeLabel();

    /**
     * True if has "ContextTypeLabel" attribute
     */
    boolean isSetContextTypeLabel();

    /**
     * Sets the "ContextTypeLabel" attribute
     */
    void setContextTypeLabel(java.lang.String contextTypeLabel);

    /**
     * Sets (as xml) the "ContextTypeLabel" attribute
     */
    void xsetContextTypeLabel(org.apache.xmlbeans.XmlString contextTypeLabel);

    /**
     * Unsets the "ContextTypeLabel" attribute
     */
    void unsetContextTypeLabel();
}

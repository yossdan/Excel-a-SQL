/*
 * XML Type:  ForeignData_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ForeignDataType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ForeignData_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface ForeignDataType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.ForeignDataType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "foreigndatatypefe8dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Rel" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RelType getRel();

    /**
     * Sets the "Rel" element
     */
    void setRel(com.microsoft.schemas.office.visio.x2012.main.RelType rel);

    /**
     * Appends and returns a new empty "Rel" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RelType addNewRel();

    /**
     * Gets the "ForeignType" attribute
     */
    java.lang.String getForeignType();

    /**
     * Gets (as xml) the "ForeignType" attribute
     */
    org.apache.xmlbeans.XmlToken xgetForeignType();

    /**
     * Sets the "ForeignType" attribute
     */
    void setForeignType(java.lang.String foreignType);

    /**
     * Sets (as xml) the "ForeignType" attribute
     */
    void xsetForeignType(org.apache.xmlbeans.XmlToken foreignType);

    /**
     * Gets the "ObjectType" attribute
     */
    long getObjectType();

    /**
     * Gets (as xml) the "ObjectType" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetObjectType();

    /**
     * True if has "ObjectType" attribute
     */
    boolean isSetObjectType();

    /**
     * Sets the "ObjectType" attribute
     */
    void setObjectType(long objectType);

    /**
     * Sets (as xml) the "ObjectType" attribute
     */
    void xsetObjectType(org.apache.xmlbeans.XmlUnsignedInt objectType);

    /**
     * Unsets the "ObjectType" attribute
     */
    void unsetObjectType();

    /**
     * Gets the "ShowAsIcon" attribute
     */
    boolean getShowAsIcon();

    /**
     * Gets (as xml) the "ShowAsIcon" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowAsIcon();

    /**
     * True if has "ShowAsIcon" attribute
     */
    boolean isSetShowAsIcon();

    /**
     * Sets the "ShowAsIcon" attribute
     */
    void setShowAsIcon(boolean showAsIcon);

    /**
     * Sets (as xml) the "ShowAsIcon" attribute
     */
    void xsetShowAsIcon(org.apache.xmlbeans.XmlBoolean showAsIcon);

    /**
     * Unsets the "ShowAsIcon" attribute
     */
    void unsetShowAsIcon();

    /**
     * Gets the "ObjectWidth" attribute
     */
    double getObjectWidth();

    /**
     * Gets (as xml) the "ObjectWidth" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetObjectWidth();

    /**
     * True if has "ObjectWidth" attribute
     */
    boolean isSetObjectWidth();

    /**
     * Sets the "ObjectWidth" attribute
     */
    void setObjectWidth(double objectWidth);

    /**
     * Sets (as xml) the "ObjectWidth" attribute
     */
    void xsetObjectWidth(org.apache.xmlbeans.XmlDouble objectWidth);

    /**
     * Unsets the "ObjectWidth" attribute
     */
    void unsetObjectWidth();

    /**
     * Gets the "ObjectHeight" attribute
     */
    double getObjectHeight();

    /**
     * Gets (as xml) the "ObjectHeight" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetObjectHeight();

    /**
     * True if has "ObjectHeight" attribute
     */
    boolean isSetObjectHeight();

    /**
     * Sets the "ObjectHeight" attribute
     */
    void setObjectHeight(double objectHeight);

    /**
     * Sets (as xml) the "ObjectHeight" attribute
     */
    void xsetObjectHeight(org.apache.xmlbeans.XmlDouble objectHeight);

    /**
     * Unsets the "ObjectHeight" attribute
     */
    void unsetObjectHeight();

    /**
     * Gets the "MappingMode" attribute
     */
    int getMappingMode();

    /**
     * Gets (as xml) the "MappingMode" attribute
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetMappingMode();

    /**
     * True if has "MappingMode" attribute
     */
    boolean isSetMappingMode();

    /**
     * Sets the "MappingMode" attribute
     */
    void setMappingMode(int mappingMode);

    /**
     * Sets (as xml) the "MappingMode" attribute
     */
    void xsetMappingMode(org.apache.xmlbeans.XmlUnsignedShort mappingMode);

    /**
     * Unsets the "MappingMode" attribute
     */
    void unsetMappingMode();

    /**
     * Gets the "ExtentX" attribute
     */
    double getExtentX();

    /**
     * Gets (as xml) the "ExtentX" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetExtentX();

    /**
     * True if has "ExtentX" attribute
     */
    boolean isSetExtentX();

    /**
     * Sets the "ExtentX" attribute
     */
    void setExtentX(double extentX);

    /**
     * Sets (as xml) the "ExtentX" attribute
     */
    void xsetExtentX(org.apache.xmlbeans.XmlDouble extentX);

    /**
     * Unsets the "ExtentX" attribute
     */
    void unsetExtentX();

    /**
     * Gets the "ExtentY" attribute
     */
    double getExtentY();

    /**
     * Gets (as xml) the "ExtentY" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetExtentY();

    /**
     * True if has "ExtentY" attribute
     */
    boolean isSetExtentY();

    /**
     * Sets the "ExtentY" attribute
     */
    void setExtentY(double extentY);

    /**
     * Sets (as xml) the "ExtentY" attribute
     */
    void xsetExtentY(org.apache.xmlbeans.XmlDouble extentY);

    /**
     * Unsets the "ExtentY" attribute
     */
    void unsetExtentY();

    /**
     * Gets the "CompressionType" attribute
     */
    java.lang.String getCompressionType();

    /**
     * Gets (as xml) the "CompressionType" attribute
     */
    org.apache.xmlbeans.XmlToken xgetCompressionType();

    /**
     * True if has "CompressionType" attribute
     */
    boolean isSetCompressionType();

    /**
     * Sets the "CompressionType" attribute
     */
    void setCompressionType(java.lang.String compressionType);

    /**
     * Sets (as xml) the "CompressionType" attribute
     */
    void xsetCompressionType(org.apache.xmlbeans.XmlToken compressionType);

    /**
     * Unsets the "CompressionType" attribute
     */
    void unsetCompressionType();

    /**
     * Gets the "CompressionLevel" attribute
     */
    double getCompressionLevel();

    /**
     * Gets (as xml) the "CompressionLevel" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetCompressionLevel();

    /**
     * True if has "CompressionLevel" attribute
     */
    boolean isSetCompressionLevel();

    /**
     * Sets the "CompressionLevel" attribute
     */
    void setCompressionLevel(double compressionLevel);

    /**
     * Sets (as xml) the "CompressionLevel" attribute
     */
    void xsetCompressionLevel(org.apache.xmlbeans.XmlDouble compressionLevel);

    /**
     * Unsets the "CompressionLevel" attribute
     */
    void unsetCompressionLevel();
}

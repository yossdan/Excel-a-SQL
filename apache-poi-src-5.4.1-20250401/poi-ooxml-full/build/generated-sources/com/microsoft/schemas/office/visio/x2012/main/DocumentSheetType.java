/*
 * XML Type:  DocumentSheet_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DocumentSheet_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface DocumentSheetType extends com.microsoft.schemas.office.visio.x2012.main.SheetType {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "documentsheettype5ca7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Name" attribute
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "Name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();

    /**
     * True if has "Name" attribute
     */
    boolean isSetName();

    /**
     * Sets the "Name" attribute
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "Name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);

    /**
     * Unsets the "Name" attribute
     */
    void unsetName();

    /**
     * Gets the "NameU" attribute
     */
    java.lang.String getNameU();

    /**
     * Gets (as xml) the "NameU" attribute
     */
    org.apache.xmlbeans.XmlString xgetNameU();

    /**
     * True if has "NameU" attribute
     */
    boolean isSetNameU();

    /**
     * Sets the "NameU" attribute
     */
    void setNameU(java.lang.String nameU);

    /**
     * Sets (as xml) the "NameU" attribute
     */
    void xsetNameU(org.apache.xmlbeans.XmlString nameU);

    /**
     * Unsets the "NameU" attribute
     */
    void unsetNameU();

    /**
     * Gets the "IsCustomName" attribute
     */
    boolean getIsCustomName();

    /**
     * Gets (as xml) the "IsCustomName" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCustomName();

    /**
     * True if has "IsCustomName" attribute
     */
    boolean isSetIsCustomName();

    /**
     * Sets the "IsCustomName" attribute
     */
    void setIsCustomName(boolean isCustomName);

    /**
     * Sets (as xml) the "IsCustomName" attribute
     */
    void xsetIsCustomName(org.apache.xmlbeans.XmlBoolean isCustomName);

    /**
     * Unsets the "IsCustomName" attribute
     */
    void unsetIsCustomName();

    /**
     * Gets the "IsCustomNameU" attribute
     */
    boolean getIsCustomNameU();

    /**
     * Gets (as xml) the "IsCustomNameU" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCustomNameU();

    /**
     * True if has "IsCustomNameU" attribute
     */
    boolean isSetIsCustomNameU();

    /**
     * Sets the "IsCustomNameU" attribute
     */
    void setIsCustomNameU(boolean isCustomNameU);

    /**
     * Sets (as xml) the "IsCustomNameU" attribute
     */
    void xsetIsCustomNameU(org.apache.xmlbeans.XmlBoolean isCustomNameU);

    /**
     * Unsets the "IsCustomNameU" attribute
     */
    void unsetIsCustomNameU();

    /**
     * Gets the "UniqueID" attribute
     */
    java.lang.String getUniqueID();

    /**
     * Gets (as xml) the "UniqueID" attribute
     */
    org.apache.xmlbeans.XmlString xgetUniqueID();

    /**
     * True if has "UniqueID" attribute
     */
    boolean isSetUniqueID();

    /**
     * Sets the "UniqueID" attribute
     */
    void setUniqueID(java.lang.String uniqueID);

    /**
     * Sets (as xml) the "UniqueID" attribute
     */
    void xsetUniqueID(org.apache.xmlbeans.XmlString uniqueID);

    /**
     * Unsets the "UniqueID" attribute
     */
    void unsetUniqueID();
}

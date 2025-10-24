/*
 * XML Type:  DataColumn_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataColumnType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataColumn_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface DataColumnType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.DataColumnType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "datacolumntypec699type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ColumnNameID" attribute
     */
    java.lang.String getColumnNameID();

    /**
     * Gets (as xml) the "ColumnNameID" attribute
     */
    org.apache.xmlbeans.XmlString xgetColumnNameID();

    /**
     * Sets the "ColumnNameID" attribute
     */
    void setColumnNameID(java.lang.String columnNameID);

    /**
     * Sets (as xml) the "ColumnNameID" attribute
     */
    void xsetColumnNameID(org.apache.xmlbeans.XmlString columnNameID);

    /**
     * Gets the "Name" attribute
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "Name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();

    /**
     * Sets the "Name" attribute
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "Name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);

    /**
     * Gets the "Label" attribute
     */
    java.lang.String getLabel();

    /**
     * Gets (as xml) the "Label" attribute
     */
    org.apache.xmlbeans.XmlString xgetLabel();

    /**
     * Sets the "Label" attribute
     */
    void setLabel(java.lang.String label);

    /**
     * Sets (as xml) the "Label" attribute
     */
    void xsetLabel(org.apache.xmlbeans.XmlString label);

    /**
     * Gets the "OrigLabel" attribute
     */
    java.lang.String getOrigLabel();

    /**
     * Gets (as xml) the "OrigLabel" attribute
     */
    org.apache.xmlbeans.XmlString xgetOrigLabel();

    /**
     * True if has "OrigLabel" attribute
     */
    boolean isSetOrigLabel();

    /**
     * Sets the "OrigLabel" attribute
     */
    void setOrigLabel(java.lang.String origLabel);

    /**
     * Sets (as xml) the "OrigLabel" attribute
     */
    void xsetOrigLabel(org.apache.xmlbeans.XmlString origLabel);

    /**
     * Unsets the "OrigLabel" attribute
     */
    void unsetOrigLabel();

    /**
     * Gets the "LangID" attribute
     */
    long getLangID();

    /**
     * Gets (as xml) the "LangID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetLangID();

    /**
     * True if has "LangID" attribute
     */
    boolean isSetLangID();

    /**
     * Sets the "LangID" attribute
     */
    void setLangID(long langID);

    /**
     * Sets (as xml) the "LangID" attribute
     */
    void xsetLangID(org.apache.xmlbeans.XmlUnsignedInt langID);

    /**
     * Unsets the "LangID" attribute
     */
    void unsetLangID();

    /**
     * Gets the "Calendar" attribute
     */
    int getCalendar();

    /**
     * Gets (as xml) the "Calendar" attribute
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetCalendar();

    /**
     * True if has "Calendar" attribute
     */
    boolean isSetCalendar();

    /**
     * Sets the "Calendar" attribute
     */
    void setCalendar(int calendar);

    /**
     * Sets (as xml) the "Calendar" attribute
     */
    void xsetCalendar(org.apache.xmlbeans.XmlUnsignedShort calendar);

    /**
     * Unsets the "Calendar" attribute
     */
    void unsetCalendar();

    /**
     * Gets the "DataType" attribute
     */
    int getDataType();

    /**
     * Gets (as xml) the "DataType" attribute
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetDataType();

    /**
     * True if has "DataType" attribute
     */
    boolean isSetDataType();

    /**
     * Sets the "DataType" attribute
     */
    void setDataType(int dataType);

    /**
     * Sets (as xml) the "DataType" attribute
     */
    void xsetDataType(org.apache.xmlbeans.XmlUnsignedShort dataType);

    /**
     * Unsets the "DataType" attribute
     */
    void unsetDataType();

    /**
     * Gets the "UnitType" attribute
     */
    java.lang.String getUnitType();

    /**
     * Gets (as xml) the "UnitType" attribute
     */
    org.apache.xmlbeans.XmlString xgetUnitType();

    /**
     * True if has "UnitType" attribute
     */
    boolean isSetUnitType();

    /**
     * Sets the "UnitType" attribute
     */
    void setUnitType(java.lang.String unitType);

    /**
     * Sets (as xml) the "UnitType" attribute
     */
    void xsetUnitType(org.apache.xmlbeans.XmlString unitType);

    /**
     * Unsets the "UnitType" attribute
     */
    void unsetUnitType();

    /**
     * Gets the "Currency" attribute
     */
    int getCurrency();

    /**
     * Gets (as xml) the "Currency" attribute
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetCurrency();

    /**
     * True if has "Currency" attribute
     */
    boolean isSetCurrency();

    /**
     * Sets the "Currency" attribute
     */
    void setCurrency(int currency);

    /**
     * Sets (as xml) the "Currency" attribute
     */
    void xsetCurrency(org.apache.xmlbeans.XmlUnsignedShort currency);

    /**
     * Unsets the "Currency" attribute
     */
    void unsetCurrency();

    /**
     * Gets the "Degree" attribute
     */
    long getDegree();

    /**
     * Gets (as xml) the "Degree" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetDegree();

    /**
     * True if has "Degree" attribute
     */
    boolean isSetDegree();

    /**
     * Sets the "Degree" attribute
     */
    void setDegree(long degree);

    /**
     * Sets (as xml) the "Degree" attribute
     */
    void xsetDegree(org.apache.xmlbeans.XmlUnsignedInt degree);

    /**
     * Unsets the "Degree" attribute
     */
    void unsetDegree();

    /**
     * Gets the "DisplayWidth" attribute
     */
    long getDisplayWidth();

    /**
     * Gets (as xml) the "DisplayWidth" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetDisplayWidth();

    /**
     * True if has "DisplayWidth" attribute
     */
    boolean isSetDisplayWidth();

    /**
     * Sets the "DisplayWidth" attribute
     */
    void setDisplayWidth(long displayWidth);

    /**
     * Sets (as xml) the "DisplayWidth" attribute
     */
    void xsetDisplayWidth(org.apache.xmlbeans.XmlUnsignedInt displayWidth);

    /**
     * Unsets the "DisplayWidth" attribute
     */
    void unsetDisplayWidth();

    /**
     * Gets the "DisplayOrder" attribute
     */
    long getDisplayOrder();

    /**
     * Gets (as xml) the "DisplayOrder" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetDisplayOrder();

    /**
     * True if has "DisplayOrder" attribute
     */
    boolean isSetDisplayOrder();

    /**
     * Sets the "DisplayOrder" attribute
     */
    void setDisplayOrder(long displayOrder);

    /**
     * Sets (as xml) the "DisplayOrder" attribute
     */
    void xsetDisplayOrder(org.apache.xmlbeans.XmlUnsignedInt displayOrder);

    /**
     * Unsets the "DisplayOrder" attribute
     */
    void unsetDisplayOrder();

    /**
     * Gets the "Mapped" attribute
     */
    boolean getMapped();

    /**
     * Gets (as xml) the "Mapped" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMapped();

    /**
     * True if has "Mapped" attribute
     */
    boolean isSetMapped();

    /**
     * Sets the "Mapped" attribute
     */
    void setMapped(boolean mapped);

    /**
     * Sets (as xml) the "Mapped" attribute
     */
    void xsetMapped(org.apache.xmlbeans.XmlBoolean mapped);

    /**
     * Unsets the "Mapped" attribute
     */
    void unsetMapped();

    /**
     * Gets the "Hyperlink" attribute
     */
    boolean getHyperlink();

    /**
     * Gets (as xml) the "Hyperlink" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHyperlink();

    /**
     * True if has "Hyperlink" attribute
     */
    boolean isSetHyperlink();

    /**
     * Sets the "Hyperlink" attribute
     */
    void setHyperlink(boolean hyperlink);

    /**
     * Sets (as xml) the "Hyperlink" attribute
     */
    void xsetHyperlink(org.apache.xmlbeans.XmlBoolean hyperlink);

    /**
     * Unsets the "Hyperlink" attribute
     */
    void unsetHyperlink();
}

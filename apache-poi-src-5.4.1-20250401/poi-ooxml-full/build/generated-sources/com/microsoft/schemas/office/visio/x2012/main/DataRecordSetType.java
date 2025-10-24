/*
 * XML Type:  DataRecordSet_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataRecordSet_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface DataRecordSetType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "datarecordsettype3544type");
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
     * Gets the "DataColumns" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataColumnsType getDataColumns();

    /**
     * Sets the "DataColumns" element
     */
    void setDataColumns(com.microsoft.schemas.office.visio.x2012.main.DataColumnsType dataColumns);

    /**
     * Appends and returns a new empty "DataColumns" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataColumnsType addNewDataColumns();

    /**
     * Gets a List of "PrimaryKey" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType> getPrimaryKeyList();

    /**
     * Gets array of all "PrimaryKey" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType[] getPrimaryKeyArray();

    /**
     * Gets ith "PrimaryKey" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType getPrimaryKeyArray(int i);

    /**
     * Returns number of "PrimaryKey" element
     */
    int sizeOfPrimaryKeyArray();

    /**
     * Sets array of all "PrimaryKey" element
     */
    void setPrimaryKeyArray(com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType[] primaryKeyArray);

    /**
     * Sets ith "PrimaryKey" element
     */
    void setPrimaryKeyArray(int i, com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType primaryKey);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrimaryKey" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType insertNewPrimaryKey(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PrimaryKey" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType addNewPrimaryKey();

    /**
     * Removes the ith "PrimaryKey" element
     */
    void removePrimaryKey(int i);

    /**
     * Gets a List of "RowMap" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.RowMapType> getRowMapList();

    /**
     * Gets array of all "RowMap" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.RowMapType[] getRowMapArray();

    /**
     * Gets ith "RowMap" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RowMapType getRowMapArray(int i);

    /**
     * Returns number of "RowMap" element
     */
    int sizeOfRowMapArray();

    /**
     * Sets array of all "RowMap" element
     */
    void setRowMapArray(com.microsoft.schemas.office.visio.x2012.main.RowMapType[] rowMapArray);

    /**
     * Sets ith "RowMap" element
     */
    void setRowMapArray(int i, com.microsoft.schemas.office.visio.x2012.main.RowMapType rowMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RowMap" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RowMapType insertNewRowMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RowMap" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RowMapType addNewRowMap();

    /**
     * Removes the ith "RowMap" element
     */
    void removeRowMap(int i);

    /**
     * Gets a List of "RefreshConflict" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType> getRefreshConflictList();

    /**
     * Gets array of all "RefreshConflict" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType[] getRefreshConflictArray();

    /**
     * Gets ith "RefreshConflict" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType getRefreshConflictArray(int i);

    /**
     * Returns number of "RefreshConflict" element
     */
    int sizeOfRefreshConflictArray();

    /**
     * Sets array of all "RefreshConflict" element
     */
    void setRefreshConflictArray(com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType[] refreshConflictArray);

    /**
     * Sets ith "RefreshConflict" element
     */
    void setRefreshConflictArray(int i, com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType refreshConflict);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RefreshConflict" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType insertNewRefreshConflict(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RefreshConflict" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType addNewRefreshConflict();

    /**
     * Removes the ith "RefreshConflict" element
     */
    void removeRefreshConflict(int i);

    /**
     * Gets a List of "AutoLinkComparison" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType> getAutoLinkComparisonList();

    /**
     * Gets array of all "AutoLinkComparison" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType[] getAutoLinkComparisonArray();

    /**
     * Gets ith "AutoLinkComparison" element
     */
    com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType getAutoLinkComparisonArray(int i);

    /**
     * Returns number of "AutoLinkComparison" element
     */
    int sizeOfAutoLinkComparisonArray();

    /**
     * Sets array of all "AutoLinkComparison" element
     */
    void setAutoLinkComparisonArray(com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType[] autoLinkComparisonArray);

    /**
     * Sets ith "AutoLinkComparison" element
     */
    void setAutoLinkComparisonArray(int i, com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType autoLinkComparison);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AutoLinkComparison" element
     */
    com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType insertNewAutoLinkComparison(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AutoLinkComparison" element
     */
    com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType addNewAutoLinkComparison();

    /**
     * Removes the ith "AutoLinkComparison" element
     */
    void removeAutoLinkComparison(int i);

    /**
     * Gets the "ID" attribute
     */
    long getID();

    /**
     * Gets (as xml) the "ID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetID();

    /**
     * Sets the "ID" attribute
     */
    void setID(long id);

    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.apache.xmlbeans.XmlUnsignedInt id);

    /**
     * Gets the "ConnectionID" attribute
     */
    long getConnectionID();

    /**
     * Gets (as xml) the "ConnectionID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetConnectionID();

    /**
     * True if has "ConnectionID" attribute
     */
    boolean isSetConnectionID();

    /**
     * Sets the "ConnectionID" attribute
     */
    void setConnectionID(long connectionID);

    /**
     * Sets (as xml) the "ConnectionID" attribute
     */
    void xsetConnectionID(org.apache.xmlbeans.XmlUnsignedInt connectionID);

    /**
     * Unsets the "ConnectionID" attribute
     */
    void unsetConnectionID();

    /**
     * Gets the "Command" attribute
     */
    java.lang.String getCommand();

    /**
     * Gets (as xml) the "Command" attribute
     */
    org.apache.xmlbeans.XmlString xgetCommand();

    /**
     * True if has "Command" attribute
     */
    boolean isSetCommand();

    /**
     * Sets the "Command" attribute
     */
    void setCommand(java.lang.String command);

    /**
     * Sets (as xml) the "Command" attribute
     */
    void xsetCommand(org.apache.xmlbeans.XmlString command);

    /**
     * Unsets the "Command" attribute
     */
    void unsetCommand();

    /**
     * Gets the "Options" attribute
     */
    long getOptions();

    /**
     * Gets (as xml) the "Options" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetOptions();

    /**
     * True if has "Options" attribute
     */
    boolean isSetOptions();

    /**
     * Sets the "Options" attribute
     */
    void setOptions(long options);

    /**
     * Sets (as xml) the "Options" attribute
     */
    void xsetOptions(org.apache.xmlbeans.XmlUnsignedInt options);

    /**
     * Unsets the "Options" attribute
     */
    void unsetOptions();

    /**
     * Gets the "TimeRefreshed" attribute
     */
    java.util.Calendar getTimeRefreshed();

    /**
     * Gets (as xml) the "TimeRefreshed" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetTimeRefreshed();

    /**
     * True if has "TimeRefreshed" attribute
     */
    boolean isSetTimeRefreshed();

    /**
     * Sets the "TimeRefreshed" attribute
     */
    void setTimeRefreshed(java.util.Calendar timeRefreshed);

    /**
     * Sets (as xml) the "TimeRefreshed" attribute
     */
    void xsetTimeRefreshed(org.apache.xmlbeans.XmlDateTime timeRefreshed);

    /**
     * Unsets the "TimeRefreshed" attribute
     */
    void unsetTimeRefreshed();

    /**
     * Gets the "NextRowID" attribute
     */
    long getNextRowID();

    /**
     * Gets (as xml) the "NextRowID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetNextRowID();

    /**
     * True if has "NextRowID" attribute
     */
    boolean isSetNextRowID();

    /**
     * Sets the "NextRowID" attribute
     */
    void setNextRowID(long nextRowID);

    /**
     * Sets (as xml) the "NextRowID" attribute
     */
    void xsetNextRowID(org.apache.xmlbeans.XmlUnsignedInt nextRowID);

    /**
     * Unsets the "NextRowID" attribute
     */
    void unsetNextRowID();

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
     * Gets the "RowOrder" attribute
     */
    boolean getRowOrder();

    /**
     * Gets (as xml) the "RowOrder" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRowOrder();

    /**
     * True if has "RowOrder" attribute
     */
    boolean isSetRowOrder();

    /**
     * Sets the "RowOrder" attribute
     */
    void setRowOrder(boolean rowOrder);

    /**
     * Sets (as xml) the "RowOrder" attribute
     */
    void xsetRowOrder(org.apache.xmlbeans.XmlBoolean rowOrder);

    /**
     * Unsets the "RowOrder" attribute
     */
    void unsetRowOrder();

    /**
     * Gets the "RefreshOverwriteAll" attribute
     */
    boolean getRefreshOverwriteAll();

    /**
     * Gets (as xml) the "RefreshOverwriteAll" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRefreshOverwriteAll();

    /**
     * True if has "RefreshOverwriteAll" attribute
     */
    boolean isSetRefreshOverwriteAll();

    /**
     * Sets the "RefreshOverwriteAll" attribute
     */
    void setRefreshOverwriteAll(boolean refreshOverwriteAll);

    /**
     * Sets (as xml) the "RefreshOverwriteAll" attribute
     */
    void xsetRefreshOverwriteAll(org.apache.xmlbeans.XmlBoolean refreshOverwriteAll);

    /**
     * Unsets the "RefreshOverwriteAll" attribute
     */
    void unsetRefreshOverwriteAll();

    /**
     * Gets the "RefreshNoReconciliationUI" attribute
     */
    boolean getRefreshNoReconciliationUI();

    /**
     * Gets (as xml) the "RefreshNoReconciliationUI" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRefreshNoReconciliationUI();

    /**
     * True if has "RefreshNoReconciliationUI" attribute
     */
    boolean isSetRefreshNoReconciliationUI();

    /**
     * Sets the "RefreshNoReconciliationUI" attribute
     */
    void setRefreshNoReconciliationUI(boolean refreshNoReconciliationUI);

    /**
     * Sets (as xml) the "RefreshNoReconciliationUI" attribute
     */
    void xsetRefreshNoReconciliationUI(org.apache.xmlbeans.XmlBoolean refreshNoReconciliationUI);

    /**
     * Unsets the "RefreshNoReconciliationUI" attribute
     */
    void unsetRefreshNoReconciliationUI();

    /**
     * Gets the "RefreshInterval" attribute
     */
    long getRefreshInterval();

    /**
     * Gets (as xml) the "RefreshInterval" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetRefreshInterval();

    /**
     * True if has "RefreshInterval" attribute
     */
    boolean isSetRefreshInterval();

    /**
     * Sets the "RefreshInterval" attribute
     */
    void setRefreshInterval(long refreshInterval);

    /**
     * Sets (as xml) the "RefreshInterval" attribute
     */
    void xsetRefreshInterval(org.apache.xmlbeans.XmlUnsignedInt refreshInterval);

    /**
     * Unsets the "RefreshInterval" attribute
     */
    void unsetRefreshInterval();

    /**
     * Gets the "ReplaceLinks" attribute
     */
    long getReplaceLinks();

    /**
     * Gets (as xml) the "ReplaceLinks" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetReplaceLinks();

    /**
     * True if has "ReplaceLinks" attribute
     */
    boolean isSetReplaceLinks();

    /**
     * Sets the "ReplaceLinks" attribute
     */
    void setReplaceLinks(long replaceLinks);

    /**
     * Sets (as xml) the "ReplaceLinks" attribute
     */
    void xsetReplaceLinks(org.apache.xmlbeans.XmlUnsignedInt replaceLinks);

    /**
     * Unsets the "ReplaceLinks" attribute
     */
    void unsetReplaceLinks();

    /**
     * Gets the "Checksum" attribute
     */
    long getChecksum();

    /**
     * Gets (as xml) the "Checksum" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetChecksum();

    /**
     * True if has "Checksum" attribute
     */
    boolean isSetChecksum();

    /**
     * Sets the "Checksum" attribute
     */
    void setChecksum(long checksum);

    /**
     * Sets (as xml) the "Checksum" attribute
     */
    void xsetChecksum(org.apache.xmlbeans.XmlUnsignedInt checksum);

    /**
     * Unsets the "Checksum" attribute
     */
    void unsetChecksum();
}

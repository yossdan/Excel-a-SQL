/*
 * XML Type:  DataRecordSet_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataRecordSet_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class DataRecordSetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.DataRecordSetType {
    private static final long serialVersionUID = 1L;

    public DataRecordSetTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Rel"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "DataColumns"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "PrimaryKey"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "RowMap"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "RefreshConflict"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "AutoLinkComparison"),
        new QName("", "ID"),
        new QName("", "ConnectionID"),
        new QName("", "Command"),
        new QName("", "Options"),
        new QName("", "TimeRefreshed"),
        new QName("", "NextRowID"),
        new QName("", "Name"),
        new QName("", "RowOrder"),
        new QName("", "RefreshOverwriteAll"),
        new QName("", "RefreshNoReconciliationUI"),
        new QName("", "RefreshInterval"),
        new QName("", "ReplaceLinks"),
        new QName("", "Checksum"),
    };


    /**
     * Gets the "Rel" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RelType getRel() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RelType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RelType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Rel" element
     */
    @Override
    public void setRel(com.microsoft.schemas.office.visio.x2012.main.RelType rel) {
        generatedSetterHelperImpl(rel, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Rel" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RelType addNewRel() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RelType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RelType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "DataColumns" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataColumnsType getDataColumns() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataColumnsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataColumnsType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DataColumns" element
     */
    @Override
    public void setDataColumns(com.microsoft.schemas.office.visio.x2012.main.DataColumnsType dataColumns) {
        generatedSetterHelperImpl(dataColumns, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataColumns" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataColumnsType addNewDataColumns() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataColumnsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataColumnsType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Gets a List of "PrimaryKey" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType> getPrimaryKeyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPrimaryKeyArray,
                this::setPrimaryKeyArray,
                this::insertNewPrimaryKey,
                this::removePrimaryKey,
                this::sizeOfPrimaryKeyArray
            );
        }
    }

    /**
     * Gets array of all "PrimaryKey" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType[] getPrimaryKeyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType[0]);
    }

    /**
     * Gets ith "PrimaryKey" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType getPrimaryKeyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PrimaryKey" element
     */
    @Override
    public int sizeOfPrimaryKeyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "PrimaryKey" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPrimaryKeyArray(com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType[] primaryKeyArray) {
        check_orphaned();
        arraySetterHelper(primaryKeyArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "PrimaryKey" element
     */
    @Override
    public void setPrimaryKeyArray(int i, com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType primaryKey) {
        generatedSetterHelperImpl(primaryKey, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrimaryKey" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType insertNewPrimaryKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PrimaryKey" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType addNewPrimaryKey() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PrimaryKeyType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "PrimaryKey" element
     */
    @Override
    public void removePrimaryKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "RowMap" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.RowMapType> getRowMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRowMapArray,
                this::setRowMapArray,
                this::insertNewRowMap,
                this::removeRowMap,
                this::sizeOfRowMapArray
            );
        }
    }

    /**
     * Gets array of all "RowMap" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RowMapType[] getRowMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new com.microsoft.schemas.office.visio.x2012.main.RowMapType[0]);
    }

    /**
     * Gets ith "RowMap" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RowMapType getRowMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RowMapType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RowMapType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RowMap" element
     */
    @Override
    public int sizeOfRowMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "RowMap" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRowMapArray(com.microsoft.schemas.office.visio.x2012.main.RowMapType[] rowMapArray) {
        check_orphaned();
        arraySetterHelper(rowMapArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "RowMap" element
     */
    @Override
    public void setRowMapArray(int i, com.microsoft.schemas.office.visio.x2012.main.RowMapType rowMap) {
        generatedSetterHelperImpl(rowMap, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RowMap" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RowMapType insertNewRowMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RowMapType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RowMapType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RowMap" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RowMapType addNewRowMap() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RowMapType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RowMapType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "RowMap" element
     */
    @Override
    public void removeRowMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "RefreshConflict" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType> getRefreshConflictList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRefreshConflictArray,
                this::setRefreshConflictArray,
                this::insertNewRefreshConflict,
                this::removeRefreshConflict,
                this::sizeOfRefreshConflictArray
            );
        }
    }

    /**
     * Gets array of all "RefreshConflict" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType[] getRefreshConflictArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType[0]);
    }

    /**
     * Gets ith "RefreshConflict" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType getRefreshConflictArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RefreshConflict" element
     */
    @Override
    public int sizeOfRefreshConflictArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "RefreshConflict" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRefreshConflictArray(com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType[] refreshConflictArray) {
        check_orphaned();
        arraySetterHelper(refreshConflictArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "RefreshConflict" element
     */
    @Override
    public void setRefreshConflictArray(int i, com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType refreshConflict) {
        generatedSetterHelperImpl(refreshConflict, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RefreshConflict" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType insertNewRefreshConflict(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RefreshConflict" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType addNewRefreshConflict() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "RefreshConflict" element
     */
    @Override
    public void removeRefreshConflict(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "AutoLinkComparison" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType> getAutoLinkComparisonList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAutoLinkComparisonArray,
                this::setAutoLinkComparisonArray,
                this::insertNewAutoLinkComparison,
                this::removeAutoLinkComparison,
                this::sizeOfAutoLinkComparisonArray
            );
        }
    }

    /**
     * Gets array of all "AutoLinkComparison" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType[] getAutoLinkComparisonArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType[0]);
    }

    /**
     * Gets ith "AutoLinkComparison" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType getAutoLinkComparisonArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AutoLinkComparison" element
     */
    @Override
    public int sizeOfAutoLinkComparisonArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "AutoLinkComparison" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAutoLinkComparisonArray(com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType[] autoLinkComparisonArray) {
        check_orphaned();
        arraySetterHelper(autoLinkComparisonArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "AutoLinkComparison" element
     */
    @Override
    public void setAutoLinkComparisonArray(int i, com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType autoLinkComparison) {
        generatedSetterHelperImpl(autoLinkComparison, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AutoLinkComparison" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType insertNewAutoLinkComparison(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AutoLinkComparison" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType addNewAutoLinkComparison() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.AutoLinkComparisonType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "AutoLinkComparison" element
     */
    @Override
    public void removeAutoLinkComparison(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets the "ID" attribute
     */
    @Override
    public long getID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "ID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Sets the "ID" attribute
     */
    @Override
    public void setID(long id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setLongValue(id);
        }
    }

    /**
     * Sets (as xml) the "ID" attribute
     */
    @Override
    public void xsetID(org.apache.xmlbeans.XmlUnsignedInt id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(id);
        }
    }

    /**
     * Gets the "ConnectionID" attribute
     */
    @Override
    public long getConnectionID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "ConnectionID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetConnectionID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "ConnectionID" attribute
     */
    @Override
    public boolean isSetConnectionID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "ConnectionID" attribute
     */
    @Override
    public void setConnectionID(long connectionID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setLongValue(connectionID);
        }
    }

    /**
     * Sets (as xml) the "ConnectionID" attribute
     */
    @Override
    public void xsetConnectionID(org.apache.xmlbeans.XmlUnsignedInt connectionID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(connectionID);
        }
    }

    /**
     * Unsets the "ConnectionID" attribute
     */
    @Override
    public void unsetConnectionID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "Command" attribute
     */
    @Override
    public java.lang.String getCommand() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Command" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetCommand() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "Command" attribute
     */
    @Override
    public boolean isSetCommand() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "Command" attribute
     */
    @Override
    public void setCommand(java.lang.String command) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setStringValue(command);
        }
    }

    /**
     * Sets (as xml) the "Command" attribute
     */
    @Override
    public void xsetCommand(org.apache.xmlbeans.XmlString command) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(command);
        }
    }

    /**
     * Unsets the "Command" attribute
     */
    @Override
    public void unsetCommand() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "Options" attribute
     */
    @Override
    public long getOptions() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "Options" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetOptions() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "Options" attribute
     */
    @Override
    public boolean isSetOptions() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "Options" attribute
     */
    @Override
    public void setOptions(long options) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setLongValue(options);
        }
    }

    /**
     * Sets (as xml) the "Options" attribute
     */
    @Override
    public void xsetOptions(org.apache.xmlbeans.XmlUnsignedInt options) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(options);
        }
    }

    /**
     * Unsets the "Options" attribute
     */
    @Override
    public void unsetOptions() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "TimeRefreshed" attribute
     */
    @Override
    public java.util.Calendar getTimeRefreshed() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "TimeRefreshed" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetTimeRefreshed() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * True if has "TimeRefreshed" attribute
     */
    @Override
    public boolean isSetTimeRefreshed() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "TimeRefreshed" attribute
     */
    @Override
    public void setTimeRefreshed(java.util.Calendar timeRefreshed) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setCalendarValue(timeRefreshed);
        }
    }

    /**
     * Sets (as xml) the "TimeRefreshed" attribute
     */
    @Override
    public void xsetTimeRefreshed(org.apache.xmlbeans.XmlDateTime timeRefreshed) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(timeRefreshed);
        }
    }

    /**
     * Unsets the "TimeRefreshed" attribute
     */
    @Override
    public void unsetTimeRefreshed() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "NextRowID" attribute
     */
    @Override
    public long getNextRowID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "NextRowID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetNextRowID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * True if has "NextRowID" attribute
     */
    @Override
    public boolean isSetNextRowID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "NextRowID" attribute
     */
    @Override
    public void setNextRowID(long nextRowID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setLongValue(nextRowID);
        }
    }

    /**
     * Sets (as xml) the "NextRowID" attribute
     */
    @Override
    public void xsetNextRowID(org.apache.xmlbeans.XmlUnsignedInt nextRowID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.set(nextRowID);
        }
    }

    /**
     * Unsets the "NextRowID" attribute
     */
    @Override
    public void unsetNextRowID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Gets the "Name" attribute
     */
    @Override
    public java.lang.String getName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Name" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "Name" attribute
     */
    @Override
    public boolean isSetName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "Name" attribute
     */
    @Override
    public void setName(java.lang.String name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setStringValue(name);
        }
    }

    /**
     * Sets (as xml) the "Name" attribute
     */
    @Override
    public void xsetName(org.apache.xmlbeans.XmlString name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(name);
        }
    }

    /**
     * Unsets the "Name" attribute
     */
    @Override
    public void unsetName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "RowOrder" attribute
     */
    @Override
    public boolean getRowOrder() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "RowOrder" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetRowOrder() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "RowOrder" attribute
     */
    @Override
    public boolean isSetRowOrder() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "RowOrder" attribute
     */
    @Override
    public void setRowOrder(boolean rowOrder) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setBooleanValue(rowOrder);
        }
    }

    /**
     * Sets (as xml) the "RowOrder" attribute
     */
    @Override
    public void xsetRowOrder(org.apache.xmlbeans.XmlBoolean rowOrder) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(rowOrder);
        }
    }

    /**
     * Unsets the "RowOrder" attribute
     */
    @Override
    public void unsetRowOrder() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Gets the "RefreshOverwriteAll" attribute
     */
    @Override
    public boolean getRefreshOverwriteAll() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "RefreshOverwriteAll" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetRefreshOverwriteAll() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * True if has "RefreshOverwriteAll" attribute
     */
    @Override
    public boolean isSetRefreshOverwriteAll() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
        }
    }

    /**
     * Sets the "RefreshOverwriteAll" attribute
     */
    @Override
    public void setRefreshOverwriteAll(boolean refreshOverwriteAll) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.setBooleanValue(refreshOverwriteAll);
        }
    }

    /**
     * Sets (as xml) the "RefreshOverwriteAll" attribute
     */
    @Override
    public void xsetRefreshOverwriteAll(org.apache.xmlbeans.XmlBoolean refreshOverwriteAll) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.set(refreshOverwriteAll);
        }
    }

    /**
     * Unsets the "RefreshOverwriteAll" attribute
     */
    @Override
    public void unsetRefreshOverwriteAll() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Gets the "RefreshNoReconciliationUI" attribute
     */
    @Override
    public boolean getRefreshNoReconciliationUI() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "RefreshNoReconciliationUI" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetRefreshNoReconciliationUI() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * True if has "RefreshNoReconciliationUI" attribute
     */
    @Override
    public boolean isSetRefreshNoReconciliationUI() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[15]) != null;
        }
    }

    /**
     * Sets the "RefreshNoReconciliationUI" attribute
     */
    @Override
    public void setRefreshNoReconciliationUI(boolean refreshNoReconciliationUI) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.setBooleanValue(refreshNoReconciliationUI);
        }
    }

    /**
     * Sets (as xml) the "RefreshNoReconciliationUI" attribute
     */
    @Override
    public void xsetRefreshNoReconciliationUI(org.apache.xmlbeans.XmlBoolean refreshNoReconciliationUI) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.set(refreshNoReconciliationUI);
        }
    }

    /**
     * Unsets the "RefreshNoReconciliationUI" attribute
     */
    @Override
    public void unsetRefreshNoReconciliationUI() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Gets the "RefreshInterval" attribute
     */
    @Override
    public long getRefreshInterval() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "RefreshInterval" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetRefreshInterval() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * True if has "RefreshInterval" attribute
     */
    @Override
    public boolean isSetRefreshInterval() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[16]) != null;
        }
    }

    /**
     * Sets the "RefreshInterval" attribute
     */
    @Override
    public void setRefreshInterval(long refreshInterval) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.setLongValue(refreshInterval);
        }
    }

    /**
     * Sets (as xml) the "RefreshInterval" attribute
     */
    @Override
    public void xsetRefreshInterval(org.apache.xmlbeans.XmlUnsignedInt refreshInterval) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.set(refreshInterval);
        }
    }

    /**
     * Unsets the "RefreshInterval" attribute
     */
    @Override
    public void unsetRefreshInterval() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[16]);
        }
    }

    /**
     * Gets the "ReplaceLinks" attribute
     */
    @Override
    public long getReplaceLinks() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "ReplaceLinks" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetReplaceLinks() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * True if has "ReplaceLinks" attribute
     */
    @Override
    public boolean isSetReplaceLinks() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[17]) != null;
        }
    }

    /**
     * Sets the "ReplaceLinks" attribute
     */
    @Override
    public void setReplaceLinks(long replaceLinks) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[17]);
            }
            target.setLongValue(replaceLinks);
        }
    }

    /**
     * Sets (as xml) the "ReplaceLinks" attribute
     */
    @Override
    public void xsetReplaceLinks(org.apache.xmlbeans.XmlUnsignedInt replaceLinks) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[17]);
            }
            target.set(replaceLinks);
        }
    }

    /**
     * Unsets the "ReplaceLinks" attribute
     */
    @Override
    public void unsetReplaceLinks() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[17]);
        }
    }

    /**
     * Gets the "Checksum" attribute
     */
    @Override
    public long getChecksum() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[18]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "Checksum" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetChecksum() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[18]);
            return target;
        }
    }

    /**
     * True if has "Checksum" attribute
     */
    @Override
    public boolean isSetChecksum() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[18]) != null;
        }
    }

    /**
     * Sets the "Checksum" attribute
     */
    @Override
    public void setChecksum(long checksum) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[18]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[18]);
            }
            target.setLongValue(checksum);
        }
    }

    /**
     * Sets (as xml) the "Checksum" attribute
     */
    @Override
    public void xsetChecksum(org.apache.xmlbeans.XmlUnsignedInt checksum) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[18]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[18]);
            }
            target.set(checksum);
        }
    }

    /**
     * Unsets the "Checksum" attribute
     */
    @Override
    public void unsetChecksum() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[18]);
        }
    }
}

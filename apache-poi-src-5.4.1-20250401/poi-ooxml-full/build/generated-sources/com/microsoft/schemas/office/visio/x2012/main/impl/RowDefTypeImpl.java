/*
 * XML Type:  RowDef_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.RowDefType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML RowDef_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class RowDefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.RowDefType {
    private static final long serialVersionUID = 1L;

    public RowDefTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "CellDef"),
    };


    /**
     * Gets a List of "CellDef" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.CellDefType> getCellDefList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCellDefArray,
                this::setCellDefArray,
                this::insertNewCellDef,
                this::removeCellDef,
                this::sizeOfCellDefArray
            );
        }
    }

    /**
     * Gets array of all "CellDef" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CellDefType[] getCellDefArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.CellDefType[0]);
    }

    /**
     * Gets ith "CellDef" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CellDefType getCellDefArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CellDefType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CellDefType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CellDef" element
     */
    @Override
    public int sizeOfCellDefArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "CellDef" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCellDefArray(com.microsoft.schemas.office.visio.x2012.main.CellDefType[] cellDefArray) {
        check_orphaned();
        arraySetterHelper(cellDefArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "CellDef" element
     */
    @Override
    public void setCellDefArray(int i, com.microsoft.schemas.office.visio.x2012.main.CellDefType cellDef) {
        generatedSetterHelperImpl(cellDef, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CellDef" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CellDefType insertNewCellDef(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CellDefType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CellDefType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CellDef" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CellDefType addNewCellDef() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CellDefType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CellDefType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "CellDef" element
     */
    @Override
    public void removeCellDef(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

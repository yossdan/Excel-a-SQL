/*
 * XML Type:  SectionDef_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.SectionDefType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SectionDef_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class SectionDefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.SectionDefType {
    private static final long serialVersionUID = 1L;

    public SectionDefTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "CellDef"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "RowDef"),
        new QName("", "N"),
        new QName("", "T"),
        new QName("", "S"),
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

    /**
     * Gets the "RowDef" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RowDefType getRowDef() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RowDefType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RowDefType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "RowDef" element
     */
    @Override
    public boolean isSetRowDef() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "RowDef" element
     */
    @Override
    public void setRowDef(com.microsoft.schemas.office.visio.x2012.main.RowDefType rowDef) {
        generatedSetterHelperImpl(rowDef, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RowDef" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RowDefType addNewRowDef() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RowDefType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RowDefType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "RowDef" element
     */
    @Override
    public void unsetRowDef() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "N" attribute
     */
    @Override
    public java.lang.String getN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "N" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Sets the "N" attribute
     */
    @Override
    public void setN(java.lang.String n) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(n);
        }
    }

    /**
     * Sets (as xml) the "N" attribute
     */
    @Override
    public void xsetN(org.apache.xmlbeans.XmlString n) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(n);
        }
    }

    /**
     * Gets the "T" attribute
     */
    @Override
    public java.lang.String getT() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "T" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetT() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "T" attribute
     */
    @Override
    public boolean isSetT() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "T" attribute
     */
    @Override
    public void setT(java.lang.String t) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(t);
        }
    }

    /**
     * Sets (as xml) the "T" attribute
     */
    @Override
    public void xsetT(org.apache.xmlbeans.XmlString t) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(t);
        }
    }

    /**
     * Unsets the "T" attribute
     */
    @Override
    public void unsetT() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "S" attribute
     */
    @Override
    public short getS() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? 0 : target.getShortValue();
        }
    }

    /**
     * Gets (as xml) the "S" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedByte xgetS() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "S" attribute
     */
    @Override
    public boolean isSetS() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "S" attribute
     */
    @Override
    public void setS(short s) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setShortValue(s);
        }
    }

    /**
     * Sets (as xml) the "S" attribute
     */
    @Override
    public void xsetS(org.apache.xmlbeans.XmlUnsignedByte s) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(s);
        }
    }

    /**
     * Unsets the "S" attribute
     */
    @Override
    public void unsetS() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }
}

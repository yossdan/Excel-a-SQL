/*
 * XML Type:  Extensions_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ExtensionsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Extensions_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class ExtensionsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.ExtensionsType {
    private static final long serialVersionUID = 1L;

    public ExtensionsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "CellDef"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "FunctionDef"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "SectionDef"),
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
     * Gets a List of "FunctionDef" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.FunctionDefType> getFunctionDefList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFunctionDefArray,
                this::setFunctionDefArray,
                this::insertNewFunctionDef,
                this::removeFunctionDef,
                this::sizeOfFunctionDefArray
            );
        }
    }

    /**
     * Gets array of all "FunctionDef" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FunctionDefType[] getFunctionDefArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new com.microsoft.schemas.office.visio.x2012.main.FunctionDefType[0]);
    }

    /**
     * Gets ith "FunctionDef" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FunctionDefType getFunctionDefArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FunctionDefType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FunctionDefType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "FunctionDef" element
     */
    @Override
    public int sizeOfFunctionDefArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "FunctionDef" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setFunctionDefArray(com.microsoft.schemas.office.visio.x2012.main.FunctionDefType[] functionDefArray) {
        check_orphaned();
        arraySetterHelper(functionDefArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "FunctionDef" element
     */
    @Override
    public void setFunctionDefArray(int i, com.microsoft.schemas.office.visio.x2012.main.FunctionDefType functionDef) {
        generatedSetterHelperImpl(functionDef, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FunctionDef" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FunctionDefType insertNewFunctionDef(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FunctionDefType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FunctionDefType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "FunctionDef" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FunctionDefType addNewFunctionDef() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FunctionDefType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FunctionDefType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "FunctionDef" element
     */
    @Override
    public void removeFunctionDef(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "SectionDef" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.SectionDefType> getSectionDefList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSectionDefArray,
                this::setSectionDefArray,
                this::insertNewSectionDef,
                this::removeSectionDef,
                this::sizeOfSectionDefArray
            );
        }
    }

    /**
     * Gets array of all "SectionDef" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SectionDefType[] getSectionDefArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new com.microsoft.schemas.office.visio.x2012.main.SectionDefType[0]);
    }

    /**
     * Gets ith "SectionDef" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SectionDefType getSectionDefArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SectionDefType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SectionDefType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SectionDef" element
     */
    @Override
    public int sizeOfSectionDefArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "SectionDef" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSectionDefArray(com.microsoft.schemas.office.visio.x2012.main.SectionDefType[] sectionDefArray) {
        check_orphaned();
        arraySetterHelper(sectionDefArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "SectionDef" element
     */
    @Override
    public void setSectionDefArray(int i, com.microsoft.schemas.office.visio.x2012.main.SectionDefType sectionDef) {
        generatedSetterHelperImpl(sectionDef, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SectionDef" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SectionDefType insertNewSectionDef(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SectionDefType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SectionDefType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SectionDef" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SectionDefType addNewSectionDef() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SectionDefType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SectionDefType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "SectionDef" element
     */
    @Override
    public void removeSectionDef(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }
}

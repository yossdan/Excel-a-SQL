/*
 * XML Type:  Colors_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ColorsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Colors_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class ColorsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.ColorsType {
    private static final long serialVersionUID = 1L;

    public ColorsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "ColorEntry"),
    };


    /**
     * Gets a List of "ColorEntry" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.ColorEntryType> getColorEntryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getColorEntryArray,
                this::setColorEntryArray,
                this::insertNewColorEntry,
                this::removeColorEntry,
                this::sizeOfColorEntryArray
            );
        }
    }

    /**
     * Gets array of all "ColorEntry" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ColorEntryType[] getColorEntryArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.ColorEntryType[0]);
    }

    /**
     * Gets ith "ColorEntry" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ColorEntryType getColorEntryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ColorEntryType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ColorEntryType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ColorEntry" element
     */
    @Override
    public int sizeOfColorEntryArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "ColorEntry" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setColorEntryArray(com.microsoft.schemas.office.visio.x2012.main.ColorEntryType[] colorEntryArray) {
        check_orphaned();
        arraySetterHelper(colorEntryArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "ColorEntry" element
     */
    @Override
    public void setColorEntryArray(int i, com.microsoft.schemas.office.visio.x2012.main.ColorEntryType colorEntry) {
        generatedSetterHelperImpl(colorEntry, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ColorEntry" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ColorEntryType insertNewColorEntry(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ColorEntryType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ColorEntryType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ColorEntry" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ColorEntryType addNewColorEntry() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ColorEntryType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ColorEntryType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ColorEntry" element
     */
    @Override
    public void removeColorEntry(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}

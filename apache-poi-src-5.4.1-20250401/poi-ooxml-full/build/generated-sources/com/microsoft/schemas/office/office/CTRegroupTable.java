/*
 * XML Type:  CT_RegroupTable
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTRegroupTable
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_RegroupTable(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTRegroupTable extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTRegroupTable> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctregrouptable0565type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "entry" elements
     */
    java.util.List<com.microsoft.schemas.office.office.CTEntry> getEntryList();

    /**
     * Gets array of all "entry" elements
     */
    com.microsoft.schemas.office.office.CTEntry[] getEntryArray();

    /**
     * Gets ith "entry" element
     */
    com.microsoft.schemas.office.office.CTEntry getEntryArray(int i);

    /**
     * Returns number of "entry" element
     */
    int sizeOfEntryArray();

    /**
     * Sets array of all "entry" element
     */
    void setEntryArray(com.microsoft.schemas.office.office.CTEntry[] entryArray);

    /**
     * Sets ith "entry" element
     */
    void setEntryArray(int i, com.microsoft.schemas.office.office.CTEntry entry);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    com.microsoft.schemas.office.office.CTEntry insertNewEntry(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    com.microsoft.schemas.office.office.CTEntry addNewEntry();

    /**
     * Removes the ith "entry" element
     */
    void removeEntry(int i);

    /**
     * Gets the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt.Enum getExt();

    /**
     * Gets (as xml) the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt xgetExt();

    /**
     * True if has "ext" attribute
     */
    boolean isSetExt();

    /**
     * Sets the "ext" attribute
     */
    void setExt(com.microsoft.schemas.vml.STExt.Enum ext);

    /**
     * Sets (as xml) the "ext" attribute
     */
    void xsetExt(com.microsoft.schemas.vml.STExt ext);

    /**
     * Unsets the "ext" attribute
     */
    void unsetExt();
}

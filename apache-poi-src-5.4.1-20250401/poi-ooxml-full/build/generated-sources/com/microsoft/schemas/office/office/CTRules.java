/*
 * XML Type:  CT_Rules
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTRules
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Rules(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTRules extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTRules> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctrulesf8b0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "r" elements
     */
    java.util.List<com.microsoft.schemas.office.office.CTR> getRList();

    /**
     * Gets array of all "r" elements
     */
    com.microsoft.schemas.office.office.CTR[] getRArray();

    /**
     * Gets ith "r" element
     */
    com.microsoft.schemas.office.office.CTR getRArray(int i);

    /**
     * Returns number of "r" element
     */
    int sizeOfRArray();

    /**
     * Sets array of all "r" element
     */
    void setRArray(com.microsoft.schemas.office.office.CTR[] rArray);

    /**
     * Sets ith "r" element
     */
    void setRArray(int i, com.microsoft.schemas.office.office.CTR r);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "r" element
     */
    com.microsoft.schemas.office.office.CTR insertNewR(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "r" element
     */
    com.microsoft.schemas.office.office.CTR addNewR();

    /**
     * Removes the ith "r" element
     */
    void removeR(int i);

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

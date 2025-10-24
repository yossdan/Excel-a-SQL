/*
 * XML Type:  CT_RelationTable
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTRelationTable
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_RelationTable(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTRelationTable extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTRelationTable> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctrelationtable9cebtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "rel" elements
     */
    java.util.List<com.microsoft.schemas.office.office.CTRelation> getRelList();

    /**
     * Gets array of all "rel" elements
     */
    com.microsoft.schemas.office.office.CTRelation[] getRelArray();

    /**
     * Gets ith "rel" element
     */
    com.microsoft.schemas.office.office.CTRelation getRelArray(int i);

    /**
     * Returns number of "rel" element
     */
    int sizeOfRelArray();

    /**
     * Sets array of all "rel" element
     */
    void setRelArray(com.microsoft.schemas.office.office.CTRelation[] relArray);

    /**
     * Sets ith "rel" element
     */
    void setRelArray(int i, com.microsoft.schemas.office.office.CTRelation rel);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "rel" element
     */
    com.microsoft.schemas.office.office.CTRelation insertNewRel(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "rel" element
     */
    com.microsoft.schemas.office.office.CTRelation addNewRel();

    /**
     * Removes the ith "rel" element
     */
    void removeRel(int i);

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

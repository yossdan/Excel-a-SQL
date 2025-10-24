/*
 * XML Type:  CT_Relation
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTRelation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Relation(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTRelation extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTRelation> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctrelation60dftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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

    /**
     * Gets the "idsrc" attribute
     */
    java.lang.String getIdsrc();

    /**
     * Gets (as xml) the "idsrc" attribute
     */
    org.apache.xmlbeans.XmlString xgetIdsrc();

    /**
     * True if has "idsrc" attribute
     */
    boolean isSetIdsrc();

    /**
     * Sets the "idsrc" attribute
     */
    void setIdsrc(java.lang.String idsrc);

    /**
     * Sets (as xml) the "idsrc" attribute
     */
    void xsetIdsrc(org.apache.xmlbeans.XmlString idsrc);

    /**
     * Unsets the "idsrc" attribute
     */
    void unsetIdsrc();

    /**
     * Gets the "iddest" attribute
     */
    java.lang.String getIddest();

    /**
     * Gets (as xml) the "iddest" attribute
     */
    org.apache.xmlbeans.XmlString xgetIddest();

    /**
     * True if has "iddest" attribute
     */
    boolean isSetIddest();

    /**
     * Sets the "iddest" attribute
     */
    void setIddest(java.lang.String iddest);

    /**
     * Sets (as xml) the "iddest" attribute
     */
    void xsetIddest(org.apache.xmlbeans.XmlString iddest);

    /**
     * Unsets the "iddest" attribute
     */
    void unsetIddest();

    /**
     * Gets the "idcntr" attribute
     */
    java.lang.String getIdcntr();

    /**
     * Gets (as xml) the "idcntr" attribute
     */
    org.apache.xmlbeans.XmlString xgetIdcntr();

    /**
     * True if has "idcntr" attribute
     */
    boolean isSetIdcntr();

    /**
     * Sets the "idcntr" attribute
     */
    void setIdcntr(java.lang.String idcntr);

    /**
     * Sets (as xml) the "idcntr" attribute
     */
    void xsetIdcntr(org.apache.xmlbeans.XmlString idcntr);

    /**
     * Unsets the "idcntr" attribute
     */
    void unsetIdcntr();
}

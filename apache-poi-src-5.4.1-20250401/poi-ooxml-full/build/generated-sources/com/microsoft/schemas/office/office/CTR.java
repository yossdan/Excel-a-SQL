/*
 * XML Type:  CT_R
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTR
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_R(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTR extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTR> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctr0eabtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "proxy" elements
     */
    java.util.List<com.microsoft.schemas.office.office.CTProxy> getProxyList();

    /**
     * Gets array of all "proxy" elements
     */
    com.microsoft.schemas.office.office.CTProxy[] getProxyArray();

    /**
     * Gets ith "proxy" element
     */
    com.microsoft.schemas.office.office.CTProxy getProxyArray(int i);

    /**
     * Returns number of "proxy" element
     */
    int sizeOfProxyArray();

    /**
     * Sets array of all "proxy" element
     */
    void setProxyArray(com.microsoft.schemas.office.office.CTProxy[] proxyArray);

    /**
     * Sets ith "proxy" element
     */
    void setProxyArray(int i, com.microsoft.schemas.office.office.CTProxy proxy);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "proxy" element
     */
    com.microsoft.schemas.office.office.CTProxy insertNewProxy(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "proxy" element
     */
    com.microsoft.schemas.office.office.CTProxy addNewProxy();

    /**
     * Removes the ith "proxy" element
     */
    void removeProxy(int i);

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);

    /**
     * Gets the "type" attribute
     */
    com.microsoft.schemas.office.office.STRType.Enum getType();

    /**
     * Gets (as xml) the "type" attribute
     */
    com.microsoft.schemas.office.office.STRType xgetType();

    /**
     * True if has "type" attribute
     */
    boolean isSetType();

    /**
     * Sets the "type" attribute
     */
    void setType(com.microsoft.schemas.office.office.STRType.Enum type);

    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(com.microsoft.schemas.office.office.STRType type);

    /**
     * Unsets the "type" attribute
     */
    void unsetType();

    /**
     * Gets the "how" attribute
     */
    com.microsoft.schemas.office.office.STHow.Enum getHow();

    /**
     * Gets (as xml) the "how" attribute
     */
    com.microsoft.schemas.office.office.STHow xgetHow();

    /**
     * True if has "how" attribute
     */
    boolean isSetHow();

    /**
     * Sets the "how" attribute
     */
    void setHow(com.microsoft.schemas.office.office.STHow.Enum how);

    /**
     * Sets (as xml) the "how" attribute
     */
    void xsetHow(com.microsoft.schemas.office.office.STHow how);

    /**
     * Unsets the "how" attribute
     */
    void unsetHow();

    /**
     * Gets the "idref" attribute
     */
    java.lang.String getIdref();

    /**
     * Gets (as xml) the "idref" attribute
     */
    org.apache.xmlbeans.XmlString xgetIdref();

    /**
     * True if has "idref" attribute
     */
    boolean isSetIdref();

    /**
     * Sets the "idref" attribute
     */
    void setIdref(java.lang.String idref);

    /**
     * Sets (as xml) the "idref" attribute
     */
    void xsetIdref(org.apache.xmlbeans.XmlString idref);

    /**
     * Unsets the "idref" attribute
     */
    void unsetIdref();
}

/*
 * XML Type:  CT_Rel
 * Namespace: urn:schemas-microsoft-com:office:powerpoint
 * Java type: com.microsoft.schemas.office.powerpoint.CTRel
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.powerpoint;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Rel(@urn:schemas-microsoft-com:office:powerpoint).
 *
 * This is a complex type.
 */
public interface CTRel extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.powerpoint.CTRel> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctrelef01type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();

    /**
     * True if has "id" attribute
     */
    boolean isSetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();
}

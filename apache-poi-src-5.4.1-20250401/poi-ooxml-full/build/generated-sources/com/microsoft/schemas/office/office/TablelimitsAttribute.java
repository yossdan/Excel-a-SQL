/*
 * An XML attribute type.
 * Localname: tablelimits
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.TablelimitsAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one tablelimits(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface TablelimitsAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.TablelimitsAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "tablelimits7119attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "tablelimits" attribute
     */
    java.lang.String getTablelimits();

    /**
     * Gets (as xml) the "tablelimits" attribute
     */
    org.apache.xmlbeans.XmlString xgetTablelimits();

    /**
     * True if has "tablelimits" attribute
     */
    boolean isSetTablelimits();

    /**
     * Sets the "tablelimits" attribute
     */
    void setTablelimits(java.lang.String tablelimits);

    /**
     * Sets (as xml) the "tablelimits" attribute
     */
    void xsetTablelimits(org.apache.xmlbeans.XmlString tablelimits);

    /**
     * Unsets the "tablelimits" attribute
     */
    void unsetTablelimits();
}

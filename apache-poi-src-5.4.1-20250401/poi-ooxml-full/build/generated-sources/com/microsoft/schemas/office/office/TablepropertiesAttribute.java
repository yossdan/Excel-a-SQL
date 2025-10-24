/*
 * An XML attribute type.
 * Localname: tableproperties
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.TablepropertiesAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one tableproperties(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface TablepropertiesAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.TablepropertiesAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "tableproperties01b4attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "tableproperties" attribute
     */
    java.lang.String getTableproperties();

    /**
     * Gets (as xml) the "tableproperties" attribute
     */
    org.apache.xmlbeans.XmlString xgetTableproperties();

    /**
     * True if has "tableproperties" attribute
     */
    boolean isSetTableproperties();

    /**
     * Sets the "tableproperties" attribute
     */
    void setTableproperties(java.lang.String tableproperties);

    /**
     * Sets (as xml) the "tableproperties" attribute
     */
    void xsetTableproperties(org.apache.xmlbeans.XmlString tableproperties);

    /**
     * Unsets the "tableproperties" attribute
     */
    void unsetTableproperties();
}

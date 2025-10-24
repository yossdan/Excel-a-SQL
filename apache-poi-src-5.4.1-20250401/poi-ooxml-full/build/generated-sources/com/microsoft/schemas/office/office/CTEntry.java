/*
 * XML Type:  CT_Entry
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTEntry
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Entry(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTEntry extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTEntry> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctentry612btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "new" attribute
     */
    int getNew();

    /**
     * Gets (as xml) the "new" attribute
     */
    org.apache.xmlbeans.XmlInt xgetNew();

    /**
     * True if has "new" attribute
     */
    boolean isSetNew();

    /**
     * Sets the "new" attribute
     */
    void setNew(int xnew);

    /**
     * Sets (as xml) the "new" attribute
     */
    void xsetNew(org.apache.xmlbeans.XmlInt xnew);

    /**
     * Unsets the "new" attribute
     */
    void unsetNew();

    /**
     * Gets the "old" attribute
     */
    int getOld();

    /**
     * Gets (as xml) the "old" attribute
     */
    org.apache.xmlbeans.XmlInt xgetOld();

    /**
     * True if has "old" attribute
     */
    boolean isSetOld();

    /**
     * Sets the "old" attribute
     */
    void setOld(int old);

    /**
     * Sets (as xml) the "old" attribute
     */
    void xsetOld(org.apache.xmlbeans.XmlInt old);

    /**
     * Unsets the "old" attribute
     */
    void unsetOld();
}

/*
 * XML Type:  AuthorEntry_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AuthorEntry_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface AuthorEntryType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.AuthorEntryType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "authorentrytype53a4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Name" attribute
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "Name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();

    /**
     * True if has "Name" attribute
     */
    boolean isSetName();

    /**
     * Sets the "Name" attribute
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "Name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);

    /**
     * Unsets the "Name" attribute
     */
    void unsetName();

    /**
     * Gets the "Initials" attribute
     */
    java.lang.String getInitials();

    /**
     * Gets (as xml) the "Initials" attribute
     */
    org.apache.xmlbeans.XmlString xgetInitials();

    /**
     * True if has "Initials" attribute
     */
    boolean isSetInitials();

    /**
     * Sets the "Initials" attribute
     */
    void setInitials(java.lang.String initials);

    /**
     * Sets (as xml) the "Initials" attribute
     */
    void xsetInitials(org.apache.xmlbeans.XmlString initials);

    /**
     * Unsets the "Initials" attribute
     */
    void unsetInitials();

    /**
     * Gets the "ResolutionID" attribute
     */
    java.lang.String getResolutionID();

    /**
     * Gets (as xml) the "ResolutionID" attribute
     */
    org.apache.xmlbeans.XmlString xgetResolutionID();

    /**
     * True if has "ResolutionID" attribute
     */
    boolean isSetResolutionID();

    /**
     * Sets the "ResolutionID" attribute
     */
    void setResolutionID(java.lang.String resolutionID);

    /**
     * Sets (as xml) the "ResolutionID" attribute
     */
    void xsetResolutionID(org.apache.xmlbeans.XmlString resolutionID);

    /**
     * Unsets the "ResolutionID" attribute
     */
    void unsetResolutionID();

    /**
     * Gets the "ID" attribute
     */
    long getID();

    /**
     * Gets (as xml) the "ID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetID();

    /**
     * Sets the "ID" attribute
     */
    void setID(long id);

    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.apache.xmlbeans.XmlUnsignedInt id);
}

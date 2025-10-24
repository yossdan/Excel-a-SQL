/*
 * XML Type:  CT_Person
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPerson
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Person(@http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments).
 *
 * This is a complex type.
 */
public interface CTPerson extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPerson> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctperson1ee6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();

    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();

    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);

    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();

    /**
     * Gets the "displayName" attribute
     */
    java.lang.String getDisplayName();

    /**
     * Gets (as xml) the "displayName" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetDisplayName();

    /**
     * Sets the "displayName" attribute
     */
    void setDisplayName(java.lang.String displayName);

    /**
     * Sets (as xml) the "displayName" attribute
     */
    void xsetDisplayName(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring displayName);

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid xgetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid id);

    /**
     * Gets the "userId" attribute
     */
    java.lang.String getUserId();

    /**
     * Gets (as xml) the "userId" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetUserId();

    /**
     * True if has "userId" attribute
     */
    boolean isSetUserId();

    /**
     * Sets the "userId" attribute
     */
    void setUserId(java.lang.String userId);

    /**
     * Sets (as xml) the "userId" attribute
     */
    void xsetUserId(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring userId);

    /**
     * Unsets the "userId" attribute
     */
    void unsetUserId();

    /**
     * Gets the "providerId" attribute
     */
    java.lang.String getProviderId();

    /**
     * Gets (as xml) the "providerId" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetProviderId();

    /**
     * True if has "providerId" attribute
     */
    boolean isSetProviderId();

    /**
     * Sets the "providerId" attribute
     */
    void setProviderId(java.lang.String providerId);

    /**
     * Sets (as xml) the "providerId" attribute
     */
    void xsetProviderId(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring providerId);

    /**
     * Unsets the "providerId" attribute
     */
    void unsetProviderId();
}

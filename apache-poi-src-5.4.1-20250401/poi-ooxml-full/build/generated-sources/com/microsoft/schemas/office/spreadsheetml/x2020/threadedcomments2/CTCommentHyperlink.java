/*
 * XML Type:  CT_CommentHyperlink
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2020/threadedcomments2
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_CommentHyperlink(@http://schemas.microsoft.com/office/spreadsheetml/2020/threadedcomments2).
 *
 * This is a complex type.
 */
public interface CTCommentHyperlink extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcommenthyperlink1f71type");
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
     * Gets the "startIndex" attribute
     */
    long getStartIndex();

    /**
     * Gets (as xml) the "startIndex" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetStartIndex();

    /**
     * Sets the "startIndex" attribute
     */
    void setStartIndex(long startIndex);

    /**
     * Sets (as xml) the "startIndex" attribute
     */
    void xsetStartIndex(org.apache.xmlbeans.XmlUnsignedInt startIndex);

    /**
     * Gets the "length" attribute
     */
    long getLength();

    /**
     * Gets (as xml) the "length" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetLength();

    /**
     * Sets the "length" attribute
     */
    void setLength(long length);

    /**
     * Sets (as xml) the "length" attribute
     */
    void xsetLength(org.apache.xmlbeans.XmlUnsignedInt length);

    /**
     * Gets the "url" attribute
     */
    java.lang.String getUrl();

    /**
     * Gets (as xml) the "url" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetUrl();

    /**
     * Sets the "url" attribute
     */
    void setUrl(java.lang.String url);

    /**
     * Sets (as xml) the "url" attribute
     */
    void xsetUrl(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring url);
}

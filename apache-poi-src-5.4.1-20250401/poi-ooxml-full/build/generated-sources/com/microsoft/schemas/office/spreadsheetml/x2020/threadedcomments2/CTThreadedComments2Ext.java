/*
 * XML Type:  CT_ThreadedComments2Ext
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2020/threadedcomments2
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTThreadedComments2Ext
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ThreadedComments2Ext(@http://schemas.microsoft.com/office/spreadsheetml/2020/threadedcomments2).
 *
 * This is a complex type.
 */
public interface CTThreadedComments2Ext extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTThreadedComments2Ext> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctthreadedcomments2ext2d0ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "checksum" element
     */
    long getChecksum();

    /**
     * Gets (as xml) the "checksum" element
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetChecksum();

    /**
     * Sets the "checksum" element
     */
    void setChecksum(long checksum);

    /**
     * Sets (as xml) the "checksum" element
     */
    void xsetChecksum(org.apache.xmlbeans.XmlUnsignedInt checksum);

    /**
     * Gets a List of "hyperlink" elements
     */
    java.util.List<com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink> getHyperlinkList();

    /**
     * Gets array of all "hyperlink" elements
     */
    com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink[] getHyperlinkArray();

    /**
     * Gets ith "hyperlink" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink getHyperlinkArray(int i);

    /**
     * Returns number of "hyperlink" element
     */
    int sizeOfHyperlinkArray();

    /**
     * Sets array of all "hyperlink" element
     */
    void setHyperlinkArray(com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink[] hyperlinkArray);

    /**
     * Sets ith "hyperlink" element
     */
    void setHyperlinkArray(int i, com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink hyperlink);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "hyperlink" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink insertNewHyperlink(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "hyperlink" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink addNewHyperlink();

    /**
     * Removes the ith "hyperlink" element
     */
    void removeHyperlink(int i);
}

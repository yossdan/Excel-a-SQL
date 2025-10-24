/*
 * XML Type:  CT_Mention
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Mention(@http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments).
 *
 * This is a complex type.
 */
public interface CTMention extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctmention0451type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "mentionpersonId" attribute
     */
    java.lang.String getMentionpersonId();

    /**
     * Gets (as xml) the "mentionpersonId" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid xgetMentionpersonId();

    /**
     * Sets the "mentionpersonId" attribute
     */
    void setMentionpersonId(java.lang.String mentionpersonId);

    /**
     * Sets (as xml) the "mentionpersonId" attribute
     */
    void xsetMentionpersonId(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid mentionpersonId);

    /**
     * Gets the "mentionId" attribute
     */
    java.lang.String getMentionId();

    /**
     * Gets (as xml) the "mentionId" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid xgetMentionId();

    /**
     * Sets the "mentionId" attribute
     */
    void setMentionId(java.lang.String mentionId);

    /**
     * Sets (as xml) the "mentionId" attribute
     */
    void xsetMentionId(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid mentionId);

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
}

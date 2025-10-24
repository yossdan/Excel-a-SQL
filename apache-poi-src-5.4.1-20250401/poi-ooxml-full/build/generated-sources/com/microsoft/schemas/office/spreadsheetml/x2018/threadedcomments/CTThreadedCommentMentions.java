/*
 * XML Type:  CT_ThreadedCommentMentions
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ThreadedCommentMentions(@http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments).
 *
 * This is a complex type.
 */
public interface CTThreadedCommentMentions extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctthreadedcommentmentionsc746type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "mention" elements
     */
    java.util.List<com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention> getMentionList();

    /**
     * Gets array of all "mention" elements
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention[] getMentionArray();

    /**
     * Gets ith "mention" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention getMentionArray(int i);

    /**
     * Returns number of "mention" element
     */
    int sizeOfMentionArray();

    /**
     * Sets array of all "mention" element
     */
    void setMentionArray(com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention[] mentionArray);

    /**
     * Sets ith "mention" element
     */
    void setMentionArray(int i, com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention mention);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "mention" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention insertNewMention(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "mention" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTMention addNewMention();

    /**
     * Removes the ith "mention" element
     */
    void removeMention(int i);
}

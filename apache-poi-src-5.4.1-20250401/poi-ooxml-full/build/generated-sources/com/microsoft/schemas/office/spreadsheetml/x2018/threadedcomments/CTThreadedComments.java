/*
 * XML Type:  CT_ThreadedComments
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ThreadedComments(@http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments).
 *
 * This is a complex type.
 */
public interface CTThreadedComments extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctthreadedcommentsaa8etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "threadedComment" elements
     */
    java.util.List<com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment> getThreadedCommentList();

    /**
     * Gets array of all "threadedComment" elements
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment[] getThreadedCommentArray();

    /**
     * Gets ith "threadedComment" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment getThreadedCommentArray(int i);

    /**
     * Returns number of "threadedComment" element
     */
    int sizeOfThreadedCommentArray();

    /**
     * Sets array of all "threadedComment" element
     */
    void setThreadedCommentArray(com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment[] threadedCommentArray);

    /**
     * Sets ith "threadedComment" element
     */
    void setThreadedCommentArray(int i, com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment threadedComment);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "threadedComment" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment insertNewThreadedComment(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "threadedComment" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment addNewThreadedComment();

    /**
     * Removes the ith "threadedComment" element
     */
    void removeThreadedComment(int i);

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
}

/*
 * XML Type:  CT_ThreadedComment
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ThreadedComment(@http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments).
 *
 * This is a complex type.
 */
public interface CTThreadedComment extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctthreadedcomment455dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "text" element
     */
    java.lang.String getText();

    /**
     * Gets (as xml) the "text" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetText();

    /**
     * True if has "text" element
     */
    boolean isSetText();

    /**
     * Sets the "text" element
     */
    void setText(java.lang.String text);

    /**
     * Sets (as xml) the "text" element
     */
    void xsetText(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring text);

    /**
     * Unsets the "text" element
     */
    void unsetText();

    /**
     * Gets the "mentions" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions getMentions();

    /**
     * True if has "mentions" element
     */
    boolean isSetMentions();

    /**
     * Sets the "mentions" element
     */
    void setMentions(com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions mentions);

    /**
     * Appends and returns a new empty "mentions" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions addNewMentions();

    /**
     * Unsets the "mentions" element
     */
    void unsetMentions();

    /**
     * Gets the "extLst" element
     */
    org.apache.xmlbeans.XmlObject getExtLst();

    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();

    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.apache.xmlbeans.XmlObject extLst);

    /**
     * Appends and returns a new empty "extLst" element
     */
    org.apache.xmlbeans.XmlObject addNewExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();

    /**
     * Gets the "ref" attribute
     */
    java.lang.String getRef();

    /**
     * Gets (as xml) the "ref" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef();

    /**
     * True if has "ref" attribute
     */
    boolean isSetRef();

    /**
     * Sets the "ref" attribute
     */
    void setRef(java.lang.String ref);

    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref);

    /**
     * Unsets the "ref" attribute
     */
    void unsetRef();

    /**
     * Gets the "dT" attribute
     */
    java.util.Calendar getDT();

    /**
     * Gets (as xml) the "dT" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetDT();

    /**
     * True if has "dT" attribute
     */
    boolean isSetDT();

    /**
     * Sets the "dT" attribute
     */
    void setDT(java.util.Calendar dt);

    /**
     * Sets (as xml) the "dT" attribute
     */
    void xsetDT(org.apache.xmlbeans.XmlDateTime dt);

    /**
     * Unsets the "dT" attribute
     */
    void unsetDT();

    /**
     * Gets the "personId" attribute
     */
    java.lang.String getPersonId();

    /**
     * Gets (as xml) the "personId" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid xgetPersonId();

    /**
     * Sets the "personId" attribute
     */
    void setPersonId(java.lang.String personId);

    /**
     * Sets (as xml) the "personId" attribute
     */
    void xsetPersonId(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid personId);

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
     * Gets the "parentId" attribute
     */
    java.lang.String getParentId();

    /**
     * Gets (as xml) the "parentId" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid xgetParentId();

    /**
     * True if has "parentId" attribute
     */
    boolean isSetParentId();

    /**
     * Sets the "parentId" attribute
     */
    void setParentId(java.lang.String parentId);

    /**
     * Sets (as xml) the "parentId" attribute
     */
    void xsetParentId(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid parentId);

    /**
     * Unsets the "parentId" attribute
     */
    void unsetParentId();

    /**
     * Gets the "done" attribute
     */
    boolean getDone();

    /**
     * Gets (as xml) the "done" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDone();

    /**
     * True if has "done" attribute
     */
    boolean isSetDone();

    /**
     * Sets the "done" attribute
     */
    void setDone(boolean done);

    /**
     * Sets (as xml) the "done" attribute
     */
    void xsetDone(org.apache.xmlbeans.XmlBoolean done);

    /**
     * Unsets the "done" attribute
     */
    void unsetDone();
}

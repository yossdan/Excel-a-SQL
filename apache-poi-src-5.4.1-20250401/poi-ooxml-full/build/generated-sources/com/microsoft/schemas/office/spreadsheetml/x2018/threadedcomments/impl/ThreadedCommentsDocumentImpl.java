/*
 * An XML document type.
 * Localname: ThreadedComments
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.ThreadedCommentsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ThreadedComments(@http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments) element.
 *
 * This is a complex type.
 */
public class ThreadedCommentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.ThreadedCommentsDocument {
    private static final long serialVersionUID = 1L;

    public ThreadedCommentsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments", "ThreadedComments"),
    };


    /**
     * Gets the "ThreadedComments" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments getThreadedComments() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ThreadedComments" element
     */
    @Override
    public void setThreadedComments(com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments threadedComments) {
        generatedSetterHelperImpl(threadedComments, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ThreadedComments" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments addNewThreadedComments() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComments)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

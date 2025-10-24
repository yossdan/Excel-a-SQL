/*
 * An XML document type.
 * Localname: Comments
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.CommentsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Comments(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public class CommentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.CommentsDocument {
    private static final long serialVersionUID = 1L;

    public CommentsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Comments"),
    };


    /**
     * Gets the "Comments" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CommentsType getComments() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CommentsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CommentsType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Comments" element
     */
    @Override
    public void setComments(com.microsoft.schemas.office.visio.x2012.main.CommentsType comments) {
        generatedSetterHelperImpl(comments, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Comments" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CommentsType addNewComments() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CommentsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CommentsType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

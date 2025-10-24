/*
 * An XML document type.
 * Localname: personList
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.PersonListDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one personList(@http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments) element.
 *
 * This is a complex type.
 */
public class PersonListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.PersonListDocument {
    private static final long serialVersionUID = 1L;

    public PersonListDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments", "personList"),
    };


    /**
     * Gets the "personList" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPersonList getPersonList() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPersonList target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPersonList)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "personList" element
     */
    @Override
    public void setPersonList(com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPersonList personList) {
        generatedSetterHelperImpl(personList, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "personList" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPersonList addNewPersonList() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPersonList target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPersonList)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

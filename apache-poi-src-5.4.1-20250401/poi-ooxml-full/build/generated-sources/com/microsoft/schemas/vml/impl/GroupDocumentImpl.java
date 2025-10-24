/*
 * An XML document type.
 * Localname: group
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one group(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class GroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.GroupDocument {
    private static final long serialVersionUID = 1L;

    public GroupDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "group"),
    };


    /**
     * Gets the "group" element
     */
    @Override
    public com.microsoft.schemas.vml.CTGroup getGroup() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTGroup target = null;
            target = (com.microsoft.schemas.vml.CTGroup)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "group" element
     */
    @Override
    public void setGroup(com.microsoft.schemas.vml.CTGroup group) {
        generatedSetterHelperImpl(group, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "group" element
     */
    @Override
    public com.microsoft.schemas.vml.CTGroup addNewGroup() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTGroup target = null;
            target = (com.microsoft.schemas.vml.CTGroup)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

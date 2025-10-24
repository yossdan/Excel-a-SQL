/*
 * XML Type:  CT_ThreadedComment
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_ThreadedComment(@http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments).
 *
 * This is a complex type.
 */
public class CTThreadedCommentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedComment {
    private static final long serialVersionUID = 1L;

    public CTThreadedCommentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments", "text"),
        new QName("http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments", "mentions"),
        new QName("http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments", "extLst"),
        new QName("", "ref"),
        new QName("", "dT"),
        new QName("", "personId"),
        new QName("", "id"),
        new QName("", "parentId"),
        new QName("", "done"),
    };


    /**
     * Gets the "text" element
     */
    @Override
    public java.lang.String getText() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "text" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetText() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "text" element
     */
    @Override
    public boolean isSetText() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "text" element
     */
    @Override
    public void setText(java.lang.String text) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(text);
        }
    }

    /**
     * Sets (as xml) the "text" element
     */
    @Override
    public void xsetText(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring text) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(text);
        }
    }

    /**
     * Unsets the "text" element
     */
    @Override
    public void unsetText() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "mentions" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions getMentions() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "mentions" element
     */
    @Override
    public boolean isSetMentions() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "mentions" element
     */
    @Override
    public void setMentions(com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions mentions) {
        generatedSetterHelperImpl(mentions, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "mentions" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions addNewMentions() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTThreadedCommentMentions)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "mentions" element
     */
    @Override
    public void unsetMentions() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "extLst" element
     */
    @Override
    public org.apache.xmlbeans.XmlObject getExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(org.apache.xmlbeans.XmlObject extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public org.apache.xmlbeans.XmlObject addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "ref" attribute
     */
    @Override
    public java.lang.String getRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ref" attribute
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "ref" attribute
     */
    @Override
    public boolean isSetRef() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "ref" attribute
     */
    @Override
    public void setRef(java.lang.String ref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(ref);
        }
    }

    /**
     * Sets (as xml) the "ref" attribute
     */
    @Override
    public void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(ref);
        }
    }

    /**
     * Unsets the "ref" attribute
     */
    @Override
    public void unsetRef() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "dT" attribute
     */
    @Override
    public java.util.Calendar getDT() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "dT" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetDT() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "dT" attribute
     */
    @Override
    public boolean isSetDT() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "dT" attribute
     */
    @Override
    public void setDT(java.util.Calendar dt) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setCalendarValue(dt);
        }
    }

    /**
     * Sets (as xml) the "dT" attribute
     */
    @Override
    public void xsetDT(org.apache.xmlbeans.XmlDateTime dt) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(dt);
        }
    }

    /**
     * Unsets the "dT" attribute
     */
    @Override
    public void unsetDT() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "personId" attribute
     */
    @Override
    public java.lang.String getPersonId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "personId" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid xgetPersonId() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Sets the "personId" attribute
     */
    @Override
    public void setPersonId(java.lang.String personId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setStringValue(personId);
        }
    }

    /**
     * Sets (as xml) the "personId" attribute
     */
    @Override
    public void xsetPersonId(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid personId) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(personId);
        }
    }

    /**
     * Gets the "id" attribute
     */
    @Override
    public java.lang.String getId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Sets the "id" attribute
     */
    @Override
    public void setId(java.lang.String id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid id) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(id);
        }
    }

    /**
     * Gets the "parentId" attribute
     */
    @Override
    public java.lang.String getParentId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "parentId" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid xgetParentId() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "parentId" attribute
     */
    @Override
    public boolean isSetParentId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "parentId" attribute
     */
    @Override
    public void setParentId(java.lang.String parentId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setStringValue(parentId);
        }
    }

    /**
     * Sets (as xml) the "parentId" attribute
     */
    @Override
    public void xsetParentId(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid parentId) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(parentId);
        }
    }

    /**
     * Unsets the "parentId" attribute
     */
    @Override
    public void unsetParentId() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "done" attribute
     */
    @Override
    public boolean getDone() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "done" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetDone() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "done" attribute
     */
    @Override
    public boolean isSetDone() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "done" attribute
     */
    @Override
    public void setDone(boolean done) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setBooleanValue(done);
        }
    }

    /**
     * Sets (as xml) the "done" attribute
     */
    @Override
    public void xsetDone(org.apache.xmlbeans.XmlBoolean done) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(done);
        }
    }

    /**
     * Unsets the "done" attribute
     */
    @Override
    public void unsetDone() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }
}

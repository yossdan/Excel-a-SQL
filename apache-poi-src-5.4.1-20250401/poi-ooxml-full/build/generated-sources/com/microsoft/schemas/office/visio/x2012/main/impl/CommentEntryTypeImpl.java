/*
 * XML Type:  CommentEntry_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.CommentEntryType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CommentEntry_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.visio.x2012.main.CommentEntryType.
 */
public class CommentEntryTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.microsoft.schemas.office.visio.x2012.main.CommentEntryType {
    private static final long serialVersionUID = 1L;

    public CommentEntryTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, true);
    }

    protected CommentEntryTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "AuthorID"),
        new QName("", "PageID"),
        new QName("", "ShapeID"),
        new QName("", "Date"),
        new QName("", "EditDate"),
        new QName("", "Done"),
        new QName("", "CommentID"),
        new QName("", "AutoCommentType"),
    };


    /**
     * Gets the "AuthorID" attribute
     */
    @Override
    public long getAuthorID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "AuthorID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetAuthorID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "AuthorID" attribute
     */
    @Override
    public void setAuthorID(long authorID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setLongValue(authorID);
        }
    }

    /**
     * Sets (as xml) the "AuthorID" attribute
     */
    @Override
    public void xsetAuthorID(org.apache.xmlbeans.XmlUnsignedInt authorID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(authorID);
        }
    }

    /**
     * Gets the "PageID" attribute
     */
    @Override
    public long getPageID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "PageID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetPageID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "PageID" attribute
     */
    @Override
    public void setPageID(long pageID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setLongValue(pageID);
        }
    }

    /**
     * Sets (as xml) the "PageID" attribute
     */
    @Override
    public void xsetPageID(org.apache.xmlbeans.XmlUnsignedInt pageID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(pageID);
        }
    }

    /**
     * Gets the "ShapeID" attribute
     */
    @Override
    public long getShapeID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "ShapeID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetShapeID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "ShapeID" attribute
     */
    @Override
    public boolean isSetShapeID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "ShapeID" attribute
     */
    @Override
    public void setShapeID(long shapeID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setLongValue(shapeID);
        }
    }

    /**
     * Sets (as xml) the "ShapeID" attribute
     */
    @Override
    public void xsetShapeID(org.apache.xmlbeans.XmlUnsignedInt shapeID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(shapeID);
        }
    }

    /**
     * Unsets the "ShapeID" attribute
     */
    @Override
    public void unsetShapeID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "Date" attribute
     */
    @Override
    public java.util.Calendar getDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "Date" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Sets the "Date" attribute
     */
    @Override
    public void setDate(java.util.Calendar date) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setCalendarValue(date);
        }
    }

    /**
     * Sets (as xml) the "Date" attribute
     */
    @Override
    public void xsetDate(org.apache.xmlbeans.XmlDateTime date) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(date);
        }
    }

    /**
     * Gets the "EditDate" attribute
     */
    @Override
    public java.util.Calendar getEditDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "EditDate" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetEditDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "EditDate" attribute
     */
    @Override
    public boolean isSetEditDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "EditDate" attribute
     */
    @Override
    public void setEditDate(java.util.Calendar editDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setCalendarValue(editDate);
        }
    }

    /**
     * Sets (as xml) the "EditDate" attribute
     */
    @Override
    public void xsetEditDate(org.apache.xmlbeans.XmlDateTime editDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(editDate);
        }
    }

    /**
     * Unsets the "EditDate" attribute
     */
    @Override
    public void unsetEditDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "Done" attribute
     */
    @Override
    public boolean getDone() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "Done" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetDone() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "Done" attribute
     */
    @Override
    public boolean isSetDone() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "Done" attribute
     */
    @Override
    public void setDone(boolean done) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setBooleanValue(done);
        }
    }

    /**
     * Sets (as xml) the "Done" attribute
     */
    @Override
    public void xsetDone(org.apache.xmlbeans.XmlBoolean done) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(done);
        }
    }

    /**
     * Unsets the "Done" attribute
     */
    @Override
    public void unsetDone() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "CommentID" attribute
     */
    @Override
    public long getCommentID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "CommentID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetCommentID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Sets the "CommentID" attribute
     */
    @Override
    public void setCommentID(long commentID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setLongValue(commentID);
        }
    }

    /**
     * Sets (as xml) the "CommentID" attribute
     */
    @Override
    public void xsetCommentID(org.apache.xmlbeans.XmlUnsignedInt commentID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(commentID);
        }
    }

    /**
     * Gets the "AutoCommentType" attribute
     */
    @Override
    public long getAutoCommentType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "AutoCommentType" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetAutoCommentType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "AutoCommentType" attribute
     */
    @Override
    public boolean isSetAutoCommentType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "AutoCommentType" attribute
     */
    @Override
    public void setAutoCommentType(long autoCommentType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setLongValue(autoCommentType);
        }
    }

    /**
     * Sets (as xml) the "AutoCommentType" attribute
     */
    @Override
    public void xsetAutoCommentType(org.apache.xmlbeans.XmlUnsignedInt autoCommentType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(autoCommentType);
        }
    }

    /**
     * Unsets the "AutoCommentType" attribute
     */
    @Override
    public void unsetAutoCommentType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }
}

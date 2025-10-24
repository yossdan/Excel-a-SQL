/*
 * XML Type:  RowMap_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.RowMapType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML RowMap_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class RowMapTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.RowMapType {
    private static final long serialVersionUID = 1L;

    public RowMapTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "RowID"),
        new QName("", "PageID"),
        new QName("", "ShapeID"),
    };


    /**
     * Gets the "RowID" attribute
     */
    @Override
    public long getRowID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "RowID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetRowID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "RowID" attribute
     */
    @Override
    public void setRowID(long rowID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setLongValue(rowID);
        }
    }

    /**
     * Sets (as xml) the "RowID" attribute
     */
    @Override
    public void xsetRowID(org.apache.xmlbeans.XmlUnsignedInt rowID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(rowID);
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
}

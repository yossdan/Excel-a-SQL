/*
 * XML Type:  CT_DataModelExtBlock
 * Namespace: http://schemas.microsoft.com/office/drawing/2008/diagram
 * Java type: com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2008.diagram.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_DataModelExtBlock(@http://schemas.microsoft.com/office/drawing/2008/diagram).
 *
 * This is a complex type.
 */
public class CTDataModelExtBlockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock {
    private static final long serialVersionUID = 1L;

    public CTDataModelExtBlockImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "relId"),
        new QName("", "minVer"),
    };


    /**
     * Gets the "relId" attribute
     */
    @Override
    public java.lang.String getRelId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "relId" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetRelId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "relId" attribute
     */
    @Override
    public boolean isSetRelId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "relId" attribute
     */
    @Override
    public void setRelId(java.lang.String relId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(relId);
        }
    }

    /**
     * Sets (as xml) the "relId" attribute
     */
    @Override
    public void xsetRelId(org.apache.xmlbeans.XmlString relId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(relId);
        }
    }

    /**
     * Unsets the "relId" attribute
     */
    @Override
    public void unsetRelId() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "minVer" attribute
     */
    @Override
    public java.lang.String getMinVer() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "minVer" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetMinVer() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "minVer" attribute
     */
    @Override
    public boolean isSetMinVer() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "minVer" attribute
     */
    @Override
    public void setMinVer(java.lang.String minVer) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(minVer);
        }
    }

    /**
     * Sets (as xml) the "minVer" attribute
     */
    @Override
    public void xsetMinVer(org.apache.xmlbeans.XmlAnyURI minVer) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(minVer);
        }
    }

    /**
     * Unsets the "minVer" attribute
     */
    @Override
    public void unsetMinVer() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}

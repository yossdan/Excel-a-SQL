/*
 * An XML attribute type.
 * Localname: targetscreensize
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.TargetscreensizeAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one targetscreensize(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class TargetscreensizeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.TargetscreensizeAttribute {
    private static final long serialVersionUID = 1L;

    public TargetscreensizeAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "targetscreensize"),
    };


    /**
     * Gets the "targetscreensize" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STScreenSize.Enum getTargetscreensize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STScreenSize.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "targetscreensize" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STScreenSize xgetTargetscreensize() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STScreenSize target = null;
            target = (com.microsoft.schemas.office.office.STScreenSize)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "targetscreensize" attribute
     */
    @Override
    public boolean isSetTargetscreensize() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "targetscreensize" attribute
     */
    @Override
    public void setTargetscreensize(com.microsoft.schemas.office.office.STScreenSize.Enum targetscreensize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(targetscreensize);
        }
    }

    /**
     * Sets (as xml) the "targetscreensize" attribute
     */
    @Override
    public void xsetTargetscreensize(com.microsoft.schemas.office.office.STScreenSize targetscreensize) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STScreenSize target = null;
            target = (com.microsoft.schemas.office.office.STScreenSize)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STScreenSize)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(targetscreensize);
        }
    }

    /**
     * Unsets the "targetscreensize" attribute
     */
    @Override
    public void unsetTargetscreensize() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}

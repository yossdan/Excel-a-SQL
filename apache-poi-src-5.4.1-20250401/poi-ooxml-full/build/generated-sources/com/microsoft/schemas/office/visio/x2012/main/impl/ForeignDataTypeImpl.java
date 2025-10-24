/*
 * XML Type:  ForeignData_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ForeignDataType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ForeignData_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class ForeignDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.ForeignDataType {
    private static final long serialVersionUID = 1L;

    public ForeignDataTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Rel"),
        new QName("", "ForeignType"),
        new QName("", "ObjectType"),
        new QName("", "ShowAsIcon"),
        new QName("", "ObjectWidth"),
        new QName("", "ObjectHeight"),
        new QName("", "MappingMode"),
        new QName("", "ExtentX"),
        new QName("", "ExtentY"),
        new QName("", "CompressionType"),
        new QName("", "CompressionLevel"),
    };


    /**
     * Gets the "Rel" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RelType getRel() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RelType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RelType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Rel" element
     */
    @Override
    public void setRel(com.microsoft.schemas.office.visio.x2012.main.RelType rel) {
        generatedSetterHelperImpl(rel, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Rel" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RelType addNewRel() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RelType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RelType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "ForeignType" attribute
     */
    @Override
    public java.lang.String getForeignType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ForeignType" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlToken xgetForeignType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "ForeignType" attribute
     */
    @Override
    public void setForeignType(java.lang.String foreignType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(foreignType);
        }
    }

    /**
     * Sets (as xml) the "ForeignType" attribute
     */
    @Override
    public void xsetForeignType(org.apache.xmlbeans.XmlToken foreignType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(foreignType);
        }
    }

    /**
     * Gets the "ObjectType" attribute
     */
    @Override
    public long getObjectType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "ObjectType" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetObjectType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "ObjectType" attribute
     */
    @Override
    public boolean isSetObjectType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "ObjectType" attribute
     */
    @Override
    public void setObjectType(long objectType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setLongValue(objectType);
        }
    }

    /**
     * Sets (as xml) the "ObjectType" attribute
     */
    @Override
    public void xsetObjectType(org.apache.xmlbeans.XmlUnsignedInt objectType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(objectType);
        }
    }

    /**
     * Unsets the "ObjectType" attribute
     */
    @Override
    public void unsetObjectType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "ShowAsIcon" attribute
     */
    @Override
    public boolean getShowAsIcon() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "ShowAsIcon" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetShowAsIcon() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "ShowAsIcon" attribute
     */
    @Override
    public boolean isSetShowAsIcon() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "ShowAsIcon" attribute
     */
    @Override
    public void setShowAsIcon(boolean showAsIcon) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setBooleanValue(showAsIcon);
        }
    }

    /**
     * Sets (as xml) the "ShowAsIcon" attribute
     */
    @Override
    public void xsetShowAsIcon(org.apache.xmlbeans.XmlBoolean showAsIcon) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(showAsIcon);
        }
    }

    /**
     * Unsets the "ShowAsIcon" attribute
     */
    @Override
    public void unsetShowAsIcon() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "ObjectWidth" attribute
     */
    @Override
    public double getObjectWidth() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "ObjectWidth" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDouble xgetObjectWidth() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "ObjectWidth" attribute
     */
    @Override
    public boolean isSetObjectWidth() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "ObjectWidth" attribute
     */
    @Override
    public void setObjectWidth(double objectWidth) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setDoubleValue(objectWidth);
        }
    }

    /**
     * Sets (as xml) the "ObjectWidth" attribute
     */
    @Override
    public void xsetObjectWidth(org.apache.xmlbeans.XmlDouble objectWidth) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(objectWidth);
        }
    }

    /**
     * Unsets the "ObjectWidth" attribute
     */
    @Override
    public void unsetObjectWidth() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "ObjectHeight" attribute
     */
    @Override
    public double getObjectHeight() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "ObjectHeight" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDouble xgetObjectHeight() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "ObjectHeight" attribute
     */
    @Override
    public boolean isSetObjectHeight() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "ObjectHeight" attribute
     */
    @Override
    public void setObjectHeight(double objectHeight) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setDoubleValue(objectHeight);
        }
    }

    /**
     * Sets (as xml) the "ObjectHeight" attribute
     */
    @Override
    public void xsetObjectHeight(org.apache.xmlbeans.XmlDouble objectHeight) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(objectHeight);
        }
    }

    /**
     * Unsets the "ObjectHeight" attribute
     */
    @Override
    public void unsetObjectHeight() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "MappingMode" attribute
     */
    @Override
    public int getMappingMode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "MappingMode" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedShort xgetMappingMode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "MappingMode" attribute
     */
    @Override
    public boolean isSetMappingMode() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "MappingMode" attribute
     */
    @Override
    public void setMappingMode(int mappingMode) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setIntValue(mappingMode);
        }
    }

    /**
     * Sets (as xml) the "MappingMode" attribute
     */
    @Override
    public void xsetMappingMode(org.apache.xmlbeans.XmlUnsignedShort mappingMode) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(mappingMode);
        }
    }

    /**
     * Unsets the "MappingMode" attribute
     */
    @Override
    public void unsetMappingMode() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "ExtentX" attribute
     */
    @Override
    public double getExtentX() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "ExtentX" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDouble xgetExtentX() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "ExtentX" attribute
     */
    @Override
    public boolean isSetExtentX() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "ExtentX" attribute
     */
    @Override
    public void setExtentX(double extentX) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setDoubleValue(extentX);
        }
    }

    /**
     * Sets (as xml) the "ExtentX" attribute
     */
    @Override
    public void xsetExtentX(org.apache.xmlbeans.XmlDouble extentX) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(extentX);
        }
    }

    /**
     * Unsets the "ExtentX" attribute
     */
    @Override
    public void unsetExtentX() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "ExtentY" attribute
     */
    @Override
    public double getExtentY() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "ExtentY" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDouble xgetExtentY() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "ExtentY" attribute
     */
    @Override
    public boolean isSetExtentY() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "ExtentY" attribute
     */
    @Override
    public void setExtentY(double extentY) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setDoubleValue(extentY);
        }
    }

    /**
     * Sets (as xml) the "ExtentY" attribute
     */
    @Override
    public void xsetExtentY(org.apache.xmlbeans.XmlDouble extentY) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(extentY);
        }
    }

    /**
     * Unsets the "ExtentY" attribute
     */
    @Override
    public void unsetExtentY() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "CompressionType" attribute
     */
    @Override
    public java.lang.String getCompressionType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "CompressionType" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlToken xgetCompressionType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "CompressionType" attribute
     */
    @Override
    public boolean isSetCompressionType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "CompressionType" attribute
     */
    @Override
    public void setCompressionType(java.lang.String compressionType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setStringValue(compressionType);
        }
    }

    /**
     * Sets (as xml) the "CompressionType" attribute
     */
    @Override
    public void xsetCompressionType(org.apache.xmlbeans.XmlToken compressionType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(compressionType);
        }
    }

    /**
     * Unsets the "CompressionType" attribute
     */
    @Override
    public void unsetCompressionType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "CompressionLevel" attribute
     */
    @Override
    public double getCompressionLevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "CompressionLevel" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDouble xgetCompressionLevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * True if has "CompressionLevel" attribute
     */
    @Override
    public boolean isSetCompressionLevel() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "CompressionLevel" attribute
     */
    @Override
    public void setCompressionLevel(double compressionLevel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setDoubleValue(compressionLevel);
        }
    }

    /**
     * Sets (as xml) the "CompressionLevel" attribute
     */
    @Override
    public void xsetCompressionLevel(org.apache.xmlbeans.XmlDouble compressionLevel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(compressionLevel);
        }
    }

    /**
     * Unsets the "CompressionLevel" attribute
     */
    @Override
    public void unsetCompressionLevel() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }
}

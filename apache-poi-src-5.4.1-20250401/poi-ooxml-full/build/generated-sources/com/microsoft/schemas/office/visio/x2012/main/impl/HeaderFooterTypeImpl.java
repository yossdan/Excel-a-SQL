/*
 * XML Type:  HeaderFooter_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML HeaderFooter_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class HeaderFooterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType {
    private static final long serialVersionUID = 1L;

    public HeaderFooterTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "HeaderMargin"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "FooterMargin"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "HeaderLeft"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "HeaderCenter"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "HeaderRight"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "FooterLeft"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "FooterCenter"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "FooterRight"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "HeaderFooterFont"),
        new QName("", "HeaderFooterColor"),
    };


    /**
     * Gets the "HeaderMargin" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.HeaderMarginType getHeaderMargin() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.HeaderMarginType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.HeaderMarginType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "HeaderMargin" element
     */
    @Override
    public boolean isSetHeaderMargin() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "HeaderMargin" element
     */
    @Override
    public void setHeaderMargin(com.microsoft.schemas.office.visio.x2012.main.HeaderMarginType headerMargin) {
        generatedSetterHelperImpl(headerMargin, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "HeaderMargin" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.HeaderMarginType addNewHeaderMargin() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.HeaderMarginType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.HeaderMarginType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "HeaderMargin" element
     */
    @Override
    public void unsetHeaderMargin() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "FooterMargin" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FooterMarginType getFooterMargin() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FooterMarginType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FooterMarginType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "FooterMargin" element
     */
    @Override
    public boolean isSetFooterMargin() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "FooterMargin" element
     */
    @Override
    public void setFooterMargin(com.microsoft.schemas.office.visio.x2012.main.FooterMarginType footerMargin) {
        generatedSetterHelperImpl(footerMargin, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "FooterMargin" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FooterMarginType addNewFooterMargin() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FooterMarginType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FooterMarginType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "FooterMargin" element
     */
    @Override
    public void unsetFooterMargin() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "HeaderLeft" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.HeaderLeftType getHeaderLeft() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.HeaderLeftType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.HeaderLeftType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "HeaderLeft" element
     */
    @Override
    public boolean isSetHeaderLeft() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "HeaderLeft" element
     */
    @Override
    public void setHeaderLeft(com.microsoft.schemas.office.visio.x2012.main.HeaderLeftType headerLeft) {
        generatedSetterHelperImpl(headerLeft, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "HeaderLeft" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.HeaderLeftType addNewHeaderLeft() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.HeaderLeftType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.HeaderLeftType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "HeaderLeft" element
     */
    @Override
    public void unsetHeaderLeft() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "HeaderCenter" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.HeaderCenterType getHeaderCenter() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.HeaderCenterType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.HeaderCenterType)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "HeaderCenter" element
     */
    @Override
    public boolean isSetHeaderCenter() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "HeaderCenter" element
     */
    @Override
    public void setHeaderCenter(com.microsoft.schemas.office.visio.x2012.main.HeaderCenterType headerCenter) {
        generatedSetterHelperImpl(headerCenter, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "HeaderCenter" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.HeaderCenterType addNewHeaderCenter() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.HeaderCenterType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.HeaderCenterType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "HeaderCenter" element
     */
    @Override
    public void unsetHeaderCenter() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "HeaderRight" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.HeaderRightType getHeaderRight() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.HeaderRightType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.HeaderRightType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "HeaderRight" element
     */
    @Override
    public boolean isSetHeaderRight() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "HeaderRight" element
     */
    @Override
    public void setHeaderRight(com.microsoft.schemas.office.visio.x2012.main.HeaderRightType headerRight) {
        generatedSetterHelperImpl(headerRight, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "HeaderRight" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.HeaderRightType addNewHeaderRight() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.HeaderRightType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.HeaderRightType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "HeaderRight" element
     */
    @Override
    public void unsetHeaderRight() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "FooterLeft" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FooterLeftType getFooterLeft() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FooterLeftType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FooterLeftType)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "FooterLeft" element
     */
    @Override
    public boolean isSetFooterLeft() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "FooterLeft" element
     */
    @Override
    public void setFooterLeft(com.microsoft.schemas.office.visio.x2012.main.FooterLeftType footerLeft) {
        generatedSetterHelperImpl(footerLeft, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "FooterLeft" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FooterLeftType addNewFooterLeft() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FooterLeftType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FooterLeftType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "FooterLeft" element
     */
    @Override
    public void unsetFooterLeft() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "FooterCenter" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FooterCenterType getFooterCenter() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FooterCenterType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FooterCenterType)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "FooterCenter" element
     */
    @Override
    public boolean isSetFooterCenter() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "FooterCenter" element
     */
    @Override
    public void setFooterCenter(com.microsoft.schemas.office.visio.x2012.main.FooterCenterType footerCenter) {
        generatedSetterHelperImpl(footerCenter, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "FooterCenter" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FooterCenterType addNewFooterCenter() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FooterCenterType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FooterCenterType)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "FooterCenter" element
     */
    @Override
    public void unsetFooterCenter() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "FooterRight" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FooterRightType getFooterRight() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FooterRightType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FooterRightType)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "FooterRight" element
     */
    @Override
    public boolean isSetFooterRight() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "FooterRight" element
     */
    @Override
    public void setFooterRight(com.microsoft.schemas.office.visio.x2012.main.FooterRightType footerRight) {
        generatedSetterHelperImpl(footerRight, PROPERTY_QNAME[7], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "FooterRight" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FooterRightType addNewFooterRight() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FooterRightType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FooterRightType)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Unsets the "FooterRight" element
     */
    @Override
    public void unsetFooterRight() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "HeaderFooterFont" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.HeaderFooterFontType getHeaderFooterFont() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.HeaderFooterFontType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.HeaderFooterFontType)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "HeaderFooterFont" element
     */
    @Override
    public boolean isSetHeaderFooterFont() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "HeaderFooterFont" element
     */
    @Override
    public void setHeaderFooterFont(com.microsoft.schemas.office.visio.x2012.main.HeaderFooterFontType headerFooterFont) {
        generatedSetterHelperImpl(headerFooterFont, PROPERTY_QNAME[8], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "HeaderFooterFont" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.HeaderFooterFontType addNewHeaderFooterFont() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.HeaderFooterFontType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.HeaderFooterFontType)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Unsets the "HeaderFooterFont" element
     */
    @Override
    public void unsetHeaderFooterFont() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "HeaderFooterColor" attribute
     */
    @Override
    public java.lang.String getHeaderFooterColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "HeaderFooterColor" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetHeaderFooterColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "HeaderFooterColor" attribute
     */
    @Override
    public boolean isSetHeaderFooterColor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "HeaderFooterColor" attribute
     */
    @Override
    public void setHeaderFooterColor(java.lang.String headerFooterColor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setStringValue(headerFooterColor);
        }
    }

    /**
     * Sets (as xml) the "HeaderFooterColor" attribute
     */
    @Override
    public void xsetHeaderFooterColor(org.apache.xmlbeans.XmlString headerFooterColor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(headerFooterColor);
        }
    }

    /**
     * Unsets the "HeaderFooterColor" attribute
     */
    @Override
    public void unsetHeaderFooterColor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }
}

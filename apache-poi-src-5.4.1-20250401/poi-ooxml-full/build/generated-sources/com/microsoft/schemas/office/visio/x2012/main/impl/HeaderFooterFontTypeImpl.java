/*
 * XML Type:  HeaderFooterFont_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.HeaderFooterFontType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML HeaderFooterFont_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class HeaderFooterFontTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.HeaderFooterFontType {
    private static final long serialVersionUID = 1L;

    public HeaderFooterFontTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "Height"),
        new QName("", "Width"),
        new QName("", "Escapement"),
        new QName("", "Orientation"),
        new QName("", "Weight"),
        new QName("", "Italic"),
        new QName("", "Underline"),
        new QName("", "StrikeOut"),
        new QName("", "CharSet"),
        new QName("", "OutPrecision"),
        new QName("", "ClipPrecision"),
        new QName("", "Quality"),
        new QName("", "PitchAndFamily"),
        new QName("", "FaceName"),
    };


    /**
     * Gets the "Height" attribute
     */
    @Override
    public int getHeight() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "Height" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInt xgetHeight() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "Height" attribute
     */
    @Override
    public boolean isSetHeight() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "Height" attribute
     */
    @Override
    public void setHeight(int height) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setIntValue(height);
        }
    }

    /**
     * Sets (as xml) the "Height" attribute
     */
    @Override
    public void xsetHeight(org.apache.xmlbeans.XmlInt height) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(height);
        }
    }

    /**
     * Unsets the "Height" attribute
     */
    @Override
    public void unsetHeight() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "Width" attribute
     */
    @Override
    public int getWidth() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "Width" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInt xgetWidth() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "Width" attribute
     */
    @Override
    public boolean isSetWidth() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "Width" attribute
     */
    @Override
    public void setWidth(int width) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setIntValue(width);
        }
    }

    /**
     * Sets (as xml) the "Width" attribute
     */
    @Override
    public void xsetWidth(org.apache.xmlbeans.XmlInt width) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(width);
        }
    }

    /**
     * Unsets the "Width" attribute
     */
    @Override
    public void unsetWidth() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "Escapement" attribute
     */
    @Override
    public int getEscapement() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "Escapement" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInt xgetEscapement() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "Escapement" attribute
     */
    @Override
    public boolean isSetEscapement() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "Escapement" attribute
     */
    @Override
    public void setEscapement(int escapement) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setIntValue(escapement);
        }
    }

    /**
     * Sets (as xml) the "Escapement" attribute
     */
    @Override
    public void xsetEscapement(org.apache.xmlbeans.XmlInt escapement) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(escapement);
        }
    }

    /**
     * Unsets the "Escapement" attribute
     */
    @Override
    public void unsetEscapement() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "Orientation" attribute
     */
    @Override
    public int getOrientation() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "Orientation" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInt xgetOrientation() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "Orientation" attribute
     */
    @Override
    public boolean isSetOrientation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "Orientation" attribute
     */
    @Override
    public void setOrientation(int orientation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setIntValue(orientation);
        }
    }

    /**
     * Sets (as xml) the "Orientation" attribute
     */
    @Override
    public void xsetOrientation(org.apache.xmlbeans.XmlInt orientation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(orientation);
        }
    }

    /**
     * Unsets the "Orientation" attribute
     */
    @Override
    public void unsetOrientation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "Weight" attribute
     */
    @Override
    public int getWeight() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "Weight" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInt xgetWeight() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "Weight" attribute
     */
    @Override
    public boolean isSetWeight() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "Weight" attribute
     */
    @Override
    public void setWeight(int weight) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setIntValue(weight);
        }
    }

    /**
     * Sets (as xml) the "Weight" attribute
     */
    @Override
    public void xsetWeight(org.apache.xmlbeans.XmlInt weight) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(weight);
        }
    }

    /**
     * Unsets the "Weight" attribute
     */
    @Override
    public void unsetWeight() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "Italic" attribute
     */
    @Override
    public short getItalic() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? 0 : target.getShortValue();
        }
    }

    /**
     * Gets (as xml) the "Italic" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedByte xgetItalic() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "Italic" attribute
     */
    @Override
    public boolean isSetItalic() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "Italic" attribute
     */
    @Override
    public void setItalic(short italic) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setShortValue(italic);
        }
    }

    /**
     * Sets (as xml) the "Italic" attribute
     */
    @Override
    public void xsetItalic(org.apache.xmlbeans.XmlUnsignedByte italic) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(italic);
        }
    }

    /**
     * Unsets the "Italic" attribute
     */
    @Override
    public void unsetItalic() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "Underline" attribute
     */
    @Override
    public short getUnderline() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? 0 : target.getShortValue();
        }
    }

    /**
     * Gets (as xml) the "Underline" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedByte xgetUnderline() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "Underline" attribute
     */
    @Override
    public boolean isSetUnderline() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "Underline" attribute
     */
    @Override
    public void setUnderline(short underline) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setShortValue(underline);
        }
    }

    /**
     * Sets (as xml) the "Underline" attribute
     */
    @Override
    public void xsetUnderline(org.apache.xmlbeans.XmlUnsignedByte underline) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(underline);
        }
    }

    /**
     * Unsets the "Underline" attribute
     */
    @Override
    public void unsetUnderline() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "StrikeOut" attribute
     */
    @Override
    public short getStrikeOut() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? 0 : target.getShortValue();
        }
    }

    /**
     * Gets (as xml) the "StrikeOut" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedByte xgetStrikeOut() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "StrikeOut" attribute
     */
    @Override
    public boolean isSetStrikeOut() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "StrikeOut" attribute
     */
    @Override
    public void setStrikeOut(short strikeOut) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setShortValue(strikeOut);
        }
    }

    /**
     * Sets (as xml) the "StrikeOut" attribute
     */
    @Override
    public void xsetStrikeOut(org.apache.xmlbeans.XmlUnsignedByte strikeOut) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(strikeOut);
        }
    }

    /**
     * Unsets the "StrikeOut" attribute
     */
    @Override
    public void unsetStrikeOut() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "CharSet" attribute
     */
    @Override
    public short getCharSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? 0 : target.getShortValue();
        }
    }

    /**
     * Gets (as xml) the "CharSet" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedByte xgetCharSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "CharSet" attribute
     */
    @Override
    public boolean isSetCharSet() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "CharSet" attribute
     */
    @Override
    public void setCharSet(short charSet) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setShortValue(charSet);
        }
    }

    /**
     * Sets (as xml) the "CharSet" attribute
     */
    @Override
    public void xsetCharSet(org.apache.xmlbeans.XmlUnsignedByte charSet) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(charSet);
        }
    }

    /**
     * Unsets the "CharSet" attribute
     */
    @Override
    public void unsetCharSet() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "OutPrecision" attribute
     */
    @Override
    public short getOutPrecision() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? 0 : target.getShortValue();
        }
    }

    /**
     * Gets (as xml) the "OutPrecision" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedByte xgetOutPrecision() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "OutPrecision" attribute
     */
    @Override
    public boolean isSetOutPrecision() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "OutPrecision" attribute
     */
    @Override
    public void setOutPrecision(short outPrecision) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setShortValue(outPrecision);
        }
    }

    /**
     * Sets (as xml) the "OutPrecision" attribute
     */
    @Override
    public void xsetOutPrecision(org.apache.xmlbeans.XmlUnsignedByte outPrecision) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(outPrecision);
        }
    }

    /**
     * Unsets the "OutPrecision" attribute
     */
    @Override
    public void unsetOutPrecision() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "ClipPrecision" attribute
     */
    @Override
    public short getClipPrecision() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return (target == null) ? 0 : target.getShortValue();
        }
    }

    /**
     * Gets (as xml) the "ClipPrecision" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedByte xgetClipPrecision() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * True if has "ClipPrecision" attribute
     */
    @Override
    public boolean isSetClipPrecision() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "ClipPrecision" attribute
     */
    @Override
    public void setClipPrecision(short clipPrecision) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setShortValue(clipPrecision);
        }
    }

    /**
     * Sets (as xml) the "ClipPrecision" attribute
     */
    @Override
    public void xsetClipPrecision(org.apache.xmlbeans.XmlUnsignedByte clipPrecision) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(clipPrecision);
        }
    }

    /**
     * Unsets the "ClipPrecision" attribute
     */
    @Override
    public void unsetClipPrecision() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "Quality" attribute
     */
    @Override
    public short getQuality() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return (target == null) ? 0 : target.getShortValue();
        }
    }

    /**
     * Gets (as xml) the "Quality" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedByte xgetQuality() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * True if has "Quality" attribute
     */
    @Override
    public boolean isSetQuality() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "Quality" attribute
     */
    @Override
    public void setQuality(short quality) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setShortValue(quality);
        }
    }

    /**
     * Sets (as xml) the "Quality" attribute
     */
    @Override
    public void xsetQuality(org.apache.xmlbeans.XmlUnsignedByte quality) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.set(quality);
        }
    }

    /**
     * Unsets the "Quality" attribute
     */
    @Override
    public void unsetQuality() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Gets the "PitchAndFamily" attribute
     */
    @Override
    public short getPitchAndFamily() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? 0 : target.getShortValue();
        }
    }

    /**
     * Gets (as xml) the "PitchAndFamily" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedByte xgetPitchAndFamily() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "PitchAndFamily" attribute
     */
    @Override
    public boolean isSetPitchAndFamily() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "PitchAndFamily" attribute
     */
    @Override
    public void setPitchAndFamily(short pitchAndFamily) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setShortValue(pitchAndFamily);
        }
    }

    /**
     * Sets (as xml) the "PitchAndFamily" attribute
     */
    @Override
    public void xsetPitchAndFamily(org.apache.xmlbeans.XmlUnsignedByte pitchAndFamily) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(pitchAndFamily);
        }
    }

    /**
     * Unsets the "PitchAndFamily" attribute
     */
    @Override
    public void unsetPitchAndFamily() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "FaceName" attribute
     */
    @Override
    public java.lang.String getFaceName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "FaceName" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetFaceName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "FaceName" attribute
     */
    @Override
    public boolean isSetFaceName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "FaceName" attribute
     */
    @Override
    public void setFaceName(java.lang.String faceName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setStringValue(faceName);
        }
    }

    /**
     * Sets (as xml) the "FaceName" attribute
     */
    @Override
    public void xsetFaceName(org.apache.xmlbeans.XmlString faceName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(faceName);
        }
    }

    /**
     * Unsets the "FaceName" attribute
     */
    @Override
    public void unsetFaceName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }
}

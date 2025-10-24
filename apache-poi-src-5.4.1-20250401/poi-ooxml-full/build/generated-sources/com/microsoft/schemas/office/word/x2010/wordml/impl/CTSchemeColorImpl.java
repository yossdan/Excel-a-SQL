/*
 * XML Type:  CT_SchemeColor
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_SchemeColor(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public class CTSchemeColorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CTSchemeColor {
    private static final long serialVersionUID = 1L;

    public CTSchemeColorImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "tint"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "shade"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "alpha"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "hueMod"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "sat"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "satOff"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "satMod"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "lum"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "lumOff"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "lumMod"),
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "val"),
    };


    /**
     * Gets a List of "tint" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage> getTintList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTintArray,
                this::setTintArray,
                this::insertNewTint,
                this::removeTint,
                this::sizeOfTintArray
            );
        }
    }

    /**
     * Gets array of all "tint" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage[] getTintArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage[0]);
    }

    /**
     * Gets ith "tint" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage getTintArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "tint" element
     */
    @Override
    public int sizeOfTintArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "tint" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setTintArray(com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage[] tintArray) {
        check_orphaned();
        arraySetterHelper(tintArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "tint" element
     */
    @Override
    public void setTintArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage tint) {
        generatedSetterHelperImpl(tint, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "tint" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage insertNewTint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "tint" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage addNewTint() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "tint" element
     */
    @Override
    public void removeTint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "shade" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage> getShadeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getShadeArray,
                this::setShadeArray,
                this::insertNewShade,
                this::removeShade,
                this::sizeOfShadeArray
            );
        }
    }

    /**
     * Gets array of all "shade" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage[] getShadeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage[0]);
    }

    /**
     * Gets ith "shade" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage getShadeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "shade" element
     */
    @Override
    public int sizeOfShadeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "shade" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setShadeArray(com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage[] shadeArray) {
        check_orphaned();
        arraySetterHelper(shadeArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "shade" element
     */
    @Override
    public void setShadeArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage shade) {
        generatedSetterHelperImpl(shade, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "shade" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage insertNewShade(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "shade" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage addNewShade() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "shade" element
     */
    @Override
    public void removeShade(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "alpha" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage> getAlphaList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAlphaArray,
                this::setAlphaArray,
                this::insertNewAlpha,
                this::removeAlpha,
                this::sizeOfAlphaArray
            );
        }
    }

    /**
     * Gets array of all "alpha" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage[] getAlphaArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage[0]);
    }

    /**
     * Gets ith "alpha" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage getAlphaArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "alpha" element
     */
    @Override
    public int sizeOfAlphaArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "alpha" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAlphaArray(com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage[] alphaArray) {
        check_orphaned();
        arraySetterHelper(alphaArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "alpha" element
     */
    @Override
    public void setAlphaArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage alpha) {
        generatedSetterHelperImpl(alpha, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "alpha" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage insertNewAlpha(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "alpha" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage addNewAlpha() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "alpha" element
     */
    @Override
    public void removeAlpha(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "hueMod" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage> getHueModList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getHueModArray,
                this::setHueModArray,
                this::insertNewHueMod,
                this::removeHueMod,
                this::sizeOfHueModArray
            );
        }
    }

    /**
     * Gets array of all "hueMod" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage[] getHueModArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage[0]);
    }

    /**
     * Gets ith "hueMod" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage getHueModArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "hueMod" element
     */
    @Override
    public int sizeOfHueModArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "hueMod" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setHueModArray(com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage[] hueModArray) {
        check_orphaned();
        arraySetterHelper(hueModArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "hueMod" element
     */
    @Override
    public void setHueModArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage hueMod) {
        generatedSetterHelperImpl(hueMod, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "hueMod" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage insertNewHueMod(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "hueMod" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage addNewHueMod() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPositivePercentage)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "hueMod" element
     */
    @Override
    public void removeHueMod(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "sat" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTPercentage> getSatList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSatArray,
                this::setSatArray,
                this::insertNewSat,
                this::removeSat,
                this::sizeOfSatArray
            );
        }
    }

    /**
     * Gets array of all "sat" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[] getSatArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[0]);
    }

    /**
     * Gets ith "sat" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage getSatArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "sat" element
     */
    @Override
    public int sizeOfSatArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "sat" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSatArray(com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[] satArray) {
        check_orphaned();
        arraySetterHelper(satArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "sat" element
     */
    @Override
    public void setSatArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTPercentage sat) {
        generatedSetterHelperImpl(sat, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "sat" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage insertNewSat(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "sat" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage addNewSat() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "sat" element
     */
    @Override
    public void removeSat(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "satOff" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTPercentage> getSatOffList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSatOffArray,
                this::setSatOffArray,
                this::insertNewSatOff,
                this::removeSatOff,
                this::sizeOfSatOffArray
            );
        }
    }

    /**
     * Gets array of all "satOff" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[] getSatOffArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[0]);
    }

    /**
     * Gets ith "satOff" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage getSatOffArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "satOff" element
     */
    @Override
    public int sizeOfSatOffArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "satOff" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSatOffArray(com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[] satOffArray) {
        check_orphaned();
        arraySetterHelper(satOffArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "satOff" element
     */
    @Override
    public void setSatOffArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTPercentage satOff) {
        generatedSetterHelperImpl(satOff, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "satOff" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage insertNewSatOff(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "satOff" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage addNewSatOff() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "satOff" element
     */
    @Override
    public void removeSatOff(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "satMod" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTPercentage> getSatModList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSatModArray,
                this::setSatModArray,
                this::insertNewSatMod,
                this::removeSatMod,
                this::sizeOfSatModArray
            );
        }
    }

    /**
     * Gets array of all "satMod" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[] getSatModArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[0]);
    }

    /**
     * Gets ith "satMod" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage getSatModArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "satMod" element
     */
    @Override
    public int sizeOfSatModArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "satMod" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSatModArray(com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[] satModArray) {
        check_orphaned();
        arraySetterHelper(satModArray, PROPERTY_QNAME[6]);
    }

    /**
     * Sets ith "satMod" element
     */
    @Override
    public void setSatModArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTPercentage satMod) {
        generatedSetterHelperImpl(satMod, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "satMod" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage insertNewSatMod(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "satMod" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage addNewSatMod() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "satMod" element
     */
    @Override
    public void removeSatMod(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets a List of "lum" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTPercentage> getLumList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLumArray,
                this::setLumArray,
                this::insertNewLum,
                this::removeLum,
                this::sizeOfLumArray
            );
        }
    }

    /**
     * Gets array of all "lum" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[] getLumArray() {
        return getXmlObjectArray(PROPERTY_QNAME[7], new com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[0]);
    }

    /**
     * Gets ith "lum" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage getLumArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "lum" element
     */
    @Override
    public int sizeOfLumArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets array of all "lum" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLumArray(com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[] lumArray) {
        check_orphaned();
        arraySetterHelper(lumArray, PROPERTY_QNAME[7]);
    }

    /**
     * Sets ith "lum" element
     */
    @Override
    public void setLumArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTPercentage lum) {
        generatedSetterHelperImpl(lum, PROPERTY_QNAME[7], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "lum" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage insertNewLum(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "lum" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage addNewLum() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Removes the ith "lum" element
     */
    @Override
    public void removeLum(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }

    /**
     * Gets a List of "lumOff" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTPercentage> getLumOffList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLumOffArray,
                this::setLumOffArray,
                this::insertNewLumOff,
                this::removeLumOff,
                this::sizeOfLumOffArray
            );
        }
    }

    /**
     * Gets array of all "lumOff" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[] getLumOffArray() {
        return getXmlObjectArray(PROPERTY_QNAME[8], new com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[0]);
    }

    /**
     * Gets ith "lumOff" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage getLumOffArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "lumOff" element
     */
    @Override
    public int sizeOfLumOffArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets array of all "lumOff" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLumOffArray(com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[] lumOffArray) {
        check_orphaned();
        arraySetterHelper(lumOffArray, PROPERTY_QNAME[8]);
    }

    /**
     * Sets ith "lumOff" element
     */
    @Override
    public void setLumOffArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTPercentage lumOff) {
        generatedSetterHelperImpl(lumOff, PROPERTY_QNAME[8], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "lumOff" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage insertNewLumOff(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "lumOff" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage addNewLumOff() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Removes the ith "lumOff" element
     */
    @Override
    public void removeLumOff(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], i);
        }
    }

    /**
     * Gets a List of "lumMod" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.x2010.wordml.CTPercentage> getLumModList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLumModArray,
                this::setLumModArray,
                this::insertNewLumMod,
                this::removeLumMod,
                this::sizeOfLumModArray
            );
        }
    }

    /**
     * Gets array of all "lumMod" elements
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[] getLumModArray() {
        return getXmlObjectArray(PROPERTY_QNAME[9], new com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[0]);
    }

    /**
     * Gets ith "lumMod" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage getLumModArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "lumMod" element
     */
    @Override
    public int sizeOfLumModArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets array of all "lumMod" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLumModArray(com.microsoft.schemas.office.word.x2010.wordml.CTPercentage[] lumModArray) {
        check_orphaned();
        arraySetterHelper(lumModArray, PROPERTY_QNAME[9]);
    }

    /**
     * Sets ith "lumMod" element
     */
    @Override
    public void setLumModArray(int i, com.microsoft.schemas.office.word.x2010.wordml.CTPercentage lumMod) {
        generatedSetterHelperImpl(lumMod, PROPERTY_QNAME[9], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "lumMod" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage insertNewLumMod(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().insert_element_user(PROPERTY_QNAME[9], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "lumMod" element
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.CTPercentage addNewLumMod() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.CTPercentage target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.CTPercentage)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Removes the ith "lumMod" element
     */
    @Override
    public void removeLumMod(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], i);
        }
    }

    /**
     * Gets the "val" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STSchemeColorVal.Enum getVal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.x2010.wordml.STSchemeColorVal.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "val" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.x2010.wordml.STSchemeColorVal xgetVal() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STSchemeColorVal target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STSchemeColorVal)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Sets the "val" attribute
     */
    @Override
    public void setVal(com.microsoft.schemas.office.word.x2010.wordml.STSchemeColorVal.Enum val) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setEnumValue(val);
        }
    }

    /**
     * Sets (as xml) the "val" attribute
     */
    @Override
    public void xsetVal(com.microsoft.schemas.office.word.x2010.wordml.STSchemeColorVal val) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.x2010.wordml.STSchemeColorVal target = null;
            target = (com.microsoft.schemas.office.word.x2010.wordml.STSchemeColorVal)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.x2010.wordml.STSchemeColorVal)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(val);
        }
    }
}

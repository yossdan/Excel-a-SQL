/*
 * XML Type:  CT_Callout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTCallout
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Callout(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTCallout extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTCallout> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcallouta029type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt.Enum getExt();

    /**
     * Gets (as xml) the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt xgetExt();

    /**
     * True if has "ext" attribute
     */
    boolean isSetExt();

    /**
     * Sets the "ext" attribute
     */
    void setExt(com.microsoft.schemas.vml.STExt.Enum ext);

    /**
     * Sets (as xml) the "ext" attribute
     */
    void xsetExt(com.microsoft.schemas.vml.STExt ext);

    /**
     * Unsets the "ext" attribute
     */
    void unsetExt();

    /**
     * Gets the "on" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getOn();

    /**
     * Gets (as xml) the "on" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetOn();

    /**
     * True if has "on" attribute
     */
    boolean isSetOn();

    /**
     * Sets the "on" attribute
     */
    void setOn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum on);

    /**
     * Sets (as xml) the "on" attribute
     */
    void xsetOn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse on);

    /**
     * Unsets the "on" attribute
     */
    void unsetOn();

    /**
     * Gets the "type" attribute
     */
    java.lang.String getType();

    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlString xgetType();

    /**
     * True if has "type" attribute
     */
    boolean isSetType();

    /**
     * Sets the "type" attribute
     */
    void setType(java.lang.String type);

    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlString type);

    /**
     * Unsets the "type" attribute
     */
    void unsetType();

    /**
     * Gets the "gap" attribute
     */
    java.lang.String getGap();

    /**
     * Gets (as xml) the "gap" attribute
     */
    org.apache.xmlbeans.XmlString xgetGap();

    /**
     * True if has "gap" attribute
     */
    boolean isSetGap();

    /**
     * Sets the "gap" attribute
     */
    void setGap(java.lang.String gap);

    /**
     * Sets (as xml) the "gap" attribute
     */
    void xsetGap(org.apache.xmlbeans.XmlString gap);

    /**
     * Unsets the "gap" attribute
     */
    void unsetGap();

    /**
     * Gets the "angle" attribute
     */
    com.microsoft.schemas.office.office.STAngle.Enum getAngle();

    /**
     * Gets (as xml) the "angle" attribute
     */
    com.microsoft.schemas.office.office.STAngle xgetAngle();

    /**
     * True if has "angle" attribute
     */
    boolean isSetAngle();

    /**
     * Sets the "angle" attribute
     */
    void setAngle(com.microsoft.schemas.office.office.STAngle.Enum angle);

    /**
     * Sets (as xml) the "angle" attribute
     */
    void xsetAngle(com.microsoft.schemas.office.office.STAngle angle);

    /**
     * Unsets the "angle" attribute
     */
    void unsetAngle();

    /**
     * Gets the "dropauto" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getDropauto();

    /**
     * Gets (as xml) the "dropauto" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetDropauto();

    /**
     * True if has "dropauto" attribute
     */
    boolean isSetDropauto();

    /**
     * Sets the "dropauto" attribute
     */
    void setDropauto(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum dropauto);

    /**
     * Sets (as xml) the "dropauto" attribute
     */
    void xsetDropauto(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse dropauto);

    /**
     * Unsets the "dropauto" attribute
     */
    void unsetDropauto();

    /**
     * Gets the "drop" attribute
     */
    java.lang.String getDrop();

    /**
     * Gets (as xml) the "drop" attribute
     */
    com.microsoft.schemas.office.office.STCalloutDrop xgetDrop();

    /**
     * True if has "drop" attribute
     */
    boolean isSetDrop();

    /**
     * Sets the "drop" attribute
     */
    void setDrop(java.lang.String drop);

    /**
     * Sets (as xml) the "drop" attribute
     */
    void xsetDrop(com.microsoft.schemas.office.office.STCalloutDrop drop);

    /**
     * Unsets the "drop" attribute
     */
    void unsetDrop();

    /**
     * Gets the "distance" attribute
     */
    java.lang.String getDistance();

    /**
     * Gets (as xml) the "distance" attribute
     */
    org.apache.xmlbeans.XmlString xgetDistance();

    /**
     * True if has "distance" attribute
     */
    boolean isSetDistance();

    /**
     * Sets the "distance" attribute
     */
    void setDistance(java.lang.String distance);

    /**
     * Sets (as xml) the "distance" attribute
     */
    void xsetDistance(org.apache.xmlbeans.XmlString distance);

    /**
     * Unsets the "distance" attribute
     */
    void unsetDistance();

    /**
     * Gets the "lengthspecified" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getLengthspecified();

    /**
     * Gets (as xml) the "lengthspecified" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetLengthspecified();

    /**
     * True if has "lengthspecified" attribute
     */
    boolean isSetLengthspecified();

    /**
     * Sets the "lengthspecified" attribute
     */
    void setLengthspecified(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum lengthspecified);

    /**
     * Sets (as xml) the "lengthspecified" attribute
     */
    void xsetLengthspecified(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse lengthspecified);

    /**
     * Unsets the "lengthspecified" attribute
     */
    void unsetLengthspecified();

    /**
     * Gets the "length" attribute
     */
    java.lang.String getLength();

    /**
     * Gets (as xml) the "length" attribute
     */
    org.apache.xmlbeans.XmlString xgetLength();

    /**
     * True if has "length" attribute
     */
    boolean isSetLength();

    /**
     * Sets the "length" attribute
     */
    void setLength(java.lang.String length);

    /**
     * Sets (as xml) the "length" attribute
     */
    void xsetLength(org.apache.xmlbeans.XmlString length);

    /**
     * Unsets the "length" attribute
     */
    void unsetLength();

    /**
     * Gets the "accentbar" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAccentbar();

    /**
     * Gets (as xml) the "accentbar" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAccentbar();

    /**
     * True if has "accentbar" attribute
     */
    boolean isSetAccentbar();

    /**
     * Sets the "accentbar" attribute
     */
    void setAccentbar(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum accentbar);

    /**
     * Sets (as xml) the "accentbar" attribute
     */
    void xsetAccentbar(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse accentbar);

    /**
     * Unsets the "accentbar" attribute
     */
    void unsetAccentbar();

    /**
     * Gets the "textborder" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getTextborder();

    /**
     * Gets (as xml) the "textborder" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetTextborder();

    /**
     * True if has "textborder" attribute
     */
    boolean isSetTextborder();

    /**
     * Sets the "textborder" attribute
     */
    void setTextborder(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum textborder);

    /**
     * Sets (as xml) the "textborder" attribute
     */
    void xsetTextborder(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse textborder);

    /**
     * Unsets the "textborder" attribute
     */
    void unsetTextborder();

    /**
     * Gets the "minusx" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getMinusx();

    /**
     * Gets (as xml) the "minusx" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetMinusx();

    /**
     * True if has "minusx" attribute
     */
    boolean isSetMinusx();

    /**
     * Sets the "minusx" attribute
     */
    void setMinusx(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum minusx);

    /**
     * Sets (as xml) the "minusx" attribute
     */
    void xsetMinusx(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse minusx);

    /**
     * Unsets the "minusx" attribute
     */
    void unsetMinusx();

    /**
     * Gets the "minusy" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getMinusy();

    /**
     * Gets (as xml) the "minusy" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetMinusy();

    /**
     * True if has "minusy" attribute
     */
    boolean isSetMinusy();

    /**
     * Sets the "minusy" attribute
     */
    void setMinusy(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum minusy);

    /**
     * Sets (as xml) the "minusy" attribute
     */
    void xsetMinusy(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse minusy);

    /**
     * Unsets the "minusy" attribute
     */
    void unsetMinusy();
}

/*
 * XML Type:  CT_Diagram
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTDiagram
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Diagram(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTDiagram extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTDiagram> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdiagramc1cctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "relationtable" element
     */
    com.microsoft.schemas.office.office.CTRelationTable getRelationtable();

    /**
     * True if has "relationtable" element
     */
    boolean isSetRelationtable();

    /**
     * Sets the "relationtable" element
     */
    void setRelationtable(com.microsoft.schemas.office.office.CTRelationTable relationtable);

    /**
     * Appends and returns a new empty "relationtable" element
     */
    com.microsoft.schemas.office.office.CTRelationTable addNewRelationtable();

    /**
     * Unsets the "relationtable" element
     */
    void unsetRelationtable();

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
     * Gets the "dgmstyle" attribute
     */
    java.math.BigInteger getDgmstyle();

    /**
     * Gets (as xml) the "dgmstyle" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetDgmstyle();

    /**
     * True if has "dgmstyle" attribute
     */
    boolean isSetDgmstyle();

    /**
     * Sets the "dgmstyle" attribute
     */
    void setDgmstyle(java.math.BigInteger dgmstyle);

    /**
     * Sets (as xml) the "dgmstyle" attribute
     */
    void xsetDgmstyle(org.apache.xmlbeans.XmlInteger dgmstyle);

    /**
     * Unsets the "dgmstyle" attribute
     */
    void unsetDgmstyle();

    /**
     * Gets the "autoformat" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAutoformat();

    /**
     * Gets (as xml) the "autoformat" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAutoformat();

    /**
     * True if has "autoformat" attribute
     */
    boolean isSetAutoformat();

    /**
     * Sets the "autoformat" attribute
     */
    void setAutoformat(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum autoformat);

    /**
     * Sets (as xml) the "autoformat" attribute
     */
    void xsetAutoformat(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse autoformat);

    /**
     * Unsets the "autoformat" attribute
     */
    void unsetAutoformat();

    /**
     * Gets the "reverse" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getReverse();

    /**
     * Gets (as xml) the "reverse" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetReverse();

    /**
     * True if has "reverse" attribute
     */
    boolean isSetReverse();

    /**
     * Sets the "reverse" attribute
     */
    void setReverse(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum reverse);

    /**
     * Sets (as xml) the "reverse" attribute
     */
    void xsetReverse(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse reverse);

    /**
     * Unsets the "reverse" attribute
     */
    void unsetReverse();

    /**
     * Gets the "autolayout" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAutolayout();

    /**
     * Gets (as xml) the "autolayout" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAutolayout();

    /**
     * True if has "autolayout" attribute
     */
    boolean isSetAutolayout();

    /**
     * Sets the "autolayout" attribute
     */
    void setAutolayout(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum autolayout);

    /**
     * Sets (as xml) the "autolayout" attribute
     */
    void xsetAutolayout(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse autolayout);

    /**
     * Unsets the "autolayout" attribute
     */
    void unsetAutolayout();

    /**
     * Gets the "dgmscalex" attribute
     */
    java.math.BigInteger getDgmscalex();

    /**
     * Gets (as xml) the "dgmscalex" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetDgmscalex();

    /**
     * True if has "dgmscalex" attribute
     */
    boolean isSetDgmscalex();

    /**
     * Sets the "dgmscalex" attribute
     */
    void setDgmscalex(java.math.BigInteger dgmscalex);

    /**
     * Sets (as xml) the "dgmscalex" attribute
     */
    void xsetDgmscalex(org.apache.xmlbeans.XmlInteger dgmscalex);

    /**
     * Unsets the "dgmscalex" attribute
     */
    void unsetDgmscalex();

    /**
     * Gets the "dgmscaley" attribute
     */
    java.math.BigInteger getDgmscaley();

    /**
     * Gets (as xml) the "dgmscaley" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetDgmscaley();

    /**
     * True if has "dgmscaley" attribute
     */
    boolean isSetDgmscaley();

    /**
     * Sets the "dgmscaley" attribute
     */
    void setDgmscaley(java.math.BigInteger dgmscaley);

    /**
     * Sets (as xml) the "dgmscaley" attribute
     */
    void xsetDgmscaley(org.apache.xmlbeans.XmlInteger dgmscaley);

    /**
     * Unsets the "dgmscaley" attribute
     */
    void unsetDgmscaley();

    /**
     * Gets the "dgmfontsize" attribute
     */
    java.math.BigInteger getDgmfontsize();

    /**
     * Gets (as xml) the "dgmfontsize" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetDgmfontsize();

    /**
     * True if has "dgmfontsize" attribute
     */
    boolean isSetDgmfontsize();

    /**
     * Sets the "dgmfontsize" attribute
     */
    void setDgmfontsize(java.math.BigInteger dgmfontsize);

    /**
     * Sets (as xml) the "dgmfontsize" attribute
     */
    void xsetDgmfontsize(org.apache.xmlbeans.XmlInteger dgmfontsize);

    /**
     * Unsets the "dgmfontsize" attribute
     */
    void unsetDgmfontsize();

    /**
     * Gets the "constrainbounds" attribute
     */
    java.lang.String getConstrainbounds();

    /**
     * Gets (as xml) the "constrainbounds" attribute
     */
    org.apache.xmlbeans.XmlString xgetConstrainbounds();

    /**
     * True if has "constrainbounds" attribute
     */
    boolean isSetConstrainbounds();

    /**
     * Sets the "constrainbounds" attribute
     */
    void setConstrainbounds(java.lang.String constrainbounds);

    /**
     * Sets (as xml) the "constrainbounds" attribute
     */
    void xsetConstrainbounds(org.apache.xmlbeans.XmlString constrainbounds);

    /**
     * Unsets the "constrainbounds" attribute
     */
    void unsetConstrainbounds();

    /**
     * Gets the "dgmbasetextscale" attribute
     */
    java.math.BigInteger getDgmbasetextscale();

    /**
     * Gets (as xml) the "dgmbasetextscale" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetDgmbasetextscale();

    /**
     * True if has "dgmbasetextscale" attribute
     */
    boolean isSetDgmbasetextscale();

    /**
     * Sets the "dgmbasetextscale" attribute
     */
    void setDgmbasetextscale(java.math.BigInteger dgmbasetextscale);

    /**
     * Sets (as xml) the "dgmbasetextscale" attribute
     */
    void xsetDgmbasetextscale(org.apache.xmlbeans.XmlInteger dgmbasetextscale);

    /**
     * Unsets the "dgmbasetextscale" attribute
     */
    void unsetDgmbasetextscale();
}

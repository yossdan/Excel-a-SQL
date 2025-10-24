/*
 * XML Type:  CT_TextOutlineEffect
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTTextOutlineEffect
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_TextOutlineEffect(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTTextOutlineEffect extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTTextOutlineEffect> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "cttextoutlineeffect33cctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "noFill" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getNoFill();

    /**
     * True if has "noFill" element
     */
    boolean isSetNoFill();

    /**
     * Sets the "noFill" element
     */
    void setNoFill(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty noFill);

    /**
     * Appends and returns a new empty "noFill" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewNoFill();

    /**
     * Unsets the "noFill" element
     */
    void unsetNoFill();

    /**
     * Gets the "solidFill" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties getSolidFill();

    /**
     * True if has "solidFill" element
     */
    boolean isSetSolidFill();

    /**
     * Sets the "solidFill" element
     */
    void setSolidFill(com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties solidFill);

    /**
     * Appends and returns a new empty "solidFill" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTSolidColorFillProperties addNewSolidFill();

    /**
     * Unsets the "solidFill" element
     */
    void unsetSolidFill();

    /**
     * Gets the "gradFill" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties getGradFill();

    /**
     * True if has "gradFill" element
     */
    boolean isSetGradFill();

    /**
     * Sets the "gradFill" element
     */
    void setGradFill(com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties gradFill);

    /**
     * Appends and returns a new empty "gradFill" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTGradientFillProperties addNewGradFill();

    /**
     * Unsets the "gradFill" element
     */
    void unsetGradFill();

    /**
     * Gets the "prstDash" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTPresetLineDashProperties getPrstDash();

    /**
     * True if has "prstDash" element
     */
    boolean isSetPrstDash();

    /**
     * Sets the "prstDash" element
     */
    void setPrstDash(com.microsoft.schemas.office.word.x2010.wordml.CTPresetLineDashProperties prstDash);

    /**
     * Appends and returns a new empty "prstDash" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTPresetLineDashProperties addNewPrstDash();

    /**
     * Unsets the "prstDash" element
     */
    void unsetPrstDash();

    /**
     * Gets the "round" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getRound();

    /**
     * True if has "round" element
     */
    boolean isSetRound();

    /**
     * Sets the "round" element
     */
    void setRound(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty round);

    /**
     * Appends and returns a new empty "round" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewRound();

    /**
     * Unsets the "round" element
     */
    void unsetRound();

    /**
     * Gets the "bevel" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getBevel();

    /**
     * True if has "bevel" element
     */
    boolean isSetBevel();

    /**
     * Sets the "bevel" element
     */
    void setBevel(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty bevel);

    /**
     * Appends and returns a new empty "bevel" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewBevel();

    /**
     * Unsets the "bevel" element
     */
    void unsetBevel();

    /**
     * Gets the "miter" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTLineJoinMiterProperties getMiter();

    /**
     * True if has "miter" element
     */
    boolean isSetMiter();

    /**
     * Sets the "miter" element
     */
    void setMiter(com.microsoft.schemas.office.word.x2010.wordml.CTLineJoinMiterProperties miter);

    /**
     * Appends and returns a new empty "miter" element
     */
    com.microsoft.schemas.office.word.x2010.wordml.CTLineJoinMiterProperties addNewMiter();

    /**
     * Unsets the "miter" element
     */
    void unsetMiter();

    /**
     * Gets the "w" attribute
     */
    int getW();

    /**
     * Gets (as xml) the "w" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth xgetW();

    /**
     * True if has "w" attribute
     */
    boolean isSetW();

    /**
     * Sets the "w" attribute
     */
    void setW(int w);

    /**
     * Sets (as xml) the "w" attribute
     */
    void xsetW(org.openxmlformats.schemas.drawingml.x2006.main.STLineWidth w);

    /**
     * Unsets the "w" attribute
     */
    void unsetW();

    /**
     * Gets the "cap" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STLineCap.Enum getCap();

    /**
     * Gets (as xml) the "cap" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STLineCap xgetCap();

    /**
     * True if has "cap" attribute
     */
    boolean isSetCap();

    /**
     * Sets the "cap" attribute
     */
    void setCap(com.microsoft.schemas.office.word.x2010.wordml.STLineCap.Enum cap);

    /**
     * Sets (as xml) the "cap" attribute
     */
    void xsetCap(com.microsoft.schemas.office.word.x2010.wordml.STLineCap cap);

    /**
     * Unsets the "cap" attribute
     */
    void unsetCap();

    /**
     * Gets the "cmpd" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine.Enum getCmpd();

    /**
     * Gets (as xml) the "cmpd" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine xgetCmpd();

    /**
     * True if has "cmpd" attribute
     */
    boolean isSetCmpd();

    /**
     * Sets the "cmpd" attribute
     */
    void setCmpd(com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine.Enum cmpd);

    /**
     * Sets (as xml) the "cmpd" attribute
     */
    void xsetCmpd(com.microsoft.schemas.office.word.x2010.wordml.STCompoundLine cmpd);

    /**
     * Unsets the "cmpd" attribute
     */
    void unsetCmpd();

    /**
     * Gets the "algn" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment.Enum getAlgn();

    /**
     * Gets (as xml) the "algn" attribute
     */
    com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment xgetAlgn();

    /**
     * True if has "algn" attribute
     */
    boolean isSetAlgn();

    /**
     * Sets the "algn" attribute
     */
    void setAlgn(com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment.Enum algn);

    /**
     * Sets (as xml) the "algn" attribute
     */
    void xsetAlgn(com.microsoft.schemas.office.word.x2010.wordml.STPenAlignment algn);

    /**
     * Unsets the "algn" attribute
     */
    void unsetAlgn();
}

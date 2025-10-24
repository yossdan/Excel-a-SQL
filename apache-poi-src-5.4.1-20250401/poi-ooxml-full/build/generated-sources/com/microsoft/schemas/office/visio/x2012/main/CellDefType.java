/*
 * XML Type:  CellDef_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.CellDefType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CellDef_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface CellDefType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.CellDefType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "celldeftypebe08type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "N" attribute
     */
    java.lang.String getN();

    /**
     * Gets (as xml) the "N" attribute
     */
    org.apache.xmlbeans.XmlString xgetN();

    /**
     * Sets the "N" attribute
     */
    void setN(java.lang.String n);

    /**
     * Sets (as xml) the "N" attribute
     */
    void xsetN(org.apache.xmlbeans.XmlString n);

    /**
     * Gets the "T" attribute
     */
    java.lang.String getT();

    /**
     * Gets (as xml) the "T" attribute
     */
    org.apache.xmlbeans.XmlToken xgetT();

    /**
     * Sets the "T" attribute
     */
    void setT(java.lang.String t);

    /**
     * Sets (as xml) the "T" attribute
     */
    void xsetT(org.apache.xmlbeans.XmlToken t);

    /**
     * Gets the "F" attribute
     */
    java.lang.String getF();

    /**
     * Gets (as xml) the "F" attribute
     */
    org.apache.xmlbeans.XmlString xgetF();

    /**
     * True if has "F" attribute
     */
    boolean isSetF();

    /**
     * Sets the "F" attribute
     */
    void setF(java.lang.String f);

    /**
     * Sets (as xml) the "F" attribute
     */
    void xsetF(org.apache.xmlbeans.XmlString f);

    /**
     * Unsets the "F" attribute
     */
    void unsetF();

    /**
     * Gets the "IX" attribute
     */
    short getIX();

    /**
     * Gets (as xml) the "IX" attribute
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetIX();

    /**
     * True if has "IX" attribute
     */
    boolean isSetIX();

    /**
     * Sets the "IX" attribute
     */
    void setIX(short ix);

    /**
     * Sets (as xml) the "IX" attribute
     */
    void xsetIX(org.apache.xmlbeans.XmlUnsignedByte ix);

    /**
     * Unsets the "IX" attribute
     */
    void unsetIX();

    /**
     * Gets the "S" attribute
     */
    short getS();

    /**
     * Gets (as xml) the "S" attribute
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetS();

    /**
     * True if has "S" attribute
     */
    boolean isSetS();

    /**
     * Sets the "S" attribute
     */
    void setS(short s);

    /**
     * Sets (as xml) the "S" attribute
     */
    void xsetS(org.apache.xmlbeans.XmlUnsignedByte s);

    /**
     * Unsets the "S" attribute
     */
    void unsetS();
}

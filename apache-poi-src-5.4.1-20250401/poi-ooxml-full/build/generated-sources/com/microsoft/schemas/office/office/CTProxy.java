/*
 * XML Type:  CT_Proxy
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTProxy
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Proxy(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTProxy extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTProxy> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctproxy7727type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "start" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getStart();

    /**
     * Gets (as xml) the "start" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetStart();

    /**
     * True if has "start" attribute
     */
    boolean isSetStart();

    /**
     * Sets the "start" attribute
     */
    void setStart(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum start);

    /**
     * Sets (as xml) the "start" attribute
     */
    void xsetStart(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank start);

    /**
     * Unsets the "start" attribute
     */
    void unsetStart();

    /**
     * Gets the "end" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getEnd();

    /**
     * Gets (as xml) the "end" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetEnd();

    /**
     * True if has "end" attribute
     */
    boolean isSetEnd();

    /**
     * Sets the "end" attribute
     */
    void setEnd(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum end);

    /**
     * Sets (as xml) the "end" attribute
     */
    void xsetEnd(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank end);

    /**
     * Unsets the "end" attribute
     */
    void unsetEnd();

    /**
     * Gets the "idref" attribute
     */
    java.lang.String getIdref();

    /**
     * Gets (as xml) the "idref" attribute
     */
    org.apache.xmlbeans.XmlString xgetIdref();

    /**
     * True if has "idref" attribute
     */
    boolean isSetIdref();

    /**
     * Sets the "idref" attribute
     */
    void setIdref(java.lang.String idref);

    /**
     * Sets (as xml) the "idref" attribute
     */
    void xsetIdref(org.apache.xmlbeans.XmlString idref);

    /**
     * Unsets the "idref" attribute
     */
    void unsetIdref();

    /**
     * Gets the "connectloc" attribute
     */
    int getConnectloc();

    /**
     * Gets (as xml) the "connectloc" attribute
     */
    org.apache.xmlbeans.XmlInt xgetConnectloc();

    /**
     * True if has "connectloc" attribute
     */
    boolean isSetConnectloc();

    /**
     * Sets the "connectloc" attribute
     */
    void setConnectloc(int connectloc);

    /**
     * Sets (as xml) the "connectloc" attribute
     */
    void xsetConnectloc(org.apache.xmlbeans.XmlInt connectloc);

    /**
     * Unsets the "connectloc" attribute
     */
    void unsetConnectloc();
}

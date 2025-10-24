/*
 * XML Type:  CT_LineJoinMiterProperties
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTLineJoinMiterProperties
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_LineJoinMiterProperties(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTLineJoinMiterProperties extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTLineJoinMiterProperties> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctlinejoinmiterpropertiesfbd8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "lim" attribute
     */
    java.lang.Object getLim();

    /**
     * Gets (as xml) the "lim" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage xgetLim();

    /**
     * True if has "lim" attribute
     */
    boolean isSetLim();

    /**
     * Sets the "lim" attribute
     */
    void setLim(java.lang.Object lim);

    /**
     * Sets (as xml) the "lim" attribute
     */
    void xsetLim(org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage lim);

    /**
     * Unsets the "lim" attribute
     */
    void unsetLim();
}

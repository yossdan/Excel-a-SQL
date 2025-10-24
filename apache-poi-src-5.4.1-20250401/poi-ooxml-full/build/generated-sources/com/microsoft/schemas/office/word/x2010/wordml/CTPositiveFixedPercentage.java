/*
 * XML Type:  CT_PositiveFixedPercentage
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_PositiveFixedPercentage(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is a complex type.
 */
public interface CTPositiveFixedPercentage extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.x2010.wordml.CTPositiveFixedPercentage> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctpositivefixedpercentage31bdtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "val" attribute
     */
    java.lang.Object getVal();

    /**
     * Gets (as xml) the "val" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(java.lang.Object val);

    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage val);
}

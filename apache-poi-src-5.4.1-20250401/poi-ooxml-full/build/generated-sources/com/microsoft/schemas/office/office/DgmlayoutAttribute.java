/*
 * An XML attribute type.
 * Localname: dgmlayout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.DgmlayoutAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one dgmlayout(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface DgmlayoutAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.DgmlayoutAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "dgmlayout8ee7attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "dgmlayout" attribute
     */
    java.math.BigInteger getDgmlayout();

    /**
     * Gets (as xml) the "dgmlayout" attribute
     */
    com.microsoft.schemas.office.office.STDiagramLayout xgetDgmlayout();

    /**
     * True if has "dgmlayout" attribute
     */
    boolean isSetDgmlayout();

    /**
     * Sets the "dgmlayout" attribute
     */
    void setDgmlayout(java.math.BigInteger dgmlayout);

    /**
     * Sets (as xml) the "dgmlayout" attribute
     */
    void xsetDgmlayout(com.microsoft.schemas.office.office.STDiagramLayout dgmlayout);

    /**
     * Unsets the "dgmlayout" attribute
     */
    void unsetDgmlayout();
}

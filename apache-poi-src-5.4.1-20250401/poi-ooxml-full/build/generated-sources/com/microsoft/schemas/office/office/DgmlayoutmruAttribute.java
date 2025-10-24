/*
 * An XML attribute type.
 * Localname: dgmlayoutmru
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.DgmlayoutmruAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one dgmlayoutmru(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface DgmlayoutmruAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.DgmlayoutmruAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "dgmlayoutmru9765attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "dgmlayoutmru" attribute
     */
    java.math.BigInteger getDgmlayoutmru();

    /**
     * Gets (as xml) the "dgmlayoutmru" attribute
     */
    com.microsoft.schemas.office.office.STDiagramLayout xgetDgmlayoutmru();

    /**
     * True if has "dgmlayoutmru" attribute
     */
    boolean isSetDgmlayoutmru();

    /**
     * Sets the "dgmlayoutmru" attribute
     */
    void setDgmlayoutmru(java.math.BigInteger dgmlayoutmru);

    /**
     * Sets (as xml) the "dgmlayoutmru" attribute
     */
    void xsetDgmlayoutmru(com.microsoft.schemas.office.office.STDiagramLayout dgmlayoutmru);

    /**
     * Unsets the "dgmlayoutmru" attribute
     */
    void unsetDgmlayoutmru();
}

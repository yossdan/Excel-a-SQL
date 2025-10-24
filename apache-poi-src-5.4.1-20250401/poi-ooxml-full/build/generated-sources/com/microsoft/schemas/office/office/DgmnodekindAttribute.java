/*
 * An XML attribute type.
 * Localname: dgmnodekind
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.DgmnodekindAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one dgmnodekind(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface DgmnodekindAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.DgmnodekindAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "dgmnodekindcc93attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "dgmnodekind" attribute
     */
    java.math.BigInteger getDgmnodekind();

    /**
     * Gets (as xml) the "dgmnodekind" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetDgmnodekind();

    /**
     * True if has "dgmnodekind" attribute
     */
    boolean isSetDgmnodekind();

    /**
     * Sets the "dgmnodekind" attribute
     */
    void setDgmnodekind(java.math.BigInteger dgmnodekind);

    /**
     * Sets (as xml) the "dgmnodekind" attribute
     */
    void xsetDgmnodekind(org.apache.xmlbeans.XmlInteger dgmnodekind);

    /**
     * Unsets the "dgmnodekind" attribute
     */
    void unsetDgmnodekind();
}

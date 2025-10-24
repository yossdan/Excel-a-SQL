/*
 * An XML attribute type.
 * Localname: movie
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.MovieAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one movie(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface MovieAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.MovieAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "movie24a3attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "movie" attribute
     */
    float getMovie();

    /**
     * Gets (as xml) the "movie" attribute
     */
    org.apache.xmlbeans.XmlFloat xgetMovie();

    /**
     * True if has "movie" attribute
     */
    boolean isSetMovie();

    /**
     * Sets the "movie" attribute
     */
    void setMovie(float movie);

    /**
     * Sets (as xml) the "movie" attribute
     */
    void xsetMovie(org.apache.xmlbeans.XmlFloat movie);

    /**
     * Unsets the "movie" attribute
     */
    void unsetMovie();
}

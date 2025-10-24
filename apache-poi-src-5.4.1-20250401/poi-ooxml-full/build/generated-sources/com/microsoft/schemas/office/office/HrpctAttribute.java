/*
 * An XML attribute type.
 * Localname: hrpct
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.HrpctAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one hrpct(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface HrpctAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.HrpctAttribute> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "hrpct420aattrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "hrpct" attribute
     */
    float getHrpct();

    /**
     * Gets (as xml) the "hrpct" attribute
     */
    org.apache.xmlbeans.XmlFloat xgetHrpct();

    /**
     * True if has "hrpct" attribute
     */
    boolean isSetHrpct();

    /**
     * Sets the "hrpct" attribute
     */
    void setHrpct(float hrpct);

    /**
     * Sets (as xml) the "hrpct" attribute
     */
    void xsetHrpct(org.apache.xmlbeans.XmlFloat hrpct);

    /**
     * Unsets the "hrpct" attribute
     */
    void unsetHrpct();
}

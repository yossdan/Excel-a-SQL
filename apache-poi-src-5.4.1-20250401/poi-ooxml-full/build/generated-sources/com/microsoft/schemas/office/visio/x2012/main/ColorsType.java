/*
 * XML Type:  Colors_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ColorsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Colors_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface ColorsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.ColorsType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "colorstype3e49type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ColorEntry" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.ColorEntryType> getColorEntryList();

    /**
     * Gets array of all "ColorEntry" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.ColorEntryType[] getColorEntryArray();

    /**
     * Gets ith "ColorEntry" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ColorEntryType getColorEntryArray(int i);

    /**
     * Returns number of "ColorEntry" element
     */
    int sizeOfColorEntryArray();

    /**
     * Sets array of all "ColorEntry" element
     */
    void setColorEntryArray(com.microsoft.schemas.office.visio.x2012.main.ColorEntryType[] colorEntryArray);

    /**
     * Sets ith "ColorEntry" element
     */
    void setColorEntryArray(int i, com.microsoft.schemas.office.visio.x2012.main.ColorEntryType colorEntry);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ColorEntry" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ColorEntryType insertNewColorEntry(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ColorEntry" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ColorEntryType addNewColorEntry();

    /**
     * Removes the ith "ColorEntry" element
     */
    void removeColorEntry(int i);
}

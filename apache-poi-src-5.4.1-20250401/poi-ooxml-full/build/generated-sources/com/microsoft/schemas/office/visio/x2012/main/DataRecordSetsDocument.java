/*
 * An XML document type.
 * Localname: DataRecordSets
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DataRecordSets(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public interface DataRecordSetsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "datarecordsets2b8edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataRecordSets" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType getDataRecordSets();

    /**
     * Sets the "DataRecordSets" element
     */
    void setDataRecordSets(com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType dataRecordSets);

    /**
     * Appends and returns a new empty "DataRecordSets" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataRecordSetsType addNewDataRecordSets();
}

/*
 * XML Type:  RefreshConflict_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RefreshConflict_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface RefreshConflictType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.RefreshConflictType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "refreshconflicttypef3betype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "RowID" attribute
     */
    long getRowID();

    /**
     * Gets (as xml) the "RowID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetRowID();

    /**
     * Sets the "RowID" attribute
     */
    void setRowID(long rowID);

    /**
     * Sets (as xml) the "RowID" attribute
     */
    void xsetRowID(org.apache.xmlbeans.XmlUnsignedInt rowID);

    /**
     * Gets the "ShapeID" attribute
     */
    long getShapeID();

    /**
     * Gets (as xml) the "ShapeID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetShapeID();

    /**
     * Sets the "ShapeID" attribute
     */
    void setShapeID(long shapeID);

    /**
     * Sets (as xml) the "ShapeID" attribute
     */
    void xsetShapeID(org.apache.xmlbeans.XmlUnsignedInt shapeID);

    /**
     * Gets the "PageID" attribute
     */
    long getPageID();

    /**
     * Gets (as xml) the "PageID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetPageID();

    /**
     * Sets the "PageID" attribute
     */
    void setPageID(long pageID);

    /**
     * Sets (as xml) the "PageID" attribute
     */
    void xsetPageID(org.apache.xmlbeans.XmlUnsignedInt pageID);
}

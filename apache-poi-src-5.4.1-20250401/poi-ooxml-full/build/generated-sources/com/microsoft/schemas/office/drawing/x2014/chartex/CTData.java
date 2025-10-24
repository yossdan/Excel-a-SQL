/*
 * XML Type:  CT_Data
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.CTData
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Data(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a complex type.
 */
public interface CTData extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2014.chartex.CTData> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdata6c1ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "numDim" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension> getNumDimList();

    /**
     * Gets array of all "numDim" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension[] getNumDimArray();

    /**
     * Gets ith "numDim" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension getNumDimArray(int i);

    /**
     * Returns number of "numDim" element
     */
    int sizeOfNumDimArray();

    /**
     * Sets array of all "numDim" element
     */
    void setNumDimArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension[] numDimArray);

    /**
     * Sets ith "numDim" element
     */
    void setNumDimArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension numDim);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "numDim" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension insertNewNumDim(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "numDim" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTNumericDimension addNewNumDim();

    /**
     * Removes the ith "numDim" element
     */
    void removeNumDim(int i);

    /**
     * Gets a List of "strDim" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension> getStrDimList();

    /**
     * Gets array of all "strDim" elements
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension[] getStrDimArray();

    /**
     * Gets ith "strDim" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension getStrDimArray(int i);

    /**
     * Returns number of "strDim" element
     */
    int sizeOfStrDimArray();

    /**
     * Sets array of all "strDim" element
     */
    void setStrDimArray(com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension[] strDimArray);

    /**
     * Sets ith "strDim" element
     */
    void setStrDimArray(int i, com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension strDim);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "strDim" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension insertNewStrDim(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "strDim" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTStringDimension addNewStrDim();

    /**
     * Removes the ith "strDim" element
     */
    void removeStrDim(int i);

    /**
     * Gets the "extLst" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList getExtLst();

    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();

    /**
     * Sets the "extLst" element
     */
    void setExtLst(com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList extLst);

    /**
     * Appends and returns a new empty "extLst" element
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.CTExtensionList addNewExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();

    /**
     * Gets the "id" attribute
     */
    long getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    com.microsoft.schemas.office.drawing.x2014.chartex.STDataId xgetId();

    /**
     * Sets the "id" attribute
     */
    void setId(long id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(com.microsoft.schemas.office.drawing.x2014.chartex.STDataId id);
}

/*
 * XML Type:  CT_PersonList
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPersonList
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_PersonList(@http://schemas.microsoft.com/office/spreadsheetml/2018/threadedcomments).
 *
 * This is a complex type.
 */
public interface CTPersonList extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPersonList> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctpersonlistc8a4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "person" elements
     */
    java.util.List<com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPerson> getPersonList();

    /**
     * Gets array of all "person" elements
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPerson[] getPersonArray();

    /**
     * Gets ith "person" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPerson getPersonArray(int i);

    /**
     * Returns number of "person" element
     */
    int sizeOfPersonArray();

    /**
     * Sets array of all "person" element
     */
    void setPersonArray(com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPerson[] personArray);

    /**
     * Sets ith "person" element
     */
    void setPersonArray(int i, com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPerson person);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "person" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPerson insertNewPerson(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "person" element
     */
    com.microsoft.schemas.office.spreadsheetml.x2018.threadedcomments.CTPerson addNewPerson();

    /**
     * Removes the ith "person" element
     */
    void removePerson(int i);

    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();

    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();

    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);

    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
}

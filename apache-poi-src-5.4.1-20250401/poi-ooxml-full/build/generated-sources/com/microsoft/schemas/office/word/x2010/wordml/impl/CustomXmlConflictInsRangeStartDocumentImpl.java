/*
 * An XML document type.
 * Localname: customXmlConflictInsRangeStart
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictInsRangeStartDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one customXmlConflictInsRangeStart(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public class CustomXmlConflictInsRangeStartDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictInsRangeStartDocument {
    private static final long serialVersionUID = 1L;

    public CustomXmlConflictInsRangeStartDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "customXmlConflictInsRangeStart"),
    };


    /**
     * Gets the "customXmlConflictInsRangeStart" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCustomXmlConflictInsRangeStart() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "customXmlConflictInsRangeStart" element
     */
    @Override
    public void setCustomXmlConflictInsRangeStart(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange customXmlConflictInsRangeStart) {
        generatedSetterHelperImpl(customXmlConflictInsRangeStart, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "customXmlConflictInsRangeStart" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCustomXmlConflictInsRangeStart() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: customXmlConflictInsRangeEnd
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictInsRangeEndDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one customXmlConflictInsRangeEnd(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public class CustomXmlConflictInsRangeEndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictInsRangeEndDocument {
    private static final long serialVersionUID = 1L;

    public CustomXmlConflictInsRangeEndDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "customXmlConflictInsRangeEnd"),
    };


    /**
     * Gets the "customXmlConflictInsRangeEnd" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup getCustomXmlConflictInsRangeEnd() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "customXmlConflictInsRangeEnd" element
     */
    @Override
    public void setCustomXmlConflictInsRangeEnd(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup customXmlConflictInsRangeEnd) {
        generatedSetterHelperImpl(customXmlConflictInsRangeEnd, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "customXmlConflictInsRangeEnd" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup addNewCustomXmlConflictInsRangeEnd() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

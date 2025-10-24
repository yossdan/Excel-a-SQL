/*
 * An XML document type.
 * Localname: customXmlConflictDelRangeEnd
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictDelRangeEndDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one customXmlConflictDelRangeEnd(@http://schemas.microsoft.com/office/word/2010/wordml) element.
 *
 * This is a complex type.
 */
public class CustomXmlConflictDelRangeEndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.x2010.wordml.CustomXmlConflictDelRangeEndDocument {
    private static final long serialVersionUID = 1L;

    public CustomXmlConflictDelRangeEndDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/word/2010/wordml", "customXmlConflictDelRangeEnd"),
    };


    /**
     * Gets the "customXmlConflictDelRangeEnd" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup getCustomXmlConflictDelRangeEnd() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "customXmlConflictDelRangeEnd" element
     */
    @Override
    public void setCustomXmlConflictDelRangeEnd(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup customXmlConflictDelRangeEnd) {
        generatedSetterHelperImpl(customXmlConflictDelRangeEnd, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "customXmlConflictDelRangeEnd" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup addNewCustomXmlConflictDelRangeEnd() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

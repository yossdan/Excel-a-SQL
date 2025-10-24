/*
 * An XML document type.
 * Localname: column
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ColumnDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one column(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class ColumnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.ColumnDocument {
    private static final long serialVersionUID = 1L;

    public ColumnDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "column"),
    };


    /**
     * Gets the "column" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTStrokeChild getColumn() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTStrokeChild target = null;
            target = (com.microsoft.schemas.office.office.CTStrokeChild)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "column" element
     */
    @Override
    public void setColumn(com.microsoft.schemas.office.office.CTStrokeChild column) {
        generatedSetterHelperImpl(column, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "column" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTStrokeChild addNewColumn() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTStrokeChild target = null;
            target = (com.microsoft.schemas.office.office.CTStrokeChild)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

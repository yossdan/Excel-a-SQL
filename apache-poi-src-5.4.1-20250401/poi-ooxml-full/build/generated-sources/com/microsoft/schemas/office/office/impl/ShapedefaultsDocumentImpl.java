/*
 * An XML document type.
 * Localname: shapedefaults
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ShapedefaultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one shapedefaults(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class ShapedefaultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.ShapedefaultsDocument {
    private static final long serialVersionUID = 1L;

    public ShapedefaultsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "shapedefaults"),
    };


    /**
     * Gets the "shapedefaults" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTShapeDefaults getShapedefaults() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTShapeDefaults target = null;
            target = (com.microsoft.schemas.office.office.CTShapeDefaults)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "shapedefaults" element
     */
    @Override
    public void setShapedefaults(com.microsoft.schemas.office.office.CTShapeDefaults shapedefaults) {
        generatedSetterHelperImpl(shapedefaults, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "shapedefaults" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTShapeDefaults addNewShapedefaults() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTShapeDefaults target = null;
            target = (com.microsoft.schemas.office.office.CTShapeDefaults)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

/*
 * An XML document type.
 * Localname: dataModelExt
 * Namespace: http://schemas.microsoft.com/office/drawing/2008/diagram
 * Java type: com.microsoft.schemas.office.drawing.x2008.diagram.DataModelExtDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2008.diagram.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one dataModelExt(@http://schemas.microsoft.com/office/drawing/2008/diagram) element.
 *
 * This is a complex type.
 */
public class DataModelExtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2008.diagram.DataModelExtDocument {
    private static final long serialVersionUID = 1L;

    public DataModelExtDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "dataModelExt"),
    };


    /**
     * Gets the "dataModelExt" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock getDataModelExt() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "dataModelExt" element
     */
    @Override
    public void setDataModelExt(com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock dataModelExt) {
        generatedSetterHelperImpl(dataModelExt, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "dataModelExt" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock addNewDataModelExt() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTDataModelExtBlock)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

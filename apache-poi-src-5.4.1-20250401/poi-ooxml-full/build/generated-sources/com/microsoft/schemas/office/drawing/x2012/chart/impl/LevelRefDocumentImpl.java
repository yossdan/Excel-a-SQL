/*
 * An XML document type.
 * Localname: levelRef
 * Namespace: http://schemas.microsoft.com/office/drawing/2012/chart
 * Java type: com.microsoft.schemas.office.drawing.x2012.chart.LevelRefDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2012.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one levelRef(@http://schemas.microsoft.com/office/drawing/2012/chart) element.
 *
 * This is a complex type.
 */
public class LevelRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2012.chart.LevelRefDocument {
    private static final long serialVersionUID = 1L;

    public LevelRefDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2012/chart", "levelRef"),
    };


    /**
     * Gets the "levelRef" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTLevelRef getLevelRef() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTLevelRef target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTLevelRef)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "levelRef" element
     */
    @Override
    public void setLevelRef(com.microsoft.schemas.office.drawing.x2012.chart.CTLevelRef levelRef) {
        generatedSetterHelperImpl(levelRef, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "levelRef" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2012.chart.CTLevelRef addNewLevelRef() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2012.chart.CTLevelRef target = null;
            target = (com.microsoft.schemas.office.drawing.x2012.chart.CTLevelRef)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}

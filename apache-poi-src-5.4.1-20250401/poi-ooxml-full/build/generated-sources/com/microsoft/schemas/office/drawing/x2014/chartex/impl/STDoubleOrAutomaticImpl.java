/*
 * XML Type:  ST_DoubleOrAutomatic
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ST_DoubleOrAutomatic(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlDouble
 *     com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic$Member
 */
public class STDoubleOrAutomaticImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic, org.apache.xmlbeans.XmlDouble, com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic.Member {
    private static final long serialVersionUID = 1L;

    public STDoubleOrAutomaticImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected STDoubleOrAutomaticImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.microsoft.schemas.office.drawing.x2014.chartex.STDoubleOrAutomatic.Member {
        private static final long serialVersionUID = 1L;

        public MemberImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
}

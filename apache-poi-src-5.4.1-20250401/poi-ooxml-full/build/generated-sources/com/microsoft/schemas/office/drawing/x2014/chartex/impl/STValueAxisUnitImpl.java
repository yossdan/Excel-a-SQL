/*
 * XML Type:  ST_ValueAxisUnit
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ST_ValueAxisUnit(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit$Member
 *     com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit$Member2
 */
public class STValueAxisUnitImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit, com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit.Member, com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit.Member2 {
    private static final long serialVersionUID = 1L;

    public STValueAxisUnitImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected STValueAxisUnitImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit.Member {
        private static final long serialVersionUID = 1L;

        public MemberImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit$Member2.
     */
    public static class MemberImpl2 extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.microsoft.schemas.office.drawing.x2014.chartex.STValueAxisUnit.Member2 {
        private static final long serialVersionUID = 1L;

        public MemberImpl2(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected MemberImpl2(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
}
